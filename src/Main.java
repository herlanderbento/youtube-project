public class Main {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 01 de POO");
        video[1] = new Video("Aula 02 de Python");
        video[2] = new Video("Aula 03 de PHP");

        User user[] = new User[3];
        user[0] = new User("Herlander Bento", 22, "M", "herlanderbento");
        user[1] = new User("Antonio Gabriel", 22, "M", "antoniogabriel2020");
        user[2] = new User("Marcia Gaieta", 21, "F", "marcia");

        Visualization visualization[] = new Visualization[5];
        visualization[0] = new Visualization(user[0], video[2]);
        visualization[0].evaluate();
        System.out.println(visualization[0].toString());

        visualization[1] = new Visualization(user[0], video[1]);
        visualization[0].evaluate(87.0f);
        System.out.println(visualization[1].toString());


        //visualization[2] = new Visualization(user[0], video[0]);


        //System.out.println(visualization[1].toString());
        //System.out.println(visualization[2].toString());

        System.out.println("VIDEOS\n---------------------------------------");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());

        System.out.println("\nUSERS\n---------------------------------------");
        System.out.println(user[0].toString());
        System.out.println(user[1].toString());
        System.out.println(user[2].toString());
    }
}