import java.util.*;

public class ActivitySelectionII {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end []={2,4,6,7,9,9};

        //sorting 
        int activity [][] = new int[start.length][3];

        for(int i =0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }

        //lamda function 
        Arrays.sort(activity,Comparator.comparing(o ->o[2]));



        int maxActivity =0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxActivity=1;
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];


        for(int i =1;i<end.length;i++){
            if(activity[i][1]>=lastEnd){
                maxActivity++;
                ans.add(activity[i][0]);
                lastEnd=activity[i][2];
            }
        }
        System.out.println("maxActivity: "+maxActivity);
        
        for(int i =0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
