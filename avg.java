import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value pf A B & C");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("The avg of a three number is:");
        System.out.println(average);
        sc.close();
    }
}
