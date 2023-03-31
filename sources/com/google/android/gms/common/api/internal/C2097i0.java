package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C2051a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p007a5.C0111g;
import p017b5.C1806k0;
import p017b5.C1808l0;
import p017b5.C1813o;
import p017b5.C1824v;
import p017b5.C1826x;
import p033d5.C4095d;
import p033d5.C4141r;
import p180z4.C6362b;
import p180z4.C6370f;
import p189b6.C6606a;
import p189b6.C6611f;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2097i0 implements C1826x, C1808l0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f6207a;

    /* renamed from: b */
    private final Condition f6208b;

    /* renamed from: c */
    private final Context f6209c;

    /* renamed from: d */
    private final C6370f f6210d;

    /* renamed from: e */
    private final C2094h0 f6211e;

    /* renamed from: f */
    final Map<C2051a.C2054c<?>, C2051a.C2060f> f6212f;

    /* renamed from: g */
    final Map<C2051a.C2054c<?>, C6362b> f6213g = new HashMap();

    /* renamed from: h */
    final C4095d f6214h;

    /* renamed from: i */
    final Map<C2051a<?>, Boolean> f6215i;

    /* renamed from: r */
    final C2051a.C2052a<? extends C6611f, C6606a> f6216r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile C1813o f6217s;

    /* renamed from: t */
    private C6362b f6218t = null;

    /* renamed from: u */
    int f6219u;

    /* renamed from: v */
    final C2087f0 f6220v;

    /* renamed from: w */
    final C1824v f6221w;

    public C2097i0(Context context, C2087f0 f0Var, Lock lock, Looper looper, C6370f fVar, Map<C2051a.C2054c<?>, C2051a.C2060f> map, C4095d dVar, Map<C2051a<?>, Boolean> map2, C2051a.C2052a<? extends C6611f, C6606a> aVar, ArrayList<C1806k0> arrayList, C1824v vVar) {
        this.f6209c = context;
        this.f6207a = lock;
        this.f6210d = fVar;
        this.f6212f = map;
        this.f6214h = dVar;
        this.f6215i = map2;
        this.f6216r = aVar;
        this.f6220v = f0Var;
        this.f6221w = vVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo6962a(this);
        }
        this.f6211e = new C2094h0(this, looper);
        this.f6208b = lock.newCondition();
        this.f6217s = new C2074b0(this);
    }

    /* renamed from: P0 */
    public final void mo6918P0(Bundle bundle) {
        this.f6207a.lock();
        try {
            this.f6217s.mo6970a(bundle);
        } finally {
            this.f6207a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo7002a() {
        this.f6217s.mo6971b();
    }

    /* renamed from: b */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo7003b(T t) {
        t.mo7995l();
        this.f6217s.mo6975f(t);
        return t;
    }

    /* renamed from: c */
    public final boolean mo7004c() {
        return this.f6217s instanceof C2117p;
    }

    /* renamed from: d */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo7005d(T t) {
        t.mo7995l();
        return this.f6217s.mo6977h(t);
    }

    /* renamed from: e */
    public final void mo7006e() {
        if (this.f6217s instanceof C2117p) {
            ((C2117p) this.f6217s).mo8115j();
        }
    }

    /* renamed from: f */
    public final void mo7007f() {
        if (this.f6217s.mo6976g()) {
            this.f6213g.clear();
        }
    }

    /* renamed from: g */
    public final void mo7008g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f6217s);
        for (C2051a next : this.f6215i.keySet()) {
            printWriter.append(str).append(next.mo7962d()).println(":");
            ((C2051a.C2060f) C4141r.m28221k(this.f6212f.get(next.mo7960b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo8075j() {
        this.f6207a.lock();
        try {
            this.f6220v.mo8056r();
            this.f6217s = new C2117p(this);
            this.f6217s.mo6974e();
            this.f6208b.signalAll();
        } finally {
            this.f6207a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo8076k() {
        this.f6207a.lock();
        try {
            this.f6217s = new C2071a0(this, this.f6214h, this.f6215i, this.f6210d, this.f6216r, this.f6207a, this.f6209c);
            this.f6217s.mo6974e();
            this.f6208b.signalAll();
        } finally {
            this.f6207a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo8077l(C6362b bVar) {
        this.f6207a.lock();
        try {
            this.f6218t = bVar;
            this.f6217s = new C2074b0(this);
            this.f6217s.mo6974e();
            this.f6208b.signalAll();
        } finally {
            this.f6207a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo8078m(C2091g0 g0Var) {
        this.f6211e.sendMessage(this.f6211e.obtainMessage(1, g0Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo8079n(RuntimeException runtimeException) {
        this.f6211e.sendMessage(this.f6211e.obtainMessage(2, runtimeException));
    }

    /* renamed from: o3 */
    public final void mo6969o3(C6362b bVar, C2051a<?> aVar, boolean z) {
        this.f6207a.lock();
        try {
            this.f6217s.mo6972c(bVar, aVar, z);
        } finally {
            this.f6207a.unlock();
        }
    }

    /* renamed from: p */
    public final void mo6919p(int i) {
        this.f6207a.lock();
        try {
            this.f6217s.mo6973d(i);
        } finally {
            this.f6207a.unlock();
        }
    }
}
