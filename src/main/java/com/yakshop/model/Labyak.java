package com.yakshop.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "labyak")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Labyak {
	private String name;
	private Double age;
	private String sex;
	public Labyak() {}
	public Labyak(String name, Double age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Double getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Double age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
}
