import java.awt.*;
import java.util.*;

public class SortStudents{
    public static void main(String[] args){
        int numberOfStudents = Integer.parseInt(args[0]);
        String sortBy = args[1];
        Scanner data = new Scanner(System.in);

        Student[] students = new Student[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++){
            String personnumber = data.next();
            String lastName = data.next();
            String firstName = data.next();
            String credits = data.next();

            Student s = new Student(personnumber, firstName, lastName);
            students[i] = s;
            s.addCredits(Double.parseDouble(credits));
        
        }
        data.close();

        switch (sortBy.toLowerCase()) {
            case "name":
                Arrays.sort(students);
                break;

            case "age":
                Arrays.sort(students, new StudentAgeComparator());
                break;

            case "credits":
                Arrays.sort(students, new StudentCreditsComparator());
                break;

            default:
                System.out.println("error");
                return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
