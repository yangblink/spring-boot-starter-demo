package org.example;

public class HelloService {
    HelloProperties helloProperties;

    public String sayHello(String name) {
        return "hello" + name + "," + helloProperties.getSuffix();
    }
    public HelloProperties getHelloProperties() {
        return helloProperties;
    }
    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
