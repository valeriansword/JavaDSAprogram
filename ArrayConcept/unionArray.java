package ArrayConcept;
import java.util.ArrayList;
public class unionArray {
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        int[] b={1,2,3};
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        ArrayList<Integer> union=new ArrayList<Integer>();
        while(i<n && j<m){
            if(a[i]<=b[j]){
                 if(union.size()==0 || !(union.contains(a[i]))){
                    union.add(a[i]);
                     
                
            }
            i++;
            }
            else{
                if(union.size()==0 || b[j]!=union.get(i)){
                    union.add(b[j]);
                     
                
            }
            j++;

            }
           
        }
        System.out.println(union);
        
    }
   
}
