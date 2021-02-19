package Application;

public class SocialShare implements ShareStrategy {

    @Override
    public void share() {
        System.out.println("I'm sharing via Social Media.");
    }
}
