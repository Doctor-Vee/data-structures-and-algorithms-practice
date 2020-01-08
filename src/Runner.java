public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] original = {20, 35, -15, 7, 55, 1, -22};

        for (int unsortedPartitionIndex = original.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for(int i = 0; i < unsortedPartitionIndex; i++ ){
                if (original[i] > original[i+1]){
                    swap(original, i, i+1);
                }
            }
        }

        for(int i = 0; i < original.length; i++){
            System.out.println(original[i]);
        }

    }

    public static void swap(int[] array, int a, int b) {
        if (a != b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
}
