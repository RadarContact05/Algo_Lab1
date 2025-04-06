import java.util.*;

public class SortStudents {

    public static void main(String[] args) {
        int numberOfStudents = Integer.parseInt(args[0]);
        String sortBy = args[1].toLowerCase();
        Scanner data = new Scanner(System.in);
        List<String[]> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String personnummer = data.next();
            String lastName = data.next();
            String firstName = data.next();
            String credits = data.next();
            students.add(new String[]{personnummer, lastName, firstName, credits});
        }
        data.close();

        if (sortBy.equals("name")) {
            students.sort((s1, s2) -> {
                int lastCmp = s1[1].compareTo(s2[1]);
                if (lastCmp != 0) return lastCmp;
                return s1[2].compareTo(s2[2]);
            });
        } else if (sortBy.equals("age")) {
            students.sort((s1, s2) -> s1[0].compareTo(s2[0]));
        } else if (sortBy.equals("credits")) {
            students.sort((s1, s2) -> {
                double credits1 = Double.parseDouble(s1[3]);
                double credits2 = Double.parseDouble(s2[3]);
                return Double.compare(credits1, credits2);
            });
        } else {
            System.out.println("error");
            return;
        }

        for (String[] student : students) {
            System.out.println("[Student]/" + student[1] + ", " + student[2] + ", pn: " + student[0] + ", credits: " + student[3] + "/");
        }
    }
}
