package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_14 {
    public static void main(String args[]) {

        // 14. Stock Commission.

        double total_stock = 21.77 * 600;
        double commission_of_stock = 0.02 * total_stock;
        double total_amount = total_stock + commission_of_stock;

        System.out.println("Kathryn paid $" + total_stock + " for the shares. She Paid $"
                + commission_of_stock + " to her stock broker, paying a total of $" + total_amount + ".");
    }
}
