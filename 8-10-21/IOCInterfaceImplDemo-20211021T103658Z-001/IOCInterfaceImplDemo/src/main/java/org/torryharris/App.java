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
        THClient c1 = (THClient) context.getBean("client1");
        System.out.println(c1.deposit(1234L,10000.0));
        System.out.println();
        System.out.println(c1.withdraw(1234L,4000.0));
        System.out.println();
        System.out.println(c1.getBalance(1234L));

        THClient c11 = (THClient) context.getBean("client1");
        System.out.println(c11.deposit(12341L,10000.0));
        System.out.println();
        System.out.println(c11.withdraw(12341L,4000.0));
        System.out.println();
        System.out.println(c11.getBalance(12341L));



        System.out.println("******************************************************");

        THClient c2 = (THClient) context.getBean("client2");
        System.out.println(c2.deposit(12342L,10000.0));
        System.out.println();
        System.out.println(c2.withdraw(12342L,4000.0));
        System.out.println();
        System.out.println(c2.getBalance(12342L));

        THClient c21 = (THClient) context.getBean("client2");
        System.out.println(c21.deposit(123422L,10000.0));
        System.out.println();
        System.out.println(c21.withdraw(123422L,4000.0));
        System.out.println();
        System.out.println(c21.getBalance(123422L));

        System.out.println(c2==c21);







        ((ClassPathXmlApplicationContext) context).close();

    }
}
