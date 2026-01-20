class SwapNumbers
 {

    // Method to swap numbers
    static void swap(int[] nums)
	{
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }

    public static void main(String[] args)
	{

        int[] numbers = {10, 20};

        System.out.println("Before Swap:");
        System.out.println("a = " + numbers[0] + " b = " + numbers[1]);

        // Call swap method
        swap(numbers);

        System.out.println("After Swap:");
        System.out.println("a = " + numbers[0] + " b = " + numbers[1]);
    }
}
