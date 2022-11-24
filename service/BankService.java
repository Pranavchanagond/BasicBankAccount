package com.pranav.Bank.service;

import com.pranav.Bank.BankValidationException;
import com.pranav.Bank.acc.RDAccount;

public class BankService {

    public boolean validateData(float principal,int tenure,int age,String gender)throws BankValidationException{
        try{
            if(principal < 500) {
                throw new BankValidationException();
            }
        }
        catch(BankValidationException ex){
//            System.out.println("Invalid Data");
            return false;
        }
        try {
            if(tenure != 5 && tenure !=10){
                throw new BankValidationException();
            }
        } catch(BankValidationException e){
//            e.toString();
            return false;
        }

        try {
            if(gender != "Male" && gender != "Female"){
                throw new BankValidationException();
            }
        } catch(BankValidationException e){
//            e.toString();
            return false;
        }

        try {
            if(age < 1 || age > 100){
                throw new BankValidationException();
            }
        } catch(BankValidationException e){
//            e.toString();
            return false;
        }


        return true;
    }

    public void calculate(float principal,int tenure,int age,String gener){
        try {
            if(validateData(principal,tenure,age,gener) == true){
                RDAccount obj = new RDAccount(tenure,principal);
               obj.setInterest(age,gener);

               System.out.println("Interest = "+obj.calculateInterest());

                System.out.println("Amount Deposited = "+obj.calculateAmountDeposited());

                System.out.println("Maturity Amount = "+obj.calculateMaturityaAmount(principal,age));
            }
        } catch (BankValidationException e) {
            throw new RuntimeException(e);
        }

    }


}
