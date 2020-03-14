package example;

import com.ak.example.MyServiceImplServiceLocator;
public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          MyServiceImplServiceLocator locator = new MyServiceImplServiceLocator();
        String[] d= locator.getMyServiceImplPort().kk(1);
         for(String e:d){
             System.out.println(e);
         }
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
