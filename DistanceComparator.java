import java.util.Comparator;
public class DistanceComparator implements Comparator<Point2D>{
  public static double oDist(Point2D p){
    return Math.sqrt(p.x*p.x + p.y*p.y);
  }
  public int compare(Point2D a, Point2D b){
    if(oDist(a) < oDist(b)) return -1;
    if(oDist(a) > oDist(b)) return 1;
    return 0;
  }

  /*
  The method main illustrates the methods defined in the class.
  */
  public static void main(String[] args) {
    Point2D a = new Point2D(0.5, 1);
    Point2D b = new Point2D(0.25, 10);

    System.out.println("Compare with Point2D lexicographical order:");
    if (a.compareTo(b) < 0)
    System.out.println(a + " is smaller than " + b);
    else
    System.out.println(a + " is NOT smaller than " + b);

    Comparator<Point2D> dst = new DistanceComparator();
    System.out.println("Compare with distance Comparator:");
    if (dst.compare(a, b) < 0)
    System.out.println(a + " is smaller than " + b);
    else
    System.out.println(a + " is NOT smaller than " + b);
  }
}
