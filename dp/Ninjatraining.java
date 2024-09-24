package dp;

public class Ninjatraining {
    public static void main(String[] args) {

    }

    public static int ninja(int task[][],int ind,int lasttask) {
        if(ind==0){
            int maxi=0;
            for (int i = 0; i < 2; i++) {
                if (i != lasttask) {
                    int points = task[0][i] + ninja(task, ind - 1, i);
                    maxi=Math.max(maxi, points)
                }
                return maxi;
            }
        }
        int maxi=0;
        for (int i = 0; i < 2; i++) {
            if (i != lasttask) {
                int points = task[ind][i] + ninja(task, ind - 1, i);
                maxi=Math.max(maxi, points)
            }
        }
        return maxi;
    }
}
