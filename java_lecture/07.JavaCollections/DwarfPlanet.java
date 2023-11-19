package com.practice;

public class DwarfPlanet extends HeavenlyBody{
    private String name;
    private double orbitalPeriod;
    
    public DwarfPlanet(String name, double orbitalPeriod){
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
