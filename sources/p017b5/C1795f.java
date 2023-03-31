package p017b5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import p033d5.C4087c;
import p033d5.C4108h;
import p033d5.C4114j;
import p033d5.C4141r;
import p180z4.C6362b;
import p180z4.C6366d;

/* renamed from: b5.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C1795f implements C2051a.C2060f, ServiceConnection {

    /* renamed from: t */
    private static final String f5323t = C1795f.class.getSimpleName();

    /* renamed from: a */
    private final String f5324a;

    /* renamed from: b */
    private final String f5325b;

    /* renamed from: c */
    private final ComponentName f5326c;

    /* renamed from: d */
    private final Context f5327d;

    /* renamed from: e */
    private final C1789c f5328e;

    /* renamed from: f */
    private final Handler f5329f;

    /* renamed from: g */
    private final C1797g f5330g;

    /* renamed from: h */
    private IBinder f5331h;

    /* renamed from: i */
    private boolean f5332i;

    /* renamed from: r */
    private String f5333r;

    /* renamed from: s */
    private String f5334s;

    /* renamed from: w */
    private final void m8432w() {
        if (Thread.currentThread() != this.f5329f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: x */
    private final void m8433x(String str) {
        String.valueOf(this.f5331h);
    }

    /* renamed from: a */
    public final boolean mo6930a() {
        m8432w();
        return this.f5331h != null;
    }

    /* renamed from: b */
    public final boolean mo6931b() {
        return false;
    }

    /* renamed from: c */
    public final Set<Scope> mo6932c() {
        return Collections.emptySet();
    }

    /* renamed from: d */
    public final void mo6933d(String str) {
        m8432w();
        this.f5333r = str;
        mo6935e();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public final void mo6935e() {
        m8432w();
        m8433x("Disconnect called.");
        try {
            this.f5327d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f5332i = false;
        this.f5331h = null;
    }

    /* renamed from: f */
    public final boolean mo6936f() {
        m8432w();
        return this.f5332i;
    }

    /* renamed from: g */
    public final String mo6937g() {
        String str = this.f5324a;
        if (str != null) {
            return str;
        }
        C4141r.m28221k(this.f5326c);
        return this.f5326c.getPackageName();
    }

    /* renamed from: h */
    public final void mo6938h(C4087c.C4090c cVar) {
        m8432w();
        m8433x("Connect started.");
        if (mo6930a()) {
            try {
                mo6933d("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f5326c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f5324a).setAction(this.f5325b);
            }
            boolean bindService = this.f5327d.bindService(intent, this, C4108h.m28148a());
            this.f5332i = bindService;
            if (!bindService) {
                this.f5331h = null;
                this.f5330g.mo6954B0(new C6362b(16));
            }
            m8433x("Finished connect.");
        } catch (SecurityException e) {
            this.f5332i = false;
            this.f5331h = null;
            throw e;
        }
    }

    /* renamed from: i */
    public final void mo6939i(C4114j jVar, Set<Scope> set) {
    }

    /* renamed from: j */
    public final void mo6940j(C4087c.C4092e eVar) {
    }

    /* renamed from: l */
    public final boolean mo6941l() {
        return false;
    }

    /* renamed from: m */
    public final int mo6942m() {
        return 0;
    }

    /* renamed from: n */
    public final C6366d[] mo6943n() {
        return new C6366d[0];
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5329f.post(new C1828z(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5329f.post(new C1827y(this));
    }

    /* renamed from: p */
    public final String mo6946p() {
        return this.f5333r;
    }

    /* renamed from: r */
    public final Intent mo6947r() {
        return new Intent();
    }

    /* renamed from: s */
    public final boolean mo6948s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo6949t() {
        this.f5332i = false;
        this.f5331h = null;
        m8433x("Disconnected.");
        this.f5328e.mo6919p(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo6950u(IBinder iBinder) {
        this.f5332i = false;
        this.f5331h = iBinder;
        m8433x("Connected.");
        this.f5328e.mo6918P0(new Bundle());
    }

    /* renamed from: v */
    public final void mo6951v(String str) {
        this.f5334s = str;
    }
}
