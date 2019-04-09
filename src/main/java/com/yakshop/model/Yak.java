package com.yakshop.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "labyak")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Yak {
	private String name;
	private Double age;
	@JsonProperty("age-last-shaved")
	private Double ageLastShaved;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	public Double getAgeLastShaved() {
		return ageLastShaved;
	}
	public void setAgeLastShaved(Double ageLastShaved) {
		this.ageLastShaved = ageLastShaved;
	}
}
