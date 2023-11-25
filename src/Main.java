import Hogwarts.Slytherin;
import Hogwarts.Hogwarts;
import Hogwarts.Hufflepuff;
import Hogwarts.Ravenclaw;
import Hogwarts.Gryffindor;

public class Main {
    public static void main(String[] args) {
        Slytherin Draco = new Slytherin("Драго", 8, 86, 45, 78, 78, 89, 67);
        Slytherin Goil = new Slytherin("Гойл", 0,23,56,21,67,3,67);
        Gryffindor Ron = new Gryffindor("Рон", 0, 1, 3, 6, 5);
        Gryffindor Germiona = new Gryffindor("Гермиона", 3,4,5,5,6);
        Germiona.compareStudents(Ron);
        Draco.compareStudentsSlytherin(Goil);
        Draco.compareStudents(Goil);
        Hufflepuff hufflepuff = new Hufflepuff( "Захария", 18, 45, 3, 7, 56);
        Hogwarts [] hogwartsStudents = new Hogwarts[] { hufflepuff, Draco, Goil};
        for (Hogwarts student : hogwartsStudents) {
        }
    }
}