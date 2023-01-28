public class Animal {
    private static final double DEFAULT_DOG_WEIGHT = 10.0;
    private static final double DEFAULT_CAT_WEIGHT = 5.0;
    private static final double DEFAULT_ELEPHANT_WEIGHT = 800.0;
    private static final double DEFAULT_HUMAN_WEIGHT = 70.0;
    private static final double DEFAULT_ANIMAL_WEIGHT = 1.0;
    final String species;
    private Double weight;
    String name;
    Boolean isAlive;

    public Animal(String species, String name){
        this.isAlive = true;
        this.species = species;
        switch(species){
            case "canis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "fenis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            case "homo sapiens" : this.weight = DEFAULT_HUMAN_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;

        }
    }
    public void feed(){
        this.weight += 1.0;
        System.out.println("You gave your pet some food and now it weights: " + this.weight);

        if(this.weight <=0){
            System.out.println("Pet is dead, stop feeding him");
        }
    }
    public void takeForAWalk() {
        this.weight -= 1.0;

        if (this.weight <= 0) {
            System.out.println("Pet is dead");
        }
    }
    public String toString() {
        return this.name + " " + this.species + " " + this.weight;
    }
}
