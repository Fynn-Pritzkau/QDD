package AdventOfCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main1
{
    public static int sum;

    public static void main(String[] args)
    {
        getFirstAndLastNumber();
    }

    public static void getFirstAndLastNumber()
    {
        BufferedReader reader;

        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\fynn.pritzkau\\IdeaProjects\\QDD\\smol is good\\src\\main\\java\\AdventOfCode\\sample.txt"));
            String line = reader.readLine();

            while(line != null)
            {
                String number = "";

                for(int i = 0; i < line.length(); i++)
                {
                    if(Character.isDigit(line.charAt(i)))
                    {
                        number = "" + line.charAt(i);
                        break;
                    }
                }

                for(int i = line.length()-1; i > 0; i--)
                {
                    if(Character.isDigit(line.charAt(i)))
                    {
                        number = number + line.charAt(i);
                        System.out.println(number);
                        break;
                    }
                }

                if(number.length() == 1)
                {
                    number = number + number;
                }
                sum += Integer.parseInt(number);

                line = reader.readLine();
            }

            reader.close();

            System.out.println(sum);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

