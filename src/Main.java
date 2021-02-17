import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
//        int[][] place = new int[10][10];
        int[][] place = {
                {1,0,0,0},
                {0,1,1,0},
                {0,1,0,0},
                {0,0,0,1},
        };
        int[][] result = new int[place.length][place[0].length];
        boolean isOk = true;

//        while (isOk) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите число по X");
//            int one = scanner.nextInt();
//            System.out.println("Введите число по Y");
//            int two = scanner.nextInt();
//            place[one][two] = 1;
//            System.out.println("Продолжить 1-да 0-стоп");
//            if (scanner.nextInt() == 0) isOk = false;
//        }


        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                System.out.print(place[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//==========================шаг
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place[0].length; j++) {
                count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (l >= 0 && k >= 0 && k<place.length && l<place[0].length && (i != k || j != l)) {
                            if (place[k][l] == 1)
                                count++;
                        }
                    }
                }
                if (place[i][j] == 0 && count == 3) {
                    result[i][j] = 1;
                } else if (place[i][j] == 1) {
                    if(count == 2 || count == 3)
                        result[i][j] = 1;
                    if (count < 2 || count > 3) {
                        result[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < place.length; i++) {
            for (int j = 0; j < place.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    //=======================
    //проверка на окончание игры place == result
}
