package p264io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicLong;
import p264io.flutter.embedding.android.C10623a;
import p264io.flutter.view.C11091f;
import p297mb.C11881b;
import p325pc.C12172h;

/* renamed from: io.flutter.plugin.platform.j */
/* compiled from: PlatformViewWrapper */
class C10735j extends FrameLayout {

    /* renamed from: a */
    private int f42035a;

    /* renamed from: b */
    private int f42036b;

    /* renamed from: c */
    private int f42037c;

    /* renamed from: d */
    private int f42038d;

    /* renamed from: e */
    private int f42039e;

    /* renamed from: f */
    private int f42040f;

    /* renamed from: g */
    private SurfaceTexture f42041g;

    /* renamed from: h */
    private Surface f42042h;

    /* renamed from: i */
    private C10623a f42043i;

    /* renamed from: r */
    ViewTreeObserver.OnGlobalFocusChangeListener f42044r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final AtomicLong f42045s;

    /* renamed from: t */
    private final C11091f.C11092a f42046t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f42047u;

    /* renamed from: v */
    private final C11091f.C11093b f42048v;

    /* renamed from: io.flutter.plugin.platform.j$a */
    /* compiled from: PlatformViewWrapper */
    class C10736a implements C11091f.C11092a {
        C10736a() {
        }

        /* renamed from: a */
        public void mo34277a() {
            if (Build.VERSION.SDK_INT == 29) {
                C10735j.this.f42045s.decrementAndGet();
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.j$b */
    /* compiled from: PlatformViewWrapper */
    class C10737b implements C11091f.C11093b {
        C10737b() {
        }

        public void onTrimMemory(int i) {
            if (i == 80 && Build.VERSION.SDK_INT >= 29) {
                boolean unused = C10735j.this.f42047u = true;
            }
        }
    }

    /* renamed from: io.flutter.plugin.platform.j$c */
    /* compiled from: PlatformViewWrapper */
    class C10738c implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ View.OnFocusChangeListener f42051a;

        C10738c(View.OnFocusChangeListener onFocusChangeListener) {
            this.f42051a = onFocusChangeListener;
        }

        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f42051a;
            C10735j jVar = C10735j.this;
            onFocusChangeListener.onFocusChange(jVar, C12172h.m58452c(jVar));
        }
    }

    public C10735j(Context context) {
        super(context);
        this.f42045s = new AtomicLong(0);
        this.f42046t = new C10736a();
        this.f42047u = false;
        this.f42048v = new C10737b();
        setWillNotDraw(false);
    }

    /* renamed from: f */
    private void m53702f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f42045s.incrementAndGet();
        }
    }

    /* renamed from: g */
    private void m53703g() {
        if (this.f42047u) {
            Surface surface = this.f42042h;
            if (surface != null) {
                surface.release();
            }
            this.f42042h = mo34261c(this.f42041g);
            this.f42047u = false;
        }
    }

    /* renamed from: n */
    private boolean m53704n() {
        if (Build.VERSION.SDK_INT != 29 || this.f42045s.get() <= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Surface mo34261c(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    /* renamed from: d */
    public int mo34262d() {
        return this.f42040f;
    }

    public void draw(Canvas canvas) {
        Surface surface = this.f42042h;
        if (surface == null) {
            super.draw(canvas);
            C11881b.m57384b("PlatformViewWrapper", "Platform view cannot be composed without a surface.");
        } else if (!surface.isValid()) {
            C11881b.m57384b("PlatformViewWrapper", "Invalid surface. The platform view cannot be displayed.");
        } else {
            SurfaceTexture surfaceTexture = this.f42041g;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                C11881b.m57384b("PlatformViewWrapper", "Invalid texture. The platform view cannot be displayed.");
            } else if (!m53704n()) {
                invalidate();
            } else {
                m53703g();
                Canvas lockHardwareCanvas = this.f42042h.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    super.draw(lockHardwareCanvas);
                    m53702f();
                } finally {
                    this.f42042h.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }
    }

    /* renamed from: e */
    public int mo34264e() {
        return this.f42039e;
    }

    /* renamed from: h */
    public void mo34265h() {
        this.f42041g = null;
        Surface surface = this.f42042h;
        if (surface != null) {
            surface.release();
            this.f42042h = null;
        }
    }

    /* renamed from: i */
    public void mo34266i(int i, int i2) {
        this.f42039e = i;
        this.f42040f = i2;
        SurfaceTexture surfaceTexture = this.f42041g;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    /* renamed from: j */
    public void mo34268j(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f42037c = layoutParams.leftMargin;
        this.f42038d = layoutParams.topMargin;
    }

    /* renamed from: k */
    public void mo34269k(View.OnFocusChangeListener onFocusChangeListener) {
        mo34272o();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f42044r == null) {
            C10738c cVar = new C10738c(onFocusChangeListener);
            this.f42044r = cVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(cVar);
        }
    }

    /* renamed from: l */
    public void mo34270l(SurfaceTexture surfaceTexture) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            C11881b.m57384b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f42041g = surfaceTexture;
        int i2 = this.f42039e;
        if (i2 > 0 && (i = this.f42040f) > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i);
        }
        Surface surface = this.f42042h;
        if (surface != null) {
            surface.release();
        }
        Surface c = mo34261c(surfaceTexture);
        this.f42042h = c;
        Canvas lockHardwareCanvas = c.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            m53702f();
        } finally {
            this.f42042h.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    /* renamed from: m */
    public void mo34271m(C10623a aVar) {
        this.f42043i = aVar;
    }

    /* renamed from: o */
    public void mo34272o() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.f42044r) != null) {
            this.f42044r = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f42043i == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.f42037c;
            this.f42035a = i;
            int i2 = this.f42038d;
            this.f42036b = i2;
            matrix.postTranslate((float) i, (float) i2);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f42037c, (float) this.f42038d);
        } else {
            matrix.postTranslate((float) this.f42035a, (float) this.f42036b);
            this.f42035a = this.f42037c;
            this.f42036b = this.f42038d;
        }
        return this.f42043i.mo33835g(motionEvent, matrix);
    }

    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public C10735j(Context context, C11091f.C11094c cVar) {
        this(context);
        cVar.mo34887e(this.f42046t);
        cVar.mo34884b(this.f42048v);
        mo34270l(cVar.mo34885c());
    }
}
