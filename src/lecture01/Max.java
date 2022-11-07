package lecture01;

public class Max {
    int Max(int[] score){
        int max=score[0];
        for(int i=0;i<5;i++){
            if(max<score[i]){
                max=score[i];
            }
        }
        return max;
    }
}
