
import java.util.Scanner;

public class paiza用{
    public static void main(String[] args) {
        /*int x = 6;
        System.err.println(x*x*3.14);*/

        //if練習
        int hit = (int)(Math.random()*10+1);//乱数範囲１~10 
        //System.out.println(hit);
        if (hit>=6) {
            System.out.println("クリティカル！"+"スライムに"+hit+"ダメージ！");//ダメージ6以上の処理
        }else if(hit>=4){
            System.out.println("スライムに"+hit+"ダメージ！");//ダメージ４以上の処理
        }else{
            System.out.println("スライムに"+hit+"ダメージ!");//ダメージ３以下の処理
        }

        System.out.println("");

        //西暦表記
        /*Calendar calendar=Calendar.getInstance();
        int year1 = calendar.get(calendar.YEAR);*/
        int year1 = 2034;
        int year =1988;
        System.out.println(year1-year+"年");

        System.out.println("");
        //if(補修)
        int number1 = 2;
        int number2 = 1;
        if (number1==1 && number2==1) {//and関数(２つの条件が完全一致した場合)
            System.out.println("OK!");
        }
        if (number1==1 || number2==2) {//or関数(２つの条件の片方が一致していた場合)
            System.out.println("YES!");
        }
        boolean flag = number1 ==1;//boolean関数でTrueかFalse(真偽)の判定
        System.out.println(flag);

        System.out.println("");
        //データ型の変換(キャスト)について
        System.out.println(10/3.0);

        double number =3.14;
        System.out.println(number);
        System.out.println((int)number);//double(小数)をint(整数型)に変換する
        System.out.println((float)number2);//整数を少数に変換

        String text ="123";
        System.out.println(text);
        System.out.println(Integer.parseInt(text)*10);//文字列を整数に変換
        System.out.println(Double.parseDouble(text));//文字列を少数に変換
        
        System.out.println("");
        //税込み価格の計算
        int price = 3500;//税抜価格
        System.out.println("税抜"+price+"円");

        int discountPrice = (int)(price*0.85);//割引価格
        System.out.println("15%割引後"+discountPrice+"円");

        int amount = (int)(discountPrice*1.10);//税込価格
        System.out.println("税込み"+amount+"円");

        System.out.println("");

        //while文基本形
        int i = 5;
        while(i<=10){//変数で指定した数から5まで繰り返す
            System.out.println("こんにちは "+i);//繰り返す処理
            i ++;//指定した数まで処理を繰り返す(カウンタ変数)
        }
        System.out.println();
        //カウントダウン処理
        int I = 10;
        while(I>=1){
            System.out.println("Hello "+I);
            I-=1;
        }
        System.out.println(" ");
        //for文
        for (int ii = 1; ii<=10; ii++){
            System.out.println("Hello world "+ii);
        }
        //標準入力を追加
        System.out.println("");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
    	String data = sc.nextLine();        //標準入力を受け取るdata変更を作成
        System.out.println(data);
    	
    }
}