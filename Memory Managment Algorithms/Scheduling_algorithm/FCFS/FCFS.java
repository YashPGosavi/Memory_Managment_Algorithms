import java.util.Scanner;

public class FCFS{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER ENTRIES : ");
    int n = sc.nextInt();

    int [] bt = new int[n];
    String[] Pname = new String[n];
    int [] wt = new int[n+1];
    wt[0]=0;
    int [] tt = new int[n];

    int brust_Time;
    int waiting_Time = 0;
    int turn_time = 0;

    double Total_Tt = 0;
    double Total_Wt = 0;

    for(int i=0; i<n;i++){
        System.out.println("Enter Process Name "+ (i+1) + " : ");
        Pname[i]=sc.next();

        System.out.println("Enter Brust Time : "); 
        brust_Time = sc.nextInt();
        bt[i] = brust_Time;

        waiting_Time = waiting_Time+brust_Time;
        wt[i+1] = waiting_Time;

        turn_time = wt[i]+brust_Time;
        tt[i]=turn_time;

    Total_Tt = Total_Tt+Double.valueOf(turn_time);
    Total_Wt = Total_Wt+Double.valueOf(waiting_Time);
    }
    Total_Wt=Total_Wt-wt[n];

    System.out.println("Pn   "+"Bt  "+"Wt   "+"tt   ");
    for(int i=0;i<n;i++){
      System.out.println(Pname[i]+"   "+bt[i]+"   "+wt[i]+"   "+tt[i]);
    }
    System.out.println("Average Tt : "+ Total_Tt/n);
    System.out.println("Average Wt : "+ Total_Wt/n);
    sc.close();
}
}