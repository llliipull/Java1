package HW3;

import java.util.Random;

public class HW3 {

    public static void main(String[] args){

        int[] firstArray = new int[10];
        System.out.println("Before");
        for (int i = 0; i < 10; i++){
            Random random = new Random();
            firstArray[i] = random.nextInt(2);
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        System.out.println("After");
        for (int i = 0; i < 10; i++){

            if (firstArray[i] == 1) {
                firstArray[i] = 0;
            } else{
                firstArray[i] = 1;
            }
            System.out.print(firstArray[i] + " ");
        }


        System.out.println();
        int[] secondArray = new int[100];

        for (int i = 0; i < 100; i++){
            secondArray[i] = i + 1;
            System.out.print(secondArray[i] + " ");
        }

        System.out.println();
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++){
            if (thirdArray[i] < 6){
                thirdArray[i] = thirdArray[i] * 2;
            }
            System.out.print(thirdArray[i] + " ");
        }


        int[][] forthArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j != 1) || (i == 1 && j == 1) || (i == 2 && j != 1)) {
                    forthArray[i][j] = 1;
                }
                System.out.print(forthArray[i][j] + " ");
                }
            }

        System.out.println();
        printArray(fifthArray(3, 22));

        System.out.println();
        Random random = new Random();
        int[] sixthArray = new int[7];
        for(int i = 0; i < sixthArray.length; i++){
            sixthArray[i] = random.nextInt(999);
        }
        System.out.println("max is " + maxValue(sixthArray));
        System.out.println("min is " + minValue(sixthArray));

    }

        public static int maxValue (int[] array){
            int max = 0;
            for ( int i = 0; i < array.length; i++){
                if (array[i] > max){
                    max = array[i];
                }
            }
            return max;
        }

        public static int minValue (int[] array){
        int min = 999;
        for ( int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
        }

        public static void printArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static int[] fifthArray(int len, int initialValue){
            int[] returnedArray = new int[len];
            for (int i = 0; i < len; i++) {
                returnedArray[i] = initialValue;
            }

            return returnedArray;

        }



}



