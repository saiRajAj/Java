import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        String str;
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("EntertheString : ");
        str = sc.nextLine();
        int l = str.length();
        for(int i =l-1; i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
        System.out.println(str +" is a Palindrome");
    }
    else{
         System.out.println(str +" is not a Palindrome");
    }
    
    }
}