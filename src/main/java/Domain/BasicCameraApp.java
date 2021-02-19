package Domain;

import Application.ShareStrategy;

public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        shareStrategy = () -> System.out.println("Sharing Basic Photo!");
    }

    public BasicCameraApp(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    @Override
    public void edit() {
        System.out.println("Editing from basic camera app.");
    }
}
