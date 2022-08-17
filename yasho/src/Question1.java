import java.util.Scanner;
public class Question1
{
    public static void main(String[] args)
    {
        String user_name;
        int user_age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("What is your name >>");
        user_name = inputDevice.nextLine();
        System.out.print("How old are you? >>");
        user_age = inputDevice.nextInt();
        System.out.println("You name is is " + user_name +
                " and you are " + user_age+ " years old");

    }

}
