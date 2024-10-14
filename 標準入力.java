import java.util.Scanner;                   //入力された値に処理をするパッケージをインポート

class 標準入力{
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
        //標準入力したデータを配列に格納する
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n + m);

        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = sc.nextInt();
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}  