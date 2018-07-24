public class insertionSort {
    public static void insertionSort(int[] array){
//        从第二个元素起,依次取出数组的值
        for (int i = 1; i <array.length ; i++) {
//        将取出来的数存起来
            int temp=array[i];
            int j;
//         找到该元素要插入的位置
            for (j =i-1; j >=0 ; j--) {
                if (array[j]>temp){
                    array[j+1]=array[j];
                }else {
                    break;
                }
            }
//          将元素插入
            array[j+1]=temp;
        }

    } 
}
