public class メソッド2 {
    public static void main(String[] args) {
        attack("monster");
        Enemy enemy = new Enemy("モンスター");
        enemy.enemy();
        
    }
    public static void attack(String enemy) {
        System.out.println(enemy);
    }
}

class Enemy{
    private final String enemyName;

    public Enemy(String name){
        enemyName = name;
    }
    public void enemy() {
        System.out.println(enemyName);
    }
}