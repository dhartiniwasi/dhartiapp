package p226ee;

import android.hardware.Camera;
import java.util.List;

/* renamed from: ee.d */
/* compiled from: CameraUtils */
public class C10117d {
    /* renamed from: a */
    public static Camera m51451a(int i) {
        if (i != -1) {
            return Camera.open(i);
        }
        try {
            return Camera.open();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m51452b() {
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = -1;
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 0) {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: c */
    public static boolean m51453c(Camera camera) {
        List<String> supportedFlashModes;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getFlashMode() != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty() && (supportedFlashModes.size() != 1 || !supportedFlashModes.get(0).equals("off"))) {
                return true;
            }
        }
        return false;
    }
}
