import java.util.Scanner;

public class q1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x;
        x=sc.nextInt();
        int original_x=x;
        System.out.println("Enter the nth term:");
        int n;
        n=sc.nextInt();
        int sum=1;
        for (int i = 1; i < n; i++) {
            sum=sum+x;
            x=x*2;
        }
        System.out.println("The sum of given series with x= "+original_x+" and n= "+n+" is "+sum);
        sc.close();
    }
}
