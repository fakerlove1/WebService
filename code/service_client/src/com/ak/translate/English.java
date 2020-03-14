package com.ak.translate;

import com.ak.e.EnglishChineseLocator;
public class English {
    public static void main(String[] argv) {
        try {

            EnglishChineseLocator locator = new EnglishChineseLocator();
            String p[] = locator.getEnglishChineseSoap().translatorString("中国");
            for (String item : p) {
                System.out.println(item);
            }
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
