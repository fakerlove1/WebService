package example.service.impl;

        import example.service.ServiceInterface;

        import javax.jws.WebMethod;
        import javax.jws.WebParam;
        import javax.jws.WebResult;
        import javax.jws.WebService;
        import javax.xml.ws.spi.WebServiceFeatureAnnotation;

/**
 * 这个是 服务的实体类 ，具体服务的逻辑代码写在这里
 */
@WebService(name = "My_Self",portName = "My_Port_Name",serviceName = "my_Service_Name")
public class MyServiceImpl implements ServiceInterface {


    @Override
    public int add(int a, int b) {
        System.out.println("这个是Service  的加法");
        return a+b;
    }


    @WebMethod(exclude = true)
    @Override
    public int mins(int a, int b) {
        System.out.println("进行了减法");
        return a-b;
    }
}
