public class Hufflepuff extends Hogwarts {

    private static String FACULTY = "Пуффендуй";
    private int diligence; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String name, int powerOfMagic, int apparate, int diligence, int loyalty, int honesty) {
        super(name, powerOfMagic, apparate);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return /*getName() + ": сила колдовства-" + getPowerOfMagic() + ", телепорт-" + getApparate() +*/
                super.toString() +
                        ", трудолюбие-" + diligence + ", верность-" + loyalty + ", честность-" + honesty + " ("
                        + FACULTY + ")";
    }

    public static int sumMarks(Hufflepuff student) {
        return student.diligence + student.loyalty + student.honesty;
    }

    public static void printBestStudent(Hufflepuff studentA, Hufflepuff studentB) {
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
