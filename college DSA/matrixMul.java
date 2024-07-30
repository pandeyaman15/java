import java.util.*;
public class matrixMul {
    public static void main(String[] args) {
        int m, n, i, j,p,q;   
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the number of row"); 
        m= sc.nextInt();
        System.out.println("enter the number of collumn ");
        n=sc.nextInt();
        int array[][] = new int[m][n];
        System.out.println("enter the element ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        // Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the number of row"); 
        p= sc.nextInt();
        System.out.println("enter the number of collumn ");
        q=sc.nextInt();
        int brray[][] = new int[p][q];
        System.out.println("enter the element ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                brray[i][j]=sc.nextInt();
            }
        }
        int crray[][]=new int[m][q];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                crray[i][j]=0;
            }
        }
        for(i=0;i<m;i++){
            
        }

    }
}
