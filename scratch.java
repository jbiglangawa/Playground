class Scratch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = getTargetSum(array, 1);
        System.out.format("The result is: %d and %d\n", result[0], result[1]);
    }

    /**
     * This approach makes use of the bubble sort to find the two numbers that
     * equate to the sum.
     *
     * @param array Given array
     * @param targetSum Target sum of numbers
     * @return The two numbers that equate to the sum
     * @author John Marvie Biglang-awa
     */
    public static int[] getTargetSum(int[] array, int targetSum) {
        if(array.length < 1) {
            throw new IllegalArgumentException("The size of the array should be more than 1");
        }

        int[] numbersAddingToSum = new int[2];
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(targetSum == (array[i] + array[j])) {
                    numbersAddingToSum[0] = array[i];
                    numbersAddingToSum[1] = array[j];
                    break;
                }
            }
        }

        // If there is no detected sum for the array, throw an exception
        if(numbersAddingToSum[0] == 0 && numbersAddingToSum[1] == 0) {
            throw new IllegalArgumentException("The array provided does not contain two numbers that sum up to the target number");
        }

        return numbersAddingToSum;
    }
}
