//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 7 ;
        int c = 5 ;
        boolean d = true ;
        if (d == true){
            findHighestScore(a,b,c);
        }

    }
    public static void findHighestScore(int a,int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the highest number");
            } else if (a < c) {
                System.out.println(c + " is the highest number");
            }else {
                System.out.println(a + " equal to " + c);
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println(b + " is the highest score");
            }else {
                System.out.println(b + "equal to" + c);
            }
        }
    }
}

