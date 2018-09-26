import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRanDom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] +" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRanDom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap vi tri: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri phhan tu thu " + x + "la: " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi so vuot qua gioi han");
        }
    }
}
