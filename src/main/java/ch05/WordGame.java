package ch05;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {

        String startWord = "아버지";

        System.out.println("끝말잇기를 시작합니다.");
        System.out.println("시작 단어 : " + startWord);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String inputWord = scanner.nextLine();

            if (startWord.charAt(startWord.length() - 1) != inputWord.charAt(0)) {
                System.out.println("끝말잇기를 실패했습니다.");
                break;
            }

            if (inputWord.length() == 1) {
                System.out.println("한 글자는 입력할 수 없습니다.");
                continue;
            }

            startWord = inputWord;
        }
        System.out.print("프로그램을 종료합니다.");
    }
}
