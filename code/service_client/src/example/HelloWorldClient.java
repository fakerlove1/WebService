package example;

import com.ak.client.MyServiceImplServiceLocator;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          MyServiceImplServiceLocator locator = new MyServiceImplServiceLocator();
          int result=locator.getMyServiceImplPort().add(1,2);
          System.out.println(result);
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
