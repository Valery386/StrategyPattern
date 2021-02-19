package Application;

public class TxtShare implements ShareStrategy {

    @Override
    public void share() {
        System.out.println("I'm sharing via Txt.");
    }
}
