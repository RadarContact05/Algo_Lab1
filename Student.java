public class Student implements Comparable<Student>{

  private final String personNumber;
  private final String firstName;
  private final String lastName;
  private double credits;

  public Student(String pn, String fn, String ln){
    personNumber = pn;
    firstName    = fn;
    lastName     = ln;
    credits      = 0;
  }
  public String toString(){
    return "[Student]/"
          + lastName + ", " + firstName + ", pn: " + personNumber
          + ", credits: " + credits + "/";
  }

  public boolean equals(Student that){
    return that.personNumber.equals(this.personNumber) && 
      that.firstName.equals(this.firstName) && 
      that.lastName.equals(this.lastName); 
  }
  public int compareTo(Student that){
    int lastNameComparison = this.lastName.compareTo(that.lastName);
    if (lastNameComparison != 0) {
        return lastNameComparison; 
    }
    int firstNameComparison = this.firstName.compareTo(that.firstName);
    if (firstNameComparison != 0) {
        return firstNameComparison; 
    }
    return this.personNumber.compareTo(that.personNumber);
  }

  public void addCredits(double c){
    credits += c;
  }

  public double credits(){
    return credits;
  }

  public static void main(String[] args) {
    Student a = new Student("0101019999", "Student", "Randomsdotter");
    Student b = new Student("0202028888", "She", "Studentdotter");
    Student c = new Student("0302017777", "He", "Studentsson");
    Student d = new Student("0302016666", "Student", "Randomsson");

    System.out.println(a + " equals " + a + " is " + a.equals(a));
    System.out.println();

    System.out.println(b + " equals " + c + " is " + b.equals(c));
    System.out.println();

    Student[] four = {a, b, c, d};
    System.out.println("Array with students: ");
    GenericArraySupport.printlns(four);
    System.out.println();

    GenericSorting.insertionSort(four);
    System.out.println("Sorted array: ");
    GenericArraySupport.printlns(four);
    System.out.println();

    a.addCredits(7.5);
    b.addCredits(15);
    c.addCredits(4.5);
    d.addCredits(3);
    System.out.println("Added credits: ");
    GenericArraySupport.printlns(four);
  }
}
