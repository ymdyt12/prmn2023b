package lecture02;

public class Keisan {

    int sum(int[] array){
        int sum = 0;
        for(int i = 0;i < 5;i++){
            sum += array[i];
        }
        return sum;

    }
    void hantei(int sum){
        System.out.println("合計値:" + sum);
        if(sum >= 100){
            System.out.println("great!!");
        }else if(sum >= 50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
