package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_12 {
    public static void main(String args[]) {

        // 12. String Manipulator.

        String user_favorite_city;

        user_favorite_city = "Dhaka";

        System.out.println( "The number of characters in " + user_favorite_city + " is " +  user_favorite_city.length() + ".");
        System.out.println( user_favorite_city + " converted to upper case is " +  user_favorite_city.toUpperCase() + ".");
        System.out.println( user_favorite_city + " converted to lower case is " +  user_favorite_city.toLowerCase() + ".");
        System.out.println( "The first character in " + user_favorite_city + " is " + user_favorite_city.charAt( 0 ) + ".");

    }
}
