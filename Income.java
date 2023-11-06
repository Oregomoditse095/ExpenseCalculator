package com.mycompany.budgetplan;
import java.util.*;
/**
 *
 * @author ke_or
 */
public class Income {
    protected int income, monthlyTax;

    Scanner input = new Scanner(System.in);

    public Income()
    {
        income = 0;
        monthlyTax = 0;
    }

    //accessor and mutator methods for gross income
    public void setIncome()
    {
        System.out.print("Enter your gross monthly income: ");
        income = input.nextInt();
    }

    public int getIncome()
    {
        return income;
    }

    //accessor and mutator methods for monthly tax deductions
    public void setMonthlyTax()
    {
        System.out.print("Enter your monthly tax deduction: ");
        monthlyTax = input.nextInt();
    }

    public int getMonthlyTax()
    {
        return monthlyTax;
    }

}
