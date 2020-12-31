package ch05;

import java.util.Scanner;

public class WordGame2 {

    private final Scanner scanner = new Scanner(System.in);

    private String startWord;
    private Player players[] = null;

    public WordGame2() {
        this("아버지");
    }
    public WordGame2(String startWord) {
        this.startWord = startWord;
    }

    public void playGame() {

        int cnt = getPlayerCount();
        if (cnt <= 0) {
            System.out.println("게임 참여자가 없습니다.");
            return;
        }
        setPlayerNames(cnt);
        startGame();
    }

    private int getPlayerCount() {

        System.out.println("참가 인원 수와 각각의 이름을 입력해주세요.");

        System.out.print("참가 인원 수 : ");
        int cnt = scanner.nextInt();
        scanner.nextLine();

        return cnt;
    }

    private void setPlayerNames(int cnt) {
        players = new Player[cnt];

        for(int i = 0; i < cnt; i++) {
            System.out.printf("참가자 %d 이름 : ", i + 1);
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }
    }

    private void startGame() {

        System.out.println("끝말잇기를 시작합니다.");
        System.out.println("시작 단어 : " + startWord);

        int round = 0;
        while (true) {
            System.out.println("<< " + ++round + "라운드 시작 >>");

            for (int i = 0; i < players.length; i++) {
                System.out.print(players[i].getName() + " > ");
                String inputWord = scanner.nextLine();

                if (startWord.charAt(startWord.length() - 1) != inputWord.charAt(0)) {
                    scanner.close();
                    System.out.printf("%s가(이) 끝말잇기를 실패했습니다.\n", players[i].getName());
                    System.out.print("프로그램을 종료합니다.\n");
                    return;
                }

                if (inputWord.length() == 1) {
                    System.out.println("한 글자는 입력할 수 없습니다.");
                    continue;
                }

                startWord = inputWord;
            }
        }

    }

}
