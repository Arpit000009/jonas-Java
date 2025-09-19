package wats;

public class watsapp {
    String message;
    String theme;
    int filesize;
    profile p;

    watsapp(String message,String theme,int filesize){
        this.message = message;
        this.theme = theme;
        this.filesize = filesize;
    }

        public void uploadprofile(profile p){
        if(this.p == null){
            this.p = p;
            System.out.println("profile uploaded");
        }
        else{
            System.out.println("profile already present");
        }
    }
    public void removeprofile(){
        if(this.p!=null){
            this.p = null;
            System.out.println("profile removed");
        }
        else{
            System.out.println("no profile to be removed");
        }
    }
}

