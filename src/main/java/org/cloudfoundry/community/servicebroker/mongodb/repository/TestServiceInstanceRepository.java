package org.cloudfoundry.community.servicebroker.mongodb.repository;

import org.cloudfoundry.community.servicebroker.model.ServiceInstance;
import org.springframework.data.mongodb.repository.MongoRepository;

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