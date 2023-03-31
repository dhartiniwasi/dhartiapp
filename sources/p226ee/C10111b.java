package p226ee;

import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: ee.b */
/* compiled from: CameraHandlerThread */
public class C10111b extends HandlerThread {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10110a f40193a;

    /* renamed from: ee.b$a */
    /* compiled from: CameraHandlerThread */
    class C10112a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f40194a;

        /* renamed from: ee.b$a$a */
        /* compiled from: CameraHandlerThread */
        class C10113a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Camera f40196a;

            C10113a(Camera camera) {
                this.f40196a = camera;
            }

            public void run() {
                C10111b.this.f40193a.setupCameraPreview(C10118e.m51454a(this.f40196a, C10112a.this.f40194a));
            }
        }

        C10112a(int i) {
            this.f40194a = i;
        }

        public void run() {
            new Handler(Looper.getMainLooper()).post(new C10113a(C10117d.m51451a(this.f40194a)));
        }
    }

    public C10111b(C10110a aVar) {
        super("CameraHandlerThread");
        this.f40193a = aVar;
        start();
    }

    /* renamed from: b */
    public void mo32749b(int i) {
        new Handler(getLooper()).post(new C10112a(i));
    }
}
