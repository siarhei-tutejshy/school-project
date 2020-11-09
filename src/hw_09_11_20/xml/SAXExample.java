package hw_09_11_20.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SAXExample {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        XMLHAndler handler = new XMLHAndler();
        parser.parse(new File("E:/projects/src/hw_09_11_20/xml/medintitutionemployees.xml"), handler);
        for (Employee emp : employees) {
            System.out.printf("Name: %s\n Surname: %s \nPosition: %s\n Expirience %s\n Department: %s\n\n", emp.getName(), emp.getSurname(),
                    emp.getDepartmentPosition(), emp.getExpirience(), emp.getDepartmentName());
        }

    }

    private static class XMLHAndler extends DefaultHandler {

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

            if (qName.equals("employee")) {
                String name = attributes.getValue("name");
                String surname = attributes.getValue("surname");
                String departmentPosition = attributes.getValue("departmentposition");
                String expirience = attributes.getValue("expirience");
                String dep = attributes.getValue("departmentname");

                employees.add(new Employee(name, surname, departmentPosition, expirience, dep));
            }

        }
    }

}


