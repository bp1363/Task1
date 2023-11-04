import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  user to enter a temperature value and the unit of measurement
        System.out.print("Enter a temperature value: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the unit of measurement (C or F): ");
        String unit = input.next();

        // Perform the conversion
        double convertedTemperature;
        if (unit.equals("C")) {
            convertedTemperature = (temperature * 9.0 / 5.0) + 32.0;
        } else if (unit.equals("F")) {
            convertedTemperature = (temperature - 32.0) * 5.0 / 9.0;
        } else {
            System.out.println("Invalid unit of measurement.Please enter either 'C' or 'F'.");
            return;
        }

        // Display the converted temperature
        System.out.println("The converted temperature is: " + convertedTemperature);
        
        System.out.println("Thank you");
    }
}
