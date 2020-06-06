class Solution {
    static int[] arr;
    Random random = new Random();
    public Solution(int[] w) {
        arr = new int[w.length];
        arr[0] = w[0];
        int sum = arr[0];
        for(int i = 1; i < w.length; i++) {
            sum += w[i];
            arr[i] = sum;
        }
    }
    public int pickIndex() {
        int x = arr[arr.length - 1];
        int index = random.nextInt(x) + 1;
        int randomIndex = Arrays.binarySearch(arr, index);
        if(randomIndex < 0) randomIndex = -randomIndex - 1;
        return randomIndex;
    }
}
