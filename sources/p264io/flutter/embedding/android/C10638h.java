package p264io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import p297mb.C11881b;
import p408yb.C13247a;
import p408yb.C13257b;
import p408yb.C13258c;

/* renamed from: io.flutter.embedding.android.h */
/* compiled from: FlutterSurfaceView */
public class C10638h extends SurfaceView implements C13258c {

    /* renamed from: a */
    private final boolean f41762a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f41763b;

    /* renamed from: c */
    private boolean f41764c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f41765d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C13247a f41766e;

    /* renamed from: f */
    private final SurfaceHolder.Callback f41767f;

    /* renamed from: g */
    private final C13257b f41768g;

    /* renamed from: io.flutter.embedding.android.h$a */
    /* compiled from: FlutterSurfaceView */
    class C10639a implements SurfaceHolder.Callback {
        C10639a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C11881b.m57388f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (C10638h.this.f41765d) {
                C10638h.this.m53364i(i2, i3);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C11881b.m57388f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            boolean unused = C10638h.this.f41763b = true;
            if (C10638h.this.f41765d) {
                C10638h.this.m53365j();
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C11881b.m57388f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            boolean unused = C10638h.this.f41763b = false;
            if (C10638h.this.f41765d) {
                C10638h.this.m53366k();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.h$b */
    /* compiled from: FlutterSurfaceView */
    class C10640b implements C13257b {
        C10640b() {
        }

        /* renamed from: b */
        public void mo33830b() {
        }

        /* renamed from: d */
        public void mo33831d() {
            C11881b.m57388f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            C10638h.this.setAlpha(1.0f);
            if (C10638h.this.f41766e != null) {
                C10638h.this.f41766e.mo38355q(this);
            }
        }
    }

    public C10638h(Context context, boolean z) {
        this(context, (AttributeSet) null, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m53364i(int i, int i2) {
        if (this.f41766e != null) {
            C11881b.m57388f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f41766e.mo38361w(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m53365j() {
        if (this.f41766e == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f41766e.mo38359u(getHolder().getSurface(), this.f41764c);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m53366k() {
        C13247a aVar = this.f41766e;
        if (aVar != null) {
            aVar.mo38360v();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: l */
    private void m53367l() {
        if (this.f41762a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f41767f);
        setAlpha(0.0f);
    }

    /* renamed from: a */
    public void mo33918a() {
        if (this.f41766e != null) {
            if (getWindowToken() != null) {
                C11881b.m57388f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                m53366k();
            }
            setAlpha(0.0f);
            this.f41766e.mo38355q(this.f41768g);
            this.f41766e = null;
            this.f41765d = false;
            return;
        }
        C11881b.m57389g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    /* renamed from: b */
    public void mo33919b(C13247a aVar) {
        C11881b.m57388f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f41766e != null) {
            C11881b.m57388f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f41766e.mo38360v();
            this.f41766e.mo38355q(this.f41768g);
        }
        this.f41766e = aVar;
        this.f41765d = true;
        aVar.mo38348f(this.f41768g);
        if (this.f41763b) {
            C11881b.m57388f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m53365j();
        }
        this.f41764c = false;
    }

    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    public C13247a getAttachedRenderer() {
        return this.f41766e;
    }

    public void pause() {
        if (this.f41766e != null) {
            this.f41766e = null;
            this.f41764c = true;
            this.f41765d = false;
            return;
        }
        C11881b.m57389g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    private C10638h(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f41763b = false;
        this.f41764c = false;
        this.f41765d = false;
        this.f41767f = new C10639a();
        this.f41768g = new C10640b();
        this.f41762a = z;
        m53367l();
    }
}
