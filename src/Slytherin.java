public class Slytherin extends Hogwards{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slytherin(String name, int powerMagick, int distanceTransgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerMagick, distanceTransgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public int sumScoreSpecific() {
        return cunning+determination+ambition+resourcefulness+thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{"+ super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                "} ";
    }
}
