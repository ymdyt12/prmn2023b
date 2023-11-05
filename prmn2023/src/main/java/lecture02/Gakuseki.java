package lecture02;

import java.util.Scanner;
public class Gakuseki {
    Gakuseki(String number){
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください");
        String gakusei = scan.next();

        if(number.equals(gakusei)){
            System.out.println("complete!");
        }else{
            System.out.println("error!");
        }

    }
}
