package Infrastructure;

import Application.EmailShare;
import Application.SocialShare;
import Application.ShareStrategy;
import Domain.BasicCameraApp;
import Domain.CameraPlusApp;
import Domain.PhoneCameraApp;

public class CameraAppSimulator {

    public static void main(String[] args) {
        System.out.println("-------- Camera Plus App. --------");
        CameraPlusApp plusCameraApp = new CameraPlusApp();
        plusCameraApp.sharePhoto();
        plusCameraApp.edit();

        System.out.println("-------- Basic Camera with param in the constructor. --------");
        ShareStrategy shareStrategy = () -> System.out.println("Changing the way we share photos!");
        BasicCameraApp basicCameraApp = new BasicCameraApp(shareStrategy);
        basicCameraApp.sharePhoto();
        basicCameraApp.edit();

        System.out.println("-------- Basic Camera with no param in the constructor. --------");
        BasicCameraApp basicAppNoParam = new BasicCameraApp();
        basicAppNoParam.sharePhoto();
        basicAppNoParam.edit();

        System.out.println("-------- Phone Camera class behaving as CameraPlusApp. --------");
        PhoneCameraApp phoneCameraAsPlusApp = new CameraPlusApp();
        phoneCameraAsPlusApp.sharePhoto();

        System.out.println("-------- Changing the share interface to SocialShare. --------");
        phoneCameraAsPlusApp.setShareStrategy(new SocialShare());
        phoneCameraAsPlusApp.sharePhoto();

        System.out.println("-------- Changing the share interface to EmailShare. --------");
        phoneCameraAsPlusApp.setShareStrategy(new EmailShare());
        phoneCameraAsPlusApp.sharePhoto();

    }

}
