package Hogwarts;
public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor ( String name, int skillMagic, int trangression, int mobility, int honor, int bravery) {
        super( name, skillMagic, trangression);
        this.nobility = mobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {return nobility;}
    public int getHonor() {return honor;}

    public int getBravery() { return bravery;}

    public String toString () {
        return super.toString() + " , благороден на " + nobility + " , обладает честью " + honor + " и храбростью " + bravery;
    }

    public void compareStudents(Gryffindor student) {
        if ( this.getNobility() + this.getBravery() + this.getHonor() > student.getNobility() + student.getBravery() + student.getHonor()) {
            System.out.println("Гриффиндоровец " + this.getName() + " сильнее, чем " + student.getName());
        } else if (this.getNobility() < student.getNobility()) {
            System.out.println("Гриффиндоровец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Гриффиндоровцы " + this.getName() + " и " + student.getName() + " одинаково сильны");
        }
    }
}
