public class Point2D implements Comparable<Point2D>{

  public double x;
  public double y;

  public Point2D(double x, double y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return "[Point2D] x = " + x + ", y = " + y;
  }
  public boolean equals(Point2D that){
    return this.x == that.x && this.y == that.y;
  }

  public int compareTo(Point2D that){
    if(this.x < that.x) return -1;
    if(this.x > that.x) return 1;
    // at this point: they have the same x!
    if(this.y < that.y) return -1;
    if(this.y > that.y) return 1;
    // at this point: they also have the same y!
    return 0;
  }

  /*
  The purpose of main is to showcase the datatype.
  */
  public static void main(String[] args) {
    Point2D[] points = {new Point2D(0,0), new Point2D(10,0),
                        new Point2D(1,10),new Point2D(3,4),
                        new Point2D(3,5),new Point2D(4,3),
                        new Point2D(5,3),new Point2D(10,10)};

    System.out.println("\nAn array of points:");
    GenericArraySupport.printlns(points);

    GenericSorting.insertionSort(points);
    System.out.println("\nSorted with insertion sort (uses method compareTo):");
    GenericArraySupport.printlns(points);


  }
}
