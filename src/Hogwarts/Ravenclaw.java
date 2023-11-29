package Hogwarts;


public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw ( String name, int skillMagic, int trangression, int mind, int wisdom, int wit, int creation) {
        super( name, skillMagic, trangression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    public int getMind () { return mind;}
    public int getWisdom() { return wisdom;}

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public String toString() {
        return super.toString() + ", обладает умом " + mind + ", мудростью " + wisdom + ", остроумием " + wit + " и творчеством " + creation;
    }

    public void compareStudentRavenclaw ( Ravenclaw student) {
        if (this.getMind() + this.getCreation() + this.getWit() + this.getWisdom() > student.getMind() + student.getCreation() + student.getWit() + student.getWisdom()) {
            System.out.println("Когтерванец " + this.getName() + " cильнее, чем " + student.getName());
        } else if (this.getMind() < student.getMind()) {
            System.out.println("Когтерванец " + student.getName() + " сильнее, чем " + this.getName());
        }else {
            System.out.println("Когтерванец " + this.getName() + " и " + student.getName() + " одинаково сильны");
        }
    }
}
