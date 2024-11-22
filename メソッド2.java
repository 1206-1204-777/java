public class メソッド2 {
    public static void main(String[] args) {
        Player player = new Player("man");
        player.work();
    }
}

class  Player{
    private final String name;
    
    public Player(String myName){
        name = myName;
    }
    public void work(){
        System.out.println(name);
    }
}