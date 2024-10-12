public class 配列復習 {
    public static void main(String[] args) {
        //変数と配列の違い
        String test = "Hello ";
        String test2 = "wold";
        System.out.println(test+test2);     //変数を使用した出力

        System.out.println();

        String [] word = {"java","mine"};   //配列の作成
        System.out.println(test+word[0]);   //変数と配列を組み合わせて出力    
        System.out.println();

        System.out.println("配列の取り出し方");

        String [] name;                     //配列nameを作成
        name = new String[2];               //nameの要素数を指定
        name[0] = "佐藤";                   
        name[1] = "加藤";                   //配列の要素を２つ追加

        int num =1;                         //変数を使用して取り出す要素番号を指定
        System.out.println(name[num]);      //指定した要素を出力
        System.out.println();

        System.out.println("配列とループの組み合わせ");

        System.out.println(name.length+" ：要素数");    //nameの要素数を表示

        for (String element : name) {
            System.out.println(element);    //for文を使用しname配列の要素をすべて出力
        }
        System.out.println();
        System.out.println("要素の合計");

        int [] numbers = {12,12,4,7,8,95};  //この配列の要素を合計する
        int sum = 0;                        //空の変数を作成
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];              //空の要素sumに要素数と同じ回数[0]から順に要素を足す
        }
        System.out.println(sum);            //合計を出力

        System.out.println();

        System.out.println("");
    }
}