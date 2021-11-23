/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* XMLDemo -- Opens a small XML file, reads it in, makes additions, changes, deletions and returns an updated XML file
 * Based on the demo found at https://www.mkyong.com/java/how-to-modify-xml-file-in-java-dom-parser/
 * Author:  MKYong
*/
package xmldemo;

// ALL of these imports need to be done to deal with XML Input/Output
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDemo {

	public static void main(String argv[]) {

	   try {
		
                // Create a doc building factory, which makes docBuilder objects, which creates a document from a parsed XML file
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse("newXMLDocument.xml");

		// Get the root NODE element of the XML file
		Node company = doc.getFirstChild();

		// Get the staff element , it may not working if tag has spaces, or
		// whatever weird characters in front...it's better to use
		// getElementsByTagName() to get it directly.
		// Node staff = company.getFirstChild();

		// Get the staff NODE element by tag name directly.
		Node staff = doc.getElementsByTagName("staff").item(0);

		// get staff NODE Attributes, set to a NamedNodeMap object named attr
		NamedNodeMap attr = staff.getAttributes();
		
                // Get the id NODE and update attribute from 1 to 2
                Node nodeAttr = attr.getNamedItem("id");
		nodeAttr.setTextContent("2");

		// append a new NODE element age to staff
		Element age = doc.createElement("age");    //new Age tag
		age.appendChild(doc.createTextNode("28")); //new node after Age tag of 28
		staff.appendChild(age);                    //add to staff node

		// loop the staff child node
		NodeList list = staff.getChildNodes();     //get NodeList of child nodes from Staff tag

		for (int i = 0; i < list.getLength(); i++) {  //check each node in the list
			
                   Node node = list.item(i);

		   // get the salary element, and update the value
		   if ("salary".equals(node.getNodeName())) {
			node.setTextContent("2000000");       //if node is Salary, set it to 2000000
		   }

                   //remove firstname
		   if ("firstname".equals(node.getNodeName())) {  //remove firstname node from XML file
			staff.removeChild(node);
		   }

		}

		// rewrite the content back into xml file with the same name
                
                // Create a Transformer factory, which makes Transformer objects, which transforms doc into a DOM Source, which turns into XML file via StreamResult
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("newXMLDocument.xml"));
		transformer.transform(source, result);

		System.out.println("Done");
                
           // error checking
	   } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	   } catch (TransformerException tfe) {
		tfe.printStackTrace();
	   } catch (IOException ioe) {
		ioe.printStackTrace();
	   } catch (SAXException sae) {
		sae.printStackTrace();
	   }
	}
}

    

