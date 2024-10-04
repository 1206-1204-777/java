import java.util.Scanner;                   //入力された値に処理をするパッケージをインポート

class JSample3_1{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//入力を可能にさせる記述
        int Count = sc.nextInt();            //Count変数に入力した値を代入
        System.out.println("データ個数"+Count);           //入力した値を出力

        //for文を利用し複数の入力値を取得
        String data;
        for (int i = 0; i < Count; i++) {       //count変数で指定(入力)した数処理を実行
            data=sc.next();                     //入力を取得するには 変数=sc.next(); と記述
            System.out.println("Hello "+data);  //取得した変数dataを出力
        }
    }
} 