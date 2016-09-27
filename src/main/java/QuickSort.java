public class QuickSort {
    public static void main(String[] args) {
        int[] array = {28, 6, 40, 2, 63, 9, 58, 16, 47, 20};
        sort(array, 0, array.length - 1);
    }


    public static void sort(int[] array, int start, int end) {
        int k = start;
        int i = start + 1;
        int j = end;

        if (start == end) {
            return;
        }
        if (start == end - 1) {
            if (array[start] > array[end]) {
                array[start] = array[start] + array[end];
                array[end] = array[start] - array[end];
                array[start] = array[start] - array[end];
            }
            return;
        }
        while (i < j) {
            while (array[i] < array[k]) {
                if (i == end)
                    break;
                i++;
            }
            while (array[j] > array[k]) {
                if (j == start + 1)
                    break;
                j--;
            }
            if (i < j) {
                array[i] = array[i] + array[j];
                array[j] = array[i] - array[j];
                array[i] = array[i] - array[j];
                for (int c = 0; c < array.length; c++)
                    System.out.print(array[c] + " ");
                System.out.println();

            } else {
                array[k] = array[k] + array[j];
                array[j] = array[k] - array[j];
                array[k] = array[k] - array[j];
                sort(array, start, j - 1);
                sort(array, j + 1, end);
            }
        }

    }
}
