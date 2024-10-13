public class 関数復習 {
    public static int total(int z){
        int total = z * 10;
        return total;
    }

    public static void hello() {                        //引数の無い関数
        System.out.println("Hello ");
    }

    public static void math(int x, int y) {             //仮引数(int x, int y)を作成
        System.out.println(x * 10);
        System.out.println("合計"+ ((10*x)+(5*y)));     //複数の引数を受け取り処理
    }
    public static void ma(int[] x) {
        int sum = 0;
        for (int i=0;i<3;i++) {                         //配列を受け取り受け取った要素の平均を計算
            sum += x[i];
        }
        System.out.println("平均点"+sum/3);
    }
    public static void main(String[] args) {
        System.out.println("仮引数なし");
        hello();
        //System.out.println("仮引数あり");
        //int num =10;
        //math(num);
        System.out.println("複数の関数を使用");
        int apple, orange;
        apple = 100;
        orange = 250;
        math(apple,orange);
        System.out.println("戻り値");
        int result = total(apple);
        if(result>3000){
            System.out.println("over");
        }
        else;
        System.out.println("Ok");
        System.out.println("配列を引数として渡す");

        int [] score = {64,78,94};
        ma(score);
    }
}
