public class firstfit{
    static void fit(int[] block,int n,int [] process,int m){
        int []allocation = new int[m];

        for(int i=0;i<m;i++){
            allocation[i]=-1;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(block[j]>=process[i])
                {
                allocation[i]=j;
                block[j] -= process[i];
                break;
            }
            }
        }
        System.out.println("Sr.No\t\tprocess\t\talocation");
        for(int i=0;i<m;i++){
            System.out.print((i+1)+"\t\t"+process[i]+"\t\t");
            if(allocation[i] != -1){
                System.out.println(allocation[i]+1);
            }
            else{
                System.out.println("Not allowed");
            }
        }
    }
    public static void main(String[] args) {
        int blockSize[] = {100, 500, 200, 300, 600};
        int processSize[] = {212, 417, 112, 426};
        int n = blockSize.length;
        int m = processSize.length;
        fit(blockSize, n, processSize, m);
    }
}