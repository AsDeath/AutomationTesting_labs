import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter celsius");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println("Fahrenheit: "+fahrenheit);

    }
}