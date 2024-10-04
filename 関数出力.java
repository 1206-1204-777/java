public class 関数出力 {
    public static void hello(){//関数helloを作成
        System.out.println("Hello world");
    }
    public static void twice(int x) {//関数twiceを作成
        System.out.println(x*2);     //２倍した値を出力   
    }
    public static void main(String[] args) {
        System.out.println("Hello git");
        hello();//hello関数を呼び出し
        System.out.println();//改行用
        
        int num =50;
        twice(num);//関数twiceを呼び出す
    }
}
