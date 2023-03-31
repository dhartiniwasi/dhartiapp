package p173y3;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p167x3.C6065j;

/* renamed from: y3.f */
/* compiled from: SphericalGLSurfaceView */
public final class C6136f extends GLSurfaceView {

    /* renamed from: a */
    private final CopyOnWriteArrayList<C6137a> f29561a;

    /* renamed from: b */
    private final SensorManager f29562b;

    /* renamed from: c */
    private final Sensor f29563c;

    /* renamed from: d */
    private final C6134c f29564d;

    /* renamed from: e */
    private final Handler f29565e;

    /* renamed from: f */
    private final C6135d f29566f;

    /* renamed from: g */
    private SurfaceTexture f29567g;

    /* renamed from: h */
    private Surface f29568h;

    /* renamed from: i */
    private boolean f29569i;

    /* renamed from: r */
    private boolean f29570r;

    /* renamed from: s */
    private boolean f29571s;

    /* renamed from: y3.f$a */
    /* compiled from: SphericalGLSurfaceView */
    public interface C6137a {
        /* renamed from: C */
        void mo20994C(Surface surface);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m35810b() {
        Surface surface = this.f29568h;
        if (surface != null) {
            Iterator<C6137a> it = this.f29561a.iterator();
            while (it.hasNext()) {
                it.next().mo20994C(surface);
            }
        }
        m35811c(this.f29567g, surface);
        this.f29567g = null;
        this.f29568h = null;
    }

    /* renamed from: c */
    private static void m35811c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: e */
    private void m35812e() {
        boolean z = this.f29569i && this.f29570r;
        Sensor sensor = this.f29563c;
        if (sensor != null && z != this.f29571s) {
            if (z) {
                this.f29562b.registerListener(this.f29564d, sensor, 0);
            } else {
                this.f29562b.unregisterListener(this.f29564d);
            }
            this.f29571s = z;
        }
    }

    /* renamed from: d */
    public void mo20985d(C6137a aVar) {
        this.f29561a.remove(aVar);
    }

    public C6132a getCameraMotionListener() {
        return this.f29566f;
    }

    public C6065j getVideoFrameMetadataListener() {
        return this.f29566f;
    }

    public Surface getVideoSurface() {
        return this.f29568h;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29565e.post(new C13017e(this));
    }

    public void onPause() {
        this.f29570r = false;
        m35812e();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f29570r = true;
        m35812e();
    }

    public void setDefaultStereoMode(int i) {
        throw null;
    }

    public void setUseSensorRotation(boolean z) {
        this.f29569i = z;
        m35812e();
    }
}
