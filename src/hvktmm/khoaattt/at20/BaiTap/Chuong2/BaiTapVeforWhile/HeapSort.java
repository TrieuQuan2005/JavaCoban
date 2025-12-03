package hvktmm.khoaattt.at20.BaiTap.Chuong2.BaiTapVeforWhile;
import java.util.Scanner;

public class HeapSort {

    static void Adjust(int[] a, int r, int n) {
        int temp = a[r];
        int child = 2 * r + 1; // con trái

        while (child < n) {
            if (child + 1 < n && a[child] < a[child + 1]) child++;
            if (temp >= a[child]) break;

            a[r] = a[child];
            r = child;
            child = 2 * r + 1;
        }

        a[r] = temp;
    }

    static void HeapSort(int[] a, int n) {
        // Bước 1: Xây dựng max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            Adjust(a, i, n);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            Adjust(a, 0, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Nhập các phần tử của dãy:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        HeapSort(a, n);

        System.out.print("Dãy sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
