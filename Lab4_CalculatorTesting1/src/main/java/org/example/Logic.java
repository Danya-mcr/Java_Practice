package org.example;

import org.example.Actions.*;

public class Logic {
    public double startCalc(String value) {
        value = value.replace(" ", "");
        char type = '0';
        int opIdx = -1;

        for (int i = 1; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                type = c;
                opIdx = i;
                break;
            }
        }

        if (type == '0') {
            if (value.startsWith("sin")) {
                value = value.substring(3).replace("(", "").replace(")", "");
                try {
                    double numb = Double.parseDouble(value);
                    Sinus sinus = new Sinus(numb);
                    return sinus.doAction();
                } catch (NumberFormatException e) {
                    throw new ArithmeticException("Некорректное значение числа");
                }
            }
            throw new ArithmeticException("Некорректное значение операции");
        }

        if (opIdx == -1) throw new ArithmeticException("Некорректное значение операции");

        double numb1 = 0, numb2 = 0;
        try {
            numb1 = Double.parseDouble(value.substring(0, opIdx));
            numb2 = Double.parseDouble(value.substring(opIdx + 1));
        } catch (NumberFormatException e) {
            throw new ArithmeticException("Некорректное значение числа");
        }

        switch (type) {
            case '+' :
                Addition addition = new Addition(numb1, numb2);
                return addition.doAction();
            case '-' :
                Subtraction subtraction = new Subtraction(numb1, numb2);
                return subtraction.doAction();
            case '*':
                Multiply multiply = new Multiply(numb1, numb2);
                return multiply.doAction();
            case '/':
                Division division = new Division(numb1, numb2);
                return division.doAction();
            default:
                throw new ArithmeticException("Некорректное значение операции");
        }
    }

}
