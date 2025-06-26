import java.util.*;
public class max{
    public static void main(String[] args) {
        int a, b, c, g;
        Scanner sc = new Scanner(System.in);
        System.out.println("EntertheThreeNumbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is Greater");
        }
        else if(b > a && b > c){
            System.out.println(b + " is Greater");
        }
        else if(c > a && c > b){
            System.out.println(c + " is Greater");
        }
        else{
            System.out.println("All are Equal");
        }
    }
}