package org.cloudfoundry.community.servicebroker.mongodb.service;

import org.cloudfoundry.community.servicebroker.exception.ServiceBrokerException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceDoesNotExistException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceExistsException;
import org.cloudfoundry.community.servicebroker.exception.ServiceInstanceUpdateNotSupportedException;
import org.cloudfoundry.community.servicebroker.model.ServiceDefinition;
import org.cloudfoundry.community.servicebroker.model.ServiceInstance;
import org.cloudfoundry.community.servicebroker.mongodb.repository.MongoServiceInstanceRepository;
import org.cloudfoundry.community.servicebroker.service.ServiceInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by James on 7/6/2015.
 */
@Service
public class HelloServiceInstanceService implements ServiceInstanceService {
    private MongoServiceInstanceRepository repository;
    private HelloAdminService hello;
    @Autowired
    public HelloServiceInstanceService(HelloAdminService hello, MongoServiceInstanceRepository repository) {
        System.out.println("In HelloServiceInstanceService");
        this.hello = hello;
        this.repository = repository;
    }

    @Override
    public ServiceInstance createServiceInstance(ServiceDefinition service, String serviceInstanceId, String planId, String organizationGuid, String spaceGuid) throws ServiceInstanceExistsException, ServiceBrokerException {
        System.out.println("Creating service");
        System.out.println(service.getId());
        System.out.println(serviceInstanceId);
        ServiceInstance instance = new ServiceInstance(service.getId(), service.getId(), planId, organizationGuid, spaceGuid, null);
        return instance;
    }
    @Override
    public ServiceInstance getServiceInstance(String id) {
        return repository.findOne(id);
    }

    @Override
    public ServiceInstance deleteServiceInstance(String s, String s1, String s2) throws ServiceBrokerException {
        return null;
    }

    @Override
    public ServiceInstance updateServiceInstance(String s, String s1) throws ServiceInstanceUpdateNotSupportedException, ServiceBrokerException, ServiceInstanceDoesNotExistException {
        return null;
    }
}

