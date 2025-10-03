package msoffice;

public class word extends msoffice{
    word(String ext,String name){
        super(ext,name);
    }
    @Override
    public void createNewFile(){
        System.out.println("word file created");
    };
}
