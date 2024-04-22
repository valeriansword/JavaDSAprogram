package ArrayConcept;

public class MaxiNumberOfOnes {
    public static void main(String args[]){
        int[] arr={1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1};
        int count=0;
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count+=1;
                if(temp<count){
                    temp=count;
                }
            }
            else if(arr[i]==0){
                if(temp<count){
                    temp=count;
                    count=0;
                }
                else{
                    count=0;
                }
            }
        }
        System.out.println(temp);
    }
    
}
