public class Animal {
    String species;
    int Age;

    public Animal(String species, int age) {
        this.species = species;
        this.Age = age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", Age=" + Age +
                '}';
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public void faIlVerso() {
        System.out.println("Roars");
    }

}
