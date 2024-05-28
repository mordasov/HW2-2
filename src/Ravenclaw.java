public class Ravenclaw extends Hogwarts {

    private static String FACULTY = "Когтевран";
    private int mind; // ум
    private int wisdom; //мудрость
    private int witty; //остроумный
    private int creative; //творческий

    public Ravenclaw(String name, int powerOfMagic, int apparate, int mind, int wisdom, int witty, int creative) {
        super(name, powerOfMagic, apparate);
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return /*getName() + ": сила колдовства-" + getPowerOfMagic() + ", телепорт-" + getApparate() +*/
                super.toString() +
                        ", ум-" + mind + ", мудрость-" + wisdom + ", остроумный-" + witty + ", творческий-" + creative +
                        " (" + FACULTY + ")";
    }

    public static int sumMarks(Ravenclaw student) {
        return student.mind + student.wisdom + student.witty + student.creative;
    }

    public static void printBestStudent(Ravenclaw studentA, Ravenclaw studentB) {
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
