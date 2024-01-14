package TemperatureConverter;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class TemperatureConverterMain
{
    public static void main(String[] args)
    {
        new TemperatureConverterMain();
    }

    private int paul = 1;

    Scanner scanner = new Scanner(System.in);

    public TemperatureConverterMain()
    {
        if(scanner.nextInt() == 1)
        {
            System.out.println(convertCelsiusToFahrenheit(scanner.nextDouble()));
        }
        else
        {
            System.out.println(convertFahrenheitToCelsius(scanner.nextDouble()));
        }
    }

    private double convertCelsiusToFahrenheit(double celsius)
    {
        return celsius * ((double) 9 /5) + 32;
    }

    private double convertFahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * ((double) 5 /9);
    }
}
