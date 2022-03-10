package HW4;

import java.util.Random;
import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        String[][] map = initField(5);

        printField(map);

        while (true) {

            playerTurn(map);
            printField(map);
            if(isWinner("X", map, 4)){
                break;
            } else if (isDraw(map)){
                break;
            }

            computerTurn(map);
            printField(map);
            if(isWinner("O", map, 4)){
                break;
            }else if (isDraw(map)){
                break;
            }
        }


    }

    public static String[][] initField(int size) {
        String[][] map = new String[size][size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = "*";
            }
        }
        return map;
    }

    public static void printField(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isWinner(String sign, String[][] map, int signForWin) {

        int diagCount1 = 0;
        int diagCount2 = 0;

        for (int i = 0; i < map.length; i++) {

            int horizontalCount = 0;
            int verticalCount = 0;

            if (map[i][i].equals(sign)){
                diagCount1 ++;
            }
            if (map[i][map.length - 1 - i].equals(sign)){
                diagCount2 ++;
            }

            for (int j = 0; j < map.length; j++) {

                    if(map[i][j].equals(sign)){
                        horizontalCount ++;
                    }
                    if (map[j][i].equals(sign)){
                        verticalCount ++;
                    }

                    if(horizontalCount == signForWin || verticalCount == signForWin
                            || diagCount1 == signForWin || diagCount2 == signForWin){
                        System.out.println(sign + " победил");
                        return true;
                    }

            }
        }
        return false;
    }

    public static boolean isDraw(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья!");
        return true;

    }

    public static void playerTurn(String map[][]) {

        System.out.println("Ход игрока! Укажите клетку");

        Scanner sc = new Scanner(System.in);


        boolean isActive = true;

        while (isActive) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x - 1][y - 1] = "X";
                    isActive = false;
                } else {
                    System.out.println("Ячейка занята!");
                }
            } else {
                System.out.println("Вы вышли за пределы поля!");
            }
        }
    }

    public static void computerTurn(String[][] map) {
        System.out.println("Ход компьютера! Ожидайте...");

        Random random = new Random();

        boolean isActive = true;

        while (isActive) {

            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

                if (map[x][y].equals("*")) {
                    map[x][y] = "O";
                    isActive = false;
                }

        }
    }
}