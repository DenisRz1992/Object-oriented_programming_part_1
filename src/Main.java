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
        Hufflepuff Zaharia = new Hufflepuff( "Захария", 18, 45, 3, 7, 56);
        Hufflepuff Sedric = new Hufflepuff("Седрик",2,4,5,7,8);
        Ravenclaw Marcus = new Ravenclaw("Маркус", 10,11,12,13,15,6);
        Ravenclaw Padma = new Ravenclaw("Падма",16,10,43,23,3,36);
        Draco.compareStudentsSlytherin(Goil);
        Draco.compareStudents(Goil);
        Germiona.compareStudents(Ron);
        Zaharia.compareStudent(Sedric);
        Marcus.compareStudentRavenclaw(Padma);
        Marcus.compareStudents(Padma);
        Hogwarts [] hogwartsStudents = new Hogwarts[] { Ron, Germiona, Draco, Goil, Zaharia, Sedric, Marcus, Padma};
        for (Hogwarts student : hogwartsStudents) {
        }
    }
}