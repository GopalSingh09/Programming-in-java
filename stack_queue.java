import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class stack_queue {

    public static void main(String[] args){
        System.out.println("Stack operations\n\t1. Push\n\t2. Pop\n\t3. Traverse\nQueue operation\n\t4. Insert\n\t5. Traverse\n\t6. Delete\n7. Exit");
        int ch;
        int obj = 1;
        int val;
        Scanner take = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> qu = new PriorityQueue<Integer>();
        do {
            System.out.print("Enter choice: ");
            ch = take.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter data: ");
                    val = take.nextInt();
                    stack.push(val);
                    System.out.println("Item pushed");
                    break;
                case 2:
                    stack.pop();
                    System.out.println("item Popped");
                    break;
                case 3:
                    System.out.println(stack);
                    break;
                case 4:
                    System.out.print("Enter data: ");
                    val = take.nextInt();
                    qu.add(val);
                    System.out.println("item inserted");
                    break;
                case 5:
                    System.out.println(qu);
                    break;
                case 6:
                    qu.remove();
                    System.out.println("Item deleted");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input.");
                    break;
            }
        }while(true);
    }
}
