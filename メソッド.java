public class メソッド{
public static void main(String[] args) {  //mainメソッドを作成
    System.out.println("Hello world");  //mainメソッドの内容
    sayHello();                           //sayHelloメソッドを呼び出す。内容はメインと同じ
    int num1 = math(3,2);                 //int num1変数を作成。変数内容はmathメソッドに３を渡す
    System.out.println(num1);             //mathメソッドから返ってきた値を出力する

    Msg msg1 = new Msg("戦士");       //Msgクラス内のメンバー変数myNameを変数msg1に代入
    msg1.msg();                           //Msgクラスのmsgメソッドを呼び出す
    Msg msg2 = new Msg("Wolf");
    msg2.msg();

    Item apple = new Item(120, 25);
    int total = apple.getTotalAmount();
    System.out.println(total);
}
public static void sayHello(){
    System.out.println("Hello world");  //sayHelloメソッドを作成
}

public static int math(int x,int y) {               //mathメソッドを作成
    return  x * y;                          //戻り値をx*yとしてmainに返す
}
} 

class Msg{                                  //Msgクラスを作成
    private final String myName;            //メンバー変数myNameを作成

    public Msg(String name){                //コンストラクタを作成
        myName = name;                      //初期値の設定
    }
    public void msg(){
        System.out.println(myName+" is walk");
    }
}

class Item{
    private final int price;
    private final int Quantity;
    public Item(int newPrice,int newQuantity){
        price = newPrice;
        Quantity = newQuantity;
    }

public int getTotalAmount(){
    return price * Quantity;
}
}