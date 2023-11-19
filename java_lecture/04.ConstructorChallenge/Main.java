package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    VipCustomer Jo = new VipCustomer();
	    VipCustomer Hong = new VipCustomer("Hong","cjlka@sdjfal.com");
	    VipCustomer Son = new VipCustomer("Son", 100_001, "asdjlk@dek.com");

        System.out.println(Jo.getEmail());
        System.out.println(Hong.getName());
        System.out.println(Son.getCreditLimit());
    }
}
