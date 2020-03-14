package com.ak.Jaxb;

import com.ak.pojo.Person;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Java_Xml {

    @Test
    public void  kk() throws JAXBException {
        JAXBContext jaxbc = JAXBContext.newInstance(Person.class);
        Marshaller createMarshaller = jaxbc.createMarshaller();
        createMarshaller.marshal(new Person("tom","123456"), System.out);
    }
}
