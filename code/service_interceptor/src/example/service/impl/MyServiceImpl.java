package example.service.impl;

import example.service.ServiceInterface;

import javax.jws.WebService;

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
}
