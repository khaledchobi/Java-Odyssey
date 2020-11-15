package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_16 {
    public static void main(String args[]) {

        // 16. Word Game.

        String name, city, collage, profession, animal, pet_name;
        int age;

        name = "Khaled Hasan";
        age = 39;
        city = "Dhaka";
        collage = "Dhaka Collage";
        profession = "Photographer";
        animal = "Dog";
        pet_name = "Dhaksi";

        System.out.println( "There once was a person named " + name + " who lived in " + city
                + ". At the age of " + age + ", " + name + " went to collage at " + collage + ". "
                + name + " graduated and went to work as a " + profession + ". \nThen, " + name
                + " adopted a(n) " + animal + " named " + pet_name + ". They both lived happily ever after!" );
    }
}
