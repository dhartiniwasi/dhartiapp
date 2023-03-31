package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p017b5.C1791d;
import p017b5.C1793e;
import p033d5.C4141r;
import p180z4.C6362b;
import p180z4.C6368e;

/* renamed from: com.google.android.gms.common.api.internal.g1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2092g1 extends C2104k1 {

    /* renamed from: f */
    private final SparseArray<C2088f1> f6187f = new SparseArray<>();

    private C2092g1(C1793e eVar) {
        super(eVar, C6368e.m37415q());
        this.f6083a.mo6925a("AutoManageHelper", this);
    }

    /* renamed from: t */
    public static C2092g1 m9290t(C1791d dVar) {
        C1793e d = LifecycleCallback.m9131d(dVar);
        C2092g1 g1Var = (C2092g1) d.mo6926b("AutoManageHelper", C2092g1.class);
        if (g1Var != null) {
            return g1Var;
        }
        return new C2092g1(d);
    }

    /* renamed from: w */
    private final C2088f1 m9291w(int i) {
        if (this.f6187f.size() <= i) {
            return null;
        }
        SparseArray<C2088f1> sparseArray = this.f6187f;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    /* renamed from: a */
    public final void mo8000a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f6187f.size(); i++) {
            C2088f1 w = m9291w(i);
            if (w != null) {
                printWriter.append(str).append("GoogleApiClient #").print(w.f6175a);
                printWriter.println(":");
                w.f6176b.mo6964d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo8007j() {
        super.mo8007j();
        boolean z = this.f6232b;
        String valueOf = String.valueOf(this.f6187f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f6233c.get() == null) {
            for (int i = 0; i < this.f6187f.size(); i++) {
                C2088f1 w = m9291w(i);
                if (w != null) {
                    w.f6176b.connect();
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo8008k() {
        super.mo8008k();
        for (int i = 0; i < this.f6187f.size(); i++) {
            C2088f1 w = m9291w(i);
            if (w != null) {
                w.f6176b.disconnect();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo8068m(C6362b bVar, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C2088f1 f1Var = this.f6187f.get(i);
        if (f1Var != null) {
            mo8071v(i);
            GoogleApiClient.C2050c cVar = f1Var.f6177c;
            if (cVar != null) {
                cVar.mo6954B0(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo8069n() {
        for (int i = 0; i < this.f6187f.size(); i++) {
            C2088f1 w = m9291w(i);
            if (w != null) {
                w.f6176b.connect();
            }
        }
    }

    /* renamed from: u */
    public final void mo8070u(int i, GoogleApiClient googleApiClient, GoogleApiClient.C2050c cVar) {
        C4141r.m28222l(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f6187f.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C4141r.m28225o(z, sb.toString());
        C2095h1 h1Var = this.f6233c.get();
        boolean z2 = this.f6232b;
        String valueOf = String.valueOf(h1Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        C2088f1 f1Var = new C2088f1(this, i, googleApiClient, cVar);
        googleApiClient.mo6967i(f1Var);
        this.f6187f.put(i, f1Var);
        if (this.f6232b && h1Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    /* renamed from: v */
    public final void mo8071v(int i) {
        C2088f1 f1Var = this.f6187f.get(i);
        this.f6187f.remove(i);
        if (f1Var != null) {
            f1Var.f6176b.mo6968j(f1Var);
            f1Var.f6176b.disconnect();
        }
    }
}
