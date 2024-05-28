public class Slytherin extends Hogwarts {

    private static String FACULTY = "Слизерин";
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
        return /*getName() + ": сила колдовства-" + getPowerOfMagic() + ", телепорт-" + getApparate() +*/
                super.toString() +
                        ", хитрость-" + cunning + ", решительность-" + determination + ", ambitiousness-" + ambitiousness +
                        ", находчивость-" + inventiveness + ", жажда власти-" + lustForPower +
                        " (" + FACULTY + ")";
    }

    public static int sumMarks(Slytherin student) {
        return student.cunning + student.determination + student.ambitiousness +
                student.inventiveness + student.lustForPower;
    }

    public static void printBestStudent(Slytherin studentA, Slytherin studentB) {
        int sumA = sumMarks(studentA);
        int sumB = sumMarks(studentB);
        if (sumA == sumB) {
            System.out.println(studentA.getName() + " и " + studentB.getName() + " имеют одинаковое количество баллов");
        } else if (sumA > sumB) {
            System.out.println(studentA.getName() + " лучше на факультете " + FACULTY +
                    ", чем " + studentB.getName() + ".");
        } else {
            System.out.println(studentB.getName() + " лучше на факультете " + FACULTY +
                    ", чем " + studentA.getName() + ".");
        }
    }

}
