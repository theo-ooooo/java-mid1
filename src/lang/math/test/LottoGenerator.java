package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45번째까지 뽑아야함
            int number = random.nextInt(45) + 1;

            if(isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    public boolean isUnique(int number) {
        for (int lottoNumber : lottoNumbers) {
            if (number == lottoNumber) {
                return false;
            }
        }
        return true;
    }
}
