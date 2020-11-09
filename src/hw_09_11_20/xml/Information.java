package hw_09_11_20.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.HandlerBase;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Information {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("E:/projects/src/hw_09_11_20/xml/medintitutionemployees.xml"));
        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");

        for (int i = 0; i < employeeElements.getLength(); i++) {
            Node emp = employeeElements.item(i);
            NamedNodeMap attributes1 = emp.getAttributes();

            employees.add(new Employee(attributes1.getNamedItem("name").getNodeValue(), attributes1.getNamedItem("surname").getNodeValue(), attributes1.getNamedItem("departmentposition").getNodeValue(),
                    attributes1.getNamedItem("expirience").getNodeValue(), attributes1.getNamedItem("departmentname").getNodeValue()));
        }
        info("Sorokin");

    }

    public static void info(String surname) {
        for (Employee emp : employees) {
            if (surname.equals(emp.getSurname())) {
                System.out.printf("Name: %s\n Surname: %s \nPosition: %s\n Expirience %s\n Department: %s\n\n", emp.getName(), emp.getSurname(),
                        emp.getDepartmentPosition(), emp.getExpirience(), emp.getDepartmentName());
            }
        }

    }
}


