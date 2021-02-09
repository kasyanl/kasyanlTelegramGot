package by.kasyan.rpa.telegram.processor;


import java.util.Scanner;

public class InputNumber {

    public static Scanner scanner = new Scanner(System.in);
    
        public static String readString() {
            return scanner.nextLine();
        }

        public static int readNumber() {
            return Integer.parseInt(scanner.nextLine());
        }

        public static double readDouble() {
            return Double.parseDouble(scanner.nextLine());
        }
    }