package SpringOffer.J2ee;

/**
 * Created by Amie on 2019/1/28.
 */
public class SortHeap {
    public void adjustHeap(int[] array, int parent, int length){
        int temp = array[length];
        int child = 2*parent+1;
        while (child < length){
            if (child +1 <length && array[child+1]>array[child])
                child++;
            if (temp>=array[child])
                break;
            array[parent] = array[child];
            parent = child;
            child = child*2+1;
        }
        array[parent] = temp;
    }
    public void heapSort(int[] list) {
        // 循环建立初始堆
        for (int i = list.length / 2; i >= 0; i--) {
            adjustHeap(list, i, list.length);
        }

        // 进行n-1次循环，完成排序
        for (int i = list.length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            int temp = list[i];
            list[i] = list[0];
            list[0] = temp;

            // 筛选 R[0] 结点，得到i-1个结点的堆
            adjustHeap(list, 0, i);
            System.out.format("第 %d 趟: \t", list.length - i);
            adjustHeap(list, 0, list.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {
                1, 3, 4, 5, 2, 6, 9, 7, 8, 0
        };

        // 调用快速排序方法
        SortHeap heap = new SortHeap();
        heap.heapSort(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
