package com.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit  {
    public void wear(){
        System.out.println("Mac bikini");
    }
}
