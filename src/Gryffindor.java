public class Gryffindor extends Hogwarts {

    private static String faculty = "Гриффиндор";
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
        return student.getPowerOfMagic() + student.getApparate() + student.getNobility() +
                student.getHonor() + student.getBravery();
    }

    public static void printBestStudent(Gryffindor studentA, Gryffindor studentB) {
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

    @Override
    public String toString() {
        return getName() + " (" + faculty + "): сила колдовства-" + getPowerOfMagic() + ", телепорт-" + getApparate() +
                ", благородство-" + nobility + ", честь-" + honor + ", храбрость-" + bravery;
    }

    public static String getFaculty() {
        return faculty;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

}
