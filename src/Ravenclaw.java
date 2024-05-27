public class Ravenclaw extends Hogwarts {

    private static String faculty = "Когтевран";
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
        return getName() + " (" + faculty + "): сила колдовства-" + powerOfMagic + ", телепорт-" + apparate +
                ", ум-" + mind + ", мудрость-" + wisdom + ", остроумный-" + witty + ", творческий-" + creative;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static int sumMarks(Ravenclaw student) {
        return student.getPowerOfMagic() + student.getApparate() + student.getMind() +
                student.getWisdom() + student.getWitty() + student.getCreative();
    }

    public static void printBestStudent(Ravenclaw studentA, Ravenclaw studentB) {
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

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

}
