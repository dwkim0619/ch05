package ch05;

import java.util.Arrays;

public class ArrayPrint<T> {
    public void Print(T[] arr) {
        Arrays.stream(arr).forEach(System.out::print);
    }
}
