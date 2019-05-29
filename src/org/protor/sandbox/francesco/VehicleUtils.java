package org.protor.sandbox.francesco;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.protor.sandbox.agodemar.Car;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class VehicleUtils {

	public static List<Car> loadListOfCars(File xmlFile) {

		List<Car> cars = new ArrayList<>();

		if (!xmlFile.exists()) {
			System.err.println("File " + xmlFile.getAbsolutePath() + " not found.");
			return cars;
		}

		System.out.println("[VehicleUtils.loadListOfCars]");
		System.out.println("Found file: " + xmlFile.getAbsolutePath());
		System.out.println("--- Now reading XML content ---");

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		try {

			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);

			System.out.println("[VehicleUtils.loadListOfCars]");
			System.out.println("File XML parsed.");

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			
			NodeList nodelist = doc.getElementsByTagName("car");
			
			for (int iNode = 0; iNode < nodelist.getLength(); iNode++) {

				Node node = nodelist.item(iNode);

				System.out.println("\nCurrent Element :" + node.getNodeName());
				
				Car car = new Car (node);

				System.out.println(car);

				cars.add(car);

			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	return cars;
}

}
