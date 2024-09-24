package com.example.example;

import org.springframework.stereotype.Service;

//@Component @Service @Respository can be used for the Bean . Those are extended Version . So you can use one of them .
//@Service
public class FirstClass {
    private String myFirstVariable;

    public FirstClass(String myFirstVariable) {
        this.myFirstVariable = myFirstVariable;
    }

    public String Hello()
    {
        return "Hello From the Class and the var is " + myFirstVariable;
    }
}
