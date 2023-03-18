import java.util.Scanner;

public class student_card {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = s.nextLine();
        System.out.print("Enter roll number: ");
        long roll = s.nextLong();
        System.out.println("Enter marks in subjects: ");
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int s5 = s.nextInt();
        int sum = s1+s2+s3+s4+s5;
        float per = (sum/500F)*100F;
        System.out.println("----------------------"+name+ " Report card-----------------------");
        System.out.println("Student name: "+name);
        System.out.println("ROll number: "+roll);
        System.out.println("Total marks: "+sum);
        System.out.println("Percentage: "+per+"%");
    }
}
