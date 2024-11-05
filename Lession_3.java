public class lession_3 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(Check(25, 8));
        Six(7);
        System.out.println(Seven(8));
        Eight("Привет", 10);
        Nine();
        Ten();
        Eleven();
        Twelve();
        
    }

    public static void printThreeWords() {
        System.out.println("Orange,\nBanana,\nApple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 7;
        b = 8;
        if ((a + b) > 0) {
            System.out.println("Сумма положительная");
        }
        if ((a + b) < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value;
        value = -52;
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value < 100 && value > 0) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a;
        int b;
        a = 24;
        b = 25;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    public static boolean Check(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void Six(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean Seven(int a) {
        return a > 0;
    }

    public static void Eight(String f, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(f);
        }
    }

    public static void Nine() {
        System.out.println(Years(2004));
    }

    public static boolean Years(int a) {
        if (a % 400 == 0)
            return true;
        else if (a % 100 == 0)
            return false;
        else if (a % 4 != 0)
            return false;
        else return true;
    }

    public static void Ten() {
        int[] yo = {1, 0, 0, 1, 0, 1, 0, 1, 1};

        for (int a = 0; a < yo.length; a++) {
            if (yo[a] == 1) {
                yo[a] = 0;
                System.out.print(yo[a] + " ");
            } else if (yo[a] == 0) {
                yo[a] = 1;
                System.out.print(yo[a] + " ");
            }
        }

    }
    public static void Eleven(){
        int[] arr=new int[100];
        for(int a=0,b=1; a < arr.length; a++,b++){
            arr[a] = arr[a]+b;
            System.out.print(arr[a]+" ");
        }
    }
    public static void Twelve(){
        int[] array={1,5,3,2,11,4,5,2,4,8,9,1};
        for (int a=0; a<array.length; a++){
            if (array[a]<6){
                array[a]=array[a]*2;
                System.out.print(array[a]+" ");
            }
            else {System.out.print(array[a]+" ");
            }
        }}
    public static void Thirteen(){
        int[][] arrarrar = new int[6][6];
        for (int a = 0; a < arrarrar.length; a++) {
            arrarrar[a][a]=1;}
    }
    public static int[] Fourteen(int len, int initialValue){
        int[] arr = new int[len];
        for(int a=0; a<len;a++){
            arr[a]=initialValue;
        }
        return arr;
    }
    }
