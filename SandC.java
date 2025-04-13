import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class SandC{
  public static void main(String[] args) {
    String sortBy = args[0];
    Scanner data = new Scanner(System.in);
    List<Pair<String, String>> list = new ArrayList<>();

    while(data.hasNextLine()){
      String personummer = data.next();
      String efternamn = data.next();
      String förnamn = data.next();
      String kod = data.next();
      data.nextLine();

      Student s = new Student(personummer, efternamn, förnamn);

      String studentNamn = efternamn + " " + förnamn + " " + personummer;
      list.add(new Pair<>(studentNamn, kod));
    }
    data.close();
    //Konverterar listan till array.
    
    Pair<String, String>[] array = new Pair[list.size()];
    list.toArray(array);

    //Sorterar med studentnamnet.

    if (sortBy.equals("student")) {
      GenericSorting.insertionSort(array);
      for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
      }
  }
    // Sorterar med anonymitetskod.

    else if (sortBy.equals("kod")) {
      Arrays.sort(array, new Comparator<Pair<String, String>>() {
          public int compare(Pair<String, String> p1, Pair<String, String> p2) {
              return p1.snd.compareTo(p2.snd);
          }
      });
    for(int i = 0; i < array.length; i++){
    System.out.println(array[i].fst + " " + array[i].snd);
    }
    }
  }
}