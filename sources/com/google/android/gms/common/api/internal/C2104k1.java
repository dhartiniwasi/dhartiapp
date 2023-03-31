package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p017b5.C1793e;
import p123q5.C5412j;
import p180z4.C6362b;
import p180z4.C6368e;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C2104k1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f6232b;

    /* renamed from: c */
    protected final AtomicReference<C2095h1> f6233c = new AtomicReference<>((Object) null);

    /* renamed from: d */
    private final Handler f6234d = new C5412j(Looper.getMainLooper());

    /* renamed from: e */
    protected final C6368e f6235e;

    C2104k1(C1793e eVar, C6368e eVar2) {
        super(eVar);
        this.f6235e = eVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m9355l(C6362b bVar, int i) {
        this.f6233c.set((Object) null);
        mo8068m(bVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m9356o() {
        this.f6233c.set((Object) null);
        mo8069n();
    }

    /* renamed from: p */
    private static final int m9357p(C2095h1 h1Var) {
        if (h1Var == null) {
            return -1;
        }
        return h1Var.mo8073a();
    }

    /* renamed from: e */
    public final void mo8002e(int i, int i2, Intent intent) {
        C2095h1 h1Var = this.f6233c.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f6235e.mo21776i(mo8001b());
                if (i3 == 0) {
                    m9356o();
                    return;
                } else if (h1Var != null) {
                    if (h1Var.mo8074b().mo21751I1() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m9356o();
            return;
        } else if (i2 == 0) {
            if (h1Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m9355l(new C6362b(i4, (PendingIntent) null, h1Var.mo8074b().toString()), m9357p(h1Var));
                return;
            }
            return;
        }
        if (h1Var != null) {
            m9355l(h1Var.mo8074b(), h1Var.mo8073a());
        }
    }

    /* renamed from: f */
    public final void mo8003f(Bundle bundle) {
        super.mo8003f(bundle);
        if (bundle != null) {
            this.f6233c.set(bundle.getBoolean("resolving_error", false) ? new C2095h1(new C6362b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: i */
    public final void mo8006i(Bundle bundle) {
        super.mo8006i(bundle);
        C2095h1 h1Var = this.f6233c.get();
        if (h1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", h1Var.mo8073a());
            bundle.putInt("failed_status", h1Var.mo8074b().mo21751I1());
            bundle.putParcelable("failed_resolution", h1Var.mo8074b().mo21753K1());
        }
    }

    /* renamed from: j */
    public void mo8007j() {
        super.mo8007j();
        this.f6232b = true;
    }

    /* renamed from: k */
    public void mo8008k() {
        super.mo8008k();
        this.f6232b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo8068m(C6362b bVar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo8069n();

    public final void onCancel(DialogInterface dialogInterface) {
        m9355l(new C6362b(13, (PendingIntent) null), m9357p(this.f6233c.get()));
    }

    /* renamed from: s */
    public final void mo8088s(C6362b bVar, int i) {
        C2095h1 h1Var = new C2095h1(bVar, i);
        if (this.f6233c.compareAndSet((Object) null, h1Var)) {
            this.f6234d.post(new C2101j1(this, h1Var));
        }
    }
}
