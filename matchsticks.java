import java.util.Scanner;
public class matchsticks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Welcome");
        System.out.println("You Can't Win");
        System.out.println("---------------------");
        var tsticks = 21;
        while (tsticks > 1){
            System.out.println("Match Sticks Left : "+tsticks);
            System.out.print("Your Choice (1-4) :");
            int hchoice = sc.nextInt();
            if (hchoice > 4 || hchoice < 1) {
                System.out.println("*****************************");
                System.out.println("Choice must be in range (1-4)");
                System.out.println("*****************************");
                continue;
            }
            int mchoice = 5 - hchoice;
            System.out.println("Computer Choice : "+mchoice);
            System.out.println("|||||||||||||||||||||||||||||||");
            tsticks -= (hchoice + mchoice);
        }
        System.out.println("You Lose.");
    }
}