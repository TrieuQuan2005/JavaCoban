package hvktmm.khoaattt.at20.BaiTap;

import java.util.Scanner;

public class Merge {
    static int[] MergeArr(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] c = new int[n + m];
        int i =0,j=0,t=0;

        while (i < n && j < m) {
            if (a[i] < b[j]) c[t++] = a[i++];
            else c[t++] = b[j++];
        }
        while (i < n) c[t++] = a[i++];
        while (j < m) c[t++] = b[j++];

        return c;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang a: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Nhap mang b: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] c = MergeArr(a, b);

        System.out.println("Mang a la: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nMang b la: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        System.out.print("Mang sau khi gop la: ");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
    }
}
