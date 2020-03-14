package example.service.impl;

import example.service.ServiceInterface;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.Map;

/**
 * 这个是 服务的实体类 ，具体服务的逻辑代码写在这里
 */
@WebService
public class MyServiceImpl implements ServiceInterface {
    @Override
    public int add(int a, int b) {
        System.out.println("这个是Service  的加法");
        return a+b;
    }

    @Override
    public int mins(int a, int b) {
        System.out.println("进行了减法");
        return a-b;
    }


    @Override
    @XmlJavaTypeAdapter(MapListAdatper.class)
    public Map<String,Object> kk(int  a) {
        Map<String,Object> map = new HashMap<>();
        map.put("code","200");
        map.put("message","the message is right");
        map.put("data",a);
        return map;
    }
}
