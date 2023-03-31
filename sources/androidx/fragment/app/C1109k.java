package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0615b;
import androidx.core.content.C0681a;
import androidx.core.util.C0831h;

/* renamed from: androidx.fragment.app.k */
/* compiled from: FragmentHostCallback */
public abstract class C1109k<E> extends C1105g {

    /* renamed from: a */
    private final Activity f3033a;

    /* renamed from: b */
    private final Context f3034b;

    /* renamed from: c */
    private final Handler f3035c;

    /* renamed from: d */
    private final int f3036d;

    /* renamed from: e */
    final C1114n f3037e;

    C1109k(C1093e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    /* renamed from: c */
    public View mo3873c(int i) {
        return null;
    }

    /* renamed from: d */
    public boolean mo3874d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity mo4065e() {
        return this.f3033a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo4066f() {
        return this.f3034b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Handler mo4067g() {
        return this.f3035c;
    }

    /* renamed from: h */
    public abstract E mo4009h();

    /* renamed from: i */
    public LayoutInflater mo4010i() {
        return LayoutInflater.from(this.f3034b);
    }

    /* renamed from: j */
    public boolean mo4011j(Fragment fragment) {
        return true;
    }

    /* renamed from: k */
    public void mo4068k(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0681a.m3157m(this.f3034b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: l */
    public void mo4069l(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C0615b.m2928z(this.f3033a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: m */
    public void mo4012m() {
    }

    C1109k(Activity activity, Context context, Handler handler, int i) {
        this.f3037e = new C1133o();
        this.f3033a = activity;
        this.f3034b = (Context) C0831h.m3663g(context, "context == null");
        this.f3035c = (Handler) C0831h.m3663g(handler, "handler == null");
        this.f3036d = i;
    }
}
