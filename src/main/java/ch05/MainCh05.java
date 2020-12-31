package ch05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class MainCh05 {
    public static void main(String[] args) {

        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[5];

        arr2  = Arrays.copyOf(arr1, arr1.length);

        arrayOutput(arr1);
    }

    public static void arrayOutput(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }


    private void test01() {
//        ArrayEx ex1 = new ArrayEx();
//        ex1.arrayEx4();
//        ex1.twoDimension();

        // 1) 2차원 배열 선언과 동시에 생성
        int arr[][] = new int[][] {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // 3) 2차원 배열 선언, 나중에 배열 생성(1 ~ 25)
        int arr2[][] = new int[5][5];
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2[0].length; k++) {
                arr2[i][k] = (i * 5) + (k + 1);
            }
        }

        int tot = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2[0].length; k++) {
                System.out.printf("%2d ", arr2[i][k]);
                tot += arr2[i][k];
            }
            System.out.println();
        }

        tot = Arrays.stream(arr2).flatMapToInt(IntStream::of).sum();
        System.out.println("총합 : " + tot);



    }
}
