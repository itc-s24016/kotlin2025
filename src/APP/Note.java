package APP;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
//メモ帳
public class Note {
    private User user;              //ユーザネーム
    private ArrayList<Memo> note;    //メモ帳
    private ArrayList<Memo> trashBox;//ゴミ箱

    //コンストラクタ
    public Note(User user) {
        this.user = user;
        this.note = new ArrayList<>();
        this.trashBox = new ArrayList<>();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("""
                    ==========================
                    1:新規メモを作成
                    2:メモ一覧を表示
                    3:ゴミ箱
                    4:復元
                    5:パスワード管理
                    0:戻る
                    ==========================
                    メニューを選択してください：\s""");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: addNote(); break;     //作成
                    case 2: searchNote();  break; //一覧を表示
                    case 3: searchTrash();  break;
                    case 4: reset();  break;
                    case 5: passConfig();  break;
                    case 0: return;               //終了
                    default: System.out.println("無効な番号です\n"); break;//無効な選択
                }
            }
            catch (InputMismatchException e){
                System.out.println("不正な値です");
                sc.next();
            }
        }
    }//--------------- menu ---------------------------------------------------------

    // 選択したメモに対するメニューを表示
    public void showMemoMenu(Memo memo) {
        Scanner sc = new Scanner(System.in);
        while (!(note.isEmpty())){
            int count = 0;
            while (count < 3){
                if (memo.showMemo()){
                    System.out.print("""
                ~~~~~~~~~~~~~~~~~~~~~~~~
                1: 削除
                2: 編集
                0: 戻る
                ~~~~~~~~~~~~~~~~~~~~~~~~~
                メニューを選択してください：\s""");

                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1: trash(memo);return;
                            case 2: memo.edit(); break;
                            case 0: return; // メモ選択に戻る
                            default: System.out.println("無効な番号です\n");
                        }

                }
                count++;
            }
            System.out.print("パスワードを確認しますか？(y / n)\n ➤ ");
            if(sc.nextLine().equals("n")){
                System.out.println("ーキャンセルしましたー");
                return;
            }
            System.out.print("ユーザネーム\n ➤ ");
            if (!(sc.nextLine().equals(user.getName()))){
                System.out.println("認証されませんでした\n");
                return;
            }
            HideMemo a = (HideMemo) memo;
            a.getPass();
            System.out.println();
        }
    }

    //作成
    public void addNote() {
        Scanner sc = new Scanner(System.in);
        Memo memo;
        while (true) {
            System.out.print("1：通常メモ / 2：鍵付きメモ\n ➤ ");
            try {
                int num = sc.nextInt();
                String[] list;
                if (num == 1) {//通常メモ
                    list = Memo.makeMemo();
                    memo = new Memo(list[0], list[1]);
                    if (memo.getContent().isEmpty()){
                        break;
                    }
                }
                else if (num == 2) {//鍵付きメモ
                    list = Memo.makeMemo();
                    memo = new HideMemo(list[0], list[1]);
                    if (memo.getContent().isEmpty()){
                        break;
                    }
                }
                else {
                    System.out.println("""
                            選択肢にない番号です
                            メモ作成をキャンセルしました
                            """);   break;
                }

                if (!(memo.getContent().isEmpty() || memo.getContent().equals("\"\""))) {
                    System.out.println("------ プレビュー ------");
                    memo.showMemo();//作成したメモを表示
                    note.add(memo);//追加
                    System.out.println();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("不正な値です");
                sc.next();
            }
        }
    }//--------------- addNote -------------

    //メモ一覧
    public void listNote(){
        for (Memo memo : note) {
            System.out.println("【 "+memo.getTitle()+" 】");
        }
    }//--------------- listNote ---------------------------
    //ゴミ箱一覧
    public void listTrash(){
        for (Memo memo : trashBox) {
            System.out.println("【 " + memo.getTitle() + " 】");
        }
    }//--------------- listTrash ------------------------------

    //一覧を表示
    public void searchNote(){
        Scanner sc = new Scanner(System.in);
        if (note.isEmpty()){
            System.out.print("""
                メモがありません...
                メモを作成しますか？(y / n)
                 ➤\s""");
            if(sc.nextLine().equals("n")){return;}
            addNote();return;
        }

        while (!(note.isEmpty())) {
            System.out.println("メモを選んでください (back → 0)▼");
            listNote();//メモ一覧
            System.out.print("--------------------------\n ➤ ");
            String title = sc.nextLine(); // タイトル
            if (title.equals("0")) {return;}// メニューに戻る
            for (Memo memo : note) {
                if (memo.getTitle().equals(title)) {
                    showMemoMenu(memo);
                    return; // メモが見つかったらループを抜ける
                }
            }System.out.println("メモが見つかりませんでした\n");
        }
    }//--------------- searchNote -------------------------------

    //ゴミ箱へ
    public void trash(Memo memo) {
        Iterator<Memo> iterator = note.iterator();
        while (iterator.hasNext()) {
            Memo currentMemo = iterator.next();
            if (currentMemo.equals(memo)) {
                iterator.remove(); // Iteratorのremove()メソッドで安全に要素を削除
                trashBox.add(currentMemo);
                return;
            }
        }
    }//--------------- trash -----------------------------

    //ゴミ箱を表示＆全消去
    public void searchTrash() {
        System.out.println("メモ【" + trashBox.size() + "件】");
        listTrash();
        System.out.println();

        if (trashBox.isEmpty()) {return;}
        System.out.print("""
                --------------------------
                ゴミ箱を空にしますか？(y / n)
                 ➤\s""");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        if (check.equals("y")) {
            System.out.print("""
                    最終確認：本当によろしいですか？(y / n)
                     ➤\s""");
            check = sc.nextLine();
            if (check.equals("y")) {
                trashBox.clear();
                System.out.println("ー全消去完了ー\n");
            } else {System.out.println("ー消去をキャンセルしましたー\n");}
        }else {System.out.println("ー消去をキャンセルしましたー\n");}
    }//--------------- searchTrash ---------------------------------

    //復元
    public void reset(){
        if (trashBox.isEmpty()) {//復元できるメモがあるか確認
            System.out.println("ゴミ箱は空です\n");
            return;
        }

        System.out.println("復元したいメモを選んでください ▼");
        listTrash();
        System.out.print("--------------------------\n ➤ ");

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine(); // タイトルを入力
        for (int i = 0; i < trashBox.size(); i++) {
            if (trashBox.get(i).getTitle().equals(title)) {
                Memo memo = trashBox.remove(i);
                note.add(memo);
                return;
            }
        }
    }//--------------- reset -------------------------------

    //パスワードの管理
    public void passConfig(){
        Scanner sc = new Scanner(System.in);
        System.out.print("UserName\n ➤ ");
        if (!(sc.nextLine().equals(user.getName()))) {
            System.out.println("認証されませんでした\n"); return;
        }
        while(true) {
            System.out.print("""
                    #########
                    1: Edit
                    2: View
                    0: Exit
                    #########
                     ➤\s""");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: passEdit();break;
                case 2: passView();break;
                case 0: return; // メモ選択に戻る
                default: System.out.println("無効な番号です\n");
            }
        }
    }

    public void passEdit(){
        System.out.println("\nSelect the path you want to change.");
        for (Memo memo : note) {
            if (!(memo instanceof HideMemo)){continue;}
            System.out.println("【 "+memo.getTitle()+" 】");
        }System.out.print(" ➤ ");
        Scanner sc = new Scanner(System.in);
        for (Memo memo : note) {
            if (memo.getTitle().equals(sc.nextLine())) {
                ((HideMemo) memo).editPass();
                return; // メモが見つかったらループを抜ける
            }
        }System.out.println("Not Found...\n");
    }

    public void passView(){
        System.out.println();
        for (Memo memo : note) {
            if (!(memo instanceof HideMemo)){continue;}
            ((HideMemo) memo).getPass();
        }System.out.println();
    }
}