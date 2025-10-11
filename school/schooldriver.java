package school;

public class schooldriver {
    public static void main(String[] args) {
        school s = new school();
        try{s.m1(9.1);
        }
        catch(earlyEnrtyException e){
            System.out.println(e.getMessage());
        }
        catch(lateEnrtyException e){
            System.out.println(e.getMessage());
        }
    }
}

