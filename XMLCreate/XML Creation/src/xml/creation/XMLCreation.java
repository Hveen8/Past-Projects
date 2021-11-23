/*
XML Creation
By Harry van der Veen
Made on 11/30/19

This prgram will create an XML file
and modify it before printing it out
on the screen

Lines of brackets separate the creation, modification, and printing sections
(//////////)

Each section is independant of one another

 */
package xml.creation;

import java.io.*;
import java.io.IOException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.*;

public class XMLCreation {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        
        //Creating a file to edit
        try {
            //making the XML file
            OutputStream fout= new FileOutputStream("timetable.xml");
            OutputStream bout= new BufferedOutputStream(fout);
            OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
                out.write("<?xml version=\"1.0\" ");
                out.write("encoding=\"ISO-8859-1\"?>\r\n");
                //putting in the info for the XML file
                out.write("<timetable>\r\n");
                    out.write("<course>\r\n");
                        out.write("<code>ICS4U</code>\r\n");
                        out.write("<description>Computer Programming, Grade 12, University</description>\r\n");
                        out.write("<teacher>Teacher A</teacher>\r\n");
                        out.write("<room>Lab 8-11</room>\r\n");
                    out.write("</course>\r\n");
                out.write("</timetable>\r\n");
                
                out.flush();  //flushing out any remaining data
            }
        catch (UnsupportedEncodingException e) {
            System.out.println("This VM does not support the Latin-1 character set.");
        }
        catch (IOException e) {
        System.out.println(e.getMessage());
        }
        
////////////////////////////////////////////////////////////////////////////////
        
        //modifying the XML file
        try {
            String filepath = "timetable.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);  //setting up the file to be edited as a doc
            
            //getting the timetable element 
            Node timetable = doc.getElementsByTagName("timetable").item(0);
            
            //getting the course element 
            Node course = doc.getElementsByTagName("course").item(0);
            
            //adding a "school" child element under course
            Element school = doc.createElement("school");
            school.appendChild(doc.createTextNode("Southwood Secondary"));
            course.appendChild(school);
            
            //updating the the teacher name to "Mr. Merritt"

            NodeList list = course.getChildNodes();     //get NodeList of child nodes from course tag
            // loop the course child node
            for (int i = 0; i < list.getLength(); i++) {  //check each node in the list
               Node node = list.item(i);
               // get the teacher element, and update the value
               if ("teacher".equals(node.getNodeName())) {
                    node.setTextContent("Mr. Merritt");       //if node is teacher, it is set to Mr. Merritt
               }
            }
                
            //creating a new course
            Element anotherCourse = doc.createElement("course");
            timetable.appendChild(anotherCourse);
            
            //getting the course element 
            Node anotherCourseNode = doc.getElementsByTagName("course").item(1);
            
            //putting all of the information into the "course"
            Element code = doc.createElement("code");
            code.appendChild(doc.createTextNode("SCH4U"));
            anotherCourseNode.appendChild(code);
            
            Element description = doc.createElement("description");
            description.appendChild(doc.createTextNode("Chemistry, Grade 12, University"));
            anotherCourseNode.appendChild(description);
            
            Element teacher = doc.createElement("teacher");
            teacher.appendChild(doc.createTextNode("Mr. Leudy"));
            anotherCourseNode.appendChild(teacher);
            
            Element room = doc.createElement("room");
            room.appendChild(doc.createTextNode("Lab 127"));
            anotherCourseNode.appendChild(room);
            
            Element newSchool = doc.createElement("school");
            newSchool.appendChild(doc.createTextNode("Southwood Secondary"));
            anotherCourseNode.appendChild(newSchool);
            
            //writing the new information into the XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
        } 
        catch (ParserConfigurationException | TransformerException | IOException | SAXException pce) {
        }

////////////////////////////////////////////////////////////////////////////////
        
        //printing the modified XML file in java like the format in the ReadandPrintXMLFile demo
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("timetable.xml"));
            doc.getDocumentElement().normalize();
            NodeList listOfCourses = doc.getElementsByTagName("course");
            int totalCourses = listOfCourses.getLength();
            
            //using a loop to print out all of the information
            for (int i = 0; i < listOfCourses.getLength(); i++) {
                System.out.println("Course: " + (i + 1));
                Node firstCourseNode = listOfCourses.item(i);
                if (firstCourseNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element firstCourseElement = (Element) firstCourseNode;
                    //class code
                    NodeList codeList = firstCourseElement.getElementsByTagName("code");
                    Element codeElement = (Element) codeList.item(0);
                    NodeList textCList = codeElement.getChildNodes();
                    System.out.println("Class Code: " + ((Node)textCList.item(0)).getNodeValue().trim());
                    //course description
                    NodeList descriptionList = firstCourseElement.getElementsByTagName("description");
                    Element descriptionElement = (Element) descriptionList.item(0);
                    NodeList textDList = descriptionElement.getChildNodes();
                    System.out.println("Description: " + ((Node)textDList.item(0)).getNodeValue().trim());
                    //teacher name
                    NodeList teacherList = firstCourseElement.getElementsByTagName("teacher");
                    Element teacherElement = (Element) teacherList.item(0);
                    NodeList textTList = teacherElement.getChildNodes();
                    System.out.println("Teacher: " + ((Node)textTList.item(0)).getNodeValue().trim());
                    //room number
                    NodeList roomList = firstCourseElement.getElementsByTagName("room");
                    Element roomElement = (Element) roomList.item(0);
                    NodeList textRList = roomElement.getChildNodes();
                    System.out.println("Room: " + ((Node)textRList.item(0)).getNodeValue().trim());
                    //school name
                    NodeList schoolList = firstCourseElement.getElementsByTagName("school");
                    Element schoolElement = (Element) schoolList.item(0);
                    NodeList textSList = schoolElement.getChildNodes();
                    System.out.println("School: " + ((Node)textSList.item(0)).getNodeValue().trim());
                }
            }
        } catch (SAXParseException err) {
        }
    }
}
