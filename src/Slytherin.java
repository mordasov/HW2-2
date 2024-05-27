public class Slytherin extends Hogwarts {

    private static String faculty = "Слизерин";
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambitiousness; //амбициозность
    private int inventiveness; //находчивость
    private int lustForPower; //жажда власти

    public Slytherin(String name, int powerOfMagic, int apparate, int cunning, int determination,
                     int ambitiousness, int inventiveness, int lustForPower) {
        super(name, powerOfMagic, apparate);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return getName() + " (" + faculty + "): сила колдовства-" + getPowerOfMagic() + ", телепорт-" + getApparate() +
                ", хитрость-" + cunning + ", решительность-" + determination + ", ambitiousness-" + ambitiousness +
                ", находчивость-" + inventiveness + ", жажда власти-" + lustForPower;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static int sumMarks(Slytherin student) {
        return student.getPowerOfMagic() + student.getApparate() + student.getCunning() +
                student.getDetermination() + student.getAmbitiousness() + student.getInventiveness()
                + student.getLustForPower();
    }

    public static void printBestStudent(Slytherin studentA, Slytherin studentB) {
        int sumA = sumMarks(studentA);
        int sumB = sumMarks(studentB);
        if (sumA == sumB) {
            System.out.println(studentA.getName() + " и " + studentB.getName() + " имеют одинаковое количество баллов");
        } else if (sumA > sumB) {
            System.out.println(studentA.getName() + " лучше на факультете " + faculty +
                    ", чем " + studentB.getName() + ".");
        } else {
            System.out.println(studentB.getName() + " лучше на факультете " + faculty +
                    ", чем " + studentA.getName() + ".");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

}
