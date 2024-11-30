import java.io.*;
import java.util.Scanner;
public class writing {
    public static void main(String[] args) throws IOException{
        //ファイルの作成
        File file = new  File("articles.txt");   //作成と書きこむファイルの指定を行う
        try ( //ファイルへの書き込み
                FileWriter writing = new FileWriter(file)) {
                writing.write("Hello\n");
                writing.write("java\n");
                writing.write("こんにちは");

                //ファイルの読み込み
                Scanner sc = new Scanner(file);         //ファイルを指定して読み込む
                while (sc.hasNextLine()) {
                    boolean Line =  sc.hasNextLine();
                    System.out.println(Line);
                }
                sc.close();
        }
    }
}
