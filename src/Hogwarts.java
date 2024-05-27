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
        int sumA = studentA.powerOfMagic + studentB.getApparate();
        int sumB = studentB.powerOfMagic + studentB.getApparate();

        if (sumA == sumB) {
            System.out.println(studentA.getName() + " и " + studentB.getName() + " имеют одинаковую мощность магии");
        } else if (sumA > sumB) {
            System.out.println(studentA.getName() + " обладает большей мощностью магии, чем " + studentB.getName() + ".");
        } else {
            System.out.println(studentB.getName() + " обладает большей мощностью магии, чем " + studentA.getName() + ".");
        }
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + ": сила колдовства-" + powerOfMagic + ", телепорт-" + apparate;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getApparate() {
        return apparate;
    }

}
