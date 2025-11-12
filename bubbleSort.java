public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8, 9 };
        bubbleSorting(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
