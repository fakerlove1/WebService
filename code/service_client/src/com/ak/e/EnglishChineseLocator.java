/**
 * EnglishChineseLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ak.e;

public class EnglishChineseLocator extends org.apache.axis.client.Service implements com.ak.e.EnglishChinese {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中文&lt;-&gt;英文双向翻译WEB服务，永久免费</strong>。提供词典翻译、音标（拼音）、解释、相关词条、例句、读音（英文Only）、候选词等功能。</br>传递中文参数请使用UTF-8编码，使用本站WEB服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持！<br /><br /><img alt="Ject.cn" title="www.Ject.cn" src="http://www.ject.cn/images/ject_logo_1616.gif"
 * style="vertical-align: middle;" /> <a href="http://www.ject.cn/" target="_blank">中英文双向翻译网站
 * <img alt="Zip" title="Zip file" src="http://www.ject.cn/images/icon/zip.gif"
 * style="vertical-align: middle;" /> .Net实例下载</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
 * alt="PDF" title="PDF file" src="http://www.ject.cn/images/icon/pdf.gif"
 * style="vertical-align: middle;" /> <a href="http://fy.webxml.com.cn/files/TranslatorWebServiceHelp.pdf"
 * target="_blank">接口开发帮助文档</a><br /><br />&nbsp;
 */

    public EnglishChineseLocator() {
    }


    public EnglishChineseLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnglishChineseLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnglishChineseSoap12
    private java.lang.String EnglishChineseSoap12_address = "http://fy.webxml.com.cn/webservices/EnglishChinese.asmx";

    public java.lang.String getEnglishChineseSoap12Address() {
        return EnglishChineseSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnglishChineseSoap12WSDDServiceName = "EnglishChineseSoap12";

    public java.lang.String getEnglishChineseSoap12WSDDServiceName() {
        return EnglishChineseSoap12WSDDServiceName;
    }

    public void setEnglishChineseSoap12WSDDServiceName(java.lang.String name) {
        EnglishChineseSoap12WSDDServiceName = name;
    }

    public com.ak.e.EnglishChineseSoap_PortType getEnglishChineseSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnglishChineseSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnglishChineseSoap12(endpoint);
    }

    public com.ak.e.EnglishChineseSoap_PortType getEnglishChineseSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ak.e.EnglishChineseSoap12Stub _stub = new com.ak.e.EnglishChineseSoap12Stub(portAddress, this);
            _stub.setPortName(getEnglishChineseSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnglishChineseSoap12EndpointAddress(java.lang.String address) {
        EnglishChineseSoap12_address = address;
    }


    // Use to get a proxy class for EnglishChineseSoap
    private java.lang.String EnglishChineseSoap_address = "http://fy.webxml.com.cn/webservices/EnglishChinese.asmx";

    public java.lang.String getEnglishChineseSoapAddress() {
        return EnglishChineseSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnglishChineseSoapWSDDServiceName = "EnglishChineseSoap";

    public java.lang.String getEnglishChineseSoapWSDDServiceName() {
        return EnglishChineseSoapWSDDServiceName;
    }

    public void setEnglishChineseSoapWSDDServiceName(java.lang.String name) {
        EnglishChineseSoapWSDDServiceName = name;
    }

    public com.ak.e.EnglishChineseSoap_PortType getEnglishChineseSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnglishChineseSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnglishChineseSoap(endpoint);
    }

    public com.ak.e.EnglishChineseSoap_PortType getEnglishChineseSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ak.e.EnglishChineseSoap_BindingStub _stub = new com.ak.e.EnglishChineseSoap_BindingStub(portAddress, this);
            _stub.setPortName(getEnglishChineseSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnglishChineseSoapEndpointAddress(java.lang.String address) {
        EnglishChineseSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ak.e.EnglishChineseSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ak.e.EnglishChineseSoap12Stub _stub = new com.ak.e.EnglishChineseSoap12Stub(new java.net.URL(EnglishChineseSoap12_address), this);
                _stub.setPortName(getEnglishChineseSoap12WSDDServiceName());
                return _stub;
            }
            if (com.ak.e.EnglishChineseSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ak.e.EnglishChineseSoap_BindingStub _stub = new com.ak.e.EnglishChineseSoap_BindingStub(new java.net.URL(EnglishChineseSoap_address), this);
                _stub.setPortName(getEnglishChineseSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EnglishChineseSoap12".equals(inputPortName)) {
            return getEnglishChineseSoap12();
        }
        else if ("EnglishChineseSoap".equals(inputPortName)) {
            return getEnglishChineseSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "EnglishChinese");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "EnglishChineseSoap12"));
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "EnglishChineseSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnglishChineseSoap12".equals(portName)) {
            setEnglishChineseSoap12EndpointAddress(address);
        }
        else 
if ("EnglishChineseSoap".equals(portName)) {
            setEnglishChineseSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
