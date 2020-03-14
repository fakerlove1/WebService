package com.ak.Jaxp;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Jaxp_Xpath {

    /**
     * 使用xpath列出所有的元素
     * @throws Exception
     */
    @Test
    public void testXpath() throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read("src/main/resources/2.xml");
        Node rootNode = doc.selectSingleNode("students");
        List nodes = rootNode.selectNodes("student");
        for(int i = 0;i<nodes.size();i++) {
            Element elmt = (Element) nodes.get(i);
            System.out.println(elmt.elementText("stuname"));
            System.out.println(elmt.elementText("stuage"));
            System.out.println(elmt.elementText("phone"));
            System.out.println(elmt.elementText("mobile"));

        }


    }
}
