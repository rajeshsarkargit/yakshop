package com.yakshop.service;

import java.util.List;
import java.util.Map;

import com.yakshop.model.Stock;
import com.yakshop.model.Yak;

public interface IService {
	public Stock getStock(int days);
	public Map<String,List<Yak>> getHerds(int days);
}
