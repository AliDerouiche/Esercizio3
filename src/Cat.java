public class Cat extends Animal{

    public Cat(String species, int age) {
        super(species, age);
    }
    @Override
    public void faIlVerso() {
        System.out.println("He meows");
    }
}