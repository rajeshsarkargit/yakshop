package com.yakshop.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import com.yakshop.model.Herd;
import com.yakshop.model.Labyak;

@Component
public class XmlParser {
	public List<Labyak> getAllYaks(){
		Herd herd = null;
		try
		{
			File xmlFile = ResourceUtils.getFile("classpath:herd.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Herd.class);             
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		    herd = (Herd) jaxbUnmarshaller.unmarshal(xmlFile);
		     
		}
		catch (JAXBException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return herd == null ? null : herd.getLabyaks();
	}
}
