import java.util.Scanner;

public class q1c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x;
        x=sc.nextInt();
        int original_x=x;
        System.out.println("Enter the nth term:");
        int n;
        n=sc.nextInt();
        float sum=1;
        for (int i = 1; i < n; i++) {
            int product=1;
            for (int j = i; j >=1; j--) {
                product=product*j;
            }
            sum=(float)sum+((float)x/product);
                x=x*2;
        }
        System.out.println(sum);
        sc.close();
    }
}
