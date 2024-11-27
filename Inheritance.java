// RPGのPlayerクラスを継承で記述　その2

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("=== パーティでスライムと戦う ===");

        Player hero = new Player("勇者");
        Player warrior = new Player("戦士");
        Wizard wizard = new Wizard("魔法使い");
        Player[] party = {hero, warrior, wizard};

        for (Player member : party) {
            member.attack("スライム");
        }
        // hero.attack("スライム");
    }
}

class Player {
    public String myName;

    public Player(String name) {
        myName = name;
    }

    public void attack(String enemy) {
        System.out.println(myName + "は、" + enemy + "を攻撃した！");
    }
}

class Wizard extends Player {
    public Wizard(String name) {
        super(name);
    }

    public void attack(String enemy) {
        System.out.println("シャラララーン！");
        System.out.println(myName + "は、" + enemy + "に炎を放った！");
    }
}