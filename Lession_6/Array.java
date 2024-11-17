package Lession_6;

public class Array {
    public static int checkArray(String[][] array) throws MyArraySizeExeption, MyArrayDataExeption {
        if (array.length != 4) {
            throw new MyArraySizeExeption("Массив должен быть 4x4");
        }
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    a = a + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataExeption("Неверный формат в [" + i + "] [" + j + "]");
                }

            }
        }
        return a;
    }
}
