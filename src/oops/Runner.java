package oops;

public class Runner extends AbstractionClass{

    public static void main(String[] args) {
        EncapsulationClass encapsulationClass = new EncapsulationClass();
        encapsulationClass.setName("Mara");
        System.out.println(encapsulationClass.getName());
    }

    @Override
    public void address() {
        System.out.println("Vaibhavi");
    }
}
