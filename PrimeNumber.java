import java.util.Scanner;
 public class PrimeNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = scanner.nextInt();
        
        if(isPrime(num))
         {
             System.out.print(num + "Prime Number");
         }
         else
         {
             System.out.print(num + "Not Prime Number");
         }
    }
    public static boolean isPrime(int num)
    {
        for ( int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }     return true;
    }
}