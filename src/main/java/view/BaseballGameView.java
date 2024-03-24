package view;

import java.util.Scanner;

public class BaseballGameView {
    private final Scanner scanner;

    public BaseballGameView() {
        scanner = new Scanner(System.in);
    }

    public int[] getUserNumbers() {
        System.out.println("세 자리 정수를 입력하세요:");
        int[] userNumbers = new int[3];
        String input = scanner.nextLine();

        if (checkInputNumber(input)) {
            for (int i = 0; i < 3; i++) {
                userNumbers[i] = input.charAt(i) - '0';
            }
            return userNumbers;
        }

        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        return getUserNumbers();
    }

    private static boolean checkInputNumber(String input) {
        return input.matches("[1-9]{3}");
    }

    public void displayResult(int[] result) {
        // 결과를 출력하는 부분
    }
}
