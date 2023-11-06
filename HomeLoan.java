package com.mycompany.budgetplan;
import java.util.*;
/**
 *
 * @author ke_or
 */
public class HomeLoan {
     Scanner input = new Scanner(System.in);


     //declaration
     private int purchasePrice, deposit, monthsToRepay;
     private int rentAmount;
     private double interestRate;

     //constructor method
     public HomeLoan()
     {
         purchasePrice = 0;
         deposit = 0;
         monthsToRepay = 0;
         interestRate = 0.0;
     }

     //override accessor and mutator methods for rental amount
     public void setRentalAmount()
     {
         System.out.print("What is the monthly rental amount for the property? ");
         rentAmount = input.nextInt();
     }
     public int getRentalAmount()
     {
         return rentAmount;
     }

     //override accessor and mutator methods for purchase price
     public void setPurchasePrice() 
     {
         //promts the user for purchase price
         System.out.print("How much is the property that you wish to purchase? ");
         purchasePrice = input.nextInt();
     }
     public int getPurchasePrice()
     {
         return purchasePrice;
     }

     //override accessor and mutator methods for deposit
     public void setDeposit() 
     {
         //prompts the user for the total deposit
         System.out.print("What is the total deposit for the property you wish to purchase? ");
         deposit = input.nextInt();
     }
     public int getDeposit()
     {
         return deposit;
     }

     //override accessor and mutator methods for interest rate
     public void setInterestRate()
     { 
         //prompts the user for the interest rate
         System.out.print("What is the interest rate from the property? (Example: 1,0; 2,5; 10,8; etc) ");
         interestRate = input.nextDouble();
     }
     public double getInterestRate()
     {
         return interestRate;
     }

     //override accessor and methods for months to pay
     public void setMonthsToRepay()
     { 
         //prompts the user for the months in which they will repay 
         System.out.print("What is the total MONTHS to repay for your property? (Choose between 240 & 360 months) ");
         monthsToRepay = input.nextInt();
     }
     public int getMonthsToRepay()
     {
         //nested if statements for different monthly repayment outcomes
         if (monthsToRepay < 240)
         { 
             monthsToRepay = 240;
             return monthsToRepay;
         }
         else
             if (monthsToRepay > 360)
         {
             monthsToRepay = 360;
             return monthsToRepay;
         }
         else
         return monthsToRepay;
     }
}
