package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseBallGame extends Game {
    private static final String REGEX_THREE_NUMBER = "^[1-9]{3}"; // 3개의 1에서 9까지 수

    @Override
    public boolean initGame() {
        return true;
    }

    @Override
    public void playGame() {
        List<Integer> computer = selectComputerNumber();
        List<Integer> user = null;
        do {
            user = inputNumber();
        } while (compareNumber(computer, user));
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}