package quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] arr = new int[10];
        for (int i = 0; i < 10; i ++) {

            int num = (int) Math.ceil(Math.random() * 10);
            list.add(num);
//            arr[i] = num;
        }
        quickSort(list, 0, arr.length - 1);
        for (int i = 0; i < list.size(); i ++) {
            System.out.print(list.get(i) + ",");
        }
    }
    public static List<Integer> quickSort(List<Integer> list, int n, int m) {
        if (n < m) {
            int j = m;
            int i = n;
            int num = list.get(n);
            while (i < j) {
                while (i < j && list.get(j) >= num) {
                    j--;
                }
                if (i < j) {
                    list.set(i, list.get(j));
                    i++;
                }
                while (i < j && list.get(i) < num) {
                    i++;
                }
                if (i < j) {
                    list.set(j, list.get(i));
                    j--;
                }
            }
            list.set(i, num);
            quickSort(list, n, i - 1);
            quickSort(list, i + 1, m);
        }


        return list;
    }

    static void quickSort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换;有的书上是以中间的数作为基准数的，要实现这个方便非常方便，直接将中间的数和第一个数进行交换就可以了
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) { // 从右向左找第一个小于x的数
                    j--;
                }
                if(i < j) {
                    s[i++] = s[j];
                }

                while(i < j && s[i] < x) { // 从左向右找第一个大于等于x的数
                    i++;
                }
                if(i < j) {
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            quickSort(s, l, i - 1); // 递归调用
            quickSort(s, i + 1, r);
        }
    }
}
