import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        if(nums==2){
            System.out.println("it is prime");
        }
        else{
             boolean isprime = true;
             for(int i=2;i<nums;i++){     //for(int i = 2 i<math.sqrt(nums);i++)
                if(nums%i==0){
                    isprime = false;

                }
              }
              if(isprime==true) {
                System.out.println("this number is prime");
              }
              else{
                System.out.println("this number is not prime");
              }
           }
           sc.close();
    }
}
