public class Main {
    public static void main(String[] args) {

        Gryffindor HarryPotter = new Gryffindor("Гарри Поттер", 99, 99, 99, 99, 99);
        Gryffindor HermioneGranger = new Gryffindor("Гермиона Грейнджер", 98, 98, 98, 98, 98);
        Gryffindor RonWeasley = new Gryffindor("Рон Уизли", 97, 97, 97, 97, 97);

        Slytherin DracoMalfoy = new Slytherin("Драко Малфой", 96, 96, 96, 96, 96, 96, 96);
        Slytherin GrahamMontague = new Slytherin("Грэхэм Монтегю", 95, 95, 95, 95, 95, 95, 95);
        Slytherin GregoryGoyle = new Slytherin("Грегори Гойл", 94, 94, 94, 94, 94, 94, 94);

        Hufflepuff ZachariahSmith = new Hufflepuff("Захария Смит", 93, 93, 93, 93, 93);
        Hufflepuff CedricDiggory = new Hufflepuff("Седрик Диггори", 92, 92, 92, 92, 92);
        Hufflepuff JustinFinch = new Hufflepuff("Джастин Финч", 91, 91, 91, 91, 91);

        Ravenclaw ZhouChang = new Ravenclaw("Чжоу Чанг", 90, 90, 90, 90, 90, 90);
        Ravenclaw PadmaPatil = new Ravenclaw("Падма Патил", 89, 89, 89, 89, 89, 89);
        Ravenclaw MarcusBelby = new Ravenclaw("Маркус Белби", 88, 88, 88, 88, 88, 88);

        printStudent(HarryPotter);
        printStudent(DracoMalfoy);
        printStudent(ZachariahSmith);
        printStudent(ZhouChang);
        System.out.println();

        Gryffindor.printBestStudent(HermioneGranger, RonWeasley);
        Slytherin.printBestStudent(GrahamMontague, GregoryGoyle);
        Hufflepuff.printBestStudent(CedricDiggory, JustinFinch);
        Ravenclaw.printBestStudent(PadmaPatil, MarcusBelby);
        System.out.println();

        Hogwarts.printMostPowerfullStudent(HarryPotter, DracoMalfoy);
        Hogwarts.printMostPowerfullStudent(MarcusBelby, GregoryGoyle);
    }

    public static void printStudent(Hogwarts student) {
        System.out.println(student);
    }

}