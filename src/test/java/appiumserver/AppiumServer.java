package appiumserver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class AppiumServer {

    //static AppiumDriverLocalService server;
    //static String mainJSpath = "C:/Users/ceyer/AppData/Roaming/npm/node_modules/appium/build/lib/main.js";

    public static void start() {

        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("C:\\Program Files\\nodejs")) // Node.js'nin yolu
                .withAppiumJS(new File("C:\\Users\\ceyer\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")) // Appium'un ana dosyasının yolu
                .withArgument(GeneralServerFlag.LOG_LEVEL, "info")); // Log seviyesi (opsiyonel)

        // Appium sunucusunu başlatın

        //if (server == null) {
            //AppiumServiceBuilder builder = new AppiumServiceBuilder();
            //builder.withIPAddress("127.0.0.1");
                    //builder.usingPort(4723);
                   // .withAppiumJS(new File(mainJSpath))
                   // .usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"));
            //server = AppiumDriverLocalService.buildService(builder);
            service.start();
        }
    //}

//    public static void stop() {
        //if (server.isRunning()) {

        //service.stop();
        //}
    //}

}
