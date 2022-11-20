package bridge.view;

import bridge.domain.GameStatus;
import bridge.domain.Move;
import bridge.domain.MoveResult;
import bridge.domain.Player;

import java.util.List;
import java.util.Map;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    private static final String GAME_START = "다리 건너기 게임을 시작합니다.";
    private static final String GAME_END = "최종 게임 결과";

    private OutputView() {
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(Player player) {
        Map<Move, List<MoveResult>> moveResults = player.getMoveResults();
        printSideBridge(moveResults.get(Move.UP));
        printSideBridge(moveResults.get(Move.DOWN));
        System.out.println();
    }

    private static void printSideBridge(List<MoveResult> results) {
        StringBuilder map = new StringBuilder();
        map.append("[");
        for (MoveResult result : results) {
            map.append(" ").append(result).append(" |");
        }
        map.deleteCharAt(map.length() - 1).append("]");

        System.out.println(map);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printResult(Player player, GameStatus gameStatus) {
        System.out.println(GAME_END);
        printMap(player);
        System.out.println("게임 성공 여부: " + printClearOrFail(gameStatus));
        System.out.print("총 시도한 횟수: " + player.getLifeCount());
    }

    private static String printClearOrFail(GameStatus gameStatus) {
        if (gameStatus == GameStatus.CLEAR) {
            return "성공";
        }
        return "실패";
    }

    public static void printStart() {
        System.out.println(GAME_START);
        System.out.println();
    }
}
