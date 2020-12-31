package ch05;

import java.util.*;
import java.util.stream.IntStream;

public class ArrEx2 {

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

        int[] arr2 = IntStream.range(1, 6).toArray();
        System.out.println("배열 크기 : " + arr2.length);

        for(int i = 0; i < arr2.length; ++i) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }

        int[] alphabets = IntStream.range(0, 26).map(i -> i + 'A').toArray();
        for (int alpha : alphabets) {
            System.out.println((char)alpha + "." + alpha);
        }
//        IntStream stream = IntStream.range(1, 6);
//        stream.forEach(System.out::println);
    }

}
