import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int bot, p_bot = 0;
        int user, p_user = 0;
        int i = 1;
        while (i <= 5){
            bot = ran.nextInt(1, 3);
//            System.out.println(bot);
            System.out.println("1. rock \n2.paper \n3.scissor");
            System.out.print("enter your choice := ");
            user = sc.nextInt();
            if (user == 1 || user == 2 || user == 3) {

                if (user == 1 && bot == 1 || user==2 && bot == 2 || user==3 && bot == 3){
                    System.out.println("COMPUTER CHOICE is := " + bot);
                    System.out.println("bot have choice is same !!!");
                }
                else if (user == 1 && bot == 2 || user == 2 && bot == 3 || user == 3 && bot == 1) {
                    System.out.println("COMPUTER CHOICE is := " + bot);
                    System.out.println("BOT IS WIN !!!");
                    p_bot++;
                }
                else {
                    System.out.println("COMPUTER CHOICE is := " + bot);
                    System.out.println("YOU ARE WIN !!!");
                    p_user++;
                }
            }
            else {
                System.out.println("!!! PLEASE ENTER CORRECT CHOICE !!!");
                i--;
            }
            i++;
        }
        System.out.println("\nYOUR POINT IS := " + p_user);
        System.out.println("BOT POINT IS := " + p_bot);
        if (p_user == p_bot){
            System.out.println("THIS GAME IS TRY NOW !!!");
        }
        else if (p_user > p_bot) {
            System.out.println("*** YOU ARE WINNER ***");
        }
        else {
            System.out.println("SORRRY,BETTER LUCK NEXT TIME !!!");
        }
    }
}