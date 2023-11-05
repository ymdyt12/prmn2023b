package lecture02;

import java.util.Scanner;
public class Access {
    String true_pasword;
    String[][] register_posword(){
        String[][] strings = new String[5][2];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            int j = 0;
            System.out.print(i + "人目の学籍番号を入力：");
            strings[i][j] = input.next();
            System.out.print(i + "番目のパスワードを入力");
            strings[i][j + 1] = input.next();
        }
        return strings;
    }

    void Hantei1(String[][] strings,String ga) {
        int flag = 0;
        for (int i = 0; i < 5; i++) {
            if (strings[i][0].equals(ga)) {
                true_pasword = strings[i][1];
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("error!");
            System.exit(0);
        }
    }

    void Hantei2(String pasword){
        if(pasword.equals(true_pasword)){
            System.out.println("ログイン完了");
        }else{
            System.out.println("不正なアクセス");
        }
    }
}
