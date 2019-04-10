package com.yakshop.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yakshop.model.Labyak;
import com.yakshop.model.Stock;
import com.yakshop.model.Yak;
import com.yakshop.parser.XmlParser;
import com.yakshop.util.HerdStockUtil;

@Component
public class ServiceImpl  implements IService{

	@Autowired
	private XmlParser parser;
	
	@Autowired
	private HerdStockUtil util;
	
	@Override
	public Stock getStock(int days) {
		double liters_of_milk = 0.00;
		double skins_of_wool = 0.00;
		List<Labyak> labyaks = parser.getAllYaks();
		for(Labyak labyak : labyaks){
			liters_of_milk+=util.producedMilk(labyak.getAge(),days);
			skins_of_wool+=util.producedSkin(labyak.getAge(),days);
		}
		Stock stock = new Stock();
		stock.setMilk(liters_of_milk);
		stock.setSkins(skins_of_wool);
		return stock;
	}
	public Map<String,List<Yak>> getHerds(int days) {
		List<Labyak> labyaks = parser.getAllYaks();
		Map<String,List<Yak>> herdDtls = new HashMap<>();
		List<Yak> herdList = new ArrayList<>();
		for(Labyak labyak : labyaks){
			Yak yak = new Yak();
			yak.setName(labyak.getName());
			yak.setAge(util.getConvrtedAge(labyak.getAge(), days));
			yak.setAgeLastShaved(util.getAgeLastShaved(labyak.getAge(), days));
			herdList.add(yak);
		}
		herdDtls.put("Herd ", herdList);
		return herdDtls;
	}
	

}
