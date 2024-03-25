class MyJava {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Initialize array directly
        int n = arr.length; // Calculate array length
        int front = 0;
        int rare = n - 1; // Index of the last element

        int mid = (front + rare) / 2;

        for (int i = 0; i < mid; i++) {
            int last = arr[rare]; // Store the last element

            for (int j = rare; j > front; j--) {
                arr[j] = arr[j - 1]; // Move elements to the right
            }

            arr[front] = last; // Place the last element at the beginning
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " "); // Print each element separated by a space
        }
    }
}
