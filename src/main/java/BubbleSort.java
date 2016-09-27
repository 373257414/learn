public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9, 2, 4, 6, 8, 0};
        for (int i=0;i<array.length;i++){
            int flag = 0;
            for (int j =1;j<array.length-i;j++){
                if (array[j]<array[j-1]){
                    flag++;
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
            if (flag==0)
                break;
            System.out.print("第"+(i+1)+"次结果：");
            for (int anArray : array) {

                System.out.print(anArray + " ");
            }
            System.out.println("。");

        }

    }
}
