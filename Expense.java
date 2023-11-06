/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetplan;

/**
 *
 * @author ke_or
 */
public abstract class Expense {
    // Declarations of abstract methods
    public abstract void setRentalAmount();

    public abstract int getRentalAmount();

    public abstract void setPurchasePrice();

    public abstract int getPurchasePrice();

    public abstract void setDeposit();

    public abstract int getDeposit();

    public abstract void setInterestRate();

    public abstract double getInterestRate();

    public abstract void setMonthsToRepay();

    public abstract int getMonthsToRepay();

}
