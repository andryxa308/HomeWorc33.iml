import java.util.Scanner;
public class main0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] test = new int[]{1, 2, 3};
        String temp = "не входит";
        System.out.print("Введите число - ");
        int m = in.nextInt();
        for (int i = 0; i < test.length; i++) {
            if (m == test[i]) {
                temp = String.valueOf(test[i]);
            }
        }
        System.out.print("Число входит в массив - " + temp);
    }
}

