import java.io.*;
import java.util.Scanner;
public class writing {
    public static void main(String[] args) throws IOException{
        //ファイルの作成
        File file = new  File("articles.txt");   //作成と書きこむファイルの指定を行う
        //ファイルへの書き込み
        try (FileWriter writing = new FileWriter(file)) {
                writing.write("Hello\n");
                writing.write("java\n");
                writing.write("こんにちは");

                for (int i = 0; i < 100+1; i++) {        //forで１から１００までの数を書きこむ処理

                    writing.write(i+"\n");
                }

                //ファイルの読み込み
            try (Scanner sc = new Scanner(file)) {//ファイルを指定して読み込む
                while (sc.hasNextLine()) {
                    boolean Line =  sc.hasNextLine();
                    System.out.println(Line);
                }
            }
        }
    }
}
