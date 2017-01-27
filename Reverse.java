public class Reverse
{
    public static void main(String[] args)
    {
        int[] data = new int[5];

        for(int x = 0; x < args.length; x++)
            data[x] = Integer.parseInt(args[x]);

       System.out.print(data[1]);

        //reverseNumber(int[] data);
    }

    /*public static int[] reverseNumber(data)
    {
        int left = 0;
        int right = data.length - 1;

        while( left < right )
        {
         // swap the values at the left and right indices
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

        // move the left and right index pointers in toward the center
            left++;
            right--;
        }
        return data;
    } */
}
