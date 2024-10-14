public class 二次元配列 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("2次元配列の作成");
        String[] teamC = {"勇者", "戦士", "魔法使い"};
        String[] teamD = {"盗賊", "忍者", "商人"};
        String[] teamE = {"スライム", "ドラゴン", "魔王"};
        
        String[][] teams = {teamC, teamD, teamE};           // teamC~Dをteamsに格納
        System.out.println(teams[0][0]);                    //記述の説明：[0](teamsの要素番号)[1](teamsに格納した配列内の要素)
        System.out.println(teams[1][2]);
        System.out.println(teams[0][2]);
        System.err.println("");

        System.out.println("配列の操作");
        teamC[2] = "魔導士";
        System.out.println(teams[0][0]);                    
        System.out.println(teams[1][2]);
        System.out.println(teams[0][2]);
        System.out.println("");

        System.out.println("ループでの処理方法");           //ループを使用し各要素の番号を改行して出力
        for(int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.print(i);
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
            System.out.println("----------");
        }
        
    }
}
