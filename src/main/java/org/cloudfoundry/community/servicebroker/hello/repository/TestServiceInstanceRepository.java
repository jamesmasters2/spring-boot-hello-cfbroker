package org.cloudfoundry.community.servicebroker.hello.repository;

/**
 * Repository for ServiceInstance objects
 * 
 * @author sgreenberg@gopivotal.com
 *
 */
public class TestServiceInstanceRepository {
    public String sayHello() {
        System.out.println("Hello from sayHello");
        return "hello";
    }
}