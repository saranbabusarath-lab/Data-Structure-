class InsertElement
 {
    public static void main(String[] args)
	{

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        int element = 25;
        int position = 3; //  position

        int[] newArr = new int[n + 1];

        // Copy elements and insert at position
        for (int i = 0, j = 0; i < newArr.length; i++) 
		{
            if (i == position - 1)
				{
                newArr[i] = element;
            } 
			else 
			{
                newArr[i] = arr[j];
                j++;
            }
        }

        // Print updated array
        for (int i = 0; i < newArr.length; i++) 
		{
            System.out.print(newArr[i] + " ");
        }
    }
}
