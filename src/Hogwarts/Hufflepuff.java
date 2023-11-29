package Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff ( String name, int skillMagic, int trangression, int industriousness, int loyalty, int honesty) {
        super( name, skillMagic, trangression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriousness () { return industriousness;}

    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    public String toString () {
        return super.toString() + " , обладает трудолюбием " + industriousness + ", верностью " + loyalty + " и чесностью " + honesty;
    }
    public void compareStudent ( Hufflepuff student) {
        if (this.getIndustriousness() + this.getHonesty() + this.getLoyalty() > student.getIndustriousness() + student.getHonesty() + student.getLoyalty()) {
            System.out.println("Пуфендуровец " + this.getName() + " сильнее, чем " + student.getName());
        } else if (this.getIndustriousness() < student.getIndustriousness()) {
            System.out.println("Пуфендуровец " + student.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Пуфендуровцы " + this.getName() + " и " + student.getName() + " одинаково сильны");
        }
    }
}
