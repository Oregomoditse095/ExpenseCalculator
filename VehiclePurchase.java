/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetplan;
import java.util.*;
/**
 *
 * @author ke_or
 */
public class VehiclePurchase extends VehicleExpense {
    // Private declarations
    private String model, make;
    private int price, deposit, insurance, totalCost;
    private double rate;
    private Scanner input;

    // Default constructor
    public VehiclePurchase() {
        input = new Scanner(System.in);
        make = "";
        model = "";
        price = 0;
        deposit = 0;
        rate = 0.0;
        insurance = 0;
        totalCost = 0;
    }

    @Override
    public void setMake() {
        System.out.print("Which car make do you wish to purchase? ");
        make = input.nextLine();
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setModel() {
        System.out.print("What model is it? ");
        model = input.nextLine();
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setPrice() {
        System.out.print("What is the price for your dream vehicle? ");
        price = input.nextInt();
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setDeposit() {
        System.out.print("What is the deposit amount? ");
        deposit = input.nextInt();
    }

    @Override
    public int getDeposit() {
        return deposit;
    }

    @Override
    public void setRate() {
        System.out.print("What is the interest rate (Example: 2.8, 5.0, 3.4, etc)? ");
        rate = input.nextDouble();
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setInsurancePremium() {
        System.out.print("What is an estimate amount of the insurance premium? ");
        insurance = input.nextInt();
    }

    @Override
    public int getInsurancePremium() {
        return insurance;
    }
}
