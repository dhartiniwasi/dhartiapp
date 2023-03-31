package p264io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import p297mb.C11881b;
import p408yb.C13247a;
import p408yb.C13258c;

/* renamed from: io.flutter.embedding.android.i */
/* compiled from: FlutterTextureView */
public class C10641i extends TextureView implements C13258c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f41771a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f41772b;

    /* renamed from: c */
    private boolean f41773c;

    /* renamed from: d */
    private C13247a f41774d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Surface f41775e;

    /* renamed from: f */
    private final TextureView.SurfaceTextureListener f41776f;

    /* renamed from: io.flutter.embedding.android.i$a */
    /* compiled from: FlutterTextureView */
    class C10642a implements TextureView.SurfaceTextureListener {
        C10642a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C11881b.m57388f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            boolean unused = C10641i.this.f41771a = true;
            if (C10641i.this.f41772b) {
                C10641i.this.m53380k();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C11881b.m57388f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            boolean unused = C10641i.this.f41771a = false;
            if (C10641i.this.f41772b) {
                C10641i.this.m53381l();
            }
            if (C10641i.this.f41775e == null) {
                return true;
            }
            C10641i.this.f41775e.release();
            Surface unused2 = C10641i.this.f41775e = null;
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C11881b.m57388f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (C10641i.this.f41772b) {
                C10641i.this.m53379j(i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public C10641i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m53379j(int i, int i2) {
        if (this.f41774d != null) {
            C11881b.m57388f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f41774d.mo38361w(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m53380k() {
        if (this.f41774d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f41775e;
        if (surface != null) {
            surface.release();
            this.f41775e = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f41775e = surface2;
        this.f41774d.mo38359u(surface2, this.f41773c);
        this.f41773c = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m53381l() {
        C13247a aVar = this.f41774d;
        if (aVar != null) {
            aVar.mo38360v();
            Surface surface = this.f41775e;
            if (surface != null) {
                surface.release();
                this.f41775e = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    /* renamed from: m */
    private void m53382m() {
        setSurfaceTextureListener(this.f41776f);
    }

    /* renamed from: a */
    public void mo33918a() {
        if (this.f41774d != null) {
            if (getWindowToken() != null) {
                C11881b.m57388f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                m53381l();
            }
            this.f41774d = null;
            this.f41772b = false;
            return;
        }
        C11881b.m57389g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    /* renamed from: b */
    public void mo33919b(C13247a aVar) {
        C11881b.m57388f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f41774d != null) {
            C11881b.m57388f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f41774d.mo38360v();
        }
        this.f41774d = aVar;
        this.f41772b = true;
        if (this.f41771a) {
            C11881b.m57388f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m53380k();
        }
    }

    public C13247a getAttachedRenderer() {
        return this.f41774d;
    }

    public void pause() {
        if (this.f41774d != null) {
            this.f41774d = null;
            this.f41773c = true;
            this.f41772b = false;
            return;
        }
        C11881b.m57389g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    public void setRenderSurface(Surface surface) {
        this.f41775e = surface;
    }

    public C10641i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41771a = false;
        this.f41772b = false;
        this.f41773c = false;
        this.f41776f = new C10642a();
        m53382m();
    }
}
