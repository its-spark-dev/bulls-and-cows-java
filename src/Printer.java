public class Printer {

    // 1. 메인 메소드에서 레프리로 부터 념겨받은 S/B/O 카운트를 회차와 함께 출력하기
    int inning = 1;

    public void result(int s, int b, int o) {
        System.out.println("[Inning: " + inning + "] " + s + "S " + b + "B " + o + "O");
        inning++;
    }

}
