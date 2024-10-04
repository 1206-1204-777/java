public class 動画用 {
    public static void main(String[] args) {
        //九九表
        int i,j;
        System.out.println("九九表");
        for (i = 1; i <= 9; i++) {
            System.out.print(i + "の段:");
            for (j = 1; j <= 9; j++){
                System.out.print(String.format("%3s", i*j));
            }
            System.out.println();
        }System.out.println("");
        int num =2;
        int count=0;
        while (num<10) { 
            num *=5;
            count++;
            System.out.println(count+":"+num);   
        }System.out.println(count+"回目で"+num+"を超える");

        //do while(条件を１度は実行する。また、do は while と別の処理)
        do{
            num*=2;
            System.out.println(num);
        }while(num<5);//条件は間違っているが１度だけ条件が実行される
        //continue文
        int z;
        for (z=0; z<5; z++) {
            System.out.print(z);
            if(z==4)
            continue;//この分以降の処理をスキップ(実行しない)
                System.out.print(",");
        }System.out.println();
        //関数
        
    }
}