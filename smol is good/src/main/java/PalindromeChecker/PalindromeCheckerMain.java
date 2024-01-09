package PalindromeChecker;

import java.util.Scanner;

public class PalindromeCheckerMain
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println(checkWord(scanner.next()));
    }

    private static boolean checkWord(String next)
    {
        String reverseString = "";

        for(int i = 0; i < next.length(); i++)
            reverseString = next.charAt(i) + reverseString;

        return next.equals(reverseString);
    }
}
