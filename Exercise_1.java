/**
 *
 * Time Complexity:
 * O(log(n) to the base 2) --> binarySearch
 * 
 * Space Complexity:
 * O(1) --> bonarySearch
 *
 */
class BinarySearch {
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
//        Using recursive approch for finding binary search.
//        find the middle element and compare the value with the required value and check if it present left or right.
        if(r>=l){
            int mid = (l+r)/2;
            if(arr[mid] ==x)
                return x;
            else if(arr[mid]>x)
                return binarySearch(arr,l,mid-1,x);
            else
                return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
