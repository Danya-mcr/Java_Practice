package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAdditionAndSubtraction() {
        Logic logic = new Logic();
        String[][] tests = {
                {"5+5", "18+32", "2351+3251"},
                {"-10+13", "-1234+4536", "-2351+25352"},
                {"12-4", "314-432", "231354-231512"},
                {"-124-1254", "-2436-21152", "-6231578213-214956294"},
                {"5.20359+23.2315", "293.235-231.235125", "-235.5423245-42365.4254235"},
                {"45--54352", "-346342--65362", "-3453+5342534"},
                {"0+425315", "24521+0", "0+0"},
                {"42353635635+34553262346", "-43256236235-54363256235", "-342623463526+3462362356"}
        };
        double[][] answers = {
                {10.0, 50.0, 5602.0},
                {3.0, 3302.0, 23001.0},
                {8.0, -118.0, -158.0},
                {-1378.0, -23588.0, -6446534507.0},
                {28.43509, 61.999875, -42600.9677480},
                {54397.0, -280980.0, 5339081.0},
                {425315.0, 24521.0, 0.0},
                {76906897981.0, -97619492470.0, -339161101170.0}
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(logic.startCalc(tests[i][j]), answers[i][j], 1e-6);
            }
        }
    }

    @Test
    public void testMultiply() {
        Logic logic = new Logic();
        String[][] tests = {
                {"5*5", "32*434", "543*453"},
                {"-5*5423", "5*-5342", "-542*-543"},
                {"8*0", "0*432", "0*0"},
                {"3246235635*343245324", "245245243*245152", "4525234*2452145"},
                {"543.435*4523.532", "674*54534.22421", "254.65342*534252"}
        };
        double[][] answers = {
                {25.0, 13888.0, 245979},
                {-27115, -26710.0, 294306},
                {0, 0, 0},
                {(double) 3246235635L * 343245324L, 60122361811936.0, 11096529926930.0},
                {2458245.6124199997, 36756067.11754, 136049098.94184}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(logic.startCalc(tests[i][j]), answers[i][j], 1e-6);
            }
        }
    }

    @Test
    public void testSubtraction() {
        Logic logic = new Logic();
        String[][] tests = {
                {"45/5", "27/9", "14/2"},
                {"45423/45", "876/653", "521/785"},
                {"534.543/653.653", "53.653/6532.3526", "6532.3467/4213.6543"},
                {"-346/5324", "5432/-5432", "-5636/-7547"},
                {"23462356543/3263562356", "1425632653652/532", "21456/425653562653"}
        };
        double[][] answers = {
                {9.0, 3.0, 7.0},
                {1009.4, 1.3415007657, 0.6636942675},
                {0.8177779342, 0.0082134268, 1.5502806436},
                {-0.064988733, -1, 0.7467868027},
                {7.1891859213, 2679760627.1654134, 5.04071899839619E-8}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(logic.startCalc(tests[i][j]), answers[i][j], 1e-6);
            }
        }
    }

    @Test
    public void testRandom() {
        Logic logic = new Logic();
        Random random = new Random();
        String[] types = {"+", "-", "*", "/"};
        for (int i = 0; i < 100000; i++) {
            int randType = random.nextInt(4);
            double randNumb1 = random.nextDouble(-1.0E15, 1.0E15);
            double randNumb2 = random.nextDouble(-1.0E15, 1.0E15);
            String valForCals = randNumb1 + types[randType] + randNumb2;
            switch (types[randType]) {
                case "+":
                    assertEquals(logic.startCalc(valForCals), randNumb1+randNumb2);
                    break;
                case "-":
                    assertEquals(logic.startCalc(valForCals), randNumb1-randNumb2);
                    break;
                case "*":
                    assertEquals(logic.startCalc(valForCals), randNumb1*randNumb2);
                    break;
                case "/":
                    assertEquals(logic.startCalc(valForCals), randNumb1/randNumb2);
                    break;
            }
        }
    }

    @Test
    public void failTests() {
        Logic logic = new Logic();
        String[] tests = {"43+32", "43-66", "458*234", "24/432"};
        double[] answers = {12, 13, 14, 15};
        for (int i = 0; i < 4; i++) {
            assertEquals(logic.startCalc(tests[i]), answers[i]);
        }
    }
}
