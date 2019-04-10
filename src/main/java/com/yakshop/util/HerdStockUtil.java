package com.yakshop.util;

import org.springframework.stereotype.Component;

@Component
public class HerdStockUtil {
	private final Integer one_Year = 100;
	public Double producedMilk(double age,int days){
		double total = 0.00;
		double ageInDays =  age*one_Year;
		for(int i=1;i<days;i++){
			ageInDays+=i;
			total += 50-(ageInDays*0.03);
		}
		return total;
	}
	public int producedSkin(double age,int days){
		double ageInDays =  age*one_Year;
		double gap = 8 + (ageInDays * 0.01);
		int numberOfSkins = (int) (gap/days);
		return numberOfSkins;
	}
	public double getConvrtedAge(double age,int days){
		return  ((age*one_Year)+days)/one_Year;
	}
	public Double getAgeLastShaved(Double age, int days) {
		return 0.00;
	}
}
