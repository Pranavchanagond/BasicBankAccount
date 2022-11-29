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

   public float calculateMaturityAmount( float p, float n ){
        float t = 60/12;
          float k =(1+rateOfInterest/100);
           k = (float) pow (k,n);
           return p * k;

    }

    public abstract float calculateInterest();

    public abstract float calculateAmountDeposited();
}
