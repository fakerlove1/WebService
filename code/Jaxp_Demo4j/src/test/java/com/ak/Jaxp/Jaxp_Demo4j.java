package com.ak.Jaxp;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.FileWriter;
import java.util.List;

public class Jaxp_Demo4j {
    /**
     * 读取
     * @throws Exception
     */
    @Test
    public void testReadXml() throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read("src/main/resources/1.xml");
        //获取根节点
        Element root = doc.getRootElement();
        //获取根节点下的子元素
        List list = root.elements();
        //迭代
        for(int i = 0;i<list.size();i++) {
            //获取第一个元素<book>
            Element element = (Element) list.get(i);
            //打印book子元素的值
            System.out.println("title="+element.elementText("title"));
            System.out.println("author="+element.elementText("author"));
            System.out.println("price="+element.elementText("price"));
            System.out.println("year"+element.elementText("year"));
            System.out.println("==================");
        }
    }

    /**
     * 读取属性
     * @throws Exception
     */
    @Test
    public void testReadXml_2() throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read("src/main/resources/1.xml");
        //获取根节点
        Element root = doc.getRootElement();
        //获取根节点下的子元素
        List list = root.elements();
        //迭代
        for(int i = 0;i<list.size();i++) {
            //获取第一个元素<book>
            Element element = (Element) list.get(i);
            //获取book元素的属性
            List attributes = element.attributes();
            for(int j = 0;j<attributes.size();j++) {
                //获取每一个属性并打印
                Attribute attr = (Attribute) attributes.get(j);
                System.out.println(attr.getName()+":"+attr.getValue());
            }
            System.out.println("-----------");

            //获取指定元素
            Element titleElmt = element.element("title");
            if(titleElmt!=null) {
                //获取指定属性并打印
                Attribute attr = titleElmt.attribute("lang");
                System.out.println(attr.getName()+":"+attr.getValue());
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");

        }

    }


    /**
     * 写入一个数据
     * @throws Exception
     */
    @Test
    public void writeXml() throws Exception {

        //创建一个空的文档对象
        Document doc = DocumentHelper.createDocument();
        // 创建根节点book
        Element rootElmt = doc.addElement("books");
        // 创建元素book
        Element bookElmt = rootElmt.addElement("book");
        // 添加book的子元素bookname
        Element bnelmt = bookElmt.addElement("bookname");
        // 设置值
        bnelmt.setText("三只小猪");
        // 添加book的子元素bookprice
        Element bpElmt = bookElmt.addElement("bookprice");
        // 设置值
        bpElmt.setText("20.02");
        // 添加book的子元素bookname
        // 创建元素book
        Element bookElmt1 = rootElmt.addElement("book");
        Element bnelmt1 = bookElmt1.addElement("bookname");
        // 设置值
        bnelmt1.setText("安徒生童话");
        // 添加book的子元素bookprice
        Element bpElmt2 = bookElmt1.addElement("bookprice");
        // 设置值
        bpElmt2.setText("15.02");
        // 创建FileWriter对象，并指定输出xml的文件
        FileWriter fw = new FileWriter("src/main/resources/1.xml");
        // 指定xml 文件的输出格式
        OutputFormat of = new OutputFormat();
        of.setEncoding("UTF-8");
        // 输出xml文件
        XMLWriter writer = new XMLWriter(fw, of);
        // 写出文档
        writer.write(doc);
        // 关闭
        writer.close();

    }

}

