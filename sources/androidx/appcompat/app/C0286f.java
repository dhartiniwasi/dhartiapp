package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0336b;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p124r.C5415b;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: AppCompatDelegate */
public abstract class C0286f {

    /* renamed from: a */
    private static int f737a = -100;

    /* renamed from: b */
    private static final C5415b<WeakReference<C0286f>> f738b = new C5415b<>();

    /* renamed from: c */
    private static final Object f739c = new Object();

    C0286f() {
    }

    /* renamed from: c */
    static void m1343c(C0286f fVar) {
        synchronized (f739c) {
            m1348z(fVar);
            f738b.add(new WeakReference(fVar));
        }
    }

    /* renamed from: g */
    public static C0286f m1344g(Activity activity, C0285e eVar) {
        return new C0287g(activity, eVar);
    }

    /* renamed from: h */
    public static C0286f m1345h(Dialog dialog, C0285e eVar) {
        return new C0287g(dialog, eVar);
    }

    /* renamed from: j */
    public static int m1346j() {
        return f737a;
    }

    /* renamed from: y */
    static void m1347y(C0286f fVar) {
        synchronized (f739c) {
            m1348z(fVar);
        }
    }

    /* renamed from: z */
    private static void m1348z(C0286f fVar) {
        synchronized (f739c) {
            Iterator<WeakReference<C0286f>> it = f738b.iterator();
            while (it.hasNext()) {
                C0286f fVar2 = (C0286f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract boolean mo927A(int i);

    /* renamed from: B */
    public abstract void mo928B(int i);

    /* renamed from: C */
    public abstract void mo929C(View view);

    /* renamed from: D */
    public abstract void mo930D(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: E */
    public abstract void mo931E(Toolbar toolbar);

    /* renamed from: F */
    public void mo932F(int i) {
    }

    /* renamed from: G */
    public abstract void mo933G(CharSequence charSequence);

    /* renamed from: H */
    public abstract C0336b mo934H(C0336b.C0337a aVar);

    /* renamed from: d */
    public abstract void mo935d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void mo936e(Context context) {
    }

    /* renamed from: f */
    public Context mo937f(Context context) {
        mo936e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo938i(int i);

    /* renamed from: k */
    public abstract C0279b mo939k();

    /* renamed from: l */
    public int mo940l() {
        return -100;
    }

    /* renamed from: m */
    public abstract MenuInflater mo941m();

    /* renamed from: n */
    public abstract C0275a mo942n();

    /* renamed from: o */
    public abstract void mo943o();

    /* renamed from: p */
    public abstract void mo944p();

    /* renamed from: q */
    public abstract void mo945q(Configuration configuration);

    /* renamed from: r */
    public abstract void mo946r(Bundle bundle);

    /* renamed from: s */
    public abstract void mo947s();

    /* renamed from: t */
    public abstract void mo948t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo949u();

    /* renamed from: v */
    public abstract void mo950v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo951w();

    /* renamed from: x */
    public abstract void mo952x();
}
