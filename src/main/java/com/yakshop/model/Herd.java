package com.yakshop.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "herd")
@XmlAccessorType (XmlAccessType.FIELD)
public class Herd {
	@XmlElement(name = "labyak")
	private List<Labyak> labyaks = null;
	public Herd() {}
	public Herd(List<Labyak> labyaks) {
		super();
		this.labyaks = labyaks;
	}

	/**
	 * @return the labyaks
	 */
	public List<Labyak> getLabyaks() {
		return labyaks;
	}

	/**
	 * @param labyaks the labyaks to set
	 */
	public void setLabyaks(List<Labyak> labyaks) {
		this.labyaks = labyaks;
	}

}