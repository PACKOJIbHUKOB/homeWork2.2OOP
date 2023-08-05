public class Griffindor extends Hogwards {
   private int nobility;
   private int honor;
   private int bravery;


    public Griffindor(String name, int powerMagick, int distanceTransgress, int nobility, int honor, int bravery) {
        super(name, powerMagick, distanceTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public int sumScoreSpecific() {
        return nobility+honor+bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{"+ super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " ;
    }


}

