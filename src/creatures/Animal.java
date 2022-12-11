package creatures;

public abstract class Animal extends Pet implements Feedable {

    public Animal(String species) {
        super(species);
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "elephant" -> this.weight = DEFAULT_ELEPHANT_WEIGHT;
            default -> this.weight = DEFAULT_WEIGHT;
        }
    }

    @Override
    public void feed() {
        this.weight += 0.5;
        System.out.println("Peet feeded");
    }

    @Override
    public Double getWeight() {
        return this.weight;

    }

    public void takeForAWalk(){
        if(weight>0) {
            weight -= 1.5;
            System.out.println("Weight after walk: " + weight);
        } else if(weight<0.01)
        {
            System.out.println("Peet has died :(");
        }
    }

}




