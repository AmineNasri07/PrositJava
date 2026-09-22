public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.age = 10;
        lion.family = "Félins";
        lion.isMammal = true;
        lion.name = "ripz";

        Zoo myZoo = new Zoo();
        myZoo.name = "My Zoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;


        Animal tiger = new Animal("Félins", "Shere Khan", 5, true);
        Zoo myZoo2 = new Zoo("Friguia", "Boufiqa", 30);
        System.out.println("--- Méthode displayZoo() ---");
        myZoo2.displayZoo();

        System.out.println("\n--- Affichage direct de l'objet Zoo ---");
        System.out.println(myZoo2);
        System.out.println(myZoo2.toString());
        System.out.println("\n--- Affichage direct d'un Animal ---");
        System.out.println(tiger);
    }
}