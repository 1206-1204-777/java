import java.util.ArrayList;

public class 配列 {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();//allayListクラスを作成
        String i = "100";
        String [] team = {"田中","佐藤",i};//配列を作成
        System.out.println(team [2]);//配列内の２つ目の要素を出力する
        System.out.println("");
        
        String name[];//空の配列を作成
        name = new String[4];//配列内の要素数を指定

        int num = 0;

        name[0] = "田中";
        name[1] = "加藤";
        name[2] = "佐藤";//要素の中身を作成
        name[3] = "マックス";
        System.out.println(name[1]);//2番目の要素を出力
        System.out.println(name[num+2]);//要素番号(インデックス)は変数を使い指定できる

        //ループとの組み合わせ
        System.out.println("要素数 "+name.length);//配列の要素数を出力
        System.out.println();


        for (String member : name) {//拡張for文
            System.out.println(member);//配列の要素を順に出力
        }

        //要素の合計
        int number[] = {42,45,485,4,7};
        //System.out.println(number[4]);
        int sum =0;
        for (int n : number) {//nにnumberの要素を代入しnumber配列の要素の数だけ処理をする
            sum += n;         //変数sumにnumber配列の要素を0から順に足す
            //sum = sum+100;
        }
        System.out.println(sum);//合計を出力。この際必ずループの外に書く(合計をループ)
        System.out.println();
        //allayListクラスの使用法
        test.add(12);//allayListクラスである変数testに要素を追加
        test.add(9);
        test.add(78);
        System.out.println(test.get(1));//testの要素を出力
        test.set(1, 100);//testのインデックス1を100に更新
        System.out.println(test.get(1));//更新した要素1を出力
        test.remove(0);//要素0を削除
        System.out.println(test.size());
    }
}
