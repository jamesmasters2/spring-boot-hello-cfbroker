package org.cloudfoundry.community.servicebroker.hello.service;

import org.springframework.stereotype.Service;

/**
 * Created by James on 7/6/2015.
 */
@Service
public class HelloAdminService {
    public String sayHello() {
        System.out.println("Hello from sayHello");
        return "hello";
    }
}
