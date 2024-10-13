public class 関数復習 {
    public static void hello() {            //引数の無い関数
        System.out.println("Hello ");
    }

    public static void math(int x) {        //引数(int x)を指定
        System.out.println(x * 10);
    }
    public static void main(String[] args) {
        System.out.println("仮引数なし");
        hello();
        System.out.println("仮引数あり");
        int num =10;
        math(num);
    }
}
