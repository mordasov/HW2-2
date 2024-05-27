public class Hufflepuff extends Hogwarts {

    private static String faculty = "Пуффендуй";
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
        return getName() + " (" + faculty + "): сила колдовства-" + powerOfMagic + ", телепорт-" + apparate +
                ", трудолюбие-" + diligence + ", верность-" + loyalty + ", честность-" + honesty;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static int sumMarks(Hufflepuff student) {
        return student.getPowerOfMagic() + student.getApparate() + student.getDiligence() +
                student.getLoyalty() + student.getHonesty();
    }

    public static void printBestStudent(Hufflepuff studentA, Hufflepuff studentB) {
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

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

}
