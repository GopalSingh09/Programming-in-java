import java.util.Scanner;
class find_Area{
    static int area(int a){
        return (a*a);
    }
    static float area(float a){
        return (3.14f*a*a);
    }
    static int area(int a, int b){
        return (a*b);
    }
    static float area(float a, float b){
        return (0.5f*(a*b));
    }
}
public class method_overloading {
    public static void main(String[] args){
        int a, l,b, ch;
        float r, tl, h;
        Scanner cin = new Scanner(System.in);
        System.out.println("Area\n\t1. Square\n\t2. Circle\n\t3. Triangle\n\t4. Rectangle\n5. Exit");
        do {
            System.out.print("Enter choice: ");
            ch = cin.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter side of square: ");
                    a = cin.nextInt();
                    System.out.println("Area of square: "+find_Area.area(a));
                    break;
                case 2:
                    System.out.print("Enter radius of circle: ");
                    r = cin.nextFloat();
                    System.out.println("Area of circle: "+find_Area.area(r));
                    break;
                case 3:
                    System.out.print("Enter length of triangle: ");
                    tl = cin.nextFloat();
                    System.out.print("Enter height of triangle: ");
                    h = cin.nextFloat();
                    System.out.println("Area of triangle: "+find_Area.area(tl, h));
                    break;
                case 4:
                    System.out.print("Enter length of rectangle: ");
                    l = cin.nextInt();
                    System.out.print("Enter breadth of rectangle: ");
                    b = cin.nextInt();
                    System.out.println("Area of triangle: "+find_Area.area(l, b));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }while(true);
    }
}
