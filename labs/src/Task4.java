import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        System.out.println("Reverse number: "+reverse(number));
        if(isPalindrome(number)) System.out.println(number+" is palindrome");
        else System.out.println(number+" is not palindrome");
    }
    public static int reverse(int number){
        int a, rev = 0;
        while(number!=0){
            a = number%10;
            rev = (rev*10)+a;
            number = number/10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number){
        int rev = reverse(number);
        if(number == rev) return true;
        else return false;
    }
}
