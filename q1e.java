import java.util.Scanner;

public class q1e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //2+4+6+8+10.....nth term
        System.out.print("Enter the nth term-->");
        int n;
        n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=(2*n); i++) {
            if (i%2==0) {
                sum=sum+i;
            }
        }
        System.out.println("The sum of given series till "+n+"th term is "+sum);
        sc.close();
    }
}
