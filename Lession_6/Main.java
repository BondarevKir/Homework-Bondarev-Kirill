package Lession_6;

import static Lession_6.Array.checkArray;

public class Main {
    public static void main(String[] args) {
        String[][] fourxArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"25", "50", "10", "60"},
                {"11", "22", "33", "44"}
        };
        String[][] threexArray = {
                {"2", "1", "3"},
                {"22", "31", "45"},
                {"45", "12", "64"}
        };
        String[][] someArray = {
                {"1", "5", "x", "50"},
                {"71", "7", "42", "13"},
                {"4", "12", "11", "25"},
                {"1", "2", "3", "4"}
        };
        String[][] rightArray = {
                {"1", "1", "24", "50"},
                {"71", "6", "40", "13"},
                {"6", "12", "11", "25"},
                {"1", "2", "3", "4"}
        };
        String[][] penaltyArray = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"25", "50", "10", "60", "3", "23"},
                {"11", "22", "33", "44"}
        };
        try {
            System.out.println("Сумма fourxfourArray " + checkArray(fourxArray));
        } catch (MyArrayDataExeption | MyArraySizeExeption exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма threexthreeArray " + checkArray(threexArray));
        } catch (MyArrayDataExeption | MyArraySizeExeption exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма someArray " + checkArray(someArray));
        } catch (MyArrayDataExeption | MyArraySizeExeption exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма rightArray " + checkArray(rightArray));
        } catch (MyArrayDataExeption | MyArraySizeExeption exception) {
            System.out.println(exception.getMessage());
        }
        try {
            System.out.println("Сумма penaltyArray " + checkArray(penaltyArray));
        } catch (MyArrayDataExeption | MyArraySizeExeption exception) {
            System.out.println(exception.getMessage());
        }
    }
}
