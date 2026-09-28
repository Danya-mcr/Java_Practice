package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        while (true) {
            String input = scanner.nextLine();

            if ("stop".equals(input)) {
                break;
            }

            System.out.println(logic.startCalc(input));
        }
    }
}
