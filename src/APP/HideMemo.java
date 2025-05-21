package APP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HideMemo extends Memo {
    private Memo memo;
    private int pass;

    public HideMemo(String title, String content) { // タイトルとコンテンツを引数として受け取る
        super(title, content); // Memo クラスのコンストラクタを呼び出す
        boolean check = false;
        this.memo = new Memo(("_"+title), content);
        while (!check) {
            System.out.print("パスワードを設定してください\n ➤ ");
            Scanner sc = new Scanner(System.in);
            try {
                this.pass = sc.nextInt();
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("入力値が不正です\n数字を入力してください");
            }
        }
    }

    public String getTitle() {
        return memo.getTitle();
    }

    public String getContent() {
        return memo.getContent();
    }

    public void getPass() {
        System.out.println("【 "+getTitle()+" 】:"+pass);
    }

    public void editPass() {
        System.out.print("Now :"+pass+"\nchange ➤ ");
        Scanner sc = new Scanner(System.in);
        pass = sc.nextInt();
        getPass();
    }

    public boolean showMemo() {
        System.out.print("pass: ");
        Scanner sc = new Scanner(System.in);
        try {
            if (sc.nextInt() == pass) {
                memo.showMemo();
                return true;
            } else {
                System.out.println("パスワードが一致しません\n");
                return false;
            }
        }catch (InputMismatchException e) {
            System.out.println("パスワードが一致しません\n");
            return false;
        }
    }

    public void edit() {
        memo.edit();
    }
}
