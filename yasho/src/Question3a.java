import java.util.Scanner;
public class Question3a
{
    public static void main(String[] args)
    {
        int user_age;
        float user_height;
        float user_weight;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("how old are you?  >>");
        user_age = inputDevice.nextInt();
        System.out.print("how tall are you? (in m) >>");
        user_height = inputDevice.nextFloat();
        System.out.print("How much do you weigh? (in kg) >>");
        user_weight = inputDevice.nextFloat();
        float bmi = user_weight / (user_height * user_height);

        System.out.println("You are " + user_age + " years of age. You weigh " + user_weight +
                "kg and you height is " + user_height + "m. Your BMI is " + bmi );

    }

}
