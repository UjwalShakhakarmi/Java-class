import java.util.Scanner;
public class Multiplyingtwonum{
    public static void main(String[] args)
    {
        Scanner ScanObj = new Scanner(System.in);//input
        System.out.println("Enter 1st num:");
        int num1 = ScanObj.nextInt();
        System.out.println("Enter 2st num:");
        int num2 = ScanObj.nextInt();
        int num = num1 * num2;
        System.out.println("the multiply is :"+ num);
    }
}