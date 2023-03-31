package com.onesignal;

import android.content.Context;
import androidx.appcompat.app.C0282d;
import androidx.fragment.app.C1086d;
import androidx.fragment.app.C1114n;
import androidx.fragment.app.Fragment;
import com.onesignal.C8289a;
import com.onesignal.C8338d3;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.onesignal.s2 */
/* compiled from: OSSystemConditionController */
class C8601s2 {

    /* renamed from: b */
    private static final String f36020b = "com.onesignal.s2";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8604c f36021a;

    /* renamed from: com.onesignal.s2$a */
    /* compiled from: OSSystemConditionController */
    class C8602a extends C1114n.C1126l {

        /* renamed from: a */
        final /* synthetic */ C1114n f36022a;

        C8602a(C1114n nVar) {
            this.f36022a = nVar;
        }

        /* renamed from: e */
        public void mo4192e(C1114n nVar, Fragment fragment) {
            super.mo4192e(nVar, fragment);
            if (fragment instanceof C1086d) {
                this.f36022a.mo4160p1(this);
                C8601s2.this.f36021a.mo28202c();
            }
        }
    }

    /* renamed from: com.onesignal.s2$b */
    /* compiled from: OSSystemConditionController */
    interface C8603b {
        /* renamed from: a */
        void mo27573a(String str, C8289a.C8292c cVar);
    }

    /* renamed from: com.onesignal.s2$c */
    /* compiled from: OSSystemConditionController */
    interface C8604c {
        /* renamed from: c */
        void mo28202c();
    }

    C8601s2(C8604c cVar) {
        this.f36021a = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo28200b(Context context) throws NoClassDefFoundError {
        if (!(context instanceof C0282d)) {
            return false;
        }
        C1114n supportFragmentManager = ((C0282d) context).getSupportFragmentManager();
        supportFragmentManager.mo4133a1(new C8602a(supportFragmentManager), true);
        List<Fragment> s0 = supportFragmentManager.mo4164s0();
        int size = s0.size();
        if (size <= 0) {
            return false;
        }
        Fragment fragment = s0.get(size - 1);
        if (!fragment.mo3801e0() || !(fragment instanceof C1086d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28201c() {
        if (C8338d3.m46486Y() == null) {
            C8338d3.m46594z1(C8338d3.C8384r0.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (mo28200b(C8338d3.m46486Y())) {
                C8338d3.m46594z1(C8338d3.C8384r0.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        } catch (NoClassDefFoundError e) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
            C8338d3.m46594z1(r0Var, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e);
        }
        C8289a b = C8301b.m46281b();
        boolean l = C8313b3.m46330l(new WeakReference(C8338d3.m46486Y()));
        if (l && b != null) {
            b.mo27575c(f36020b, this.f36021a);
            C8338d3.m46594z1(C8338d3.C8384r0.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return !l;
    }
}
