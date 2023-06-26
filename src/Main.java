import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[20];
        int max = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100);
            if (number[i]>max){
                max = number[i];
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println("số lớn nhất trong mảng là: "+max);
    }
}