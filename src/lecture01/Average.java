package lecture01;

public class Average {
    double Averege(int[] score){
        int sum=0;
        int count=0;
        double ave;

        for(int i=0;i<5;i++){
            sum=sum+score[i];
            count=count+1;
        }
        ave=(double) sum/(double)score.length;
        return ave;


    }
}
