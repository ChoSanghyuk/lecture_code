package com.practice;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    public enum BodyTypes{
        PLANET, DWARF_PLANET, MOON;
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }
    
    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name, bodyType);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        // System.out.println("obj.getClass() is " + obj.getClass());
        // System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        Key objKey = ((HeavenlyBody) obj).getKey();
        return this.key.equals(objKey);
    }

    @Override
    public final int hashCode() {
        //System.out.println("hashcode called");
        return this.key.hashCode() + 57;
    }
    @Override
    public String toString(){
        return this.key + ", " + this.orbitalPeriod;
    }
    
    
    public static final class Key{
        private String name;
        private BodyTypes bodyType;
        
        private Key(String name, BodyTypes bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }
        public String getName(){
            return name;
        }
        public BodyTypes getBodyType(){
            return bodyType;
        }
        @Override
        public boolean equals(Object obj) {
            if(this == obj) {
                return true;
            }
            if ((obj == null) || (obj.getClass() != this.getClass())) {
                return false;
            }
    
            String objName = ((Key) obj).getName();
            if( ( this.name.equals(objName) ) && ( this.bodyType == ((Key) obj).getBodyType()  ) ){
                return true;
            }
            return false;
        }
    
        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() +57;
        }
        
        @Override
        public String toString(){
            return this.name +": "+ this.bodyType;
        }
        
    }
}
