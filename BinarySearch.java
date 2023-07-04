public class BinarySearch{

    public static int binarySearch (int[] array, int target) {

        int left = 0;

        int right = array.length -1;

        while (left <= right) {

            int mid = (left + right)/2;

            if (array[mid] == target) {
                return mid;
           
            } else if (array[mid] < target) {
                left = mid +1;

            } else {
                right = mid -1;
            }


        } return -1;
   
   
    }   public static void main(String[] args) {
        
        int [] array = {1, 3, 5, 7, 9, 11};
        
        int target = 7;

        int result = binarySearch(array, target);

        System.out.println("the index of target :" + result);

    }

    
}