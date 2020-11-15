package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_02 {
    public static void main(String args[]){

        // 02. Personal Information.

        String name, city, state, collage_major, email;
        byte telephone_number1;
        short telephone_number2, telephone_number3, telephone_number4, zip_code;

        name = "Khaled Hasan";
        email = "khaled_chobi@yahoo.com";
        city = "Waterford";
        state = "Connecticut";
        zip_code = 6385;
        telephone_number1 = +1;
        telephone_number2 = 929;
        telephone_number3 = 336;
        telephone_number4 = 8556;
        collage_major = "Photography";

        // Step 3: Variable Execution/uses. Print all the variable value.
        System.out.println("Name: " + name + ".");
        System.out.println("Address: " + city + "," + state + "-0" + zip_code + ".");
        System.out.println("Telephone Number: +" + telephone_number1 + telephone_number2 + telephone_number3 + telephone_number4 +".");
        System.out.println("Collage Major: " + collage_major + ".");
        System.out.println("Email: " + email + ".");

    }
}
