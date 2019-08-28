import java.util.Arrays;
import java.util.Random;

public class topK {
    private static int[] findTopK(int[] game ,int k){
        int[] heap=new int[k];
        for(int i=0;i<k;i++){
            heap[i]=game[i];
        }
        Heaps.createHeap(heap,heap.length);
        for(int j=k;j<game.length;j++){
            if(game[j]>heap[0]){
                heap[0]=game[j];
                Heaps.heapMin(heap,k,0);
            }
        }
        return heap;
    }

    public static void main(String[] args) {
        Random random=new Random(12468);
        int[] game=new int[299];
        for(int i=0;i<game.length;i++){
            game[i]=random.nextInt(1200);
        }
        int[] topK=findTopK(game,5);
        System.out.println(Arrays.toString(topK));
        System.out.println("-----------------");
        Arrays.sort(game);
        System.out.println(Arrays.toString(Arrays.copyOfRange(game,game.length-10,game.length)));
    }
}
