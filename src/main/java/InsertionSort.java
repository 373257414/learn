public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {3, 9, 7, 6, 10, 1, 6, 4, 13, 25};
        for (int i = 1; i < array.length; i++) {
            /*从前向后插入扫面插入点，找到插入点再移动数组，不如下面一次循环
            int j = 0;
            int temp = array[i];
            while (j < i && (array[j] < temp)) {
                j++;
            }
            for (int k = i; k > j; k--) {
                array[k] = array[k - 1];
            }
            array[j]=temp;*/
            int j = i - 1;
            int temp = array[i];//array[i]将被覆盖
            while (j >= 0 && array[j] > temp) {//有序数组中的array[j]大于即将插入的数时，就后移一位
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
            System.out.print("第" + i + "次：");
            for (int anArray : array) {
                System.out.print(anArray + " ");
            }
            System.out.println();
        }
    }
}
