package racingcar.view;

import java.util.Collections;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class Output {
    private final static String GAME_RESULT_ANNOUNCE = "각 차수별 실행결과";
    private final static String WINNER_ANNOUNCE_PATTERN = "최종우승자: %s";
    private final static String MOVE_OUTPUT_PATTERN = "%s : %s";
    private final static String ONE_MOVE_OUTPUT_FORMAT = "-";

    private String repeatedMoveOutput(int n){
        return String.join("", Collections.nCopies(n, ONE_MOVE_OUTPUT_FORMAT));
    }

}
