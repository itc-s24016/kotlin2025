package APP;//【メモ帳アプリ】

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        while (true) {
            System.out.print("""
                    ==========================
                    1: 新規ユーザー作成
                    2: ログイン
                    3: ユーザ一覧
                    4: 退会
                    0: 終了
                    ==========================
                    メニューを選択してください：\s""");
            Scanner sc = new Scanner(System.in);
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: room.createUser();  break;
                    case 2: room.login();       break;
                    case 3: room.members();     break;
                    case 4: room.logout();     break;
                    case 0: return;
                    default: System.out.println("無効な番号です。");
                }
            }catch (InputMismatchException e) {
                System.out.println("不正な値です");
                sc.next();
            }catch (NullPointerException e){
                System.out.println("ログインしてください\nまたは、実行可能なアカウントがありません\n");
            }
        }
    }
}