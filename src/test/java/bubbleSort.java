import java.util.Arrays;

public class bubbleSort {
//    最初版冒泡排序
    private static void sort(int array[]){
        int tmp=0;
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }

    }
    //判断数组是否有序,如果有序说明排序完成,标记完成,结束排序
    private static void sortTest(int array[]){
        int tmp=0;
        for (int i=0;i<array.length;i++){
            boolean isSorted=true;
            for(int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
//                    有元素交换,说明不是有序的,标记为false
                    isSorted=false;
                }
            }
            if (isSorted){
                break;
            }
        }

    }

    private static void sortTestEnd(int array[]){
        int tmp=0;
//        记录最后一次交换位置
        int lastExchangeIndex=0;
//        无序数列边界,每次比较边界到此为止
        int sortBorder=array.length-1;
        for (int i=0;i<array.length;i++){
//            有序标记,每一轮都为true
            boolean isSorted=true;
            for(int j=0;j<sortBorder;j++){
                if (array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
//                    有元素交换,说明不是有序的,标记为false
                    isSorted=false;
//                    将无序数列的边界作为更新后最后一次交换元素的位置
                    lastExchangeIndex=j;
                }
            }
            sortBorder=lastExchangeIndex;
            if (isSorted){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int[] array=new int[]{5,8,6,4,7,9,1,2,3};
        sortTestEnd(array);
        System.out.println(Arrays.toString(array));
    }
}
