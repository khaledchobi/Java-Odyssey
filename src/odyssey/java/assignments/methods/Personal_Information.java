package src.odyssey.java.assignments.methods;

import java.util.Scanner;

public class Personal_Information {
    static Scanner scanner = new Scanner( System.in );

    public static void main(String args[]) {
        Information();
    }

    public static void Information(){
        String Full_Name = FullName();

        System.out.println( "There once was a person named " + Full_Name + " who lived in " + Address()
                + ". At the age of " + Age() + ", " + Full_Name + " went to collage at " + Collage() + ". "
                + Full_Name + " graduated and went to work as a " + Profession() + ". \nThen, " + Full_Name
                + " adopted a " + Animal() + " named " + PetName() + ". They both lived happily ever after!" );
    }

    public static String FullName(){
        String fname, mname, lname;
        System.out.println( "Please enter your first name: " );
        fname = scanner.nextLine();
        System.out.println( "Please enter your middle name: " );
        mname = scanner.nextLine();
        System.out.println( "Please enter your last name: " );
        lname = scanner.nextLine();
        String full_name = fname + " " + mname + " " + lname;
        return full_name;
    }
    public static String Address(){
        String house, street, city, state, zip_code;
        System.out.println( "Please enter your House no: " );
        house = scanner.nextLine();
        System.out.println( "Please enter your Street name: " );
        street = scanner.nextLine();
        System.out.println( "Please enter your city: " );
        city = scanner.nextLine();
        System.out.println( "Please enter your State: " );
        state = scanner.nextLine();
        System.out.println( "Please enter your Zip Code: " );
        zip_code = scanner.nextLine();
        String address = house + ", " + street + ", " + city + ", " + state + "-" + zip_code;
        return address;
    }
    public static int Age(){
        int age;
        System.out.println( "Please enter your age: " );
        age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }
    public static String Collage(){
        String collage;
        System.out.println( "Please enter your collage: " );
        collage = scanner.nextLine();
        return collage;
    }
    public static String Profession(){
        String profession;
        System.out.println( "Please enter your profession: " );
        profession = scanner.nextLine();
        return profession;
    }
    public static String Animal(){
        String animal;
        System.out.println( "Please enter a type of animal: " );
        animal = scanner.nextLine();
        return animal;
    }
    public static String PetName(){
        String pet_name;
        System.out.println( "Please enter the name of your pet: " );
        pet_name = scanner.nextLine();
        return pet_name;
    }
}
