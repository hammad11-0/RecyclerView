package com.example.recyclerview;

public class friends {
    private int id;
    private String name;
    private int dob;
    private String city;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public friends(int i,String n,int d,String c)
    {
        this.id=i;
        this.name=n;
        this.dob=d;
        this.city=c;

    }






}
