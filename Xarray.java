public class Xarray<T>{
  private T[] data;
  private int capacity;
  private int size;

  public Xarray(){
    capacity = 10;
    data = (T[]) new Object[capacity];
    size = 0;
  }

  public void add(T x){
    if (size == capacity){
      capacity *= 2;
      T[] temp = (T[]) new Object[capacity];

      for(int i = 0; i < size; i++){
        temp[i] = data[i];
      }
      data = temp;
    }
    data[size] = x;
    size++;
  }

  public T lookup(int i){
    if(i < 0 || i >= size) 
    throw new IndexOutOfBoundsException("Invalid entry");
    return data[i];
  }


  public void update(int i, T x){
    if(i < 0 || i >= size)
    throw new IndexOutOfBoundsException("Invalid entry");
    data[i] = x;
  }


  public int size(){
    return size;
  }

  public static void main(String[] args){

    Xarray<Integer> a = new Xarray<Integer>();
    for(int i = 0; i < 30; i++){
      a.add(i);
    }

    a.update(10,-1);

    for(int i = 0; i < 30; i++){
      System.out.print(a.lookup(i) + " ");
    }
    System.out.println();

    Integer[] arr = new Integer[a.size()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = a.lookup(i);
    }
    GenericSorting.insertionSort(arr);
    GenericArraySupport.println(arr);

    a.update(60,10);

  }
}
