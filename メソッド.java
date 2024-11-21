public class メソッド{
public static void main(String[] args) {  //mainメソッドを作成
    System.out.println("Hello world");  //mainメソッドの内容
    sayHello();                           //sayHelloメソッドを呼び出す。内容はメインと同じ
    int num1 = math(3,2);                 //int num1変数を作成。変数内容はmathメソッドに３を渡す
    System.out.println(num1);             //mathメソッドから返ってきた値を出力する
}
public static void sayHello(){
    System.out.println("Hello world");  //sayHelloメソッドを作成
}

public static int math(int x,int y) {               //mathメソッドを作成
    return  x * y;                          //戻り値をx*yとしてmainに返す
}
} 