import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int n = sc.nextInt();
         int rev=0;
         while (n>0) {
            int digit = n%10;
            rev =rev*10+digit;
            n= n/10;
            rev =rev*10+digit;
            
         }  
        // System.out.println(rev);
        if(n==rev){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
        sc.close();
    }
}
