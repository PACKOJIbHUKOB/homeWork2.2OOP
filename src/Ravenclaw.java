public class Ravenclaw extends Hogwards {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;


    public Ravenclaw(String name, int powerMagick, int distanceTransgress, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerMagick, distanceTransgress);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public int sumScoreSpecific() {
        return intelligence+wisdom+wit+creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{"+ super.toString() +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "} ";
    }

}
