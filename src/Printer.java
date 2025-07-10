public class Printer {

    // 1. 메인 메소드에서 레프리로 부터 념겨받은 S/B/O 카운트를 회차와 함께 출력하기
    int inning = 0;

    public void result(int s, int b, int o) {
        System.out.println("[Inning: " + inning + "] " + s + "S " + b + "B " + o + "O");
        inning++;
    }


    public void displayWin() {
        System.out.println("You won in " + inning + " attempts!");
    }

    // 숫자 야구는 진다는 개념이 없고, 숫자를 맞추는 것 까지 얼마나 오래 걸렸냐는 것만 판단 함.
    // 따라서 맞추었을 때, 즉 승리했을때에 맞추는 것 까지 얼마나 걸렸냐를 출력할 것.

}
