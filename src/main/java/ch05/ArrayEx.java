package ch05;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class ArrayEx {
    public void arrayEx1() {
        int[] intArr1;
        int[] intArr2 = null;
        int intArr3[] = {1, 2, 3, 4, 5};
        int intArr4[] = new int[5];
    }

    public void arrayEx3() {
        // 배열 5 크기, 점수, 총합과 평균
        int scores[] = new int[5];
        int tot = 0;
        float avg;

        Scanner scanner = new Scanner(System.in);
        System.out.println("5과목의 점수를 입력하세요.");
        for (int i = 0; i < scores.length; ++i) {
            System.out.printf("과목 %d 점수 : ", i + 1);
            scores[i] = scanner.nextInt();
            tot += scores[i];
        }
        scanner.close();

        avg = tot / (float) scores.length;
        System.out.printf("총점 : %d, 평균 : %.1f 입니다.", tot, avg);
    }

    public void arrayEx4() {
        int scores[] = new int[5];
//        Integer scores[] = new Integer[5];

        if (true) {
            final int min = 51;
            final int max = 100;

            for (int i = 0; i < scores.length; ++i) {
                scores[i] = (int) (Math.random() * (max - min)) + min;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("5과목의 점수를 입력하세요.");
            for (int i = 0; i < scores.length; ++i) {
                System.out.printf("과목 %d 점수 : ", i + 1);
                scores[i] = scanner.nextInt();
            }
            scanner.close();
        }

//        Arrays.stream(scores).boxed().sorted((o1, o2) -> o2 - o1);
//        Arrays.sort(scores);
//        int scores2[] = Arrays.stream(scores)
//                .boxed()
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue)
//                .toArray();

        IntSummaryStatistics stats = Arrays.stream(scores).summaryStatistics();

        System.out.println("----------------------------------------------------");
        System.out.print("점수 : ");
//        Arrays.stream(scores).forEach(s -> System.out.print(s + " "));
        Arrays.stream(scores)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();


        System.out.printf("총점 : %d, 평균 : %.1f 입니다.\n", stats.getSum(), stats.getAverage());
        System.out.println("----------------------------------------------------");
        System.out.println(stats.toString());
        System.out.println("----------------------------------------------------");
    }

    public void twoDimension() {
        int[][] arr = new int[][] {
                {1,2,3},
                {4,5,6}
        };

        for (int i = 0; i < arr.length; ++i) {
            for (int k = 0; k < arr[i].length; ++k) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }


}
