package Hogwarts;
public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin( String name, int skillMagic, int trangression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super( name, skillMagic, trangression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning () { return cunning;}

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public String toString () {
        return super.toString() + " обладает хтростью, " + cunning + " , решительностью " + determination + " , амбициозностью " + ambition +
                " , находчивостью " + resourcefulness + " и жаждой власти " + lustForPower;
    }

    public void compareStudentsSlytherin(Slytherin student) {

        if (this.getCunning()  + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower() >
        student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower()) {
            System.out.println("Слизериновец " + this.getName() + " cильнее, чем " + student.getName());
        } else if (this.getCunning() < student.getCunning()) {
            System.out.println("Слизериновец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Слизериновец " + this.getName() + " и " + student.getName() + " одинаково сильны");
        }
    }
}
