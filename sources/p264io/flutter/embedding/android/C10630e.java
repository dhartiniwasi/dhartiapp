package p264io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.C1208j;
import java.util.Arrays;
import java.util.List;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.embedding.engine.C10688b;
import p264io.flutter.embedding.engine.C10697e;
import p264io.flutter.plugin.platform.C10724c;
import p297mb.C11877a;
import p297mb.C11881b;
import p315ob.C12051a;
import p325pc.C12172h;
import p408yb.C13257b;

/* renamed from: io.flutter.embedding.android.e */
/* compiled from: FlutterActivityAndFragmentDelegate */
class C10630e implements C10627c<Activity> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10633c f41735a;

    /* renamed from: b */
    private C10685a f41736b;

    /* renamed from: c */
    C10644k f41737c;

    /* renamed from: d */
    private C10724c f41738d;

    /* renamed from: e */
    ViewTreeObserver.OnPreDrawListener f41739e;

    /* renamed from: f */
    private boolean f41740f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f41741g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f41742h;

    /* renamed from: i */
    private boolean f41743i;

    /* renamed from: j */
    private Integer f41744j;

    /* renamed from: k */
    private final C13257b f41745k = new C10631a();

    /* renamed from: io.flutter.embedding.android.e$a */
    /* compiled from: FlutterActivityAndFragmentDelegate */
    class C10631a implements C13257b {
        C10631a() {
        }

        /* renamed from: b */
        public void mo33830b() {
            C10630e.this.f41735a.mo33855b();
            boolean unused = C10630e.this.f41741g = false;
        }

        /* renamed from: d */
        public void mo33831d() {
            C10630e.this.f41735a.mo33857d();
            boolean unused = C10630e.this.f41741g = true;
            boolean unused2 = C10630e.this.f41742h = true;
        }
    }

    /* renamed from: io.flutter.embedding.android.e$b */
    /* compiled from: FlutterActivityAndFragmentDelegate */
    class C10632b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C10644k f41747a;

        C10632b(C10644k kVar) {
            this.f41747a = kVar;
        }

        public boolean onPreDraw() {
            if (C10630e.this.f41741g && C10630e.this.f41739e != null) {
                this.f41747a.getViewTreeObserver().removeOnPreDrawListener(this);
                C10630e.this.f41739e = null;
            }
            return C10630e.this.f41741g;
        }
    }

    /* renamed from: io.flutter.embedding.android.e$c */
    /* compiled from: FlutterActivityAndFragmentDelegate */
    interface C10633c extends C10724c.C10728d {
        /* renamed from: b */
        void mo33855b();

        /* renamed from: c */
        void mo33856c();

        /* renamed from: d */
        void mo33857d();

        /* renamed from: e */
        List<String> mo33858e();

        /* renamed from: f */
        String mo33859f();

        /* renamed from: g */
        boolean mo33860g();

        Activity getActivity();

        Context getContext();

        C1208j getLifecycle();

        /* renamed from: h */
        String mo33863h();

        /* renamed from: i */
        C10724c mo33864i(Activity activity, C10685a aVar);

        /* renamed from: j */
        boolean mo33865j();

        /* renamed from: k */
        C10685a mo27478k(Context context);

        /* renamed from: l */
        void mo33866l(C10641i iVar);

        /* renamed from: m */
        void mo27479m(C10685a aVar);

        /* renamed from: n */
        String mo33867n();

        /* renamed from: o */
        boolean mo33868o();

        /* renamed from: p */
        boolean mo33883p();

        /* renamed from: q */
        boolean mo33884q();

        /* renamed from: r */
        void mo27480r(C10685a aVar);

        /* renamed from: s */
        String mo33885s();

        /* renamed from: t */
        void mo33886t(C10638h hVar);

        /* renamed from: u */
        String mo33887u();

        /* renamed from: v */
        C10697e mo33888v();

        /* renamed from: w */
        C10677v mo33889w();

        /* renamed from: x */
        C10679x mo33890x();

        /* renamed from: y */
        C10680y mo33891y();
    }

    C10630e(C10633c cVar) {
        this.f41735a = cVar;
        this.f41742h = false;
    }

    /* renamed from: g */
    private void m53292g(C10644k kVar) {
        if (this.f41735a.mo33889w() == C10677v.surface) {
            if (this.f41739e != null) {
                kVar.getViewTreeObserver().removeOnPreDrawListener(this.f41739e);
            }
            this.f41739e = new C10632b(kVar);
            kVar.getViewTreeObserver().addOnPreDrawListener(this.f41739e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    /* renamed from: h */
    private void m53293h() {
        String str;
        C12051a.C12054c cVar;
        if (this.f41735a.mo33859f() == null && !this.f41736b.mo34072i().mo36423n()) {
            String n = this.f41735a.mo33867n();
            if (n == null && (n = m53295n(this.f41735a.getActivity().getIntent())) == null) {
                n = "/";
            }
            String s = this.f41735a.mo33885s();
            if (("Executing Dart entrypoint: " + this.f41735a.mo33863h() + ", library uri: " + s) == null) {
                str = "\"\"";
            } else {
                str = s + ", and sending initial route: " + n;
            }
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", str);
            this.f41736b.mo34076m().mo38638c(n);
            String u = this.f41735a.mo33887u();
            if (u == null || u.isEmpty()) {
                u = C11877a.m57376e().mo36134c().mo36742i();
            }
            if (s == null) {
                cVar = new C12051a.C12054c(u, this.f41735a.mo33863h());
            } else {
                cVar = new C12051a.C12054c(u, s, this.f41735a.mo33863h());
            }
            this.f41736b.mo34072i().mo36421l(cVar, this.f41735a.mo33858e());
        }
    }

    /* renamed from: i */
    private void m53294i() {
        if (this.f41735a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: n */
    private String m53295n(Intent intent) {
        Uri data;
        String path;
        if (!this.f41735a.mo33865j() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo33893A(Bundle bundle) {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        m53294i();
        if (this.f41735a.mo33860g()) {
            bundle.putByteArray("framework", this.f41736b.mo34081r().mo38645h());
        }
        if (this.f41735a.mo33868o()) {
            Bundle bundle2 = new Bundle();
            this.f41736b.mo34071h().onSaveInstanceState(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo33894B() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onStart()");
        m53294i();
        m53293h();
        Integer num = this.f41744j;
        if (num != null) {
            this.f41737c.setVisibility(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo33895C() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onStop()");
        m53294i();
        if (this.f41735a.mo33884q()) {
            this.f41736b.mo34073j().mo38631c();
        }
        this.f41744j = Integer.valueOf(this.f41737c.getVisibility());
        this.f41737c.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo33896D(int i) {
        m53294i();
        C10685a aVar = this.f41736b;
        if (aVar != null) {
            if (this.f41742h && i >= 10) {
                aVar.mo34072i().mo36424o();
                this.f41736b.mo34084u().mo38655a();
            }
            this.f41736b.mo34080q().mo38353n(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo33897E() {
        m53294i();
        if (this.f41736b != null) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f41736b.mo34071h().mo34093c();
            return;
        }
        C11881b.m57389g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo33898F() {
        this.f41735a = null;
        this.f41736b = null;
        this.f41737c = null;
        this.f41738d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo33899G() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String f = this.f41735a.mo33859f();
        if (f != null) {
            C10685a a = C10688b.m53506b().mo34088a(f);
            this.f41736b = a;
            this.f41740f = true;
            if (a == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + f + "'");
            }
            return;
        }
        C10633c cVar = this.f41735a;
        C10685a k = cVar.mo27478k(cVar.getContext());
        this.f41736b = k;
        if (k != null) {
            this.f41740f = true;
            return;
        }
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f41736b = new C10685a(this.f41735a.getContext(), this.f41735a.mo33888v().mo34125b(), false, this.f41735a.mo33860g());
        this.f41740f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo33900H() {
        C10724c cVar = this.f41738d;
        if (cVar != null) {
            cVar.mo34240A();
        }
    }

    /* renamed from: c */
    public void mo33846c() {
        if (!this.f41735a.mo33883p()) {
            this.f41735a.mo33856c();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f41735a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: j */
    public Activity mo33847d() {
        Activity activity = this.f41735a.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C10685a mo33902k() {
        return this.f41736b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo33903l() {
        return this.f41743i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo33904m() {
        return this.f41740f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo33905o(int i, int i2, Intent intent) {
        m53294i();
        if (this.f41736b != null) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
            this.f41736b.mo34071h().onActivityResult(i, i2, intent);
            return;
        }
        C11881b.m57389g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo33906p(Context context) {
        m53294i();
        if (this.f41736b == null) {
            mo33899G();
        }
        if (this.f41735a.mo33868o()) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f41736b.mo34071h().mo34095e(this, this.f41735a.getLifecycle());
        }
        C10633c cVar = this.f41735a;
        this.f41738d = cVar.mo33864i(cVar.getActivity(), this.f41736b);
        this.f41735a.mo27479m(this.f41736b);
        this.f41743i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo33907q() {
        m53294i();
        if (this.f41736b != null) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f41736b.mo34076m().mo38636a();
            return;
        }
        C11881b.m57389g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public View mo33908r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i, boolean z) {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        m53294i();
        boolean z2 = true;
        if (this.f41735a.mo33889w() == C10677v.surface) {
            Context context = this.f41735a.getContext();
            if (this.f41735a.mo33891y() != C10680y.transparent) {
                z2 = false;
            }
            C10638h hVar = new C10638h(context, z2);
            this.f41735a.mo33886t(hVar);
            this.f41737c = new C10644k(this.f41735a.getContext(), hVar);
        } else {
            C10641i iVar = new C10641i(this.f41735a.getContext());
            if (this.f41735a.mo33891y() != C10680y.opaque) {
                z2 = false;
            }
            iVar.setOpaque(z2);
            this.f41735a.mo33866l(iVar);
            this.f41737c = new C10644k(this.f41735a.getContext(), iVar);
        }
        this.f41737c.mo33953l(this.f41745k);
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f41737c.mo33955n(this.f41736b);
        this.f41737c.setId(i);
        C10679x x = this.f41735a.mo33890x();
        if (x != null) {
            C11881b.m57389g("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.f41735a.getContext());
            flutterSplashView.setId(C12172h.m58453d(486947586));
            flutterSplashView.mo33820g(this.f41737c, x);
            return flutterSplashView;
        }
        if (z) {
            m53292g(this.f41737c);
        }
        return this.f41737c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo33909s() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        m53294i();
        if (this.f41739e != null) {
            this.f41737c.getViewTreeObserver().removeOnPreDrawListener(this.f41739e);
            this.f41739e = null;
        }
        this.f41737c.mo33969s();
        this.f41737c.mo33975z(this.f41745k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo33910t() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onDetach()");
        m53294i();
        this.f41735a.mo27480r(this.f41736b);
        if (this.f41735a.mo33868o()) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f41735a.getActivity().isChangingConfigurations()) {
                this.f41736b.mo34071h().mo34098h();
            } else {
                this.f41736b.mo34071h().mo34097g();
            }
        }
        C10724c cVar = this.f41738d;
        if (cVar != null) {
            cVar.mo34242o();
            this.f41738d = null;
        }
        if (this.f41735a.mo33884q()) {
            this.f41736b.mo34073j().mo38629a();
        }
        if (this.f41735a.mo33883p()) {
            this.f41736b.mo34069f();
            if (this.f41735a.mo33859f() != null) {
                C10688b.m53506b().mo34090d(this.f41735a.mo33859f());
            }
            this.f41736b = null;
        }
        this.f41743i = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo33911u(Intent intent) {
        m53294i();
        if (this.f41736b != null) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
            this.f41736b.mo34071h().mo34094d(intent);
            String n = m53295n(intent);
            if (n != null && !n.isEmpty()) {
                this.f41736b.mo34076m().mo38637b(n);
                return;
            }
            return;
        }
        C11881b.m57389g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo33912v() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onPause()");
        m53294i();
        if (this.f41735a.mo33884q()) {
            this.f41736b.mo34073j().mo38630b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo33913w() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        m53294i();
        if (this.f41736b != null) {
            mo33900H();
        } else {
            C11881b.m57389g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo33914x(int i, String[] strArr, int[] iArr) {
        m53294i();
        if (this.f41736b != null) {
            C11881b.m57388f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.f41736b.mo34071h().onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        C11881b.m57389g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo33915y(Bundle bundle) {
        Bundle bundle2;
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        m53294i();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f41735a.mo33860g()) {
            this.f41736b.mo34081r().mo38646j(bArr);
        }
        if (this.f41735a.mo33868o()) {
            this.f41736b.mo34071h().mo34092b(bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo33916z() {
        C11881b.m57388f("FlutterActivityAndFragmentDelegate", "onResume()");
        m53294i();
        if (this.f41735a.mo33884q()) {
            this.f41736b.mo34073j().mo38632d();
        }
    }
}
