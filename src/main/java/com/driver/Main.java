package com.driver;

public class Main {

    public static void main (String args []){
        RWOnly obj=new RWOnly("prasad");
        // Error: 'name' has private access in RWOnly
        // obj.name = "New Name";

        // Error: 'name' has private access in RWOnly
        // System.out.println(obj.name);

        // use a setter to set name
        obj.setName("nikhil");

        //use a getter to get name
        System.out.println("name: "+obj.getName());
    }
}