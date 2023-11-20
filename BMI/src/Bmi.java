import java.util.Scanner;
import java.util.InputMismatchException;

public class Bmi {
    private double weight; // kilogram olarak aldým.
    private double height; // metre olarak aldým. 
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public Bmi() {
        this(50, 1.8);
    }

    // Constructor
    public Bmi(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Computing the Bmi
    public double getBmi() {
        double bmi = weight / (height * height);
        return bmi;
    }

    // Getter for Bmi status
    public String getStatus() {
        double bmi = getBmi();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    // Getter and setter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(Scanner scan) {
        System.out.print("Enter weight in kilograms: ");
        this.weight = scan.nextDouble();
    }

    // Getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(Scanner scan) {
        System.out.print("Enter height in meters: ");
        this.height = scan.nextDouble();
    }

    // Main method to run the BMI calculator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bmi bmiCalculator = new Bmi();

        bmiCalculator.setWeight(scanner);
        bmiCalculator.setHeight(scanner);

        System.out.println("Bmi: " + bmiCalculator.getBmi());
        System.out.println("Status: " + bmiCalculator.getStatus());

        // Optional: Close the scanner to avoid resource leaks
        scanner.close();
    }
}
