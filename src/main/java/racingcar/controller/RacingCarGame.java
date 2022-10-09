package racingcar.controller;


import java.util.List;
import racingcar.model.RacingCar;
import racingcar.model.RetryCount;
import racingcar.model.ScoreBoard;
import racingcar.view.Input;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class RacingCarGame {

    private final ScoreBoard scoreBoard = new ScoreBoard();
    private final RetryCount retryCount = new RetryCount();

    private void createCars() {
        List<String> carNames = Input.getCarNamesUntilValid();
        for (String carName : carNames) {
            scoreBoard.getRacingCarStats().add(new RacingCar(carName));
        }
    }

    private void setRetryCount(){
        int retryValue = Input.getRetryCountUntilValid();
        retryCount.setValue(retryValue);
    }

    private void proceedMoving(){
        int retryValue = retryCount.getValue();

    }

    private void getWinners(){

    }

    public void start(){
        createCars();
        setRetryCount();
        proceedMoving();
        getWinners();
    }
}
