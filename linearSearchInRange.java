/**
 * search_in_range
 */
public class search_in_range {

    static int search ( int arr[] , int start, int end,int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i=start;i<=end;i++)
        {
            int element = arr[i];
            if(element == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num [] = {1,2,5,4,785,95,15,77};
        int target = 77;
        System.out.println(search(num, 1, 4, target));

    }
}
