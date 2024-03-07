public class Logical {
    public static void main(String[] args) {
        boolean isTrue = false;
        if (!isTrue) {
            System.out.println("this is not true");
        }else {
            System.out.println("this is true");
        }

        int bot = 50;
        if (bot <= 60){
            System.out.println("bot is too low");
        }else {
            if (bot>60 && bot <= 80){
                System.out.println("bot is good");
            } else {
                System.out.println("bot is too high");
            }
        }
        String good = "good";
        boolean isGood = good == "good" ? true:false;

       if (isGood == true){
           System.out.println("this is good");
       }

    }

}
