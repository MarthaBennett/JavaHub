package com.hippodigital;

public class Main {

    public static void main (String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch(opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                if (value2 != 0)
                    result = value1 / value2;
                break;
         default:
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
            break;
        }

        System.out.println(result);
    }
}