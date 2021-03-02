package com.company;

public class Member extends Person{
    boolean isBasic;
    String membership;
    public String getMemberType(){
        if(isBasic == true){
            return "basic";
        }else{
            return "full";
        }
    }
    public int monthlyFee(){
        if(isBasic == true){
            return 199;
        }else{
            return 299;
        }
    }

    public Member(String name, String cpr, boolean isBasic) {
        this.name = name;
        this.cpr = cpr;
        this.isBasic = isBasic;
    }
}
