public class 継承 {
    public static void main(String[] args) {
        System.out.print("hello");
        sub sub = new sub();                //subオブジェクトを作成
        sub.look();                         //subクラスのlookメソッドを呼び出し
        sub.test();                         //subに継承した継承クラスのtestメソッドを呼び出し
    }
    public void test(){
        int x = 50;
        System.out.println(x*2);
    }
}
@SuppressWarnings("unused")
class sub extends 継承{
    public void look(){
        System.out.println(" world");
        System.out.println("こんにちは！");
    }
}