package lecture02;

import java.util.Scanner;
public class prac2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("名前を入力");
        String name1 = input.next();
        System.out.println("番号を入力");
        int num =  input.nextInt();
        System.out.printf("氏名：%s \n学籍番号:%d",name1,num);
    }
}
