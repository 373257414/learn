public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 6, 4, 3, 5, 7, 9, 1, 2};
        for (int i = 0; i < array.length; i++) {
            int minIndex = array.length-1;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.print("第" + (i) + "次结果：");
            for (int anArray : array) {

                System.out.print(anArray + " ");
            }
            System.out.println("。");
        }
    }
}
