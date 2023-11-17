package search;

public class linear {

    public static void main(String[] args) {

        int arr[] = {
            1, 3, 4, 6, 8,
        };
        int target = 4;

        int result = search(arr, target);
        if (result != -1) {
            System.out.print("index: " + result);
        } else
            System.out.println("not found");
    }

    private static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
