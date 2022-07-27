public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        arrayInt[0] = -65;
        arrayInt[1] = 538;
        arrayInt[2] = 17;
        arrayInt[3] = 0;
        arrayInt[4] = 10;

        double[] arrayDouble = {14.6, 0.37, 15.2, -44.1};

        boolean[] arrayBool = {true, false, false};


        for (int i = 0; i < arrayInt.length - 1; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.println(arrayInt[arrayInt.length - 1]);

        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
            }else{
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        int counter = arrayBool.length-1;
        while (counter > 0){
            System.out.print(arrayBool[counter]+ ", ");
            counter--;
        }
        System.out.println(arrayBool[0]);

        for (int i = 0; i < arrayDouble.length; i++) {
            if(arrayInt[i] % 2 != 0) arrayInt[i]++;
            System.out.print(arrayInt[i] + " ");
        }
    }
}
