/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package readandprintxmlfile;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.*;

public class Main {

   public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("book.xml"));
            doc.getDocumentElement().normalize();
            System.out.println("Root element of the doc is "+ doc.getDocumentElement().getNodeName());
            NodeList listOfPersons = doc.getElementsByTagName("person");
            int totalPersons = listOfPersons.getLength();
            System.out.println("Total number of people: "+ totalPersons);

            for (int s = 0; s<listOfPersons.getLength(); s++) {
                Node firstPersonNode = listOfPersons.item(s);
                if (firstPersonNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element firstPersonElement = (Element) firstPersonNode;
                    NodeList firstNameList = firstPersonElement.getElementsByTagName("first");
                    Element firstNameElement = (Element) firstNameList.item(0);
                    NodeList textFNList = firstNameElement.getChildNodes();
                    System.out.println("First Name: " + ((Node)textFNList.item(0)).getNodeValue().trim());
                    NodeList lastNameList = firstPersonElement.getElementsByTagName("last");
                    Element lastNameElement = (Element)lastNameList.item(0);
                    NodeList textLNList = lastNameElement.getChildNodes();
                    System.out.println("Last Name: " + ((Node)textLNList.item(0)).getNodeValue().trim());
                    NodeList ageList = firstPersonElement.getElementsByTagName("age");
                    Element ageElement = (Element)ageList.item(0);
                    NodeList textAgeList = ageElement.getChildNodes();
                    System.out.println("Age: " + ((Node)textAgeList.item(0)).getNodeValue().trim());

                }
            }
        } catch (SAXParseException err) {

        }
        System.exit(0);
    }

}
