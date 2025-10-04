package class_04_10_2025.remotee;

public class speaker implements remote {
    @Override
    public void up() {
        System.out.println("increase");
    }
    @Override
    public void down() {
        System.out.println("decrease");
    }
}
