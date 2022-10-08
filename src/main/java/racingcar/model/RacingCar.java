package racingcar.model;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class RacingCar {
    private Name name;
    private Position position;

    public RacingCar(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public String getName() {
        return name.getValue();
    }

    public int getPosition(){
        return position.getValue();
    }

    public class Name{
        private static final int MAXIMUM_LENGTH = 5;

        private String value;

        private Name(String value) {
            this.value = value;
        }

        private String getValue() {
            return value;
        }
    }

    private class Position{
        private static final int INCREMENTAL_VALUE = 1;
        private static final int LOWEST_MOVE_CRITERIA = 4;
        private int value;

        private int getValue() {
            return value;
        }

        private void setValue(int value) {
            this.value = value;
        }
    }

}
