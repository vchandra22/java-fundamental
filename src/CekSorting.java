public class CekSorting {
    public static void main(String[] args) {
        int array[] = {7, 20, 39, 2, 48, 520, 5, 5};
        insertionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}
