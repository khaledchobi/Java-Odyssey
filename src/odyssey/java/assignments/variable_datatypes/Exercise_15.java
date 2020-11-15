package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_15 {
    public static void main(String args[]) {

        // 15. Energy Drink Consumption.

        int surveyed_customers = 12467;
        double energy_drink_customers = 0.14 * surveyed_customers;
        double citrus_flavored_customers = 0.64 * energy_drink_customers;


        System.out.println( "Out of " + surveyed_customers + " customers, approximately "
                + ( int )energy_drink_customers
                + " buy one or two energy drinks. And out of those, approximately "
                + ( int )citrus_flavored_customers + " prefer citrus flavored energy drinks. " );

    }
}
