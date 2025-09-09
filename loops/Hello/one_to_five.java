package Hello;

public class one_to_five {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=1;j<=5;j++){
                if(j==5 && i==1){
                System.out.print(3);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
