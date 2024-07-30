import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
public class series{
public static void main(String[] args) {
    Scanner sc= new Scanner("System.in");
    System.out.println("enter the term");
    int num[] = new int[10];
    for(int i=0;i<=num.length-1;i++){
        System.out.println(Math.pow(i, i+1)+i);

    }
    sc.close();

}
}