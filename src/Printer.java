public class Printer {

    int inning = 1;

    public void result(int s, int b, int o) {
        System.out.println("[Inning: " + inning + "] " + s + "S " + b + "B " + o + "O");
        inning++;
    }

    public void displayWin() {
        System.out.println("You won in " + (inning - 1) + " attempts!");
    }

}
