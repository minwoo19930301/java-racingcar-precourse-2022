package racingcar.controller;


import java.util.List;
import racingcar.model.RacingCar;
import racingcar.model.ScoreBoard;
import racingcar.view.Input;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class RacingCarGame {

    private final ScoreBoard scoreBoard = new ScoreBoard();

    private void createCars() {
        List<String> carNames = Input.getCarNamesUntilValid();
        for (String carName : carNames) {
            scoreBoard.getRacingCarStats().add(new RacingCar(carName));
        }
    }

    private int setRetryCount(){
        return Input.getRetryCountUntilValid();
    }

    private void proceedMoving(int retryCount){

    }

    private void getWinners(){

    }

    public void start(){
        createCars();
        int retryCount = setRetryCount();
        proceedMoving(retryCount);
        getWinners();
    }
}
