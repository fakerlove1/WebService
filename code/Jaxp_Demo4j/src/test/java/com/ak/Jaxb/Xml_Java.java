package com.ak.Jaxb;

import com.ak.pojo.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Xml_Java {
    public static void main(String[] args) throws JAXBException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><person><password>123456</password><username>Tom</username></person>";
        JAXBContext jaxbc = JAXBContext.newInstance(Person.class);
        Unmarshaller createUnmarshaller = jaxbc.createUnmarshaller();
        Person user = (Person) createUnmarshaller.unmarshal(new StringReader(xml));
        System.out.println(user);
    }
}
