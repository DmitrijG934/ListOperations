public class ListOperations {
  
  public static long maxValueInListDoubleLoop(long[] arr) {
    
    long maxValue = arr[0];
    
    for(long x: arr) {
      for(long y: arr) {
        if(x < y) 
          if(y > maxValue) maxValue = y;
      }
    }
    
    return maxValue;
    
  }
  
  public static long maxValueInList(long[] arr) {
    long max = arr[0];
    for(long x: arr) {
      if(x > max) {
        max = x >= max ? x : max;
      }
    }
    return max;
  }
  
  public static long minValueInList(long[] arr) {
    long minValue = arr[0];
    for(long x: arr) {
      if(x < minValue) {
        minValue = x <= minValue ? x : minValue;
      }
    }
    return minValue;
  }
  
  public static double middleValueInList(long[] arr, double a) {
   
   	double average = a;
    double sum = 0.0;
    
    if(arr.length > 0) {
      for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
      }
    } 

    System.out.println("sum: " + sum);
    
    return (sum * average) / arr.length;
    
  }

   public static long middleValueInListLong(long[] arr) {
   
    long sum = 0;
    
    if(arr.length > 0) {
      for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
      }
    } 

    System.out.println("sum: " + sum);
    
    return sum / arr.length;
    
  }
  
  public static void main(String[] args) {
    long[] arr = {21, 210000312, 2234312, 3, -2342343};
    System.out.println(middleValueInList(arr, 0.1));
     System.out.println(middleValueInListLong(arr));
  }
}
