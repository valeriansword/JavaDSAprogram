package ArrayConcept;
//program to left rotate an array byn one place

class leftRotate{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){

        arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int element:arr){
            System.out.print(","+element);
        }
        
    }
}