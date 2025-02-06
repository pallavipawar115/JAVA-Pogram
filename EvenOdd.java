import java.util.Scanner;

public class EvenOdd{
    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out .println("Enter the number");
        int num = scanner.nextInt();
        
        if (num %2 == 0)
        {
            System.out.print(num + " EVEN number");
        }
        else{
            System.out.print(num + " ODD number");
        }
    }
}