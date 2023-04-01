import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args){
        int a[][] = new int[2][2];
        int b[] = new int[4];
        int temp = 0;
        System.out.println("Enter data:");
        Scanner take = new Scanner(System.in);
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print("["+i+"]["+j+"]:" );
                a[i][j] = take.nextInt();
                b[temp] = a[i][j];
                temp++;
            }
        }
        System.out.println("Entered table: ");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
        temp--;
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
             a[i][j] = b[temp];
             temp--;
            }
        }
        System.out.println("Reversed table: ");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }


    }
}
