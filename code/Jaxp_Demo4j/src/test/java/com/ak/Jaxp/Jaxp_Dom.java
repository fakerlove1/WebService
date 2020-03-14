package com.ak.Jaxp;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;

public class Jaxp_Dom {

    /**
     * DOM 方式进行解析
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     * @throws TransformerException
     */
    @Test
    public void kk() throws ParserConfigurationException, IOException, SAXException, TransformerException {
        //得到解析工厂DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //得到解析器DocumentBuilder
        DocumentBuilder builder =  factory.newDocumentBuilder();
        //解析指定的XML文档，得到代表内存DOM树的Document对象
        Document document = builder.parse("src/main/resources/st.xml");
        NodeList elementsByTagName = document.getElementsByTagName("stuname");
        // 打印出所有的所有的 stuname 和属性
        for(int i = 0;i<elementsByTagName.getLength();i++) {
            System.out.println(elementsByTagName.item(i).getTextContent());
            System.out.println(elementsByTagName.item(i).getAttributes().getNamedItem("name"));
        }
        //进行修改
        elementsByTagName.item(0).setTextContent("lilei_copy");
        NodeList elementsByTagName2 = document.getElementsByTagName("students");
        // 创建新的元素
        Element newStu = document.createElement("student");
        Element na = document.createElement("stuname");
        na.setTextContent("zzz");// 设置 内容
        Element age = document.createElement("stuage");
        // 设置内容
        age.setTextContent("18");
        // 嵌套元素
        newStu.appendChild(na);
        newStu.appendChild(age);
        // 添加最后一个元素
        elementsByTagName2.item(0).appendChild(newStu);
        //把修改的参数写回到xml
        TransformerFactory tfactory = TransformerFactory.newInstance();
        Transformer ts = tfactory.newTransformer();
// 写到  st_copy 中去
        ts.transform(new DOMSource(document), new StreamResult("src/main/resources/st_copy.xml"));
    }

}
