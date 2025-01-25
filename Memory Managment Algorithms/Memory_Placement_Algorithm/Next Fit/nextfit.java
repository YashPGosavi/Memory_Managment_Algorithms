public class nextfit{
    public static void next(int [] block,int n, int [] process,int m){
        int [] allocation = new int[m];
        
        for(int i=0;i<allocation.length;i++){
            allocation[i]=-1;
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j=(j+1)%n){
                if(block[j]>=process[i]){
                    allocation[i]=j;
                    block[j] -= process[i];
                    break;
                }
            }
        }

        System.out.println("Sr.No\t\tProcess\t\tAllocation_No");
        for(int i=0;i<m;i++){
            System.out.print((i+1)+"\t\t"+process[i]+"\t\t");
            if(allocation[i]!=-1){
                System.out.println(allocation[i]+1);
            }else{
                System.out.println("Not allocated.");
            }
        }
    }
    public static void main(String[] args) {
        int blockSize[] = {5, 10, 20};
        int processSize[] = {10, 20, 5};
        int n = blockSize.length;
        int m = processSize.length;
        next(blockSize, n, processSize, m);

    }
}