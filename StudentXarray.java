import java.util.Scanner;
import java.util.Arrays; 
public class StudentXarray{
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);
        Xarray<Student> studentXarray = new Xarray<>();

        while(data.hasNext()){
            String personnumber = data.next();
            String lastName = data.next();
            String firstName = data.next();
            String credits = data.next();

            Student s = new Student(personnumber, firstName, lastName);
            s.addCredits(Double.parseDouble(credits));
            studentXarray.add(s);
        
        }
        data.close();
        int count = studentXarray.size();
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            students[i] = studentXarray.lookup(i);
        }
        Arrays.sort(students, new StudentCreditsComparator());

        for(Student s : students){
            System.out.println(s);
        }
    }
}