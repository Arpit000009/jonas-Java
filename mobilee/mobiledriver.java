package mobilee;

class mobiledriver{
    public static void main(String[] args) {
        mobile m = new mobile(6.69,"samgsung");
        m.insert(new Earphone(3,1));
        System.out.println(m.brand);
        System.out.println(m.e.length);
        m.insert(new Earphone(0, 5));
    }
}