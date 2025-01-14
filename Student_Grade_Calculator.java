import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int total=0;
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of subjects you have:");
        int nosub=sc.nextInt();
        for(int i=0;i<nosub;i++){
            System.out.println("enter the marks of "+(i+1)+":");
            int marks=sc.nextInt();
            total+=marks;
        }
        System.out.println("The total marks you scored is:"+total);
        double averp=((total)/nosub);
        System.out.println("The average percentage you got is:"+averp);
        char grade;
        if(averp>=90){
            grade='A';
        }
        else if(averp>=80){
            grade='B';
        }
        else if(averp>=70){
            grade='C';
        }
        else if(averp>=60){
            grade='D';
        }
        else if(averp>=50){
            grade='E';
        }
        else if(averp>=40){
            grade='P';
        }
        else
        {
            grade='F';
        }
        System.out.println("your Grade is:"+grade);
    }
}