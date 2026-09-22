public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }


    public Zoo() {
        this.animals = new Animal[25];
    }

    // Instruction 8 : Méthode displayZoo()
    public void displayZoo() {
        System.out.println("Zoo: " + name + ", Ville: " + city + ", Cages: " + nbrCages);
    }

    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }
}