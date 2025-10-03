package msoffice;

public class excel extends msoffice{
    excel(String ext,String name){
        super(ext,name);
    }

    @Override
    public void createNewFile() {
        System.out.println("word file created");
    };
}
