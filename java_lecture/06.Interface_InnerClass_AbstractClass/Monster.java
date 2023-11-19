package com.practice;

import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    
    public Monster(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public String getName(){
        return name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public int getStrength(){
        return strength;
    }
    public List<String> write(){
        List<String> list = new ArrayList();
        list.add(name);
        list.add(""+hitPoints);
        list.add(""+strength);
        return list;
    }
    public void read(List<String> list){
        if(list != null && list.size()>0){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
        
    }
    public String toString(){
        return "Player{name='" + name+ "', hitPoints=" + hitPoints +", strength=" +strength+"}";
    }
    
}
