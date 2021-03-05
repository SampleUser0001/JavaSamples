package sample.enummethod;

public enum EnumMethod {
    HOGE(1){
        @Override
        public void print(){
            System.out.println(String.format("%s, %d",this.name(),this.getId()));
        }
    },
    PIYO(2){
        public void print(){
            System.out.println(String.format("%s, %d",this.name(),this.getId()));
        }
    };

    private final int id;
    private EnumMethod(int id){
        this.id = id;
    }
    public abstract void print();

    public int getId(){
        return this.id;
    }
}
