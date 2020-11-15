package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_17 {
    public static void main(String args[]) {

        // 17. Stock Transaction Program.

        int number_of_shares_purchased = 1000;
        double price_per_share_purchased = 32.87;
        double amount_paid_for_stock = number_of_shares_purchased * price_per_share_purchased;
        double broker_purchase_commission = 0.02 * amount_paid_for_stock;

        int number_of_shares_sold = 1000;
        double price_per_share_sold = 33.92;
        double amount_receive_for_stock = number_of_shares_sold * price_per_share_sold;
        double broker_sales_commission = 0.02 * amount_receive_for_stock;

        double total_profit = ( amount_receive_for_stock - broker_sales_commission) - ( amount_paid_for_stock + broker_purchase_commission );

        System.out.println( "Amount of money Joe paid for the stock: $" + amount_paid_for_stock + "." );
        System.out.println( "Amount of commission Joe paid for buying the stock: $" + broker_purchase_commission + "." );
        System.out.println( "Amount of money Joe received for the stock: $" + amount_receive_for_stock + "." );
        System.out.println( "Amount of commission Joe paid for selling the stock: $" + broker_sales_commission + "." );
        System.out.println( "Amount of profit/loss Joe made: $" + total_profit + "." );


    }
}
