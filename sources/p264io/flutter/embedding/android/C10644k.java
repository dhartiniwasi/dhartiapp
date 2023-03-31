package p264io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.core.content.C0681a;
import androidx.core.util.C0823a;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p186ac.C6539c;
import p195bc.C6736a;
import p203cc.C6851a;
import p264io.flutter.embedding.android.C10635g;
import p264io.flutter.embedding.android.C10661s;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.plugin.editing.C10708d;
import p264io.flutter.plugin.editing.C10710f;
import p264io.flutter.view.C11069c;
import p297mb.C11881b;
import p325pc.C12172h;
import p408yb.C13247a;
import p408yb.C13257b;
import p408yb.C13258c;

/* renamed from: io.flutter.embedding.android.k */
/* compiled from: FlutterView */
public class C10644k extends FrameLayout implements C6851a.C6854c, C10661s.C10668e {

    /* renamed from: A */
    private final C13247a.C13256g f41779A;

    /* renamed from: B */
    private final C11069c.C11080k f41780B;

    /* renamed from: C */
    private final ContentObserver f41781C;

    /* renamed from: D */
    private final C13257b f41782D;

    /* renamed from: E */
    private final C0823a<WindowLayoutInfo> f41783E;

    /* renamed from: a */
    private C10638h f41784a;

    /* renamed from: b */
    private C10641i f41785b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10635g f41786c;

    /* renamed from: d */
    C13258c f41787d;

    /* renamed from: e */
    private C13258c f41788e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Set<C13257b> f41789f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f41790g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10685a f41791h;

    /* renamed from: i */
    private final Set<C10650f> f41792i;

    /* renamed from: r */
    private C6851a f41793r;

    /* renamed from: s */
    private C10710f f41794s;

    /* renamed from: t */
    private C10708d f41795t;

    /* renamed from: u */
    private C6736a f41796u;

    /* renamed from: v */
    private C10661s f41797v;

    /* renamed from: w */
    private C10623a f41798w;

    /* renamed from: x */
    private C11069c f41799x;

    /* renamed from: y */
    private TextServicesManager f41800y;

    /* renamed from: z */
    private C10681z f41801z;

    /* renamed from: io.flutter.embedding.android.k$a */
    /* compiled from: FlutterView */
    class C10645a implements C11069c.C11080k {
        C10645a() {
        }

        /* renamed from: a */
        public void mo33976a(boolean z, boolean z2) {
            C10644k.this.m53385A(z, z2);
        }
    }

    /* renamed from: io.flutter.embedding.android.k$b */
    /* compiled from: FlutterView */
    class C10646b extends ContentObserver {
        C10646b(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            super.onChange(z);
            if (C10644k.this.f41791h != null) {
                C11881b.m57388f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                C10644k.this.mo33940C();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.k$c */
    /* compiled from: FlutterView */
    class C10647c implements C13257b {
        C10647c() {
        }

        /* renamed from: b */
        public void mo33830b() {
            boolean unused = C10644k.this.f41790g = false;
            for (C13257b b : C10644k.this.f41789f) {
                b.mo33830b();
            }
        }

        /* renamed from: d */
        public void mo33831d() {
            boolean unused = C10644k.this.f41790g = true;
            for (C13257b d : C10644k.this.f41789f) {
                d.mo33831d();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.k$d */
    /* compiled from: FlutterView */
    class C10648d implements C0823a<WindowLayoutInfo> {
        C10648d() {
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            C10644k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    /* renamed from: io.flutter.embedding.android.k$e */
    /* compiled from: FlutterView */
    class C10649e implements C13257b {

        /* renamed from: a */
        final /* synthetic */ C13247a f41806a;

        /* renamed from: b */
        final /* synthetic */ Runnable f41807b;

        C10649e(C13247a aVar, Runnable runnable) {
            this.f41806a = aVar;
            this.f41807b = runnable;
        }

        /* renamed from: b */
        public void mo33830b() {
        }

        /* renamed from: d */
        public void mo33831d() {
            this.f41806a.mo38355q(this);
            this.f41807b.run();
            C10644k kVar = C10644k.this;
            if (!(kVar.f41787d instanceof C10635g) && kVar.f41786c != null) {
                C10644k.this.f41786c.mo33918a();
            }
        }
    }

    /* renamed from: io.flutter.embedding.android.k$f */
    /* compiled from: FlutterView */
    public interface C10650f {
        /* renamed from: a */
        void mo33828a();

        /* renamed from: b */
        void mo33829b(C10685a aVar);
    }

    /* renamed from: io.flutter.embedding.android.k$g */
    /* compiled from: FlutterView */
    private enum C10651g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public C10644k(Context context, C10638h hVar) {
        this(context, (AttributeSet) null, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m53385A(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.f41791h.mo34080q().mo38352l()) {
            if (!z && !z2) {
                z3 = true;
            }
            setWillNotDraw(z3);
            return;
        }
        setWillNotDraw(false);
    }

    /* renamed from: D */
    private void m53386D() {
        if (!mo33973w()) {
            C11881b.m57389g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f41779A.f47569a = getResources().getDisplayMetrics().density;
        this.f41779A.f47584p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f41791h.mo34080q().mo38358t(this.f41779A);
    }

    /* renamed from: o */
    private C10651g m53393o() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return C10651g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? C10651g.LEFT : C10651g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return C10651g.BOTH;
            }
        }
        return C10651g.NONE;
    }

    /* renamed from: t */
    private int m53394t(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: v */
    private void m53395v() {
        C11881b.m57388f("FlutterView", "Initializing FlutterView");
        if (this.f41784a != null) {
            C11881b.m57388f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f41784a);
        } else if (this.f41785b != null) {
            C11881b.m57388f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f41785b);
        } else {
            C11881b.m57388f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f41786c);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* renamed from: B */
    public void mo33939B(Runnable runnable) {
        C10635g gVar = this.f41786c;
        if (gVar == null) {
            C11881b.m57388f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        C13258c cVar = this.f41788e;
        if (cVar == null) {
            C11881b.m57388f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f41787d = cVar;
        this.f41788e = null;
        C10685a aVar = this.f41791h;
        if (aVar == null) {
            gVar.mo33918a();
            runnable.run();
            return;
        }
        C13247a q = aVar.mo34080q();
        if (q == null) {
            this.f41786c.mo33918a();
            runnable.run();
            return;
        }
        this.f41787d.mo33919b(q);
        q.mo38348f(new C10649e(q, runnable));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r3 != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33940C() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 0
            r2 = 1
            r3 = 32
            if (r0 != r3) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            zb.m$b r0 = p417zb.C13536m.C13538b.dark
            goto L_0x001c
        L_0x001a:
            zb.m$b r0 = p417zb.C13536m.C13538b.light
        L_0x001c:
            android.view.textservice.TextServicesManager r3 = r6.f41800y
            if (r3 == 0) goto L_0x0040
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x003e
            java.util.List r3 = r3.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r3 = r3.stream()
            io.flutter.embedding.android.j r4 = p264io.flutter.embedding.android.C10643j.f41778a
            boolean r3 = r3.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f41800y
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
        L_0x003e:
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            io.flutter.embedding.engine.a r4 = r6.f41791h
            zb.m r4 = r4.mo34082s()
            zb.m$a r4 = r4.mo38647a()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            zb.m$a r4 = r4.mo38652e(r5)
            zb.m$a r3 = r4.mo38650c(r3)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r2)
            if (r4 != r2) goto L_0x006e
            r1 = 1
        L_0x006e:
            zb.m$a r1 = r3.mo38649b(r1)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            zb.m$a r1 = r1.mo38653f(r2)
            zb.m$a r0 = r1.mo38651d(r0)
            r0.mo38648a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.embedding.android.C10644k.mo33940C():void");
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f41794s.mo34205j(sparseArray);
    }

    /* renamed from: c */
    public PointerIcon mo22960c(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    public boolean checkInputConnectionProxy(View view) {
        C10685a aVar = this.f41791h;
        if (aVar != null) {
            return aVar.mo34078o().mo34293F(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((!mo33973w() || !this.f41797v.mo33989a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        C13247a.C13256g gVar = this.f41779A;
        gVar.f47572d = rect.top;
        gVar.f47573e = rect.right;
        gVar.f47574f = 0;
        gVar.f47575g = rect.left;
        gVar.f47576h = 0;
        gVar.f47577i = 0;
        gVar.f47578j = rect.bottom;
        gVar.f47579k = 0;
        C11881b.m57388f("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f41779A.f47572d + ", Left: " + this.f41779A.f47575g + ", Right: " + this.f41779A.f47573e + "\nKeyboard insets: Bottom: " + this.f41779A.f47578j + ", Left: " + this.f41779A.f47579k + ", Right: " + this.f41779A.f47577i);
        m53386D();
        return true;
    }

    /* renamed from: g */
    public void mo33945g(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        C11069c cVar = this.f41799x;
        if (cVar == null || !cVar.mo34838D()) {
            return null;
        }
        return this.f41799x;
    }

    public C10685a getAttachedFlutterEngine() {
        return this.f41791h;
    }

    public C6539c getBinaryMessenger() {
        return this.f41791h.mo34072i();
    }

    public C10635g getCurrentImageSurface() {
        return this.f41786c;
    }

    /* renamed from: i */
    public boolean mo33950i(KeyEvent keyEvent) {
        return this.f41794s.mo34211r(keyEvent);
    }

    /* renamed from: j */
    public boolean mo33951j() {
        C10635g gVar = this.f41786c;
        if (gVar != null) {
            return gVar.mo33920c();
        }
        return false;
    }

    /* renamed from: k */
    public void mo33952k(C10650f fVar) {
        this.f41792i.add(fVar);
    }

    /* renamed from: l */
    public void mo33953l(C13257b bVar) {
        this.f41789f.add(bVar);
    }

    /* renamed from: m */
    public void mo33954m(C10635g gVar) {
        C10685a aVar = this.f41791h;
        if (aVar != null) {
            gVar.mo33919b(aVar.mo34080q());
        }
    }

    /* renamed from: n */
    public void mo33955n(C10685a aVar) {
        C11881b.m57388f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (mo33973w()) {
            if (aVar == this.f41791h) {
                C11881b.m57388f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                C11881b.m57388f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                mo33969s();
            }
        }
        this.f41791h = aVar;
        C13247a q = aVar.mo34080q();
        this.f41790g = q.mo38351k();
        this.f41787d.mo33919b(q);
        q.mo38348f(this.f41782D);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f41793r = new C6851a(this, this.f41791h.mo34075l());
        }
        this.f41794s = new C10710f(this, this.f41791h.mo34085v(), this.f41791h.mo34078o());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f41800y = textServicesManager;
            this.f41795t = new C10708d(textServicesManager, this.f41791h.mo34083t());
        } catch (Exception unused) {
            C11881b.m57384b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f41796u = this.f41791h.mo34074k();
        this.f41797v = new C10661s(this);
        this.f41798w = new C10623a(this.f41791h.mo34080q(), false);
        C11069c cVar = new C11069c(this, aVar.mo34070g(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f41791h.mo34078o());
        this.f41799x = cVar;
        cVar.mo34844Y(this.f41780B);
        m53385A(this.f41799x.mo34838D(), this.f41799x.mo34839E());
        this.f41791h.mo34078o().mo34280a(this.f41799x);
        this.f41791h.mo34078o().mo34291D(this.f41791h.mo34080q());
        this.f41794s.mo34210q().restartInput(this);
        mo33940C();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f41781C);
        m53386D();
        aVar.mo34078o().mo34292E(this);
        for (C10650f b : this.f41792i) {
            b.mo33829b(aVar);
        }
        if (this.f41790g) {
            this.f41782D.mo33831d();
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            C13247a.C13256g gVar = this.f41779A;
            gVar.f47580l = systemGestureInsets.top;
            gVar.f47581m = systemGestureInsets.right;
            gVar.f47582n = systemGestureInsets.bottom;
            gVar.f47583o = systemGestureInsets.left;
        }
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
            Insets insets = windowInsets.getInsets(i2);
            C13247a.C13256g gVar2 = this.f41779A;
            gVar2.f47572d = insets.top;
            gVar2.f47573e = insets.right;
            gVar2.f47574f = insets.bottom;
            gVar2.f47575g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            C13247a.C13256g gVar3 = this.f41779A;
            gVar3.f47576h = insets2.top;
            gVar3.f47577i = insets2.right;
            gVar3.f47578j = insets2.bottom;
            gVar3.f47579k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            C13247a.C13256g gVar4 = this.f41779A;
            gVar4.f47580l = insets3.top;
            gVar4.f47581m = insets3.right;
            gVar4.f47582n = insets3.bottom;
            gVar4.f47583o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                C13247a.C13256g gVar5 = this.f41779A;
                gVar5.f47572d = Math.max(Math.max(gVar5.f47572d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                C13247a.C13256g gVar6 = this.f41779A;
                gVar6.f47573e = Math.max(Math.max(gVar6.f47573e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                C13247a.C13256g gVar7 = this.f41779A;
                gVar7.f47574f = Math.max(Math.max(gVar7.f47574f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                C13247a.C13256g gVar8 = this.f41779A;
                gVar8.f47575g = Math.max(Math.max(gVar8.f47575g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            C10651g gVar9 = C10651g.NONE;
            if (!z) {
                gVar9 = m53393o();
            }
            this.f41779A.f47572d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f41779A.f47573e = (gVar9 == C10651g.RIGHT || gVar9 == C10651g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f41779A.f47574f = (!z || m53394t(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.f41779A.f47575g = (gVar9 == C10651g.LEFT || gVar9 == C10651g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            C13247a.C13256g gVar10 = this.f41779A;
            gVar10.f47576h = 0;
            gVar10.f47577i = 0;
            gVar10.f47578j = m53394t(windowInsets);
            this.f41779A.f47579k = 0;
        }
        C11881b.m57388f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f41779A.f47572d + ", Left: " + this.f41779A.f47575g + ", Right: " + this.f41779A.f47573e + "\nKeyboard insets: Bottom: " + this.f41779A.f47578j + ", Left: " + this.f41779A.f47579k + ", Right: " + this.f41779A.f47577i + "System Gesture Insets - Left: " + this.f41779A.f47583o + ", Top: " + this.f41779A.f47580l + ", Right: " + this.f41779A.f47581m + ", Bottom: " + this.f41779A.f47578j);
        m53386D();
        return onApplyWindowInsets;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41801z = mo33968r();
        Activity e = C12172h.m58454e(getContext());
        C10681z zVar = this.f41801z;
        if (zVar != null && e != null) {
            zVar.mo33997a(e, C0681a.m3153i(getContext()), this.f41783E);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f41791h != null) {
            C11881b.m57388f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f41796u.mo22653d(configuration);
            mo33940C();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!mo33973w()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.f41794s.mo34208o(this, this.f41797v, editorInfo);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C10681z zVar = this.f41801z;
        if (zVar != null) {
            zVar.mo33998b(this.f41783E);
        }
        this.f41801z = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (mo33973w() && this.f41798w.mo33833e(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!mo33973w()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f41799x.mo34841J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f41794s.mo34213z(viewStructure, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C11881b.m57388f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        C13247a.C13256g gVar = this.f41779A;
        gVar.f47570b = i;
        gVar.f47571c = i2;
        m53386D();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo33973w()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.f41798w.mo33834f(motionEvent);
    }

    /* renamed from: p */
    public void mo33966p() {
        this.f41787d.pause();
        C10635g gVar = this.f41786c;
        if (gVar == null) {
            C10635g q = mo33967q();
            this.f41786c = q;
            addView(q);
        } else {
            gVar.mo33925i(getWidth(), getHeight());
        }
        this.f41788e = this.f41787d;
        C10635g gVar2 = this.f41786c;
        this.f41787d = gVar2;
        C10685a aVar = this.f41791h;
        if (aVar != null) {
            gVar2.mo33919b(aVar.mo34080q());
        }
    }

    /* renamed from: q */
    public C10635g mo33967q() {
        return new C10635g(getContext(), getWidth(), getHeight(), C10635g.C10637b.background);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C10681z mo33968r() {
        try {
            return new C10681z(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    /* renamed from: s */
    public void mo33969s() {
        C11881b.m57388f("FlutterView", "Detaching from a FlutterEngine: " + this.f41791h);
        if (!mo33973w()) {
            C11881b.m57388f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (C10650f a : this.f41792i) {
            a.mo33828a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f41781C);
        this.f41791h.mo34078o().mo34298K();
        this.f41791h.mo34078o().mo34283d();
        this.f41799x.mo34843Q();
        this.f41799x = null;
        this.f41794s.mo34210q().restartInput(this);
        this.f41794s.mo34209p();
        this.f41797v.mo33990c();
        C10708d dVar = this.f41795t;
        if (dVar != null) {
            dVar.mo34195b();
        }
        C6851a aVar = this.f41793r;
        if (aVar != null) {
            aVar.mo22958c();
        }
        C13247a q = this.f41791h.mo34080q();
        this.f41790g = false;
        q.mo38355q(this.f41782D);
        q.mo38360v();
        q.mo38357s(false);
        C13258c cVar = this.f41788e;
        if (cVar != null && this.f41787d == this.f41786c) {
            this.f41787d = cVar;
        }
        this.f41787d.mo33918a();
        C10635g gVar = this.f41786c;
        if (gVar != null) {
            gVar.mo33921e();
            removeView(this.f41786c);
            this.f41786c = null;
        }
        this.f41788e = null;
        this.f41791h = null;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        C13258c cVar = this.f41787d;
        if (cVar instanceof C10638h) {
            ((C10638h) cVar).setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        C13247a.C13251d dVar;
        C13247a.C13250c cVar;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature next : displayFeatures) {
            C11881b.m57388f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + next.getBounds().toString() + " and type = " + next.getClass().getSimpleName());
            if (next instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) next;
                if (foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL) {
                    dVar = C13247a.C13251d.HINGE;
                } else {
                    dVar = C13247a.C13251d.FOLD;
                }
                if (foldingFeature.getState() == FoldingFeature.State.FLAT) {
                    cVar = C13247a.C13250c.POSTURE_FLAT;
                } else if (foldingFeature.getState() == FoldingFeature.State.HALF_OPENED) {
                    cVar = C13247a.C13250c.POSTURE_HALF_OPENED;
                } else {
                    cVar = C13247a.C13250c.UNKNOWN;
                }
                arrayList.add(new C13247a.C13249b(next.getBounds(), dVar, cVar));
            } else {
                arrayList.add(new C13247a.C13249b(next.getBounds(), C13247a.C13251d.UNKNOWN, C13247a.C13250c.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect next2 : displayCutout.getBoundingRects()) {
                C11881b.m57388f("FlutterView", "DisplayCutout area reported with bounds = " + next2.toString());
                arrayList.add(new C13247a.C13249b(next2, C13247a.C13251d.CUTOUT));
            }
        }
        this.f41779A.f47585q = arrayList;
        m53386D();
    }

    /* renamed from: u */
    public boolean mo33972u() {
        return this.f41790g;
    }

    /* renamed from: w */
    public boolean mo33973w() {
        C10685a aVar = this.f41791h;
        return aVar != null && aVar.mo34080q() == this.f41787d.getAttachedRenderer();
    }

    /* renamed from: y */
    public void mo33974y(C10650f fVar) {
        this.f41792i.remove(fVar);
    }

    /* renamed from: z */
    public void mo33975z(C13257b bVar) {
        this.f41789f.remove(bVar);
    }

    public C10644k(Context context, C10641i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    private C10644k(Context context, AttributeSet attributeSet, C10638h hVar) {
        super(context, attributeSet);
        this.f41789f = new HashSet();
        this.f41792i = new HashSet();
        this.f41779A = new C13247a.C13256g();
        this.f41780B = new C10645a();
        this.f41781C = new C10646b(new Handler(Looper.getMainLooper()));
        this.f41782D = new C10647c();
        this.f41783E = new C10648d();
        this.f41784a = hVar;
        this.f41787d = hVar;
        m53395v();
    }

    private C10644k(Context context, AttributeSet attributeSet, C10641i iVar) {
        super(context, attributeSet);
        this.f41789f = new HashSet();
        this.f41792i = new HashSet();
        this.f41779A = new C13247a.C13256g();
        this.f41780B = new C10645a();
        this.f41781C = new C10646b(new Handler(Looper.getMainLooper()));
        this.f41782D = new C10647c();
        this.f41783E = new C10648d();
        this.f41785b = iVar;
        this.f41787d = iVar;
        m53395v();
    }
}
