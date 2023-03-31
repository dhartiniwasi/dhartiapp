package p264io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import p264io.flutter.plugin.platform.SingleViewPresentation;
import p264io.flutter.view.C11091f;

/* renamed from: io.flutter.plugin.platform.r */
/* compiled from: VirtualDisplayController */
class C10747r {

    /* renamed from: a */
    SingleViewPresentation f42088a;

    /* renamed from: b */
    private final Context f42089b;

    /* renamed from: c */
    private final C10722a f42090c;

    /* renamed from: d */
    private final int f42091d;

    /* renamed from: e */
    private final C11091f.C11094c f42092e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f42093f;

    /* renamed from: g */
    private final Surface f42094g;

    /* renamed from: h */
    private VirtualDisplay f42095h;

    /* renamed from: i */
    private int f42096i;

    /* renamed from: j */
    private int f42097j;

    /* renamed from: io.flutter.plugin.platform.r$a */
    /* compiled from: VirtualDisplayController */
    class C10748a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f42098a;

        /* renamed from: b */
        final /* synthetic */ Runnable f42099b;

        /* renamed from: io.flutter.plugin.platform.r$a$a */
        /* compiled from: VirtualDisplayController */
        class C10749a implements Runnable {
            C10749a() {
            }

            public void run() {
                C10748a aVar = C10748a.this;
                aVar.f42098a.postDelayed(aVar.f42099b, 128);
            }
        }

        C10748a(View view, Runnable runnable) {
            this.f42098a = view;
            this.f42099b = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            C10750b.m53816a(this.f42098a, new C10749a());
            this.f42098a.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: io.flutter.plugin.platform.r$b */
    /* compiled from: VirtualDisplayController */
    static class C10750b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        final View f42102a;

        /* renamed from: b */
        Runnable f42103b;

        /* renamed from: io.flutter.plugin.platform.r$b$a */
        /* compiled from: VirtualDisplayController */
        class C10751a implements Runnable {
            C10751a() {
            }

            public void run() {
                C10750b.this.f42102a.getViewTreeObserver().removeOnDrawListener(C10750b.this);
            }
        }

        C10750b(View view, Runnable runnable) {
            this.f42102a = view;
            this.f42103b = runnable;
        }

        /* renamed from: a */
        static void m53816a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new C10750b(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f42103b;
            if (runnable != null) {
                runnable.run();
                this.f42103b = null;
                this.f42102a.post(new C10751a());
            }
        }
    }

    private C10747r(Context context, C10722a aVar, VirtualDisplay virtualDisplay, C10731f fVar, Surface surface, C11091f.C11094c cVar, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
        Context context2 = context;
        this.f42089b = context2;
        C10722a aVar2 = aVar;
        this.f42090c = aVar2;
        this.f42092e = cVar;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.f42093f = onFocusChangeListener2;
        this.f42094g = surface;
        this.f42095h = virtualDisplay;
        this.f42091d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context2, this.f42095h.getDisplay(), fVar, aVar2, i, onFocusChangeListener2);
        this.f42088a = singleViewPresentation;
        singleViewPresentation.show();
    }

    /* renamed from: a */
    public static C10747r m53807a(Context context, C10722a aVar, C10731f fVar, C11091f.C11094c cVar, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i4 = i;
        int i5 = i2;
        context.getResources().getDisplayMetrics();
        if (i4 == 0 || i5 == 0) {
            return null;
        }
        cVar.mo34885c().setDefaultBufferSize(i4, i5);
        Surface surface = new Surface(cVar.mo34885c());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        C10747r rVar = new C10747r(context, aVar, createVirtualDisplay, fVar, surface, cVar, onFocusChangeListener, i3, obj);
        rVar.f42096i = i4;
        rVar.f42097j = i5;
        return rVar;
    }

    /* renamed from: b */
    public void mo34320b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f42088a;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: c */
    public int mo34321c() {
        return this.f42097j;
    }

    /* renamed from: d */
    public int mo34322d() {
        return this.f42096i;
    }

    /* renamed from: e */
    public View mo34323e() {
        SingleViewPresentation singleViewPresentation = this.f42088a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34324f(View view) {
        SingleViewPresentation singleViewPresentation = this.f42088a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f42088a.getView().onFlutterViewAttached(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34325g() {
        SingleViewPresentation singleViewPresentation = this.f42088a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f42088a.getView().onInputConnectionLocked();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34326h() {
        SingleViewPresentation singleViewPresentation = this.f42088a;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f42088a.getView().onInputConnectionUnlocked();
        }
    }

    /* renamed from: i */
    public void mo34327i(int i, int i2, Runnable runnable) {
        boolean isFocused = mo34323e().isFocused();
        SingleViewPresentation.C10720e detachState = this.f42088a.detachState();
        this.f42095h.setSurface((Surface) null);
        this.f42095h.release();
        this.f42096i = i;
        this.f42097j = i2;
        this.f42092e.mo34885c().setDefaultBufferSize(i, i2);
        this.f42095h = ((DisplayManager) this.f42089b.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, this.f42091d, this.f42094g, 0);
        View e = mo34323e();
        e.addOnAttachStateChangeListener(new C10748a(e, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f42089b, this.f42095h.getDisplay(), this.f42090c, detachState, this.f42093f, isFocused);
        singleViewPresentation.show();
        this.f42088a.cancel();
        this.f42088a = singleViewPresentation;
    }
}
