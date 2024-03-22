package model;

import java.util.Random;

public class BaseballGameModel {
    private int[] baseballNumbers;

    public void generateNumbers() {
        Random random = new Random();
        baseballNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            baseballNumbers[i] = random.nextInt(9) + 1;
        }
    }

    public int[] getBaseballNumbers() {
        return baseballNumbers;
    }

    public int[] compareNumbers(int[] userNumbers) {
        // TODO: 사용자가 입력한 숫자와 컴퓨터가 생성한 숫자를 비교하여 결과를 반환
        return null;
    }
}
