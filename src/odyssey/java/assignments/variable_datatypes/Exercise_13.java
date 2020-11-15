package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_13 {
    public static void main(String args[]) {

        // 13. Restaurant Bill.

        double meal_cost, tax, total_cost, tip, total_bill;
        meal_cost = 237;

        tax = 0.0675 * meal_cost;
        total_cost = meal_cost + tax;
        tip = 0.15 * total_cost;
        total_bill = total_cost + tip;

        System.out.println( "Cost of meal: $" + meal_cost );
        System.out.println( "Tax         : $" + tax );
        System.out.println( "Tip         : $" + tip );
        System.out.println( "Total Bill  : $" + total_bill );

    }
}
