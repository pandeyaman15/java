import java.util.*;
public class rats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int unit=sc.nextInt();
      
        int[] arr={2,8,3,5,7,4,1,2};
        int foodconsume=r*unit;
        System.out.println("foodconsume"+ foodconsume);
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                sum=arr[i]+arr[j];
              
             }
             
              
             
            }
            System.out.println("amount of food consume by the rats"+ sum);
            sc.close();
        }
        
        
    }
    

