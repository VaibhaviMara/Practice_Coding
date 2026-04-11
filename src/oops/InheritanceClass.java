package oops;

public class InheritanceClass extends EncapsulationClass {

    public void getNames() {
        setName("Vaibhavi");
        System.out.println(getName());
    }

    public static void main(String[] args) {
        InheritanceClass inheritanceClass = new InheritanceClass();
        inheritanceClass.getNames();
        AbstractionInterface address = new EncapsulationClass();
        address.address();
        AbstractionClass abstractionClass = new Runner();
        abstractionClass.address();
        abstractionClass.name();
    }

}
