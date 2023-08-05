public class Hufflepuff extends Hogwards{
    private int hardworking;
    private int loyal;
    private int honest;



    public Hufflepuff(String name, int powerMagick, int distanceTransgress, int hardworking, int loyal, int honest) {
        super(name, powerMagick, distanceTransgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public int sumScoreSpecific() {
        return hardworking+loyal+honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{"+ super.toString()  +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                "} ";
    }
}
