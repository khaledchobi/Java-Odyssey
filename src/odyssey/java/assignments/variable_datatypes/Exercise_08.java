package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_08 {
    public static void main(String args[]) {

        // 08. Sales Tax.

        final double state_tax_percentage = 0.04;
        final double county_tax_percentage = 0.02;
        double purchase_amount;
        double county_tax;
        double state_tax;
        double total_sales_tax;
        double total_sale;
        purchase_amount = 10;

        //System.out.println( "Please enter the purchase amount: " );
        county_tax = county_tax_percentage * purchase_amount;
        state_tax = state_tax_percentage * purchase_amount;
        total_sales_tax = state_tax + county_tax;
        total_sale = total_sales_tax + purchase_amount;
        System.out.println("Purchase amount: $" + purchase_amount + "\nState sales tax: $"
                + state_tax + "\nCounty sales tax: $" + county_tax + "\nTotal sales tax: $"
                + total_sales_tax + "\nTotal sale: $" + total_sale);

    }
}
