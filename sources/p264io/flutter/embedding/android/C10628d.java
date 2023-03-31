package p264io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.core.content.res.C0707h;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1222o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p264io.flutter.embedding.android.C10630e;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.embedding.engine.C10697e;
import p264io.flutter.plugin.platform.C10724c;
import p297mb.C11881b;
import p325pc.C12172h;
import p399xb.C12989a;

/* renamed from: io.flutter.embedding.android.d */
/* compiled from: FlutterActivity */
public class C10628d extends Activity implements C10630e.C10633c, C1220n {

    /* renamed from: d */
    public static final int f41730d = C12172h.m58453d(61938);

    /* renamed from: a */
    protected C10630e f41731a;

    /* renamed from: b */
    private C1222o f41732b;

    /* renamed from: c */
    private final OnBackInvokedCallback f41733c;

    /* renamed from: io.flutter.embedding.android.d$a */
    /* compiled from: FlutterActivity */
    class C10629a implements OnBackInvokedCallback {
        C10629a() {
        }

        public void onBackInvoked() {
            C10628d.this.onBackPressed();
        }
    }

    public C10628d() {
        this.f41733c = Build.VERSION.SDK_INT >= 33 ? new C10629a() : null;
        this.f41732b = new C1222o(this);
    }

    /* renamed from: A */
    private void m53250A() {
        if (mo33848C() == C10634f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: B */
    private View m53251B() {
        return this.f41731a.mo33908r((LayoutInflater) null, (ViewGroup) null, (Bundle) null, f41730d, mo33889w() == C10677v.surface);
    }

    /* renamed from: F */
    private Drawable m53252F() {
        try {
            Bundle E = mo33850E();
            int i = E != null ? E.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i != 0) {
                return C0707h.m3258d(getResources(), i, getTheme());
            }
            return null;
        } catch (Resources.NotFoundException e) {
            C11881b.m57384b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: G */
    private boolean m53253G() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: J */
    private boolean m53254J(String str) {
        C10630e eVar = this.f41731a;
        if (eVar == null) {
            C11881b.m57389g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (eVar.mo33903l()) {
            return true;
        } else {
            C11881b.m57389g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    /* renamed from: K */
    private void m53255K() {
        try {
            Bundle E = mo33850E();
            if (E != null) {
                int i = E.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i != -1) {
                    setTheme(i);
                    return;
                }
                return;
            }
            C11881b.m57388f("FlutterActivity", "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            C11881b.m57384b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: z */
    private void m53256z() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C10634f mo33848C() {
        if (getIntent().hasExtra("background_mode")) {
            return C10634f.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return C10634f.opaque;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C10685a mo33849D() {
        return this.f41731a.mo33902k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Bundle mo33850E() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    /* renamed from: H */
    public void mo33851H() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f41733c);
        }
    }

    /* renamed from: I */
    public void mo33852I() {
        mo33853L();
        C10630e eVar = this.f41731a;
        if (eVar != null) {
            eVar.mo33898F();
            this.f41731a = null;
        }
    }

    /* renamed from: L */
    public void mo33853L() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f41733c);
        }
    }

    /* renamed from: a */
    public boolean mo33854a() {
        return false;
    }

    /* renamed from: b */
    public void mo33855b() {
    }

    /* renamed from: c */
    public void mo33856c() {
        C11881b.m57389g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + mo33849D() + " evicted by another attaching activity");
        C10630e eVar = this.f41731a;
        if (eVar != null) {
            eVar.mo33909s();
            this.f41731a.mo33910t();
        }
    }

    /* renamed from: d */
    public void mo33857d() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    /* renamed from: e */
    public List<String> mo33858e() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    /* renamed from: f */
    public String mo33859f() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    /* renamed from: g */
    public boolean mo33860g() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (mo33859f() != null) {
            return false;
        }
        return true;
    }

    public Activity getActivity() {
        return this;
    }

    public Context getContext() {
        return this;
    }

    public C1208j getLifecycle() {
        return this.f41732b;
    }

    /* renamed from: h */
    public String mo33863h() {
        try {
            Bundle E = mo33850E();
            String string = E != null ? E.getString("io.flutter.Entrypoint") : null;
            if (string != null) {
                return string;
            }
            return "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    /* renamed from: i */
    public C10724c mo33864i(Activity activity, C10685a aVar) {
        return new C10724c(getActivity(), aVar.mo34077n(), this);
    }

    /* renamed from: j */
    public boolean mo33865j() {
        try {
            Bundle E = mo33850E();
            if (E != null) {
                return E.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: k */
    public C10685a mo27478k(Context context) {
        return null;
    }

    /* renamed from: l */
    public void mo33866l(C10641i iVar) {
    }

    /* renamed from: m */
    public void mo27479m(C10685a aVar) {
        if (!this.f41731a.mo33904m()) {
            C12989a.m61203a(aVar);
        }
    }

    /* renamed from: n */
    public String mo33867n() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle E = mo33850E();
            if (E != null) {
                return E.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public boolean mo33868o() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (m53254J("onActivityResult")) {
            this.f41731a.mo33905o(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (m53254J("onBackPressed")) {
            this.f41731a.mo33907q();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m53255K();
        super.onCreate(bundle);
        C10630e eVar = new C10630e(this);
        this.f41731a = eVar;
        eVar.mo33906p(this);
        this.f41731a.mo33915y(bundle);
        this.f41732b.mo4408h(C1208j.C1210b.ON_CREATE);
        mo33851H();
        m53250A();
        setContentView(m53251B());
        m53256z();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (m53254J("onDestroy")) {
            this.f41731a.mo33909s();
            this.f41731a.mo33910t();
        }
        mo33852I();
        this.f41732b.mo4408h(C1208j.C1210b.ON_DESTROY);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m53254J("onNewIntent")) {
            this.f41731a.mo33911u(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (m53254J("onPause")) {
            this.f41731a.mo33912v();
        }
        this.f41732b.mo4408h(C1208j.C1210b.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (m53254J("onPostResume")) {
            this.f41731a.mo33913w();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (m53254J("onRequestPermissionsResult")) {
            this.f41731a.mo33914x(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f41732b.mo4408h(C1208j.C1210b.ON_RESUME);
        if (m53254J("onResume")) {
            this.f41731a.mo33916z();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m53254J("onSaveInstanceState")) {
            this.f41731a.mo33893A(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f41732b.mo4408h(C1208j.C1210b.ON_START);
        if (m53254J("onStart")) {
            this.f41731a.mo33894B();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (m53254J("onStop")) {
            this.f41731a.mo33895C();
        }
        this.f41732b.mo4408h(C1208j.C1210b.ON_STOP);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (m53254J("onTrimMemory")) {
            this.f41731a.mo33896D(i);
        }
    }

    public void onUserLeaveHint() {
        if (m53254J("onUserLeaveHint")) {
            this.f41731a.mo33897E();
        }
    }

    /* renamed from: p */
    public boolean mo33883p() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (mo33859f() != null || this.f41731a.mo33904m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    /* renamed from: q */
    public boolean mo33884q() {
        return true;
    }

    /* renamed from: r */
    public void mo27480r(C10685a aVar) {
    }

    /* renamed from: s */
    public String mo33885s() {
        try {
            Bundle E = mo33850E();
            if (E != null) {
                return E.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public void mo33886t(C10638h hVar) {
    }

    /* renamed from: u */
    public String mo33887u() {
        String dataString;
        if (!m53253G() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    /* renamed from: v */
    public C10697e mo33888v() {
        return C10697e.m53546a(getIntent());
    }

    /* renamed from: w */
    public C10677v mo33889w() {
        return mo33848C() == C10634f.opaque ? C10677v.surface : C10677v.texture;
    }

    /* renamed from: x */
    public C10679x mo33890x() {
        Drawable F = m53252F();
        if (F != null) {
            return new C10624b(F);
        }
        return null;
    }

    /* renamed from: y */
    public C10680y mo33891y() {
        if (mo33848C() == C10634f.opaque) {
            return C10680y.opaque;
        }
        return C10680y.transparent;
    }
}
