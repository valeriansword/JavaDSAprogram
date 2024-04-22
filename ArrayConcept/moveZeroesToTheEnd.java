package ArrayConcept;

 import java.util.Arrays;
public class moveZeroesToTheEnd {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int len=arr.length;
        int j=-1;
        if(Arrays.asList(arr).contains(0)){
            for(int i=0;i<len;i++){
                if(arr[i]==0){
                        j=i;
                        break;
                }
            }
            for(int i=j+1;i<len;i++){
                if(arr[i]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    j++;
                }
            }
        }
        
       
       
        System.out.println(Arrays.toString(arr));

    }
    
}
