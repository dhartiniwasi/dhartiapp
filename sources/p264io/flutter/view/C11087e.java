package p264io.flutter.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import p186ac.C6538b;
import p186ac.C6539c;
import p195bc.C6736a;
import p203cc.C6851a;
import p264io.flutter.embedding.android.C10623a;
import p264io.flutter.embedding.android.C10661s;
import p264io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import p264io.flutter.plugin.editing.C10710f;
import p264io.flutter.view.C11091f;
import p297mb.C11881b;
import p306nb.C11992a;
import p315ob.C12051a;
import p417zb.C13508h;
import p417zb.C13536m;

@Deprecated
/* renamed from: io.flutter.view.e */
/* compiled from: FlutterView */
public class C11087e extends SurfaceView implements C6539c, C11091f, C6851a.C6854c, C10661s.C10668e {

    /* renamed from: a */
    private final C12051a f42826a;

    /* renamed from: b */
    private final C13508h f42827b;

    /* renamed from: c */
    private final C13536m f42828c;

    /* renamed from: d */
    private final C10710f f42829d;

    /* renamed from: e */
    private final C6736a f42830e;

    /* renamed from: f */
    private final C10661s f42831f;

    /* renamed from: g */
    private final C10623a f42832g;

    /* renamed from: h */
    private C11069c f42833h;

    /* renamed from: i */
    private final AtomicLong f42834i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C11086d f42835r;

    /* renamed from: io.flutter.view.e$a */
    /* compiled from: FlutterView */
    final class C11088a implements C11091f.C11094c {

        /* renamed from: a */
        private final long f42836a;

        /* renamed from: b */
        private final SurfaceTextureWrapper f42837b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f42838c;

        /* renamed from: d */
        private SurfaceTexture.OnFrameAvailableListener f42839d = new C11089a();

        /* renamed from: io.flutter.view.e$a$a */
        /* compiled from: FlutterView */
        class C11089a implements SurfaceTexture.OnFrameAvailableListener {
            C11089a() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!C11088a.this.f42838c) {
                    C11086d unused = C11087e.this.f42835r;
                }
            }
        }

        C11088a(long j, SurfaceTexture surfaceTexture) {
            this.f42836a = j;
            this.f42837b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                mo34885c().setOnFrameAvailableListener(this.f42839d, new Handler());
            } else {
                mo34885c().setOnFrameAvailableListener(this.f42839d);
            }
        }

        /* renamed from: a */
        public void mo34883a() {
            if (!this.f42838c) {
                this.f42838c = true;
                mo34885c().setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                this.f42837b.release();
                C11086d unused = C11087e.this.f42835r;
                throw null;
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo34884b(C11091f.C11093b bVar) {
            C11095g.m54993b(this, bVar);
        }

        /* renamed from: c */
        public SurfaceTexture mo34885c() {
            return this.f42837b.surfaceTexture();
        }

        /* renamed from: d */
        public long mo34886d() {
            return this.f42836a;
        }

        /* renamed from: e */
        public /* synthetic */ void mo34887e(C11091f.C11092a aVar) {
            C11095g.m54992a(this, aVar);
        }
    }

    /* renamed from: io.flutter.view.e$b */
    /* compiled from: FlutterView */
    private enum C11090b {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    /* renamed from: m */
    private C11090b m54963m() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return C11090b.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? C11090b.LEFT : C11090b.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return C11090b.BOTH;
            }
        }
        return C11090b.NONE;
    }

    /* renamed from: n */
    private boolean m54964n() {
        return false;
    }

    /* renamed from: p */
    private void m54965p() {
        C11069c cVar = this.f42833h;
        if (cVar != null) {
            cVar.mo34843Q();
            this.f42833h = null;
        }
    }

    /* renamed from: q */
    private void m54966q() {
        C13536m.C13538b bVar;
        if ((getResources().getConfiguration().uiMode & 48) == 32) {
            bVar = C13536m.C13538b.dark;
        } else {
            bVar = C13536m.C13538b.light;
        }
        this.f42828c.mo38647a().mo38652e(getResources().getConfiguration().fontScale).mo38653f(DateFormat.is24HourFormat(getContext())).mo38651d(bVar).mo38648a();
    }

    /* renamed from: a */
    public C6539c.C6542c mo22134a(C6539c.C6543d dVar) {
        return null;
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f42829d.mo34205j(sparseArray);
    }

    /* renamed from: b */
    public /* synthetic */ C6539c.C6542c mo22135b() {
        return C6538b.m38040a(this);
    }

    /* renamed from: c */
    public PointerIcon mo22960c(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean checkInputConnectionProxy(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo22136d(String str, C6539c.C6540a aVar, C6539c.C6542c cVar) {
        throw null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C11881b.m57384b("FlutterView", "dispatchKeyEvent: " + keyEvent.toString());
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((!m54964n() || !this.f42831f.mo33989a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo22137e(String str, ByteBuffer byteBuffer) {
        mo22138f(str, byteBuffer, (C6539c.C6541b) null);
    }

    /* renamed from: f */
    public void mo22138f(String str, ByteBuffer byteBuffer, C6539c.C6541b bVar) {
        if (!m54964n()) {
            C11881b.m57383a("FlutterView", "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        int i = rect.top;
        throw null;
    }

    /* renamed from: g */
    public void mo33945g(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        C11069c cVar = this.f42833h;
        if (cVar == null || !cVar.mo34838D()) {
            return null;
        }
        return this.f42833h;
    }

    public C6539c getBinaryMessenger() {
        return this;
    }

    public Bitmap getBitmap() {
        mo34870l();
        throw null;
    }

    public C12051a getDartExecutor() {
        return this.f42826a;
    }

    /* access modifiers changed from: package-private */
    public float getDevicePixelRatio() {
        throw null;
    }

    public C11086d getFlutterNativeView() {
        return this.f42835r;
    }

    public C11992a getPluginRegistry() {
        throw null;
    }

    /* renamed from: h */
    public C11091f.C11094c mo34869h() {
        return mo34871o(new SurfaceTexture(0));
    }

    /* renamed from: i */
    public boolean mo33950i(KeyEvent keyEvent) {
        return this.f42829d.mo34211r(keyEvent);
    }

    /* renamed from: j */
    public void mo22139j(String str, C6539c.C6540a aVar) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo34870l() {
        if (!m54964n()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    /* renamed from: o */
    public C11091f.C11094c mo34871o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        new C11088a(this.f42834i.getAndIncrement(), surfaceTexture);
        throw null;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i != 29) {
            boolean z = true;
            int i2 = 0;
            boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
            if ((getWindowSystemUiVisibility() & 2) != 0) {
                z = false;
            }
            if (i >= 30) {
                if (z) {
                    i2 = 0 | WindowInsets.Type.navigationBars();
                }
                if (z2) {
                    i2 |= WindowInsets.Type.statusBars();
                }
                int i3 = windowInsets.getInsets(i2).top;
                throw null;
            }
            C11090b bVar = C11090b.NONE;
            if (!z) {
                m54963m();
            }
            if (z2) {
                windowInsets.getSystemWindowInsetTop();
            }
            throw null;
        }
        int i4 = windowInsets.getSystemGestureInsets().top;
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPluginRegistry();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f42830e.mo22653d(configuration);
        m54966q();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f42829d.mo34208o(this, this.f42831f, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54965p();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (m54964n() && this.f42832g.mo33833e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!m54964n()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f42833h.mo34841J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f42829d.mo34213z(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m54964n()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f42832g.mo33834f(motionEvent);
    }

    public void setInitialRoute(String str) {
        this.f42827b.mo38638c(str);
    }
}
