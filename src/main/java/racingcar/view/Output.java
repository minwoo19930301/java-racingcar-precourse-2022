package racingcar.view;

import java.util.Collections;
import java.util.List;
import racingcar.model.ScoreBoard;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class Output {

    private final static String GAME_RESULT_ANNOUNCE = "각 차수별 실행결과";
    private final static String WINNER_ANNOUNCE_PATTERN = "최종우승자 : %s";
    private final static String MOVE_OUTPUT_PATTERN = "%s : %s";
    private final static String ONE_MOVE_OUTPUT_FORMAT = "-";
    private final static String NAME_SPLIT_STANDARD = ",";

    private String repeatedMoveOutput(int n) {
        return String.join("", Collections.nCopies(n, ONE_MOVE_OUTPUT_FORMAT));
    }

    public static String gameResultAnnounce(ScoreBoard scoreBoard) {
        List<String> winnerNames = scoreBoard.findWinners();
        return String.format(WINNER_ANNOUNCE_PATTERN,
            (String.join(NAME_SPLIT_STANDARD, winnerNames)));

    }

}
