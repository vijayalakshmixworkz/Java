class MainClass{
    final String message(){
        return "hello!";
    }
}
class Main extends MainClass{
    public static void main(String[] args) {
        System.out.println(message());
    }
    String message(){
        return "world";
    }
}