import java.util.Scanner;

public class q1d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term:");
        int n;
        n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            if (i%2==0) {
                sum=sum-i;
            }
            else {
                sum=sum+i;
            }
        }
        System.out.println("The sum of given series with n= "+n+" is "+sum);
        sc.close();
    }
}
