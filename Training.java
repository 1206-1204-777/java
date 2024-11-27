
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String Test_play = sc.next();
            System.out.println(Test_play);
        }
        move();
        move("work");                       //引数アリのメソッドmoveを呼び出し
    }
    public static void move() {
        System.out.println("hello");
    }
    public static void move(String My_move) {      //引数 My_moveを指定し出力するメソッド
        System.out.println(My_move);
    }
}