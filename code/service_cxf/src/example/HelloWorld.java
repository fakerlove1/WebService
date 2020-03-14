package example;

import example.service.impl.MyServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;


public class HelloWorld {

  public static void main(String[] args) {
    JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
    jaxWsServerFactoryBean.setAddress("http://localhost:8081/cxf");
    jaxWsServerFactoryBean.setServiceClass(MyServiceImpl.class);
    jaxWsServerFactoryBean.create().start();
    System.out.println("server start");
  }
}
