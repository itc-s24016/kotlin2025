package APP;
import java.util.Scanner;
public class Memo {//メモ一枚

    private static int memoCount = 0; // クラス変数としてカウンタを宣言
    private String title;//タイトル
    private String content;//内容

    //コンストラクタ
    public Memo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //新規メモを作成するときは内容が入力されるまでループ、タイトルはデフォが『新規メモ』
    public static String[] makeMemo(){
        String[] list = {"", ""};//空のリストを作成
        String title;
        String content = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("タイトル：");//---------------------------------タイトル
        title = sc.nextLine();

        while (content==null){//-----------------------------------------内容
            System.out.print("内容 ➤ ");
            content = sc.nextLine();
            if (content.isEmpty() || content.equals("\"\"")) {//内容記述がない場合、警告文、キャンセル選択をする
                System.out.print("""
                        ⚠ 内容が記述されていません！
                        メモ作成をやめますか？(y / n)
                         ➤\s""");
                if (sc.nextLine().equals("y")){
                    System.out.println("ーキャンセルしましたー");
                    return list;
                }
                content=null;//内容が入るまでループする
            }
            if (title.isEmpty() || title.equals("\"\"")){//タイトルの指定がない場合自動で名付け
                int count = ++memoCount;
                title = "新規メモ"+count;
            }
            list[0] = title;
            list[1] = content;
        }
        return list;
    }

    //ゲッター
    public String getTitle() {return title;}
    public String getContent() {return content;}

    //メモのプレビュー
    public boolean showMemo(){
        System.out.println("【" + title + "】" + "：" + content);
        return true;
    }//--------------- showMemo --------------------------

    //メモの編集
    public void edit(){
        boolean a = false;
        while(!a) {
            Scanner sc = new Scanner(System.in);
            System.out.print("【内容】\n" + content + "\n修正箇所 ➤ ");
            String str1 = sc.nextLine();
            System.out.print("修正内容 ➤ ");
            String str2 = sc.nextLine();

            if (str2.isEmpty() || str2.equals("\"\"")) {//内容記述がない場合、内容を記入するまでループ
                System.out.print("⚠ 内容が記述されていません！\n");
            }else {
                System.out.println();
                content = content.replace(str1, str2);
                System.out.println();
                a = true;
            }
        }
    }//--------------- edit ------------------
}
