import java.util.Arrays;

public class main3 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];

        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double a1 = 0;
        double a2 = 0;

        for (int i = 0; i < 5; i++) {
            a1 += mas1[i];
            a2 += mas2[i];
        }
        a1 /= 5;
        a2 /= 5;

        if (a1 > a2) {
            System.out.println("Среднее  первого массива (" + a1 + ") больше среднего  " +
                    "второго массива (" + a2 + ")");
        } else if (a1 < a2) {
            System.out.println("Среднее  первого массива (" + a1 + ") меньше среднего  " +
                    "второго массива (" + a2 + ")");
        } else {
            System.out.println("Средние  массивов равны (" + a1 + ")");
        }
    }
}
