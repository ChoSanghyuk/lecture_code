package com.timbuchalka;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    
    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name+" hamburger on a "+breadRollType+" roll with " + meat +", price is " +price );
    }
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price=0;
    private double addition2Price=0;
    private double addition3Price=0;
    private double addition4Price=0;
    
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added "+ name +" for an extra " + price);
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added "+ name +" for an extra " + price);
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added "+ name +" for an extra " + price);
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added "+ name +" for an extra " + price);
    }
    public double itemizeHamburger(){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }

}
