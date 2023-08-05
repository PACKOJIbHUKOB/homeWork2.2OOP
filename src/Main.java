public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Poter",93,54,97,95,98);
        Griffindor hermioneGranger = new Griffindor ("Hermione Granger",80,60,85,89,85);
        Griffindor ronWeasley = new Griffindor ("Ron Weasley",50,55,63,80,60);
        Slytherin dracoMalfoy = new Slytherin ("Draco Malfoy",73,58,86,80,54,41,94);
        Slytherin  grahamMontague = new Slytherin ("Graham Montague",44,36,51,28,61,52,49);
        Slytherin  gregoryGoyle = new Slytherin ("Gregory Goyle",39,42,41,22,11,24,13);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith",51,57,52,15,36);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",89,76,86,90,85);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",65,51,37,62,70);
        Ravenclaw choChang=new Ravenclaw("Cho Chang",63,52,58,61,39,74);
        Ravenclaw padmaPatil=new Ravenclaw("Padma Patil",47,29,31,59,48,43);
        Ravenclaw marcusBelby=new Ravenclaw("Marcus Belby",39,39,47,38,19,51);

        System.out.println(harryPotter);
        harryPotter.compareFaculty(hermioneGranger);
        gregoryGoyle.compareFaculty(padmaPatil);



    }
}