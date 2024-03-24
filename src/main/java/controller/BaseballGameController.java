package controller;

import model.BaseballGameModel;
import view.BaseballGameView;

public class BaseballGameController {
    private final BaseballGameModel model;
    private final BaseballGameView view;

    public BaseballGameController(BaseballGameModel baseballGameModel, BaseballGameView baseballGameView) {
        this.model = baseballGameModel;
        this.view = baseballGameView;
    }

    public void playGame() {
        view.displayMessage("숫자 야구 게임을 시작합니다!");

        while (true) {
            model.generateNumbers();

            askNumbers();

            view.displayMessage("게임을 계속 하시겠습니까? (Y/N)");
            String choice = view.getNextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                view.displayMessage("게임을 종료합니다.");
                break;
            }
        }
    }

    private void askNumbers() {
        while (true) {
            int[] userNumbers = view.getUserNumbers();
            int[] result = model.compareNumbers(userNumbers);
            view.displayResult(result);

            if (result[0] == 3) {
                view.displayMessage("축하합니다! 숫자를 모두 맞히셨습니다.");
                break;
            }
        }
    }
}
