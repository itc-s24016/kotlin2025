package APP;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private ArrayList<User> users;
    private User user;

    public Room() {
        this.users = new ArrayList<>();
    }

    public void createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ユーザネームを入力してください：");
        String name = sc.nextLine();
        if (name.isEmpty() || name.equals("\"\"")) {
            System.out.println("⚠文字を入力してください\n");
            return;
        }
        users.add(new User(name));
        System.out.println("ユーザーを作成しました。");
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ユーザネームを入力してください：");
        String name = sc.nextLine();
        sc.nextLine(); // 改行文字を読み飛ばす

        for (User u : users) {
            if (u.getName().equals(name)) {
                user = u;
                System.out.println("ログイン成功");
                user.getNote().menu(); // 切り替え後にNoteのmenuを表示
            }
        }System.out.println("ログイン失敗");
    }

    public void members(){
        if (users.isEmpty()){
            System.out.println("まだ誰もいません...\nアカウントを作成してメモを書こう！\n");
            return;
        }
        for (User u : users) {
            if (u == user){
                System.out.println("《 "+u.getName()+" 》◀");
                continue;
            }
            System.out.println("《 "+u.getName()+" 》");
        }System.out.println();
    }

    public void logout(){
        System.out.println("《 "+user.getName()+" 》が退会しました");
        users.remove(user);
    }
}
