import java.util.Scanner;

public class q1a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1+2+3+4....+n
        System.out.print("Enter the nth term :");
        int n;
        n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println("The sum of given series till the "+n+"th term is: "+sum);
        sc.close();
    }
}
