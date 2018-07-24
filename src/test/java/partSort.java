public class partSort {
//    快速排序
    public static int partSort(int[] array,int left,int right){
        int key=right; //将key作为基准值的下标
        while (left<right){
            //左指针向右找第一个比key大的值
            while (left<right&&array[left]<=array[key]){
                ++left;
            }
            //右指针向左找第一个比key大的值
            while (left<right&&array[right]>=array[key]){
                --right;
            }
            //交换左右指针的值
            if (array[left]!=array[right]){
                int temp1=array[left];
                array[left]=array[right];
                array[right]=temp1;
            }

        }  //将key值放到正确的位置
        int temp2=array[left];
        array[left]=array[key];
        array[key]=temp2;

        return  left;
    }
    public static void quickSort(int[] array,int left,int right){
        if (left<right){
            int kiv=partSort(array,left,right);
            quickSort(array,left,kiv-1);
            quickSort(array,kiv+1,right);
        }

    }

    public static void main(String[] args) {
        int[] array={5,3,2,1,4};
        quickSort(array,0,array.length-1);

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
