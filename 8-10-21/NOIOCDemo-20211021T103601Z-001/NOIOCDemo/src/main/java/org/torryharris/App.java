package org.torryharris;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

          /*Address address = new Address();
          address.setDoorNo("17");
          address.setStreet("Dream Medows layout street");
          address.setCity("Bangalore");
          address.setState("Karnataka");
          address.setPin("560032");*/

        Address address = new Address("17","DM street","Bangalore","Karnataka","560032");

          /*Customer cust = new Customer();
          cust.setCustId(100);
          cust.setCustName("Mythili");
          cust.setAddress(address);*/
        //Customer cust = new Customer(100,"Mythili",address);
        Customer cust = new Customer(address);
        cust.setCustId(100);
        cust.setCustName("Mythili");
        //cust.setAddress(address);



        System.out.println(cust);



    }
}
