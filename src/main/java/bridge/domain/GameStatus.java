package bridge.domain;

import java.util.Arrays;

public enum GameStatus {
    PLAYING("P", "플레이"),
    CLEAR("C", "성공"),
    DEATH("D", "죽음"),
    RETRY("R", "재도전"),
    QUIT("Q", "실패");

    final String input;
    final String meaning;

    GameStatus(String input, String meaning) {
        this.input = input;
        this.meaning = meaning;
    }

    public static String decideGameResult(GameStatus gameStatus) {
        if (gameStatus == CLEAR || gameStatus == QUIT) {
            return gameStatus.meaning;
        }

        throw new IllegalArgumentException("잘못된 게임 결과");
    }

    public static GameStatus receiveInputAfterGameOver(String input) {
        return Arrays.stream(values())
                .filter(status -> status.input.equals(input))
                .filter(status -> status == RETRY || status == QUIT)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 입력입니다."));
    }
}
