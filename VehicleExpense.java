/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.budgetplan;

/**
 *
 * @author ke_or
 */
public abstract class VehicleExpense {
    // Abstract methods for setting and getting vehicle information
    public abstract void setModel();
    public abstract String getModel();

    public abstract void setMake();
    public abstract String getMake();

    public abstract void setPrice();
    public abstract int getPrice();

    public abstract void setDeposit();
    public abstract int getDeposit();

    public abstract void setRate();
    public abstract double getRate();

    public abstract void setInsurancePremium();
    public abstract int getInsurancePremium();

}
