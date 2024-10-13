public class 関数復習 {
    public static void hello() {                        //引数の無い関数
        System.out.println("Hello ");
    }

    public static void math(int x, int y) {             //仮引数(int x, int y)を作成
        System.out.println(x * 10);
        System.out.println("合計"+ ((10*x)+(5*y)));     //複数の引数を受け取り処理
    }
    public static void main(String[] args) {
        System.out.println("仮引数なし");
        hello();
        System.out.println("仮引数あり");
        //int num =10;
        //math(num);
        System.out.println("複数の関数");
        int apple, orange;
        apple = 100;
        orange = 250;
        math(apple,orange);
    }
}
