package com.company;
import java.util.Scanner;  // Import the Scanner class
public class Application {

    public static void main(String[] args) {
        int i = 0;
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.annualInterestRate = 0.04;
        saver1.savingsBalance = 2000.00;

        saver2.annualInterestRate = 0.04;
        saver2.savingsBalance = 3000.00;
        System.out.println("Saver 1");
        while(i < 12){
            saver1.savingsBalance = calculateMonthlyInterest(saver1.savingsBalance, saver1.annualInterestRate);
            i++;

        }
        i = 0;
        System.out.println("Saver 2");
        while(i < 12){
            saver2.savingsBalance =calculateMonthlyInterest(saver2.savingsBalance, saver2.annualInterestRate);

            i++;
        }

        System.out.println("Saver 1");
        saver1.annualInterestRate = modifyInterestRate(saver1.annualInterestRate, 0.05);
        System.out.println("Saver 2");
        saver2.annualInterestRate = modifyInterestRate(saver2.annualInterestRate, 0.05);
        System.out.println("Saver 1");
        calculateMonthlyInterest(saver1.savingsBalance, saver1.annualInterestRate);
        System.out.println("Saver 2");
        calculateMonthlyInterest(saver2.savingsBalance, saver2.annualInterestRate);

    }

    public static double calculateMonthlyInterest(double savingsBalance, double annualInterestRate){
        savingsBalance = ((savingsBalance * annualInterestRate) / 12) + savingsBalance;
        System.out.println("You have a savings balance of $" + savingsBalance + ".");
        return savingsBalance;
    }

    public static double modifyInterestRate (double annualInterestRates, double newRate){
        annualInterestRates = newRate;
        System.out.println("The new interest rate is now " + annualInterestRates + "%");
        return annualInterestRates;
    }
}