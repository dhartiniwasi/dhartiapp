package p226ee;

import android.hardware.Camera;
import java.util.Objects;

/* renamed from: ee.e */
/* compiled from: CameraWrapper */
public class C10118e {

    /* renamed from: a */
    public final Camera f40210a;

    /* renamed from: b */
    public final int f40211b;

    private C10118e(Camera camera, int i) {
        Objects.requireNonNull(camera, "Camera cannot be null");
        this.f40210a = camera;
        this.f40211b = i;
    }

    /* renamed from: a */
    public static C10118e m51454a(Camera camera, int i) {
        if (camera == null) {
            return null;
        }
        return new C10118e(camera, i);
    }
}
