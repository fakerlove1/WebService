package example;

import example.service.impl.MyServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * 发布 的类
 */
public class HelloWorld {

  public static void main(String[] args) {
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, new MyServiceImpl());
  }

}
