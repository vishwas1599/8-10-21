package org.torryharris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Customer customer = (Customer)context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("Mythili");

        Address  address = (Address)customer.getAddress();
        address.setDoorNo("17");
        address.setStreet("DM street");
        address.setCity("Bangalore");
        address.setState("karnataka");
        address.setPin("560032");

        Account account = (Account)customer.getAccount();
        account.setAccId("1001");
        account.setAcctype("Savings");

        System.out.println(customer);


        ClassPathXmlApplicationContext  cpc =  (ClassPathXmlApplicationContext)  context;
        // ((ClassPathXmlApplicationContext) context).close();
        cpc.close();
    }
}
