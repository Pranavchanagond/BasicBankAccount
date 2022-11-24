package com.pranav.Bank;

import com.pranav.Bank.service.BankService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BankValidationException {
        Scanner in = new Scanner(System.in);
        int tenure;

//        System.out.println("tenure only 5 or 10");
        tenure=5;
//        System.out.println("Principal > 500");
        float principal=1000;
//        System.out.println("Enter age");
        int age=50;
//        System.out.println("Enter Gender");
        String gender="Male";

        BankService b = new BankService();
        b.calculate(principal,tenure,age,gender);
        b.validateData(principal,tenure,age,gender);


    }
}
