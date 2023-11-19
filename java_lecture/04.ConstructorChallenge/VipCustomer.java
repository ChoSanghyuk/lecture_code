package com.timbuchalka;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("Jo", 100_000 , "ganada@naver.com");
    }

    public VipCustomer(String name, String email){
        this(name, 100_000, email);
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
