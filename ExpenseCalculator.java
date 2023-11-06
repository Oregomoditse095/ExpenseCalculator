package com.mycompany.budgetplan;
import java.util.*;
/**
 *
 * @author Oregomoditse Makinta
 */
public class ExpenseCalculator {

    public static void main(String[] args) {
        // Declarations
        Scanner input = new Scanner(System.in);
        String answer, response;
        int expenses;
        final int YEARS = 5;
        final int PERCENTAGE = 75;
        double moneyLeft, totalExpenses, sum1, sum2;

        // Declarations for property
        double i, n, P, num, A, monthlyHomeLoan, m1, m2, amount;

        // Declarations for vehicle
        double interest, principle, number, futureVal, installment, totalMonthlyPayment, m3, m4;

        // Declare a list
        List<Integer> alist = new ArrayList<>();

        // Object declarations
        Income income = new Income();
        Expenditures expenditure = new Expenditures();
        HomeLoan property = new HomeLoan();
        VehiclePurchase vehicle = new VehiclePurchase();

        income.setIncome();
        income.setMonthlyTax();
        expenditure.setGroceries();
        expenditure.setWaterLights();
        expenditure.setTravelCosts();
        expenditure.setPhone();
        expenditure.setOther();

        // Saving "variables" using generics
        alist.add(expenditure.getGroceries());
        alist.add(expenditure.getWaterLights());
        alist.add(expenditure.getTravelCosts());
        alist.add(expenditure.getPhone());
        alist.add(expenditure.getOther());

        // Console output
        System.out.println("\nYour monthly gross income is: R" + income.getIncome() + "\n"
                + "With the tax fee of : R" + income.getMonthlyTax() + "\nGrocery expense: R"
                + alist.get(0) + "\nWater and Lights expense: R" + alist.get(1) +
                "\nTraveling costs (including petrol): R" + alist.get(2) + "\nPhone bills: R"
                + alist.get(3) + "\nOther expenses: R" + alist.get(4));

        // Prompts the user if they would like to rent or buy
        System.out.print("\n" + "Would you like to rent or buy a property (Please input 'rent', 'buy', or 'neither')? ");
        answer = input.nextLine();

        // If statement for selection between rent and buy
        if (answer.equals("rent") || answer.equals("rent property")) {
            property.setRentalAmount();
            System.out.println("\n" + "Your rental monthly amount is R" + property.getRentalAmount());
            System.out.println("\nPress 'Enter' to continue...");
            input.nextLine();
        } else if (answer.equals("buy") || answer.equals("buy property")) {
            property.setPurchasePrice();
            property.setDeposit();
            property.setInterestRate();
            property.setMonthsToRepay();
        }

        // Calculate a certain percentage of the price input
        num = property.getInterestRate() * property.getPurchasePrice() / 100;
        // Calculate principle
        P = property.getPurchasePrice() - num;
        // Calculate interest rate
        i = property.getInterestRate() / 100;
        // Calculate number of years
        n = property.getMonthsToRepay() / 12;
        // Calculate "future" value of property
        // Using a function to get a proper value
        m1 = i * Math.round(n);
        m2 = 1 + m1;
        A = P * m2;
        // Calculate monthly installment of property
        monthlyHomeLoan = A / property.getMonthsToRepay();
        // Calculating a third of the monthly payment
        amount = 1 / 3 * income.getIncome();

        // Calculating the money left that the user will have
        expenses = income.getMonthlyTax() + expenditure.getGroceries() + expenditure.getWaterLights()
                + expenditure.getTravelCosts() + expenditure.getPhone() + expenditure.getOther();

        if (income.getIncome() < amount) {
            // Calculate money left if not eligible for property
            double moneyLeft1 = income.getIncome() - expenses;

            System.out.println("\n" + "\nYou are not eligible for this loan or property.\nTherefore...");
            // Console output for the money left
            System.out.println("\n" + "\nThe money left from your expenses will be: R" + moneyLeft1);
            System.out.println("\nPress 'Enter' to continue...");
            input.nextLine();
        } else {
            System.out.println("\n" + "Property price: R" + property.getPurchasePrice()
                    + "\nDeposit for property: R" + property.getDeposit() + "\nProperty interest rate: "
                    + property.getInterestRate() + "%" + "\nMonths to pay for property: " + property.getMonthsToRepay()
                    + " months.\nThe monthly payment is: R" + monthlyHomeLoan);

            // Calculate money left if eligible for property purchase
            moneyLeft = income.getIncome() - expenses - monthlyHomeLoan;

            // Console output for the money left
            System.out.println("\n" + "The money left from your expenses will be: R" + moneyLeft);
            System.out.println("\nPress 'Enter' to continue...");
            input.nextLine();
        }

        // Added question that prompts the user if they want to purchase a vehicle
        System.out.print("Do you wish to purchase a vehicle? (Please input 'yes' or 'no') ");
        response = input.nextLine();

        // 'if' statement(s) that relate to the vehicle prompt question
        if (response.equals("yes")) {
            vehicle.setMake();
            vehicle.setModel();
            vehicle.setPrice();
            vehicle.setDeposit();
            vehicle.setRate();
            vehicle.setInsurancePremium();
        } else if (response.equals("no")) {
            System.out.println("Smart way to save money. Wink.");
        }

        // Calculate a certain percentage of the price input
        number = vehicle.getRate() * vehicle.getPrice() / 100;
        // Calculate principle
        principle = vehicle.getPrice() - number;
        // Calculate interest rate
        interest = vehicle.getRate() / 100;
        // Calculate "future" value of vehicle
        m3 = interest * YEARS;
        m4 = 1 + m3;
        futureVal = m4 * principle;
        // Calculate monthly installment of the vehicle
        installment = futureVal / vehicle.getPrice();
        // Calculate insurance
        totalMonthlyPayment = installment + vehicle.getInsurancePremium();

        // Console output
        System.out.println("Make: " + vehicle.getMake() + "\nModel: " + vehicle.getModel() + "\nPurchase Price: R"
                + vehicle.getPrice() + "\nDeposit: R" + vehicle.getDeposit() + "\nInterest Rate: " + vehicle.getRate()
                + "% \nThe Insurance Premium payment is: R" + vehicle.getInsurancePremium() +
                "\nTherefore the monthly cost for your vehicle alone is R" + totalMonthlyPayment);
        System.out.println("Press 'Enter' to continue...");
        input.nextLine();

        // Calculating if the user's expenses cost more than 75% of their income
        totalExpenses = expenses + monthlyHomeLoan;
        sum1 = PERCENTAGE / 100;
    }
}
