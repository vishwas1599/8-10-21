package org.torryharris;

import org.springframework.stereotype.Component;

//@Resources
@Component("service1")
public class ServiceA implements Service{
    @Override
    public String getInfo() {
        return "ServiceA info";
    }
}
