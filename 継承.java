public class 継承 {
    public static void main(String[] args) {
        System.out.println("hello");
        sub sub = new sub();
        sub.look();
        
    }
}
@SuppressWarnings("unused")
class sub extends 継承{
    public void look(){
        System.out.println("world");
    }
}