package Domain;

import Application.SocialShare;
import Application.TxtShare;

public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp() {
        shareStrategy = new TxtShare();
    }

    @Override
    public void edit() {
        System.out.println("Editing from plus camera app.");
    }
}
