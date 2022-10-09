package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class RacingCar {

    private static final int LOWEST_MOVE_CRITERIA = 4;
    private Name name;
    private Position position;

    public RacingCar(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public String getName() {
        return name.getValue();
    }

    public void moveOrNot(){
        if(Randoms.pickNumberInRange(0,9) >= LOWEST_MOVE_CRITERIA){
            position.incrementValue();
        }
    }

    public int getPosition(){
        return position.getValue();
    }

    private class Name{
        private static final int MAXIMUM_LENGTH = 5;

        private final String value;

        private Name(String value) {
            if (value == null || value.length() > MAXIMUM_LENGTH || value.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.value = value;
        }

        private String getValue() {
            return value;
        }
    }

    private class Position{
        private static final int INCREMENTAL_VALUE = 1;

        private int value;

        private int getValue() {
            return value;
        }

        private void incrementValue(){
            value += INCREMENTAL_VALUE;
        }
    }

}
