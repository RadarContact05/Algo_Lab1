import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentAgeComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        Scanner data1 = new Scanner(s1.toString());
        data1.next();
        data1.next();
        data1.next();
        String pn1 = data1.next();
        data1.close();

        Scanner data2 = new Scanner(s2.toString());
        data2.next();
        data2.next();
        data2.next();
        String pn2 = data2.next();
        data2.close();
        return pn2.compareTo(pn1);
    }


    public static void main(String[] args) {
        Student a = new Student("0101019999", "Student", "Randomsdotter");
        Student b = new Student("0202028888", "She", "Studentdotter");
        Student c = new Student("0302017777", "He", "Studentsson");
        Student d = new Student("0302016666", "Student", "Randomsson");
        a.addCredits(7.5);
        b.addCredits(15);
        c.addCredits(4.5);
        d.addCredits(3);
        Student[] four = {a, b, c, d};
        
        System.out.println("Array with students: ");
        GenericArraySupport.printlns(four);
        System.out.println();

        Arrays.sort(four, new StudentAgeComparator());
        System.out.println("Sorted array:");
        GenericArraySupport.printlns(four);
        System.out.println();
    }
}