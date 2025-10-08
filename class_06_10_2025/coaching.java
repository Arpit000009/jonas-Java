package class_06_10_2025;

import java.util.Objects;

public class coaching {
    int fees;
    int strength;
    String name;
    int staff;
    coaching(int fees,int strength,String name,int staff){
        this.fees = fees;
        this.strength = strength;
        this.name = name;
        this.staff = staff;
    }

    @Override
    public String toString() {
        return fees + " " + strength + " " + name + " " + staff;
    }

     @Override
    public boolean equals(Object o){
        coaching c2 = (coaching)o;

        return this.fees == c2.fees && this.strength == c2.strength && this.name==c2.name && this.staff == c2.staff;
    }
    @Override
    public int hashCode(){
        return Objects.hash(fees,strength,name,staff);

}
}
