public class Referee {

    // 1. 랜덤으로 만들어진 숫자와, 사용자가 입력한 숫자를 비교하기

    // 2. 비교 결과, S/B/O 얼마나 카운트 되는지 변수에 각각 저장하기
    // 2.1 카운트 값을 업데이트 할 때 마다 회차도 기록하면 좋을 것 같음 (프린터에서)

    // 3. 저장된 변수들을 리턴하여, 메인 메소드에서 프린터에게 넘기기

    public int getStrikeCount(int[] randomNumber, int[] userNumber) {
        int strike = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            for (int j = 0; j < userNumber.length; j++) {
                if (randomNumber[i] == userNumber[j]) {
                    strike++;
                }
            }
        }
        return strike;
    }


    public int getBallCount(int[] randomNumber, int[] userNumber) {
        int ball = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            for (int j = userNumber.length + 1; j > 0; j--) {
                if (randomNumber[i] == userNumber[j - 1]) {
                    ball++;
                }
            }
        }
        return ball;
    }


    public int getOutCount(int[] randomNumber, int[] userCount) {
        int out = 0;
        int j = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            if (randomNumber[i] != userCount[j] && randomNumber[i] != userCount[j+1] && randomNumber[i] != userCount[j+2]) {
                out++;
            }
        }
        return out;
    }


    // 아래는 입력받은 문자열을 처리하는 과정 중 하나, 길이 판단.
    public boolean lengthVerify (String input, int length) {
        if (input.length() == length) {
            return true;
        } else {
            return false;
        }
    }
}