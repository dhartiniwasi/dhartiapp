package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.view.C0339d;
import androidx.appcompat.view.C0342f;
import androidx.appcompat.view.C0344g;
import androidx.appcompat.view.C0349i;
import androidx.appcompat.view.menu.C0364e;
import androidx.appcompat.view.menu.C0367g;
import androidx.appcompat.view.menu.C0383m;
import androidx.appcompat.view.menu.C0385n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0452a1;
import androidx.appcompat.widget.C0494g0;
import androidx.appcompat.widget.C0501i1;
import androidx.appcompat.widget.C0508j1;
import androidx.appcompat.widget.C0509k;
import androidx.appcompat.widget.C0511k0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0615b;
import androidx.core.app.C0648j;
import androidx.core.content.C0681a;
import androidx.core.content.res.C0707h;
import androidx.core.util.C0825c;
import androidx.core.view.C0835a0;
import androidx.core.view.C0905f;
import androidx.core.view.C0908g;
import androidx.core.view.C0909g0;
import androidx.core.view.C0915h0;
import androidx.core.view.C0917i0;
import androidx.core.view.C0922k0;
import androidx.core.view.C0953u;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1220n;
import com.facebook.ads.AdError;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p048g.C4288a;
import p048g.C4290c;
import p048g.C4293f;
import p048g.C4294g;
import p048g.C4296i;
import p048g.C4297j;
import p055h.C4411a;
import p124r.C5426g;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: AppCompatDelegateImpl */
class C0287g extends C0286f implements C0367g.C0368a, LayoutInflater.Factory2 {

    /* renamed from: q0 */
    private static final C5426g<String, Integer> f740q0 = new C5426g<>();

    /* renamed from: r0 */
    private static final boolean f741r0;

    /* renamed from: s0 */
    private static final int[] f742s0 = {16842836};

    /* renamed from: t0 */
    private static final boolean f743t0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: u0 */
    private static final boolean f744u0;

    /* renamed from: v0 */
    private static boolean f745v0 = true;

    /* renamed from: A */
    C0909g0 f746A;

    /* renamed from: B */
    private boolean f747B;

    /* renamed from: C */
    private boolean f748C;

    /* renamed from: D */
    ViewGroup f749D;

    /* renamed from: E */
    private TextView f750E;

    /* renamed from: F */
    private View f751F;

    /* renamed from: G */
    private boolean f752G;

    /* renamed from: H */
    private boolean f753H;

    /* renamed from: I */
    boolean f754I;

    /* renamed from: J */
    boolean f755J;

    /* renamed from: K */
    boolean f756K;

    /* renamed from: L */
    boolean f757L;

    /* renamed from: M */
    boolean f758M;

    /* renamed from: N */
    private boolean f759N;

    /* renamed from: O */
    private C0312v[] f760O;

    /* renamed from: P */
    private C0312v f761P;

    /* renamed from: Q */
    private boolean f762Q;

    /* renamed from: R */
    private boolean f763R;

    /* renamed from: S */
    private boolean f764S;

    /* renamed from: a0 */
    boolean f765a0;

    /* renamed from: b0 */
    private Configuration f766b0;

    /* renamed from: c0 */
    private int f767c0;

    /* renamed from: d */
    final Object f768d;

    /* renamed from: d0 */
    private int f769d0;

    /* renamed from: e */
    final Context f770e;

    /* renamed from: e0 */
    private boolean f771e0;

    /* renamed from: f */
    Window f772f;

    /* renamed from: f0 */
    private boolean f773f0;

    /* renamed from: g */
    private C0305p f774g;

    /* renamed from: g0 */
    private C0307r f775g0;

    /* renamed from: h */
    final C0285e f776h;

    /* renamed from: h0 */
    private C0307r f777h0;

    /* renamed from: i */
    C0275a f778i;

    /* renamed from: i0 */
    boolean f779i0;

    /* renamed from: j0 */
    int f780j0;

    /* renamed from: k0 */
    private final Runnable f781k0;

    /* renamed from: l0 */
    private boolean f782l0;

    /* renamed from: m0 */
    private Rect f783m0;

    /* renamed from: n0 */
    private Rect f784n0;

    /* renamed from: o0 */
    private C0316j f785o0;

    /* renamed from: p0 */
    private C0318k f786p0;

    /* renamed from: r */
    MenuInflater f787r;

    /* renamed from: s */
    private CharSequence f788s;

    /* renamed from: t */
    private C0494g0 f789t;

    /* renamed from: u */
    private C0298j f790u;

    /* renamed from: v */
    private C0313w f791v;

    /* renamed from: w */
    C0336b f792w;

    /* renamed from: x */
    ActionBarContextView f793x;

    /* renamed from: y */
    PopupWindow f794y;

    /* renamed from: z */
    Runnable f795z;

    /* renamed from: androidx.appcompat.app.g$a */
    /* compiled from: AppCompatDelegateImpl */
    class C0288a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f796a;

        C0288a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f796a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m1461a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m1461a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f796a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f796a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.g$b */
    /* compiled from: AppCompatDelegateImpl */
    class C0289b implements Runnable {
        C0289b() {
        }

        public void run() {
            C0287g gVar = C0287g.this;
            if ((gVar.f780j0 & 1) != 0) {
                gVar.mo965X(0);
            }
            C0287g gVar2 = C0287g.this;
            if ((gVar2.f780j0 & 4096) != 0) {
                gVar2.mo965X(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            C0287g gVar3 = C0287g.this;
            gVar3.f779i0 = false;
            gVar3.f780j0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.g$c */
    /* compiled from: AppCompatDelegateImpl */
    class C0290c implements C0953u {
        C0290c() {
        }

        /* renamed from: a */
        public C0922k0 mo987a(View view, C0922k0 k0Var) {
            int k = k0Var.mo3419k();
            int N0 = C0287g.this.mo958N0(k0Var, (Rect) null);
            if (k != N0) {
                k0Var = k0Var.mo3422o(k0Var.mo3417i(), N0, k0Var.mo3418j(), k0Var.mo3415h());
            }
            return C0835a0.m3713Z(view, k0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.g$d */
    /* compiled from: AppCompatDelegateImpl */
    class C0291d implements C0511k0.C0512a {
        C0291d() {
        }

        /* renamed from: a */
        public void mo988a(Rect rect) {
            rect.top = C0287g.this.mo958N0((C0922k0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.g$e */
    /* compiled from: AppCompatDelegateImpl */
    class C0292e implements ContentFrameLayout.C0406a {
        C0292e() {
        }

        /* renamed from: a */
        public void mo989a() {
        }

        public void onDetachedFromWindow() {
            C0287g.this.mo963V();
        }
    }

    /* renamed from: androidx.appcompat.app.g$f */
    /* compiled from: AppCompatDelegateImpl */
    class C0293f implements Runnable {

        /* renamed from: androidx.appcompat.app.g$f$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0294a extends C0917i0 {
            C0294a() {
            }

            /* renamed from: b */
            public void mo992b(View view) {
                C0287g.this.f793x.setAlpha(1.0f);
                C0287g.this.f746A.mo3390h((C0915h0) null);
                C0287g.this.f746A = null;
            }

            /* renamed from: c */
            public void mo993c(View view) {
                C0287g.this.f793x.setVisibility(0);
            }
        }

        C0293f() {
        }

        public void run() {
            C0287g gVar = C0287g.this;
            gVar.f794y.showAtLocation(gVar.f793x, 55, 0, 0);
            C0287g.this.mo966Y();
            if (C0287g.this.mo954G0()) {
                C0287g.this.f793x.setAlpha(0.0f);
                C0287g gVar2 = C0287g.this;
                gVar2.f746A = C0835a0.m3720d(gVar2.f793x).mo3385b(1.0f);
                C0287g.this.f746A.mo3390h(new C0294a());
                return;
            }
            C0287g.this.f793x.setAlpha(1.0f);
            C0287g.this.f793x.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.g$g */
    /* compiled from: AppCompatDelegateImpl */
    class C0295g extends C0917i0 {
        C0295g() {
        }

        /* renamed from: b */
        public void mo992b(View view) {
            C0287g.this.f793x.setAlpha(1.0f);
            C0287g.this.f746A.mo3390h((C0915h0) null);
            C0287g.this.f746A = null;
        }

        /* renamed from: c */
        public void mo993c(View view) {
            C0287g.this.f793x.setVisibility(0);
            if (C0287g.this.f793x.getParent() instanceof View) {
                C0835a0.m3735k0((View) C0287g.this.f793x.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$h */
    /* compiled from: AppCompatDelegateImpl */
    private class C0296h implements C0279b {
        C0296h() {
        }
    }

    /* renamed from: androidx.appcompat.app.g$i */
    /* compiled from: AppCompatDelegateImpl */
    interface C0297i {
        /* renamed from: a */
        boolean mo994a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: androidx.appcompat.app.g$j */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0298j implements C0383m.C0384a {
        C0298j() {
        }

        /* renamed from: a */
        public void mo996a(C0367g gVar, boolean z) {
            C0287g.this.mo959O(gVar);
        }

        /* renamed from: b */
        public boolean mo997b(C0367g gVar) {
            Window.Callback i0 = C0287g.this.mo973i0();
            if (i0 == null) {
                return true;
            }
            i0.onMenuOpened(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.g$k */
    /* compiled from: AppCompatDelegateImpl */
    class C0299k implements C0336b.C0337a {

        /* renamed from: a */
        private C0336b.C0337a f806a;

        /* renamed from: androidx.appcompat.app.g$k$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0300a extends C0917i0 {
            C0300a() {
            }

            /* renamed from: b */
            public void mo992b(View view) {
                C0287g.this.f793x.setVisibility(8);
                C0287g gVar = C0287g.this;
                PopupWindow popupWindow = gVar.f794y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f793x.getParent() instanceof View) {
                    C0835a0.m3735k0((View) C0287g.this.f793x.getParent());
                }
                C0287g.this.f793x.mo1631k();
                C0287g.this.f746A.mo3390h((C0915h0) null);
                C0287g gVar2 = C0287g.this;
                gVar2.f746A = null;
                C0835a0.m3735k0(gVar2.f749D);
            }
        }

        public C0299k(C0336b.C0337a aVar) {
            this.f806a = aVar;
        }

        /* renamed from: a */
        public void mo998a(C0336b bVar) {
            this.f806a.mo998a(bVar);
            C0287g gVar = C0287g.this;
            if (gVar.f794y != null) {
                gVar.f772f.getDecorView().removeCallbacks(C0287g.this.f795z);
            }
            C0287g gVar2 = C0287g.this;
            if (gVar2.f793x != null) {
                gVar2.mo966Y();
                C0287g gVar3 = C0287g.this;
                gVar3.f746A = C0835a0.m3720d(gVar3.f793x).mo3385b(0.0f);
                C0287g.this.f746A.mo3390h(new C0300a());
            }
            C0287g gVar4 = C0287g.this;
            C0285e eVar = gVar4.f776h;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(gVar4.f792w);
            }
            C0287g gVar5 = C0287g.this;
            gVar5.f792w = null;
            C0835a0.m3735k0(gVar5.f749D);
        }

        /* renamed from: b */
        public boolean mo999b(C0336b bVar, Menu menu) {
            return this.f806a.mo999b(bVar, menu);
        }

        /* renamed from: c */
        public boolean mo1000c(C0336b bVar, Menu menu) {
            C0835a0.m3735k0(C0287g.this.f749D);
            return this.f806a.mo1000c(bVar, menu);
        }

        /* renamed from: d */
        public boolean mo1001d(C0336b bVar, MenuItem menuItem) {
            return this.f806a.mo1001d(bVar, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.g$l */
    /* compiled from: AppCompatDelegateImpl */
    static class C0301l {
        /* renamed from: a */
        static Context m1477a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m1478b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$m */
    /* compiled from: AppCompatDelegateImpl */
    static class C0302m {
        /* renamed from: a */
        static boolean m1479a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* renamed from: androidx.appcompat.app.g$n */
    /* compiled from: AppCompatDelegateImpl */
    static class C0303n {
        /* renamed from: a */
        static void m1480a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$o */
    /* compiled from: AppCompatDelegateImpl */
    static class C0304o {
        /* renamed from: a */
        static void m1481a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$q */
    /* compiled from: AppCompatDelegateImpl */
    private class C0306q extends C0307r {

        /* renamed from: c */
        private final PowerManager f814c;

        C0306q(Context context) {
            super();
            this.f814c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo1018b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1019c() {
            if (Build.VERSION.SDK_INT < 21 || !C0302m.m1479a(this.f814c)) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo1020d() {
            C0287g.this.mo955I();
        }
    }

    /* renamed from: androidx.appcompat.app.g$r */
    /* compiled from: AppCompatDelegateImpl */
    abstract class C0307r {

        /* renamed from: a */
        private BroadcastReceiver f816a;

        /* renamed from: androidx.appcompat.app.g$r$a */
        /* compiled from: AppCompatDelegateImpl */
        class C0308a extends BroadcastReceiver {
            C0308a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0307r.this.mo1020d();
            }
        }

        C0307r() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1021a() {
            BroadcastReceiver broadcastReceiver = this.f816a;
            if (broadcastReceiver != null) {
                try {
                    C0287g.this.f770e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f816a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo1018b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo1019c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo1020d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo1022e() {
            mo1021a();
            IntentFilter b = mo1018b();
            if (b != null && b.countActions() != 0) {
                if (this.f816a == null) {
                    this.f816a = new C0308a();
                }
                C0287g.this.f770e.registerReceiver(this.f816a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.g$s */
    /* compiled from: AppCompatDelegateImpl */
    private class C0309s extends C0307r {

        /* renamed from: c */
        private final C0328o f819c;

        C0309s(C0328o oVar) {
            super();
            this.f819c = oVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo1018b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo1019c() {
            return this.f819c.mo1067d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo1020d() {
            C0287g.this.mo955I();
        }
    }

    /* renamed from: androidx.appcompat.app.g$t */
    /* compiled from: AppCompatDelegateImpl */
    private static class C0310t {
        /* renamed from: a */
        static void m1498a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.g$u */
    /* compiled from: AppCompatDelegateImpl */
    private class C0311u extends ContentFrameLayout {
        public C0311u(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m1499c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0287g.this.mo964W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1499c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0287g.this.mo960Q(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C4411a.m29346b(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.g$v */
    /* compiled from: AppCompatDelegateImpl */
    protected static final class C0312v {

        /* renamed from: a */
        int f822a;

        /* renamed from: b */
        int f823b;

        /* renamed from: c */
        int f824c;

        /* renamed from: d */
        int f825d;

        /* renamed from: e */
        int f826e;

        /* renamed from: f */
        int f827f;

        /* renamed from: g */
        ViewGroup f828g;

        /* renamed from: h */
        View f829h;

        /* renamed from: i */
        View f830i;

        /* renamed from: j */
        C0367g f831j;

        /* renamed from: k */
        C0364e f832k;

        /* renamed from: l */
        Context f833l;

        /* renamed from: m */
        boolean f834m;

        /* renamed from: n */
        boolean f835n;

        /* renamed from: o */
        boolean f836o;

        /* renamed from: p */
        public boolean f837p;

        /* renamed from: q */
        boolean f838q = false;

        /* renamed from: r */
        boolean f839r;

        /* renamed from: s */
        Bundle f840s;

        C0312v(int i) {
            this.f822a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0385n mo1027a(C0383m.C0384a aVar) {
            if (this.f831j == null) {
                return null;
            }
            if (this.f832k == null) {
                C0364e eVar = new C0364e(this.f833l, C4294g.f23907j);
                this.f832k = eVar;
                eVar.mo1276g(aVar);
                this.f831j.mo1368b(this.f832k);
            }
            return this.f832k.mo1316i(this.f828g);
        }

        /* renamed from: b */
        public boolean mo1028b() {
            if (this.f829h == null) {
                return false;
            }
            if (this.f830i == null && this.f832k.mo1315b().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1029c(C0367g gVar) {
            C0364e eVar;
            C0367g gVar2 = this.f831j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo1346O(this.f832k);
                }
                this.f831j = gVar;
                if (gVar != null && (eVar = this.f832k) != null) {
                    gVar.mo1368b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1030d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C4288a.f23761a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C4288a.f23752E, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C4296i.f23931b, true);
            }
            C0339d dVar = new C0339d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f833l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C4297j.f24166y0);
            this.f823b = obtainStyledAttributes.getResourceId(C4297j.f23941B0, 0);
            this.f827f = obtainStyledAttributes.getResourceId(C4297j.f23936A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.g$w */
    /* compiled from: AppCompatDelegateImpl */
    private final class C0313w implements C0383m.C0384a {
        C0313w() {
        }

        /* renamed from: a */
        public void mo996a(C0367g gVar, boolean z) {
            C0367g D = gVar.mo1336D();
            boolean z2 = D != gVar;
            C0287g gVar2 = C0287g.this;
            if (z2) {
                gVar = D;
            }
            C0312v b0 = gVar2.mo969b0(gVar);
            if (b0 == null) {
                return;
            }
            if (z2) {
                C0287g.this.mo957N(b0.f822a, b0, D);
                C0287g.this.mo961R(b0, true);
                return;
            }
            C0287g.this.mo961R(b0, z);
        }

        /* renamed from: b */
        public boolean mo997b(C0367g gVar) {
            Window.Callback i0;
            if (gVar != gVar.mo1336D()) {
                return true;
            }
            C0287g gVar2 = C0287g.this;
            if (!gVar2.f754I || (i0 = gVar2.mo973i0()) == null || C0287g.this.f765a0) {
                return true;
            }
            i0.onMenuOpened(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f741r0 = z2;
        if (i >= 17) {
            z = true;
        }
        f744u0 = z;
        if (z2 && !f745v0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0288a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0287g(Activity activity, C0285e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    /* renamed from: A0 */
    private void m1375A0(C0312v vVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!vVar.f836o && !this.f765a0) {
            if (vVar.f822a == 0) {
                if ((this.f770e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback i0 = mo973i0();
            if (i0 == null || i0.onMenuOpened(vVar.f822a, vVar.f831j)) {
                WindowManager windowManager = (WindowManager) this.f770e.getSystemService("window");
                if (windowManager != null && m1377D0(vVar, keyEvent)) {
                    ViewGroup viewGroup = vVar.f828g;
                    if (viewGroup == null || vVar.f838q) {
                        if (viewGroup == null) {
                            if (!m1400l0(vVar) || vVar.f828g == null) {
                                return;
                            }
                        } else if (vVar.f838q && viewGroup.getChildCount() > 0) {
                            vVar.f828g.removeAllViews();
                        }
                        if (!m1399k0(vVar) || !vVar.mo1028b()) {
                            vVar.f838q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = vVar.f829h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        vVar.f828g.setBackgroundResource(vVar.f823b);
                        ViewParent parent = vVar.f829h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(vVar.f829h);
                        }
                        vVar.f828g.addView(vVar.f829h, layoutParams2);
                        if (!vVar.f829h.hasFocus()) {
                            vVar.f829h.requestFocus();
                        }
                    } else {
                        View view = vVar.f830i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            vVar.f835n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, vVar.f825d, vVar.f826e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                            layoutParams3.gravity = vVar.f824c;
                            layoutParams3.windowAnimations = vVar.f827f;
                            windowManager.addView(vVar.f828g, layoutParams3);
                            vVar.f836o = true;
                            return;
                        }
                    }
                    i = -2;
                    vVar.f835n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, vVar.f825d, vVar.f826e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                    layoutParams32.gravity = vVar.f824c;
                    layoutParams32.windowAnimations = vVar.f827f;
                    windowManager.addView(vVar.f828g, layoutParams32);
                    vVar.f836o = true;
                    return;
                }
                return;
            }
            mo961R(vVar, true);
        }
    }

    /* renamed from: C0 */
    private boolean m1376C0(C0312v vVar, int i, KeyEvent keyEvent, int i2) {
        C0367g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.f834m || m1377D0(vVar, keyEvent)) && (gVar = vVar.f831j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f789t == null) {
            mo961R(vVar, true);
        }
        return z;
    }

    /* renamed from: D0 */
    private boolean m1377D0(C0312v vVar, KeyEvent keyEvent) {
        C0494g0 g0Var;
        C0494g0 g0Var2;
        C0494g0 g0Var3;
        if (this.f765a0) {
            return false;
        }
        if (vVar.f834m) {
            return true;
        }
        C0312v vVar2 = this.f761P;
        if (!(vVar2 == null || vVar2 == vVar)) {
            mo961R(vVar2, false);
        }
        Window.Callback i0 = mo973i0();
        if (i0 != null) {
            vVar.f830i = i0.onCreatePanelView(vVar.f822a);
        }
        int i = vVar.f822a;
        boolean z = i == 0 || i == 108;
        if (z && (g0Var3 = this.f789t) != null) {
            g0Var3.mo1649d();
        }
        if (vVar.f830i == null && (!z || !(mo953B0() instanceof C0321m))) {
            C0367g gVar = vVar.f831j;
            if (gVar == null || vVar.f839r) {
                if (gVar == null && (!m1401m0(vVar) || vVar.f831j == null)) {
                    return false;
                }
                if (z && this.f789t != null) {
                    if (this.f790u == null) {
                        this.f790u = new C0298j();
                    }
                    this.f789t.mo1646b(vVar.f831j, this.f790u);
                }
                vVar.f831j.mo1375d0();
                if (!i0.onCreatePanelMenu(vVar.f822a, vVar.f831j)) {
                    vVar.mo1029c((C0367g) null);
                    if (z && (g0Var2 = this.f789t) != null) {
                        g0Var2.mo1646b((Menu) null, this.f790u);
                    }
                    return false;
                }
                vVar.f839r = false;
            }
            vVar.f831j.mo1375d0();
            Bundle bundle = vVar.f840s;
            if (bundle != null) {
                vVar.f831j.mo1347P(bundle);
                vVar.f840s = null;
            }
            if (!i0.onPreparePanel(0, vVar.f830i, vVar.f831j)) {
                if (z && (g0Var = this.f789t) != null) {
                    g0Var.mo1646b((Menu) null, this.f790u);
                }
                vVar.f831j.mo1370c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.f837p = z2;
            vVar.f831j.setQwertyMode(z2);
            vVar.f831j.mo1370c0();
        }
        vVar.f834m = true;
        vVar.f835n = false;
        this.f761P = vVar;
        return true;
    }

    /* renamed from: E0 */
    private void m1378E0(boolean z) {
        C0494g0 g0Var = this.f789t;
        if (g0Var == null || !g0Var.mo1651e() || (ViewConfiguration.get(this.f770e).hasPermanentMenuKey() && !this.f789t.mo1652f())) {
            C0312v g0 = mo971g0(0, true);
            g0.f838q = true;
            mo961R(g0, false);
            m1375A0(g0, (KeyEvent) null);
            return;
        }
        Window.Callback i0 = mo973i0();
        if (this.f789t.mo1647c() && z) {
            this.f789t.mo1654g();
            if (!this.f765a0) {
                i0.onPanelClosed(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, mo971g0(0, true).f831j);
            }
        } else if (i0 != null && !this.f765a0) {
            if (this.f779i0 && (this.f780j0 & 1) != 0) {
                this.f772f.getDecorView().removeCallbacks(this.f781k0);
                this.f781k0.run();
            }
            C0312v g02 = mo971g0(0, true);
            C0367g gVar = g02.f831j;
            if (gVar != null && !g02.f839r && i0.onPreparePanel(0, g02.f830i, gVar)) {
                i0.onMenuOpened(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, g02.f831j);
                this.f789t.mo1661h();
            }
        }
    }

    /* renamed from: F0 */
    private int m1379F0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return C8710R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
    }

    /* renamed from: H0 */
    private boolean m1380H0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f772f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0835a0.m3704Q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: J */
    private boolean m1381J(boolean z) {
        if (this.f765a0) {
            return false;
        }
        int M = m1387M();
        boolean L0 = m1386L0(mo977q0(this.f770e, M), z);
        if (M == 0) {
            m1397f0(this.f770e).mo1022e();
        } else {
            C0307r rVar = this.f775g0;
            if (rVar != null) {
                rVar.mo1021a();
            }
        }
        if (M == 3) {
            m1396e0(this.f770e).mo1022e();
        } else {
            C0307r rVar2 = this.f777h0;
            if (rVar2 != null) {
                rVar2.mo1021a();
            }
        }
        return L0;
    }

    /* renamed from: J0 */
    private void m1382J0() {
        if (this.f748C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: K */
    private void m1383K() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f749D.findViewById(16908290);
        View decorView = this.f772f.getDecorView();
        contentFrameLayout.mo1745b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f770e.obtainStyledAttributes(C4297j.f24166y0);
        obtainStyledAttributes.getValue(C4297j.f23982K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C4297j.f23986L0, contentFrameLayout.getMinWidthMinor());
        int i = C4297j.f23974I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C4297j.f23978J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C4297j.f23966G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C4297j.f23970H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: K0 */
    private C0282d m1384K0() {
        Context context = this.f770e;
        while (context != null) {
            if (!(context instanceof C0282d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0282d) context;
            }
        }
        return null;
    }

    /* renamed from: L */
    private void m1385L(Window window) {
        if (this.f772f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0305p)) {
                C0305p pVar = new C0305p(callback);
                this.f774g = pVar;
                window.setCallback(pVar);
                C0452a1 u = C0452a1.m2209u(this.f770e, (AttributeSet) null, f742s0);
                Drawable h = u.mo2049h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo2061w();
                this.f772f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: L0 */
    private boolean m1386L0(int i, boolean z) {
        boolean z2 = false;
        Configuration S = m1391S(this.f770e, i, (Configuration) null, false);
        boolean o0 = m1403o0(this.f770e);
        Configuration configuration = this.f766b0;
        if (configuration == null) {
            configuration = this.f770e.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = S.uiMode & 48;
        boolean z3 = true;
        if (i2 != i3 && z && !o0 && this.f763R && (f743t0 || this.f764S)) {
            Object obj = this.f768d;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                C0615b.m2922t((Activity) this.f768d);
                z2 = true;
            }
        }
        if (z2 || i2 == i3) {
            z3 = z2;
        } else {
            m1388M0(i3, o0, (Configuration) null);
        }
        if (z3) {
            Object obj2 = this.f768d;
            if (obj2 instanceof C0282d) {
                ((C0282d) obj2).onNightModeChanged(i);
            }
        }
        return z3;
    }

    /* renamed from: M */
    private int m1387M() {
        int i = this.f767c0;
        return i != -100 ? i : C0286f.m1346j();
    }

    /* renamed from: M0 */
    private void m1388M0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f770e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0319l.m1515a(resources);
        }
        int i3 = this.f769d0;
        if (i3 != 0) {
            this.f770e.setTheme(i3);
            if (i2 >= 23) {
                this.f770e.getTheme().applyStyle(this.f769d0, true);
            }
        }
        if (z) {
            Object obj = this.f768d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C1220n) {
                    if (((C1220n) activity).getLifecycle().mo4400b().mo4403a(C1208j.C1211c.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f764S && !this.f765a0) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: O0 */
    private void m1389O0(View view) {
        int i;
        if ((C0835a0.m3698K(view) & 8192) != 0) {
            i = C0681a.m3148d(this.f770e, C4290c.f23789b);
        } else {
            i = C0681a.m3148d(this.f770e, C4290c.f23788a);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: P */
    private void m1390P() {
        C0307r rVar = this.f775g0;
        if (rVar != null) {
            rVar.mo1021a();
        }
        C0307r rVar2 = this.f777h0;
        if (rVar2 != null) {
            rVar2.mo1021a();
        }
    }

    /* renamed from: S */
    private Configuration m1391S(Context context, int i, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: T */
    private ViewGroup m1392T() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f770e.obtainStyledAttributes(C4297j.f24166y0);
        int i = C4297j.f23951D0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C4297j.f23990M0, false)) {
                mo927A(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo927A(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            if (obtainStyledAttributes.getBoolean(C4297j.f23956E0, false)) {
                mo927A(C8710R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (obtainStyledAttributes.getBoolean(C4297j.f23961F0, false)) {
                mo927A(10);
            }
            this.f757L = obtainStyledAttributes.getBoolean(C4297j.f24171z0, false);
            obtainStyledAttributes.recycle();
            m1394a0();
            this.f772f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f770e);
            if (this.f758M) {
                viewGroup = this.f756K ? (ViewGroup) from.inflate(C4294g.f23912o, (ViewGroup) null) : (ViewGroup) from.inflate(C4294g.f23911n, (ViewGroup) null);
            } else if (this.f757L) {
                viewGroup = (ViewGroup) from.inflate(C4294g.f23903f, (ViewGroup) null);
                this.f755J = false;
                this.f754I = false;
            } else if (this.f754I) {
                TypedValue typedValue = new TypedValue();
                this.f770e.getTheme().resolveAttribute(C4288a.f23766f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C0339d(this.f770e, typedValue.resourceId);
                } else {
                    context = this.f770e;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C4294g.f23913p, (ViewGroup) null);
                C0494g0 g0Var = (C0494g0) viewGroup.findViewById(C4293f.f23887p);
                this.f789t = g0Var;
                g0Var.setWindowCallback(mo973i0());
                if (this.f755J) {
                    this.f789t.mo1662i(C8710R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                }
                if (this.f752G) {
                    this.f789t.mo1662i(2);
                }
                if (this.f753H) {
                    this.f789t.mo1662i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C0835a0.m3765z0(viewGroup, new C0290c());
                } else if (viewGroup instanceof C0511k0) {
                    ((C0511k0) viewGroup).setOnFitSystemWindowsListener(new C0291d());
                }
                if (this.f789t == null) {
                    this.f750E = (TextView) viewGroup.findViewById(C4293f.f23868M);
                }
                C0508j1.m2497c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C4293f.f23873b);
                ViewGroup viewGroup2 = (ViewGroup) this.f772f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f772f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0292e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f754I + ", windowActionBarOverlay: " + this.f755J + ", android:windowIsFloating: " + this.f757L + ", windowActionModeOverlay: " + this.f756K + ", windowNoTitle: " + this.f758M + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: Z */
    private void m1393Z() {
        if (!this.f748C) {
            this.f749D = m1392T();
            CharSequence h0 = mo972h0();
            if (!TextUtils.isEmpty(h0)) {
                C0494g0 g0Var = this.f789t;
                if (g0Var != null) {
                    g0Var.setWindowTitle(h0);
                } else if (mo953B0() != null) {
                    mo953B0().mo859x(h0);
                } else {
                    TextView textView = this.f750E;
                    if (textView != null) {
                        textView.setText(h0);
                    }
                }
            }
            m1383K();
            mo984z0(this.f749D);
            this.f748C = true;
            C0312v g0 = mo971g0(0, false);
            if (this.f765a0) {
                return;
            }
            if (g0 == null || g0.f831j == null) {
                m1402n0(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
        }
    }

    /* renamed from: a0 */
    private void m1394a0() {
        if (this.f772f == null) {
            Object obj = this.f768d;
            if (obj instanceof Activity) {
                m1385L(((Activity) obj).getWindow());
            }
        }
        if (this.f772f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: c0 */
    private static Configuration m1395c0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0303n.m1480a(configuration, configuration2, configuration3);
            } else if (!C0825c.m3642a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0304o.m1481a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0301l.m1478b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: e0 */
    private C0307r m1396e0(Context context) {
        if (this.f777h0 == null) {
            this.f777h0 = new C0306q(context);
        }
        return this.f777h0;
    }

    /* renamed from: f0 */
    private C0307r m1397f0(Context context) {
        if (this.f775g0 == null) {
            this.f775g0 = new C0309s(C0328o.m1551a(context));
        }
        return this.f775g0;
    }

    /* renamed from: j0 */
    private void m1398j0() {
        m1393Z();
        if (this.f754I && this.f778i == null) {
            Object obj = this.f768d;
            if (obj instanceof Activity) {
                this.f778i = new C0330p((Activity) this.f768d, this.f755J);
            } else if (obj instanceof Dialog) {
                this.f778i = new C0330p((Dialog) this.f768d);
            }
            C0275a aVar = this.f778i;
            if (aVar != null) {
                aVar.mo855t(this.f782l0);
            }
        }
    }

    /* renamed from: k0 */
    private boolean m1399k0(C0312v vVar) {
        View view = vVar.f830i;
        if (view != null) {
            vVar.f829h = view;
            return true;
        } else if (vVar.f831j == null) {
            return false;
        } else {
            if (this.f791v == null) {
                this.f791v = new C0313w();
            }
            View view2 = (View) vVar.mo1027a(this.f791v);
            vVar.f829h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: l0 */
    private boolean m1400l0(C0312v vVar) {
        vVar.mo1030d(mo970d0());
        vVar.f828g = new C0311u(vVar.f833l);
        vVar.f824c = 81;
        return true;
    }

    /* renamed from: m0 */
    private boolean m1401m0(C0312v vVar) {
        Context context = this.f770e;
        int i = vVar.f822a;
        if ((i == 0 || i == 108) && this.f789t != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C4288a.f23766f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C4288a.f23767g, typedValue, true);
            } else {
                theme.resolveAttribute(C4288a.f23767g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0339d dVar = new C0339d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0367g gVar = new C0367g(context);
        gVar.mo1349R(this);
        vVar.mo1029c(gVar);
        return true;
    }

    /* renamed from: n0 */
    private void m1402n0(int i) {
        this.f780j0 = (1 << i) | this.f780j0;
        if (!this.f779i0) {
            C0835a0.m3725f0(this.f772f.getDecorView(), this.f781k0);
            this.f779i0 = true;
        }
    }

    /* renamed from: o0 */
    private boolean m1403o0(Context context) {
        if (!this.f773f0 && (this.f768d instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f768d.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f771e0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f771e0 = false;
            }
        }
        this.f773f0 = true;
        return this.f771e0;
    }

    /* renamed from: t0 */
    private boolean m1404t0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0312v g0 = mo971g0(i, true);
        if (!g0.f836o) {
            return m1377D0(g0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1405w0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f792w
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.g$v r2 = r4.mo971g0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.g0 r5 = r4.f789t
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1651e()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f770e
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.g0 r5 = r4.f789t
            boolean r5 = r5.mo1647c()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f765a0
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m1377D0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.g0 r5 = r4.f789t
            boolean r0 = r5.mo1661h()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.g0 r5 = r4.f789t
            boolean r0 = r5.mo1654g()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f836o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f835n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f834m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f839r
            if (r5 == 0) goto L_0x005b
            r2.f834m = r1
            boolean r5 = r4.m1377D0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m1375A0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.mo961R(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f770e
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0287g.m1405w0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: A */
    public boolean mo927A(int i) {
        int F0 = m1379F0(i);
        if (this.f758M && F0 == 108) {
            return false;
        }
        if (this.f754I && F0 == 1) {
            this.f754I = false;
        }
        if (F0 == 1) {
            m1382J0();
            this.f758M = true;
            return true;
        } else if (F0 == 2) {
            m1382J0();
            this.f752G = true;
            return true;
        } else if (F0 == 5) {
            m1382J0();
            this.f753H = true;
            return true;
        } else if (F0 == 10) {
            m1382J0();
            this.f756K = true;
            return true;
        } else if (F0 == 108) {
            m1382J0();
            this.f754I = true;
            return true;
        } else if (F0 != 109) {
            return this.f772f.requestFeature(F0);
        } else {
            m1382J0();
            this.f755J = true;
            return true;
        }
    }

    /* renamed from: B */
    public void mo928B(int i) {
        m1393Z();
        ViewGroup viewGroup = (ViewGroup) this.f749D.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f770e).inflate(i, viewGroup);
        this.f774g.mo1003c(this.f772f.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public final C0275a mo953B0() {
        return this.f778i;
    }

    /* renamed from: C */
    public void mo929C(View view) {
        m1393Z();
        ViewGroup viewGroup = (ViewGroup) this.f749D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f774g.mo1003c(this.f772f.getCallback());
    }

    /* renamed from: D */
    public void mo930D(View view, ViewGroup.LayoutParams layoutParams) {
        m1393Z();
        ViewGroup viewGroup = (ViewGroup) this.f749D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f774g.mo1003c(this.f772f.getCallback());
    }

    /* renamed from: E */
    public void mo931E(Toolbar toolbar) {
        if (this.f768d instanceof Activity) {
            C0275a n = mo942n();
            if (!(n instanceof C0330p)) {
                this.f787r = null;
                if (n != null) {
                    n.mo850o();
                }
                this.f778i = null;
                if (toolbar != null) {
                    C0321m mVar = new C0321m(toolbar, mo972h0(), this.f774g);
                    this.f778i = mVar;
                    this.f774g.mo1007e(mVar.f860c);
                } else {
                    this.f774g.mo1007e((C0297i) null);
                }
                mo944p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: F */
    public void mo932F(int i) {
        this.f769d0 = i;
    }

    /* renamed from: G */
    public final void mo933G(CharSequence charSequence) {
        this.f788s = charSequence;
        C0494g0 g0Var = this.f789t;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
        } else if (mo953B0() != null) {
            mo953B0().mo859x(charSequence);
        } else {
            TextView textView = this.f750E;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f749D;
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo954G0() {
        /*
            r1 = this;
            boolean r0 = r1.f748C
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f749D
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.C0835a0.m3705R(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0287g.mo954G0():boolean");
    }

    /* renamed from: H */
    public C0336b mo934H(C0336b.C0337a aVar) {
        C0285e eVar;
        if (aVar != null) {
            C0336b bVar = this.f792w;
            if (bVar != null) {
                bVar.mo1087c();
            }
            C0299k kVar = new C0299k(aVar);
            C0275a n = mo942n();
            if (n != null) {
                C0336b z = n.mo861z(kVar);
                this.f792w = z;
                if (!(z == null || (eVar = this.f776h) == null)) {
                    eVar.onSupportActionModeStarted(z);
                }
            }
            if (this.f792w == null) {
                this.f792w = mo956I0(kVar);
            }
            return this.f792w;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: I */
    public boolean mo955I() {
        return m1381J(true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.C0336b mo956I0(androidx.appcompat.view.C0336b.C0337a r8) {
        /*
            r7 = this;
            r7.mo966Y()
            androidx.appcompat.view.b r0 = r7.f792w
            if (r0 == 0) goto L_0x000a
            r0.mo1087c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0287g.C0299k
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.g$k r0 = new androidx.appcompat.app.g$k
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f776h
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f765a0
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f792w = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f793x
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f757L
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f770e
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p048g.C4288a.f23766f
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f770e
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f770e
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f770e
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f793x = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p048g.C4288a.f23769i
            r5.<init>(r4, r1, r6)
            r7.f794y = r5
            r6 = 2
            androidx.core.widget.C0983i.m4445b(r5, r6)
            android.widget.PopupWindow r5 = r7.f794y
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f793x
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f794y
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p048g.C4288a.f23762b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f793x
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f794y
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.g$f r0 = new androidx.appcompat.app.g$f
            r0.<init>()
            r7.f795z = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f749D
            int r4 = p048g.C4293f.f23879h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo970d0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1955a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f793x = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f793x
            if (r0 == 0) goto L_0x015b
            r7.mo966Y()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f793x
            r0.mo1631k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f793x
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f793x
            android.widget.PopupWindow r6 = r7.f794y
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo1089e()
            boolean r8 = r8.mo999b(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.mo1093k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            r8.mo1629h(r0)
            r7.f792w = r0
            boolean r8 = r7.mo954G0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            androidx.core.view.g0 r8 = androidx.core.view.C0835a0.m3720d(r8)
            androidx.core.view.g0 r8 = r8.mo3385b(r0)
            r7.f746A = r8
            androidx.appcompat.app.g$g r0 = new androidx.appcompat.app.g$g
            r0.<init>()
            r8.mo3390h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f793x
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.C0835a0.m3735k0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.f794y
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f772f
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f795z
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f792w = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f792w
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.e r0 = r7.f776h
            if (r0 == 0) goto L_0x0166
            r0.onSupportActionModeStarted(r8)
        L_0x0166:
            androidx.appcompat.view.b r8 = r7.f792w
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0287g.mo956I0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo957N(int i, C0312v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i >= 0) {
                C0312v[] vVarArr = this.f760O;
                if (i < vVarArr.length) {
                    vVar = vVarArr[i];
                }
            }
            if (vVar != null) {
                menu = vVar.f831j;
            }
        }
        if ((vVar == null || vVar.f836o) && !this.f765a0) {
            this.f774g.mo1004d(this.f772f.getCallback(), i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public final int mo958N0(C0922k0 k0Var, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        if (k0Var != null) {
            i = k0Var.mo3419k();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f793x;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f793x.getLayoutParams();
            boolean z3 = true;
            if (this.f793x.isShown()) {
                if (this.f783m0 == null) {
                    this.f783m0 = new Rect();
                    this.f784n0 = new Rect();
                }
                Rect rect2 = this.f783m0;
                Rect rect3 = this.f784n0;
                if (k0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k0Var.mo3417i(), k0Var.mo3419k(), k0Var.mo3418j(), k0Var.mo3415h());
                }
                C0508j1.m2495a(this.f749D, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                C0922k0 H = C0835a0.m3694H(this.f749D);
                if (H == null) {
                    i2 = 0;
                } else {
                    i2 = H.mo3417i();
                }
                if (H == null) {
                    i3 = 0;
                } else {
                    i3 = H.mo3418j();
                }
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z2 = true;
                }
                if (i6 <= 0 || this.f751F != null) {
                    View view = this.f751F;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        this.f751F.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f770e);
                    this.f751F = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f749D.addView(this.f751F, -1, layoutParams);
                }
                View view3 = this.f751F;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m1389O0(this.f751F);
                }
                if (!this.f756K && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f793x.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f751F;
        if (view4 != null) {
            if (!z) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo959O(C0367g gVar) {
        if (!this.f759N) {
            this.f759N = true;
            this.f789t.mo1663j();
            Window.Callback i0 = mo973i0();
            if (i0 != null && !this.f765a0) {
                i0.onPanelClosed(C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, gVar);
            }
            this.f759N = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo960Q(int i) {
        mo961R(mo971g0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo961R(C0312v vVar, boolean z) {
        ViewGroup viewGroup;
        C0494g0 g0Var;
        if (!z || vVar.f822a != 0 || (g0Var = this.f789t) == null || !g0Var.mo1647c()) {
            WindowManager windowManager = (WindowManager) this.f770e.getSystemService("window");
            if (!(windowManager == null || !vVar.f836o || (viewGroup = vVar.f828g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo957N(vVar.f822a, vVar, (Menu) null);
                }
            }
            vVar.f834m = false;
            vVar.f835n = false;
            vVar.f836o = false;
            vVar.f829h = null;
            vVar.f838q = true;
            if (this.f761P == vVar) {
                this.f761P = null;
                return;
            }
            return;
        }
        mo959O(vVar.f831j);
    }

    /* renamed from: U */
    public View mo962U(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f785o0 == null) {
            String string = this.f770e.obtainStyledAttributes(C4297j.f24166y0).getString(C4297j.f23946C0);
            if (string == null) {
                this.f785o0 = new C0316j();
            } else {
                try {
                    this.f785o0 = (C0316j) this.f770e.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f785o0 = new C0316j();
                }
            }
        }
        boolean z3 = f741r0;
        if (z3) {
            if (this.f786p0 == null) {
                this.f786p0 = new C0318k();
            }
            if (this.f786p0.mo1061a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = m1380H0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.f785o0.createView(view, str, context, attributeSet, z, z3, true, C0501i1.m2469c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo963V() {
        C0367g gVar;
        C0494g0 g0Var = this.f789t;
        if (g0Var != null) {
            g0Var.mo1663j();
        }
        if (this.f794y != null) {
            this.f772f.getDecorView().removeCallbacks(this.f795z);
            if (this.f794y.isShowing()) {
                try {
                    this.f794y.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f794y = null;
        }
        mo966Y();
        C0312v g0 = mo971g0(0, false);
        if (g0 != null && (gVar = g0.f831j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo964W(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f768d;
        boolean z = true;
        if (((obj instanceof C0905f.C0906a) || (obj instanceof C0315i)) && (decorView = this.f772f.getDecorView()) != null && C0905f.m4106d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f774g.mo1002b(this.f772f.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo979s0(keyCode, keyEvent) : mo981v0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo965X(int i) {
        C0312v g0;
        C0312v g02 = mo971g0(i, true);
        if (g02.f831j != null) {
            Bundle bundle = new Bundle();
            g02.f831j.mo1348Q(bundle);
            if (bundle.size() > 0) {
                g02.f840s = bundle;
            }
            g02.f831j.mo1375d0();
            g02.f831j.clear();
        }
        g02.f839r = true;
        g02.f838q = true;
        if ((i == 108 || i == 0) && this.f789t != null && (g0 = mo971g0(0, false)) != null) {
            g0.f834m = false;
            m1377D0(g0, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo966Y() {
        C0909g0 g0Var = this.f746A;
        if (g0Var != null) {
            g0Var.mo3386c();
        }
    }

    /* renamed from: a */
    public boolean mo967a(C0367g gVar, MenuItem menuItem) {
        C0312v b0;
        Window.Callback i0 = mo973i0();
        if (i0 == null || this.f765a0 || (b0 = mo969b0(gVar.mo1336D())) == null) {
            return false;
        }
        return i0.onMenuItemSelected(b0.f822a, menuItem);
    }

    /* renamed from: b */
    public void mo968b(C0367g gVar) {
        m1378E0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public C0312v mo969b0(Menu menu) {
        C0312v[] vVarArr = this.f760O;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0312v vVar = vVarArr[i];
            if (vVar != null && vVar.f831j == menu) {
                return vVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void mo935d(View view, ViewGroup.LayoutParams layoutParams) {
        m1393Z();
        ((ViewGroup) this.f749D.findViewById(16908290)).addView(view, layoutParams);
        this.f774g.mo1003c(this.f772f.getCallback());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final Context mo970d0() {
        C0275a n = mo942n();
        Context j = n != null ? n.mo845j() : null;
        return j == null ? this.f770e : j;
    }

    /* renamed from: f */
    public Context mo937f(Context context) {
        boolean z = true;
        this.f763R = true;
        int q0 = mo977q0(context, m1387M());
        Configuration configuration = null;
        boolean z2 = false;
        if (f744u0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0310t.m1498a((ContextThemeWrapper) context, m1391S(context, q0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0339d) {
            try {
                ((C0339d) context).mo1114a(m1391S(context, q0, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f743t0) {
            return super.mo937f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = C0301l.m1477a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = m1395c0(configuration3, configuration4);
            }
        }
        Configuration S = m1391S(context, q0, configuration, true);
        C0339d dVar = new C0339d(context, C4296i.f23933d);
        dVar.mo1114a(S);
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0707h.C0714g.m3282a(dVar.getTheme());
        }
        return super.mo937f(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public C0312v mo971g0(int i, boolean z) {
        C0312v[] vVarArr = this.f760O;
        if (vVarArr == null || vVarArr.length <= i) {
            C0312v[] vVarArr2 = new C0312v[(i + 1)];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.f760O = vVarArr2;
            vVarArr = vVarArr2;
        }
        C0312v vVar = vVarArr[i];
        if (vVar != null) {
            return vVar;
        }
        C0312v vVar2 = new C0312v(i);
        vVarArr[i] = vVar2;
        return vVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final CharSequence mo972h0() {
        Object obj = this.f768d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f788s;
    }

    /* renamed from: i */
    public <T extends View> T mo938i(int i) {
        m1393Z();
        return this.f772f.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final Window.Callback mo973i0() {
        return this.f772f.getCallback();
    }

    /* renamed from: k */
    public final C0279b mo939k() {
        return new C0296h();
    }

    /* renamed from: l */
    public int mo940l() {
        return this.f767c0;
    }

    /* renamed from: m */
    public MenuInflater mo941m() {
        if (this.f787r == null) {
            m1398j0();
            C0275a aVar = this.f778i;
            this.f787r = new C0344g(aVar != null ? aVar.mo845j() : this.f770e);
        }
        return this.f787r;
    }

    /* renamed from: n */
    public C0275a mo942n() {
        m1398j0();
        return this.f778i;
    }

    /* renamed from: o */
    public void mo943o() {
        LayoutInflater from = LayoutInflater.from(this.f770e);
        if (from.getFactory() == null) {
            C0908g.m4110b(from, this);
        } else if (!(from.getFactory2() instanceof C0287g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo962U(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo944p() {
        if (mo953B0() != null && !mo942n().mo847l()) {
            m1402n0(0);
        }
    }

    /* renamed from: p0 */
    public boolean mo976p0() {
        return this.f747B;
    }

    /* renamed from: q */
    public void mo945q(Configuration configuration) {
        C0275a n;
        if (this.f754I && this.f748C && (n = mo942n()) != null) {
            n.mo849n(configuration);
        }
        C0509k.m2499b().mo2402g(this.f770e);
        this.f766b0 = new Configuration(this.f770e.getResources().getConfiguration());
        m1381J(false);
        configuration.updateFrom(this.f770e.getResources().getConfiguration());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public int mo977q0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m1396e0(context).mo1019c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return m1397f0(context).mo1019c();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* renamed from: r */
    public void mo946r(Bundle bundle) {
        this.f763R = true;
        m1381J(false);
        m1394a0();
        Object obj = this.f768d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0648j.m2985c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0275a B0 = mo953B0();
                if (B0 == null) {
                    this.f782l0 = true;
                } else {
                    B0.mo855t(true);
                }
            }
            C0286f.m1343c(this);
        }
        this.f766b0 = new Configuration(this.f770e.getResources().getConfiguration());
        this.f764S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo978r0() {
        C0336b bVar = this.f792w;
        if (bVar != null) {
            bVar.mo1087c();
            return true;
        }
        C0275a n = mo942n();
        if (n == null || !n.mo842g()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo947s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f768d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0286f.m1347y(r3)
        L_0x0009:
            boolean r0 = r3.f779i0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f772f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f781k0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.f765a0 = r0
            int r0 = r3.f767c0
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f768d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            r.g<java.lang.String, java.lang.Integer> r0 = f740q0
            java.lang.Object r1 = r3.f768d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f767c0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            r.g<java.lang.String, java.lang.Integer> r0 = f740q0
            java.lang.Object r1 = r3.f768d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f778i
            if (r0 == 0) goto L_0x005b
            r0.mo850o()
        L_0x005b:
            r3.m1390P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0287g.mo947s():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean mo979s0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f762Q = z;
        } else if (i == 82) {
            m1404t0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public void mo948t(Bundle bundle) {
        m1393Z();
    }

    /* renamed from: u */
    public void mo949u() {
        C0275a n = mo942n();
        if (n != null) {
            n.mo857v(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo980u0(int i, KeyEvent keyEvent) {
        C0275a n = mo942n();
        if (n != null && n.mo851p(i, keyEvent)) {
            return true;
        }
        C0312v vVar = this.f761P;
        if (vVar == null || !m1376C0(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f761P == null) {
                C0312v g0 = mo971g0(0, true);
                m1377D0(g0, keyEvent);
                boolean C0 = m1376C0(g0, keyEvent.getKeyCode(), keyEvent, 1);
                g0.f834m = false;
                if (C0) {
                    return true;
                }
            }
            return false;
        }
        C0312v vVar2 = this.f761P;
        if (vVar2 != null) {
            vVar2.f835n = true;
        }
        return true;
    }

    /* renamed from: v */
    public void mo950v(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public boolean mo981v0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f762Q;
            this.f762Q = false;
            C0312v g0 = mo971g0(0, false);
            if (g0 != null && g0.f836o) {
                if (!z) {
                    mo961R(g0, true);
                }
                return true;
            } else if (mo978r0()) {
                return true;
            }
        } else if (i == 82) {
            m1405w0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public void mo951w() {
        mo955I();
    }

    /* renamed from: x */
    public void mo952x() {
        C0275a n = mo942n();
        if (n != null) {
            n.mo857v(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo982x0(int i) {
        C0275a n;
        if (i == 108 && (n = mo942n()) != null) {
            n.mo843h(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo983y0(int i) {
        if (i == 108) {
            C0275a n = mo942n();
            if (n != null) {
                n.mo843h(false);
            }
        } else if (i == 0) {
            C0312v g0 = mo971g0(i, true);
            if (g0.f836o) {
                mo961R(g0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo984z0(ViewGroup viewGroup) {
    }

    C0287g(Dialog dialog, C0285e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f740q0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0287g(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0285e r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f746A = r0
            r0 = 1
            r2.f747B = r0
            r0 = -100
            r2.f767c0 = r0
            androidx.appcompat.app.g$b r1 = new androidx.appcompat.app.g$b
            r1.<init>()
            r2.f781k0 = r1
            r2.f770e = r3
            r2.f776h = r5
            r2.f768d = r6
            int r3 = r2.f767c0
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.d r3 = r2.m1384K0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.f r3 = r3.getDelegate()
            int r3 = r3.mo940l()
            r2.f767c0 = r3
        L_0x0032:
            int r3 = r2.f767c0
            if (r3 != r0) goto L_0x0059
            r.g<java.lang.String, java.lang.Integer> r3 = f740q0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f767c0 = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.m1385L(r4)
        L_0x005e:
            androidx.appcompat.widget.C0509k.m2501h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0287g.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.e, java.lang.Object):void");
    }

    /* renamed from: androidx.appcompat.app.g$p */
    /* compiled from: AppCompatDelegateImpl */
    class C0305p extends C0349i {

        /* renamed from: b */
        private C0297i f809b;

        /* renamed from: c */
        private boolean f810c;

        /* renamed from: d */
        private boolean f811d;

        /* renamed from: e */
        private boolean f812e;

        C0305p(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo1002b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f811d = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f811d = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.f811d = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: c */
        public void mo1003c(Window.Callback callback) {
            try {
                this.f810c = true;
                callback.onContentChanged();
                this.f810c = false;
            } catch (Throwable th) {
                this.f810c = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: d */
        public void mo1004d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f812e = true;
                callback.onPanelClosed(i, menu);
                this.f812e = false;
            } catch (Throwable th) {
                this.f812e = false;
                throw th;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f811d) {
                return mo1159a().dispatchKeyEvent(keyEvent);
            }
            return C0287g.this.mo964W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0287g.this.mo980u0(keyEvent.getKeyCode(), keyEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo1007e(C0297i iVar) {
            this.f809b = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final ActionMode mo1008f(ActionMode.Callback callback) {
            C0342f.C0343a aVar = new C0342f.C0343a(C0287g.this.f770e, callback);
            C0336b H = C0287g.this.mo934H(aVar);
            if (H != null) {
                return aVar.mo1140e(H);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f810c) {
                mo1159a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0367g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            C0297i iVar = this.f809b;
            if (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i)) == null) {
                return super.onCreatePanelView(i);
            }
            return onCreatePanelView;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0287g.this.mo982x0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            if (this.f812e) {
                mo1159a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            C0287g.this.mo983y0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0367g gVar = menu instanceof C0367g ? (C0367g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            boolean z = true;
            if (gVar != null) {
                gVar.mo1358a0(true);
            }
            C0297i iVar = this.f809b;
            if (iVar == null || !iVar.mo994a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (gVar != null) {
                gVar.mo1358a0(false);
            }
            return z;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0367g gVar;
            C0312v g0 = C0287g.this.mo971g0(0, true);
            if (g0 == null || (gVar = g0.f831j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (C0287g.this.mo976p0()) {
                return mo1008f(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C0287g.this.mo976p0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo1008f(callback);
        }
    }
}
