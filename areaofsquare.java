import java.util.*;
public class areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of an square");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("the area of square is:");
        System.out.println(area);
        sc.close();
    }
}
