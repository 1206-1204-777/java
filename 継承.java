public class 継承 {
    public static void main(String[] args) {
        System.out.print("hello");
        sub sub = new sub();                //subオブジェクトを作成
        sub.look();                         //subクラスのlookメソッドを呼び出し
        sub.test();                         //subに継承した継承クラスのtestメソッドを呼び出し

        constructor constructor = new constructor("south"); //constructorオブジェクトを作成し引数の内容を記述
        constructor.test2();                                     //constructorオブジェクトのテストメソッドを呼び出し
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

@SuppressWarnings("unused")
class constructor{                         
    public String test;
    public constructor(String name){           //引数アリのコンストラクタを作成
        test = name;                           //引数nameをtestフィールドに代入 
    }
    public void test2() {                      //引数を格納したtestフィールドを出力するメソッドを作成
        System.out.println(test);
    }
}
