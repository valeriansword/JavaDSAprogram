package ArrayConcept;

public class MinimumNumberOfOnes {
    public static void main(String args[]){
        int[][] arr={{1,1,1,1},
                     {1,1,0,0},
                     {0,0,1,1},
                     {1,1,1,0},
    };
        int count=0;
        int temp=0;
        int n=4;
        int m=4;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                count+=1;
                // if( temp>count){
                //     temp=count;
                // }
            }
            else if(arr[i][j]==0){
                if(temp<count){
                    if(temp==0){
                        temp=count;
                        count=0;
                    }
                    else{
                        count=0;
                    }
                   
                }
                
            }}
        }
        System.out.println(temp);
    }
    
    
}
