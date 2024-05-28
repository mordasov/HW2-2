public class Hogwarts {

    private String name;
    private int powerOfMagic; //сила колдовства
    private int apparate; //трансгрессировать

    public Hogwarts(String name, int powerOfMagic, int apparate) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.apparate = apparate;
    }

    public static void printMostPowerfullStudent(Hogwarts studentA, Hogwarts studentB) {
        int sumA = studentA.powerOfMagic + studentA.apparate;
        int sumB = studentB.powerOfMagic + studentB.apparate;

        if (sumA == sumB) {
            System.out.println(studentA.name + " и " + studentB.name + " имеют одинаковую мощность магии");
        } else if (sumA > sumB) {
            System.out.println(studentA.name + " обладает большей мощностью магии, чем " + studentB.name + ".");
        } else {
            System.out.println(studentB.name + " обладает большей мощностью магии, чем " + studentA.name + ".");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + ": сила колдовства-" + powerOfMagic + ", телепорт-" + apparate;
    }

}
