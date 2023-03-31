package p264io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import java.util.Objects;
import p264io.flutter.embedding.engine.FlutterJNI;

/* renamed from: io.flutter.view.h */
/* compiled from: VsyncWaiter */
public class C11096h {

    /* renamed from: e */
    private static C11096h f42847e;

    /* renamed from: f */
    private static C11098b f42848f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f42849a = -1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public FlutterJNI f42850b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11099c f42851c = new C11099c(0);

    /* renamed from: d */
    private final FlutterJNI.C10683b f42852d = new C11097a();

    /* renamed from: io.flutter.view.h$a */
    /* compiled from: VsyncWaiter */
    class C11097a implements FlutterJNI.C10683b {
        C11097a() {
        }

        /* renamed from: b */
        private Choreographer.FrameCallback m55002b(long j) {
            if (C11096h.this.f42851c == null) {
                return new C11099c(j);
            }
            long unused = C11096h.this.f42851c.f42856a = j;
            C11099c d = C11096h.this.f42851c;
            C11099c unused2 = C11096h.this.f42851c = null;
            return d;
        }

        /* renamed from: a */
        public void mo34064a(long j) {
            Choreographer.getInstance().postFrameCallback(m55002b(j));
        }
    }

    /* renamed from: io.flutter.view.h$b */
    /* compiled from: VsyncWaiter */
    class C11098b implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private DisplayManager f42854a;

        C11098b(DisplayManager displayManager) {
            this.f42854a = displayManager;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo34890a() {
            this.f42854a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                float refreshRate = this.f42854a.getDisplay(0).getRefreshRate();
                long unused = C11096h.this.f42849a = (long) (1.0E9d / ((double) refreshRate));
                C11096h.this.f42850b.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: io.flutter.view.h$c */
    /* compiled from: VsyncWaiter */
    private class C11099c implements Choreographer.FrameCallback {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f42856a;

        C11099c(long j) {
            this.f42856a = j;
        }

        public void doFrame(long j) {
            long nanoTime = System.nanoTime() - j;
            C11096h.this.f42850b.onVsync(nanoTime < 0 ? 0 : nanoTime, C11096h.this.f42849a, this.f42856a);
            C11099c unused = C11096h.this.f42851c = this;
        }
    }

    private C11096h(FlutterJNI flutterJNI) {
        this.f42850b = flutterJNI;
    }

    /* renamed from: f */
    public static C11096h m54999f(float f, FlutterJNI flutterJNI) {
        if (f42847e == null) {
            f42847e = new C11096h(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f);
        C11096h hVar = f42847e;
        hVar.f42849a = (long) (1.0E9d / ((double) f));
        return hVar;
    }

    /* renamed from: g */
    public static C11096h m55000g(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f42847e == null) {
            f42847e = new C11096h(flutterJNI);
        }
        if (f42848f == null) {
            C11096h hVar = f42847e;
            Objects.requireNonNull(hVar);
            C11098b bVar = new C11098b(displayManager);
            f42848f = bVar;
            bVar.mo34890a();
        }
        if (f42847e.f42849a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f42847e.f42849a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f42847e;
    }

    /* renamed from: h */
    public void mo34889h() {
        this.f42850b.setAsyncWaitForVsyncDelegate(this.f42852d);
    }
}
