package org.cloudfoundry.community.servicebroker.hello.service;

import org.cloudfoundry.community.servicebroker.exception.ServiceBrokerException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceBindingExistsException;
import org.cloudfoundry.community.servicebroker.model.ServiceInstance;
import org.cloudfoundry.community.servicebroker.model.ServiceInstanceBinding;
//import org.cloudfoundry.community.servicebroker.hello.repository.MongoServiceInstanceBindingRepository;
import org.cloudfoundry.community.servicebroker.service.ServiceInstanceBindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by James on 7/6/2015.
 */
@Service
public class HelloServiceInstanceBindingService implements ServiceInstanceBindingService {
    private HelloAdminService helloAdminService;
  //  private MongoServiceInstanceBindingRepository repository;

    @Autowired
    public HelloServiceInstanceBindingService(HelloAdminService helloAdminService) {
        this.helloAdminService = helloAdminService;
    }

    @Override
    public ServiceInstanceBinding createServiceInstanceBinding(String s, ServiceInstance serviceInstance, String s1, String s2, String s3) throws ServiceInstanceBindingExistsException, ServiceBrokerException {
        return null;
    }

    @Override
    public ServiceInstanceBinding deleteServiceInstanceBinding(String s, ServiceInstance serviceInstance, String s1, String s2) throws ServiceBrokerException {
        return null;
    }
}
