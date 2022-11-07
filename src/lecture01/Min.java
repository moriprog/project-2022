package lecture01;

public class Min {
    int Min(int[] score){
        int min=score[0];
        for(int i=0;i<5;i++){
            if(min>score[i]){
                min=score[i];
            }
        }
        return min;
    }
}
