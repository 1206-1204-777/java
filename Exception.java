public class Exception{
    public static void main(String[] args) {
        System.out.println("Hello world");
        //例外処理の記述
        try {                                         //例外があった場合に補足する範囲を決めてその処理を実行する  
            int num = 0;
        int answer = 100 / num;         
        System.out.println(answer);                         
        } catch (ArithmeticException e){            //エラーが発生した場合のメッセージを出力する
            System.out.println("error "+ e.getMessage());
        }finally {                                  //例外の有無にかかわらず処理をする
            System.out.println("java");
        }
        
    }
}