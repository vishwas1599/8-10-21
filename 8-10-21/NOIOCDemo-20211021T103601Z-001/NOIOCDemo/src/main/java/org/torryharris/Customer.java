package org.torryharris;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private int custId;
    private String custName;
    private Address address;

    public Customer(Address address)
    {
        this.address= address;
    }
}
