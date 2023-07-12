import java.util.Scanner;

public class Main {
    public static void reverserange(int array[],int b1,int c1)
    {
        int swap1=array[b1];
        int swap2=array[c1];
        array[b1]=swap2;
        array[c1]=swap1;
        for(int i:array)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter B ");
        int b=scanner.nextInt();
        System.out.println("Enter C ");
        int c=scanner.nextInt();
        reverserange(arr,b,c);
    }
}