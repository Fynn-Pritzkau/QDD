package calender;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class calenderMain
{
    private static ArrayList<String> terminList = new ArrayList<String>();

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("1. Termin hinzufügen");
            System.out.println("2. Termin löschen");
            System.out.println("3. Termin bearbeiten");
            System.out.println("4. Terminliste anzeigen");
            System.out.println("5. Programm beenden");

            switch(scanner.nextInt())
            {
                case 1:
                    System.out.println("Termin hinzufügen");
                    addTermin(scanner.next());
                    break;
                case 2:
                    System.out.println("Termin löschen");
                    deleteTermin(scanner.next());
                    break;
                case 3:
                    System.out.println("Termin bearbeiten");
                    editTermin(scanner.next());
                    break;
                case 4:
                    System.out.println("Terminliste anzeigen");
                    showTerminList();
                    break;
                case 5:
                    System.out.println("Programm beenden");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    break;
            }
        }
    }
    private static void showTerminList()
    {
        terminList.forEach(System.out::println);

    }

    private static void editTermin(String next)
    {
        terminList.set(terminList.indexOf(next), scanner.next());
        System.out.println("Termin wurde bearbeitet");
    }

    public static void addTermin(String termin)
    {
        terminList.add(termin);
    }

    public static void deleteTermin(String termin)
    {
        terminList.remove(termin);
    }
}
