import java.util.Scanner;

public class totalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pricee of the pen pencil & eraser");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalBill = pen+pencil+eraser;
        System.out.println("Total Bill:");
        totalBill = totalBill*(18/100)+totalBill;
        System.out.println(totalBill);
        sc.close();
    }
}
