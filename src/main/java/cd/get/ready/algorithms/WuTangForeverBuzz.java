package cd.get.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int value) {
        int input = 15;
        String out = "" +
                "";
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                out +="WuTangForever\n";
            }
            else if(i % 3 == 0) {
                out +="Wu\n";
            } else if (i % 5 == 0) {
                out +="Tang\n";

            } else {
                out+=i+"\n";
            }

        }

        return out;
    }
}