package sample.enummethod;

public class App {
    public static void main(String[] args){
        Enum.valueOf(EnumMethod.class,"HOGE").print();
        Enum.valueOf(EnumMethod.class,"PIYO").print();
    }
}
