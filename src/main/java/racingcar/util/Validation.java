package racingcar.util;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class Validation {
    private static final int MAXIMUM_LENGTH = 5;

    public static void checkName(String value){
        if (value == null || value.length() > MAXIMUM_LENGTH || value.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
    
}
