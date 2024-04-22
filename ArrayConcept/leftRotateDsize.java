package ArrayConcept;

import java.util.Arrays;

public class leftRotateDsize {
    public static void main(String[] args) {
        
    
    int arr[]={1,2,3,4,5,6,7};
    
    int n=arr.length;

     int d=2;
    //  int start=0;
    //  int end=d;
    // while(start<=end-1){
    //     int temp=arr[start];
    //     arr[start]=arr[end-1];
    //      arr[end-1]=temp;
    //      start++;
    //      end--;
    // }
   
    reverse(arr,n-1,d);
    System.out.println(Arrays.toString(arr));
   
}

    static int[] reverse(int a[],int start,int end){
      
         while(start<end){
        int temp=a[start];
        a[start]=a[end-1];
         a[end-1]=temp;
         start++;
         end--;
             
    }
   return a;
    }
    
   

    // static int[] leftRotateByDsize(int arr[],int n,int d,int temp[]){}
      
}
