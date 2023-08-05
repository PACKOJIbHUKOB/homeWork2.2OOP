public abstract class Hogwards {
    private String name;
    private int powerMagick;
    private int distanceTransgress;

    public Hogwards(String name, int powerMagick, int distanceTransgress) {
        this.name = name;
        this.powerMagick = powerMagick;
        this.distanceTransgress = distanceTransgress;
    }
    abstract public int sumScoreSpecific();
    public void compareFaculty(Hogwards hogwards){
        if (this.getClass().equals(hogwards.getClass())){
            compareStudentSpecificScore(hogwards);}
        else {compareStudentScore(hogwards);

        }
    }
    private   void compareStudentScore(Hogwards hogwards) {
        int thisScore = this.getPowerMagick() + this.getDistanceTransgress();
        int overScore = hogwards.getPowerMagick() + hogwards.getDistanceTransgress();

        if (thisScore > overScore) {
            System.out.println(this.getName() + " Сильнее чем " + hogwards.getName());
        } else if (thisScore < overScore) {
            System.out.println(this.getName() + " слабее чем " + hogwards.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwards.getName() + " равны по силе ");
        }
    }
    private void compareStudentSpecificScore (Hogwards hogwards){
        int thisScore=this.sumScoreSpecific();
        int overScore = hogwards.sumScoreSpecific();

        if (thisScore > overScore) {
            System.out.println(this.getName() + " Сильнее в "+hogwards.getClass()+" чем " + hogwards.getName());
        } else if (thisScore < overScore) {
            System.out.println(this.getName() + " Сильнее в "+hogwards.getClass()+" чем " + hogwards.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwards.getName() + " равны по силе ");
        }

    }

    public String getName() {
        return name;
    }

    public int getPowerMagick() {
        return powerMagick;
    }

    public int getDistanceTransgress() {
        return distanceTransgress;
    }


    @Override
    public String toString() {
        return  "Hogwards{" +
                "name='" + name + '\'' +
                ", powerMagick=" + powerMagick +
                ", distanceTransgress=" + distanceTransgress +
                '}';
    }
}
