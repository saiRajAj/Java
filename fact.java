import java.util.*;
public class fact{
    public static void main(String[] args) {
        int a;
        int f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get factorial : ");
        a = sc.nextInt();
        for(int i = 1 ;i <= a ;i ++){
            f = f*i;
        }
        System.out.println("Factorial of "+ a +" is "+ f);
    }
}