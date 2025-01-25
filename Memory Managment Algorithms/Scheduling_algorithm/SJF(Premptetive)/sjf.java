import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class sjf{

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("P count");
    int n = sc.nextInt();

    String [] pname = new String [n];
    int [] bt = new int [n];
    int [] wt = new int [n+1];
    wt[0]=0;
    int [] tt = new int [n];

    int W_time = 0;
    int T_time = 0;
    int x;
    String y;

    for(int i=0;i<n;i++){
        System.out.println("P name");
        pname[i]=sc.next();

        System.out.println("Bt");
        bt[i]=sc.nextInt();
    }

    for(int i=0;i<n-1;i++){
        for(int j=1;j<n;j++){
            if(bt[i]>bt[j]){
                x=bt[i];
                bt[i]=bt[j];
                bt[j]=x;

                y=pname[i];
                pname[i]=pname[j];
                pname[j]=y;
            }
        }
    }

    for(int i=0;i<n;i++){
        W_time = W_time+bt[i];
        wt[i+1]=W_time;

        tt[i]=wt[i]+bt[i];
        T_time=T_time+tt[i];

    }

    int twt=W_time-wt[n];

    double avg_twt = Double.valueOf(twt)/n;
    double avg_ttt = Double.valueOf(T_time)/n;

    System.out.println("Pn   "+"Bt  "+"Wt   "+"tt   ");
    for(int i=0;i<n;i++){
      System.out.println(pname[i]+"   "+bt[i]+"   "+wt[i]+"   "+tt[i]);
    }
    System.out.println("Average Tt : "+ avg_ttt/n);
    System.out.println("Average Wt : "+ avg_twt/n);

    }    
    

}