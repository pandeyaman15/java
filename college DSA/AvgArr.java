import java.util.Scanner;

public class AvgArr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements");
      int num = sc.nextInt();
      int[] arr = new int[num];
      for(int i =0; i<num; i++){
        arr[i] = sc.nextInt();
     }
     float average = 0;
     for(int i =0; i<num; i++){
        average = average + arr[i];
     }
     average = average/num;
     System.out.println(average);
     sc.close();

    }
    
}
