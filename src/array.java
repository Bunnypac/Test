import java.sql.SQLOutput;
import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int sum=0;
        int size = s.nextInt();
        int arr[]=new int [size];
        System.out.println( "Enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            sum=sum+i;
        }
        System.out.println("Sum:"+sum);


    }
}
