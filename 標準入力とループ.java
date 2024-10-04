import java.util.*;

public class 標準入力とループ {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startYear = sc.nextInt();			//１つ目の値を取得する
        int duration = sc.nextInt();			//2つ目の値を取得する

        for (int i = 0; i < duration; i++) {	//ループを2つ目の値まで行う
            int adYear = startYear + i;			//西暦用の変数を作成。１つ目の値に変数iを足すことで変数の更新を行う
            int showaYear = adYear - 1925;		//和暦用の変数を作成。ループ内に置くことで西暦と連動する(adYear - 1925)
            System.out.println("西暦" + adYear + "年は昭和" + showaYear + "年です");
        }
    }
}
