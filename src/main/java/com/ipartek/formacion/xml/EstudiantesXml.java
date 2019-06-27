package com.ipartek.formacion.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

/**
 * ejercicio para aprender a pasear y trabajar con xml
 * https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 * @author Curso
 *
 */
public class EstudiantesXml {

	public static void main(String[] args) throws ParserConfigurationException, UnsupportedEncodingException, SAXException, IOException {

		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//similar a String pero preparado para trabajar con dtring grande oficheros texto
		StringBuilder xmlStringBuilder = new StringBuilder();
		xmlStringBuilder.append("<?xml version=\"1.0\"?> <perro><nombre>Rataplan</nombre></perro>");

        Document doc = builder.parse(new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8")));
		
        Element elemento = doc.getDocumentElement();
        String nombre =elemento.getTextContent();
		System.out.println(" a ver que sacamos del perro "+ nombre);

		
		
		
	}

}
