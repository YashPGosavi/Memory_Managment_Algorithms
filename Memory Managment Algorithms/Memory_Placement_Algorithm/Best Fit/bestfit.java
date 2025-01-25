import java.util.Scanner;

public class bestfit{
    static void bfit(int[]block,int n,int[]process,int m){
        int[] allocation = new int[m];
        for(int i=0;i<m;i++){
            allocation[i]=-1;
        }

        for(int i=0;i<m;i++){
            int bestind=-1;
            for(int j=0;j<n;j++){
                if(block[j]>=process[i]){
                    if(bestind==-1){
                        bestind=j;
                    }
                    else if(block[bestind]>block[j]){
                        bestind=j;
                    }
                }
            }
            if(bestind != -1){
                allocation[i]=bestind;
                block [bestind] -= process[i];
            }
        }

        System.out.println("Sr.No\t\tProcess\t\tAllocation_No");
        for(int i=0;i<m;i++){
            System.out.print((i+1)+"\t\t"+process[i]+"\t\t");
            if(allocation[i] != -1){
                System.out.println(allocation[i]+1);
            }else{
                System.out.println("Not allocated");
            }
        }
    }
    public static void main(String[] args) {
        int blockSize[] = {100, 500, 200, 300, 600};
        int processSize[] = {212, 417, 112, 426};
        int n = blockSize.length;
        int m = processSize.length;
        bfit(blockSize, n, processSize, m);

    }
}