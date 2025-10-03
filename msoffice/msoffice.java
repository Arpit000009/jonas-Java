package msoffice;

public abstract class msoffice {
    String ext;
    String name;
    msoffice(String ext,String name){
        this.ext = ext;
        this.name = name;
    }

    abstract public void createNewFile();
}
