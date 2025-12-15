import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class comp{
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "comp [name=" + name + ", age=" + age + "]";
    }

    comp(String name,int age){
        this.name = name;
        this.age = age;
    }
    
}

class sortId {
    Comparator<comp> comparator = (comp c1,comp c2)->{
        return c1.getAge() - c2.getAge();
    };
}

class run{
    public static void main(String[] args) {
        ArrayList<comp> list = new ArrayList<>();
        list.add(new comp("Arpit",22));
        list.add(new comp("onw",22));
        list.add(new comp("two",22));
        list.add(new comp("three",22));

        sortId sortt = new sortId();
        Collections.sort(list,sortt.comparator);

        for(comp c:list){
            System.out.println(c);
        }
        
    }
}