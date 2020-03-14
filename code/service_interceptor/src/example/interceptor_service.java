package example;

import example.service.impl.MyServiceImpl;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 拦截器的 写法
 */
public class interceptor_service {

    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress("http://localhost:8081/cxf");
        jaxWsServerFactoryBean.setServiceClass(MyServiceImpl.class);
        //服务端入拦截器
        jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        //服务端出拦截器
        jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        jaxWsServerFactoryBean.create().start();
        System.out.println("server start");
    }
}
