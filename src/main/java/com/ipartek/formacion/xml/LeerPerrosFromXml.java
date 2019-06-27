package com.ipartek.formacion.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.Perro;

/**
 * leer xml con listado de perros guardar en arraylist mostrar por pantalla
 * 
 * @author Curso
 *
 */
public class LeerPerrosFromXml {
	public static void main(String[] args) {

//		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//		
//		//similar a String pero preparado para trabajar con dtring grande oficheros texto
//		StringBuilder xmlStringBuilder = new StringBuilder();
//		xmlStringBuilder.append("<?xml version=\"1.0\"?> <perro><nombre>Rataplan</nombre></perro>");
//
//        Document doc = builder.parse(new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8")));
//	
		try {

			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(
					new File("C:/1713/eclipse-workspace/1713/src/main/java/com/ipartek/formacion/xml/perros.xml"));
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("perro");
			System.out.println("----------------------------");

			Perro perro;

			for (int i = 0; i < nList.getLength(); i++) {
				Node nNode = nList.item(i);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) nNode;
					perro = new Perro();
					perro.setNombre(elemento.getElementsByTagName("nombre").item(0).getTextContent());
					perro.setRaza(elemento.getElementsByTagName("raza").item(0).getTextContent());
					perro.setEdad(Integer.parseInt(elemento.getElementsByTagName("edad").item(0).getTextContent()));
					perro.setVacunado(
							"true".equals(elemento.getElementsByTagName("vacunado").item(0).getTextContent()) ? true
									: false);

					// System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					System.out.println("nombre : " + elemento.getElementsByTagName("nombre").item(0).getTextContent());
					System.out.println("raza : " + elemento.getElementsByTagName("raza").item(0).getTextContent());
					System.out.println("edad : " + elemento.getElementsByTagName("edad").item(0).getTextContent());
					System.out.println("vacunado : " + elemento.getElementsByTagName("vacunado").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
