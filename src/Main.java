import java.util.Random;
import java.util.Scanner;



public class Main {

    Scanner keyboard = new Scanner(System.in);
    public  int randomNum = 0;
    int firstNumber = 0;
    int secondNumber = 0;
    int len      = 0;


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int len;
        String rndString = "";
        Random rnd = new Random();

        System.out.println("Enter range of random numbers");
        System.out.println("Min?");
        firstNumber = keyboard.nextInt();
        System.out.println("max?");
        secondNumber = keyboard.nextInt();
        System.out.println("Length of string?");
        len = keyboard.nextInt();

        for(int i = 0; i < len; i++ ){
            int answer = rnd.nextInt((secondNumber-firstNumber) + 1);
            rndString = rndString +" " + answer;

        }

        System.out.println("Here is your string "  +  rndString);

    }
}
