import java.util.Scanner;

public class Exception{
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        System.out.println("Hello world");
        //例外処理の記述
        try {                                         //例外があった場合に補足する範囲を決めてその処理を実行する  
            int num = Integer.parseInt("25");
        int answer = 100 / num;         
        System.out.println(answer);
        throw new ArithmeticException("NO");                     
        } catch (ArithmeticException e){            //エラーが発生した場合のメッセージを出力する
            //System.err.println("error "+ e.getMessage());
            e.printStackTrace();
           // System.out.println(e);
            
        }finally {                                  //例外の有無にかかわらず処理をする
            System.out.println("Hello java");
        }
        try {
            // プレイヤー名を配列で記述する
        String [] players = {"勇者","戦士"};
        // 標準入力から整数を取り込み
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        // 入力値に合わせて、プレイヤー名を表示する
        System.out.println(players[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("0から1の数値を入力してください");
            e.printStackTrace();        
        
        }catch (NumberFormatException e){
            System.out.println("半角数字を入力してください");
            e.printStackTrace();
        }finally{
            System.out.println("GAME START");
        }
    }
}