package java8;
//check is two numbers is possitive
public class possitive {
    public static void main(String[] args) {
        String str  = "I am arpit and ahmed is my friendddd";
        int count = 0;
        int maxcount = 0;
        String str2 = "";
        String maxstr = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){ 
                count++;
                str2 = str2+str.charAt(i);
            }
            else{
                count = 0;
                str2 = "";
            }
            if(count>maxcount){
                maxcount = count;
                maxstr = str2;
            }
        }

        System.out.println(maxstr);
    }
    
}
