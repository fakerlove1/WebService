package example;

import example.service.impl.MyServiceImpl;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * 发布 服务的总体类
 * 使用的方法 为 JAX-WS
 */
public class HelloWorld {

  public static void main(String[] args) {


    JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
    jaxWsServerFactoryBean.setAddress("http://localhost:8081/cxf");
    jaxWsServerFactoryBean.setServiceClass(MyServiceImpl.class);

    jaxWsServerFactoryBean.create().start();
    System.out.println("server start");
  }
}
