import java.util.Arrays;
import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{
@Override
    public int compare(Student s1, Student s2) {
        String birth1 = s1.toString().split("pn: ")[1].split(",")[0].trim().substring(0, 6);
        String birth2 = s2.toString().split("pn: ")[1].split(",")[0].trim().substring(0, 6);
        
        return birth2.compareTo(birth1);
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