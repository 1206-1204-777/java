public class 関数出力 {
    public static void hello(){                 //関数helloを作成
        System.out.println("Hello world");
    }
    public static void twice(int x) {           //関数twiceを作成
        System.out.println(x*2);                //２倍した値を出力   
    }
    public static int math(int x,int y) {      //math関数を作成

        int total =x * 10;                     //total変数を作成
        return total;                          //returnで戻り値をmain関数に返す

        //System.out.println(x+y);             //appleとorangeの値段の合計を出力
    }
    public static void main(String[] args) {
        System.out.println("Hello git");
        hello();                                //hello関数を呼び出し
        System.out.println();                   //改行用

        int num =50;
        twice(num);                             //関数twiceを呼び出す
        System.out.println();                   //改行

        //複数の関数を使用
        int apple, orange;
        apple = 100;
        orange = 200;                           //apple,orangeの値段を設定
        math(apple,orange);                     //math関数を呼び出し
        //戻り値
        int result = math(apple, orange);       //戻り値を指定
        System.out.println(result);
    }
}
