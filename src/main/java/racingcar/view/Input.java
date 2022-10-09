package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.model.RacingCar;

/**
 * @author: Minwoo Kim
 * @date 2022/10/09
 */
public class Input {
    private final static String CAR_NAMES_INQUIRY = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String RETRY_COUNT_INQUIRY = "시도할 회수는 몇회인가요?";
    private final static String NAME_SPLIT_STANDARD = ",";
    private final static String ERROR_FORM_PATTERN = "[ERROR] %s";
    private final static String WRONG_NAME = "잘못된 이름입니다.";

    private static void validateNameByCreatingCar(String[] names){
        for(String name : names){
            new RacingCar(name);
        }
    }

    public static List<String> getCarNamesUntilValid(){
        while(true){
            try{
                System.out.println(CAR_NAMES_INQUIRY);
                String inputString = Console.readLine();
                String[] result = inputString.split(NAME_SPLIT_STANDARD);
                validateNameByCreatingCar(result);
                return Arrays.asList(result);
            } catch (IllegalArgumentException e){
                System.out.printf(ERROR_FORM_PATTERN + "%n", WRONG_NAME);
            }
        }
    }


}
