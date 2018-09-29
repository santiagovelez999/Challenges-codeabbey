public class Solution {

    public static void main(String[] args)
    {
        int sum = 0;
        int size = (int) Math.floor(Math.random() * (0 + 16));
        int[] vector = new int[size];
        for (int i = 0; i < vector.length; i++)
        {
            int value = (int) Math.floor(Math.random() * (0 + 16));
            vector[i] = value;
            sum = sum + vector[i];
        }
        System.out.println(" The sum of the random vector is:" + sum);
          
    }
    
}
