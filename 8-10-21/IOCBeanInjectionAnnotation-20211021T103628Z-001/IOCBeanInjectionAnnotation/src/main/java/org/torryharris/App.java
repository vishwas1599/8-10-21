package org.torryharris;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.torryharris");
        context.refresh();

        Customer customer = (Customer)context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("Mythili");

        Address address = customer.getAddress();
        address.setDoorNo("17");
        address.setStreet("dm street");
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setPin("560032");

        System.out.println(customer);

    }
}
