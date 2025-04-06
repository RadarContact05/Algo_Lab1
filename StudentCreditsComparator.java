import java.util.Arrays;
import java.util.Comparator;


public class StudentCreditsComparator implements Comparator<Student>{
@Override
  public int compare(Student s1, Student s2){
    int creditComparison = Double.compare(s1.credits(), s2.credits());
      if (creditComparison != 0) {
        return creditComparison;
      } 
    return s1.compareTo(s2);
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

    Arrays.sort(four, new StudentCreditsComparator());
    System.out.println("Sorted array: ");
    GenericArraySupport.printlns(four);
    System.out.println();
   }
}
