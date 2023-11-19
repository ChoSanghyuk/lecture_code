package com.practice;

public class Moon extends HeavenlyBody {
    private String name;
    private double orbitalPeriod;
    
    public Moon(String name, double orbitalPeriod){
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
