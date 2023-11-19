package com.practice;

public class Planet extends HeavenlyBody{
   private String name;
   private double orbitalPeriod;
   
   public Planet(String name, double orbitalPeriod){
       super(name, orbitalPeriod, BodyTypes.PLANET);
   }
   @Override
   public boolean addSatellite(HeavenlyBody satellite) {
       if (satellite.getKey().getBodyType() == BodyTypes.MOON){
           return super.addSatellite(satellite);
        }
        return false;
    }
}
