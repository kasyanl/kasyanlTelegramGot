package by.kasyan.rpa.telegram.processor;


import java.util.Scanner;

public class InputNumber {

    public static Scanner scanner = new Scanner(System.in);
    
        public  String readString() {
            return scanner.nextLine();
        }

        public int readNumber() {
            return Integer.parseInt(scanner.nextLine());
        }

        public double readDouble() {
            return Double.parseDouble(scanner.nextLine());
        }
    }