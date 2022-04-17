public class Main {
    public static void main(String[] args) {
        double randomDodge1 = Math.random() * 100;
        double randomDodge2 = Math.random() * 100;
        Fighter f1 = new Fighter("A" , 10, 120, 100, randomDodge1);
        Fighter f2 = new Fighter("B", 20, 85, 85, randomDodge2);

        Match match = new Match(f1, f2, 85,100);
        match.run();
    }
}
