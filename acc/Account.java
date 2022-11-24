package com.pranav.Bank.acc;

public abstract class Account {
    int tenure;
    float principal;
    float rateOfInterest;

    public void setInterest(int age,String gender){
        if (gender=="Male"){
            if(age<60){
                rateOfInterest=9.8f;
            }
            else rateOfInterest = 10.5f;
        }
        else if(gender == "Female"){
            if(age < 58){
                rateOfInterest = 10.2f;
            }
            else rateOfInterest = 10.8f;
        }
    }

    public float calculateMaturityaAmount(float totalPrincipleDeposited,float maturityInterest){
          return totalPrincipleDeposited + maturityInterest;
    }

    public abstract float calculateInterest();

    public abstract float calculateAmountDeposited();
}
