public class Referee {
    public int getStrikeCount(int[] randomNumber, int[] userNumber) {
        int strike = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            if (randomNumber[i] == userNumber[i]) {
                strike++;
            }
        }
        return strike;
    }

    public int getBallCount(int[] randomNumber, int[] userNumber) {
        int ball = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            for (int j = 0; j < userNumber.length; j++) {
                if (i != j && randomNumber[i] == userNumber[j]) {
                    ball++;
                }
            }
        }
        return ball;
    }

    public int getOutCount(int[] randomNumber, int[] userCount) {
        int out = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            boolean found = false;
            for (int j = 0; j < userCount.length; j++) {
                if (randomNumber[i] == userCount[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                out++;
            }
        }
        return out;
    }

    public boolean lengthVerify(String input, int length) {
        return input.length() == length;
    }
}