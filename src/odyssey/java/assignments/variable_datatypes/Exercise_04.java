package src.odyssey.java.assignments.variable_datatypes;

public class Exercise_04 {
    public static void main(String args[]){

        // 04. Name and Initials.

        String first_name = "Khaled";
        String middle_name = "Hasan";
        String last_name = "Khaled";

        char first_initial;
        char middle_initial;
        char last_initial;

        first_initial = first_name.charAt(0);
        middle_initial = middle_name.charAt(0);
        last_initial = last_name.charAt(0);

        System.out.println("Name: " + first_name + " " + middle_name + " " + last_name + ".");
        System.out.println("Initials: " + first_initial + "." + middle_initial + "." + last_initial + ".");



        // 04. Name and Initials. Short version.

        String f_name = "Khaled";
        String m_name = "Hasan";
        String l_name = "Khaled";

        char f_initial = f_name.charAt(1);
        char m_initial = m_name.charAt(2);
        char l_initial = l_name.charAt(3);

        System.out.println("Name: " + f_name + " " + m_name + " " + l_name + ".");
        System.out.println("Initials: " + f_initial + "." + m_initial + "." + l_initial + ".");

    }

}
