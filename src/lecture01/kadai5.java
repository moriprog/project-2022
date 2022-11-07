package lecture01;

import java.util.Scanner;

public class kadai5 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        int max_score,min_score;
        double ave;
        Scanner input=new Scanner(System.in);

        for(int k=0;k<5;k++){
            if(score[k]>=90){
                System.out.println(k+"番 "+score[k]+" 秀");
            }
            else if(score[k]<90 && score[k]>=80){
                System.out.println(k+"番 "+score[k]+" 優");
            }
            else if(score[k]<80 && score[k]>=70){
                System.out.println(k+"番 "+score[k]+" 良");
            }
            else if(score[k]<70 && score[k]>=60){
                System.out.println(k+"番 "+score[k]+" 可");
            }
            else{
                System.out.println(k+"番 "+score[k]+" 不可");
            }

        }

        Max max=new Max();
        max_score=max.Max(score);
        System.out.println("最高点:"+max_score+"点");

        Min min=new Min();
        min_score=min.Min(score);
        System.out.println("最低点:"+min_score+"点");

        Average average=new Average();
        ave=average.Averege(score);
        System.out.println("平均点:"+ave+"点");


    }
}
