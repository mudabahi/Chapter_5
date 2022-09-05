import java.util.Scanner;

public class session_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in pounds");
        double weight = sc.nextDouble();

        System.out.println("Enter height in inches");
        double height = sc.nextDouble();

        final double kilogram_Per_pound = 0.45359237;
        final double meter_Per_inches = .0254;

        double weightInKilogram = weight * kilogram_Per_pound;
        double heightInMeter = height * meter_Per_inches;

        double bmi = weight / (heightInMeter * heightInMeter);

        if(bmi < 18){
            System.out.println("Under Weight");
        }else if (bmi == 20){
            System.out.println("Normal");
        }else if (bmi > 20){
            System.out.println("Over weight");
        }else {
            System.out.println("Invalid");
        }




    }
}
