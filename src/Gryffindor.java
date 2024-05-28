public class Gryffindor extends Hogwarts {

    private static String FACULTY = "Гриффиндор";
    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Gryffindor(String name, int powerOfMagic, int apparate, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, apparate);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static int sumMarks(Gryffindor student) {
        return student.nobility + student.honor + student.bravery;
    }

    public static void printBestStudent(Gryffindor studentA, Gryffindor studentB) {
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

    @Override
    public String toString() {
        return /*getName() + ": сила колдовства-" + getPowerOfMagic() + ", телепорт-" + getApparate() +*/
                super.toString() +
                        ", благородство-" + nobility + ", честь-" + honor + ", храбрость-" + bravery + " ("
                        + FACULTY + ")";
    }

}
