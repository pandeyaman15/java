import java.util.*;
public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the days b/w 1 to 7");
        int days = sc.nextInt();
        switch (days) {
            case 1: System.out.println("Monday"); 
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("enter the valid days");
                break;
        }
        sc.close();     
    }

}
