package org.torryharris;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private String doorNo;
    private String street;
    private String  city;
    private String state;
    private String  pin;


}
