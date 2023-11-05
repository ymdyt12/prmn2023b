package lecture02;

import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] pasword_list = new String[5][2];

        Access access = new Access();
        pasword_list = access.register_posword();

        System.out.print("学籍番号を入力：");
        String gakuseki = input.next();

        access.Hantei1(pasword_list,gakuseki);

        System.out.print("パスワードを入力：");
        String pasword = input.next();
        access.Hantei2(pasword);

    }
}
