import java.util.Scanner;

public class array_of_ascii {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner take = new Scanner(System.in);
        System.out.println("Enter data: ");
        for(int i = 0;i<5;i++){
            System.out.print(i+": ");
            a[i] = take.nextInt();
        }
        System.out.println("Ascii code array: ");
        for(int i = 0;i<5;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println(" ");
        System.out.println("Corresponding values: ");
        for (int j = 0;j<5;j++){
            System.out.print((char)a[j]+" ");
        }
    }
}
