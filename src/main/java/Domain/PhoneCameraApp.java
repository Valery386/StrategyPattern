package Domain;

import Application.ShareStrategy;

public abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public PhoneCameraApp() {
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    abstract void edit();

    public void sharePhoto() {
        shareStrategy.share();
    }

    public void save() {
        System.out.println("All cameras save pictures!");
    }

    public void take() {
        System.out.println("All cameras take photos!");
    }
}
