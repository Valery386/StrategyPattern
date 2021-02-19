package Application;

public class EmailShare implements ShareStrategy {

    @Override
    public void share() {
        System.out.println("I'm sharing via Email.");
    }
}
