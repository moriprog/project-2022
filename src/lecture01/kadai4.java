package lecture01;

public class kadai4 {
    public static void main(String[] args) {
        int[] array=new int[100];
        int n=0;
        int sum=0;
        for(int i=0; i<100; i++){
            n=n+1;
            array[i]=n;
        }

        for(int i=0;i<100;i++){
            if(i%2==0){
                sum=sum+array[i];
            }
        }
        System.out.println(sum);

    }

}
