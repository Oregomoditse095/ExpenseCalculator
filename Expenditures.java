package com.mycompany.budgetplan;
import java.util.*;
/**
 *
 * @author ke_or
 */
public class Expenditures extends Income{
    Scanner input = new Scanner(System.in);
    
    //declarations
    private int groceries, waterLights, travelCosts, phone, other;

    //constructor method
    public Expenditures()
    {
        groceries = 0;
        waterLights = 0;
        travelCosts = 0;
        phone = 0;
        other = 0;
    }

    //accessor and mutator method for groceries
    public void setGroceries()
    {
        System.out.print("Enter an estimate amount for your monthly groceries: ");
        groceries = input.nextInt();
    }

    public int getGroceries()
    {
        return groceries;
    }

    //accessor and mutator methods for water and lights
    public void setWaterLights()
    {
        System.out.print("Enter an estimate bill amount for you water and lights: ");
        waterLights = input.nextInt();
    }

    public int getWaterLights()
    {
        return waterLights;
    }

    //accessor and mutator methods for traveling costs
    public void setTravelCosts()
    {
        System.out.print("Enter an estimate amount for your traveling costs (including petrol): ");
        travelCosts = input.nextInt();
    }

    public int getTravelCosts()
    {
        return travelCosts;
    }

    //accessor and mutator methods for phone bills
    public void setPhone()
    {
        System.out.print("Enter an estimate amount for your phone bill: ");
        phone = input.nextInt();
    }
    public int getPhone()
    {
        return phone;
    }

    //accesor and mutator methods for other expenses
    public void setOther()
    {
        System.out.print("Enter an estimate amount for ALL your other expenses: ");
        other = input.nextInt();
    }

    public int getOther()
    {
        return other;
    }

    
}
