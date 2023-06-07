public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int amount = 0;
        boolean proverkam = false;
        double  [] numbers = new double[15];
        numbers [0] = 2.4;
        numbers [1] =-3;
        numbers [2] = 15;
        numbers [3] = 24;
        numbers [4] = -7;
        numbers [5] = -9;
        numbers [6] = 88;
        numbers [7] = 44;
        numbers [8] =-71;
        numbers [9] =-13;
        numbers [10] = 54;
        numbers [11] =-28;
        numbers [12] = 17;
        numbers [13] = 10;
        numbers [14] = 19;

        for (double name12 : numbers ) {
            if (name12 < 0){
                proverkam = true;
            } else if (name12 > 0 && proverkam) {
                sum +=name12;
                amount ++;
                System.out.println(name12);


            }


        }
        System.out.println(sum / amount);




    }

}