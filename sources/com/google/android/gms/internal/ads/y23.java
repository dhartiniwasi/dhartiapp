package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p032d4.C4076a;
import p218e6.C9975i;
import p218e6.C9980l;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y23 {

    /* renamed from: a */
    private final Context f20447a;

    /* renamed from: b */
    private final Executor f20448b;

    /* renamed from: c */
    private final e23 f20449c;

    /* renamed from: d */
    private final g23 f20450d;

    /* renamed from: e */
    private final x23 f20451e;

    /* renamed from: f */
    private final x23 f20452f;

    /* renamed from: g */
    private C9975i f20453g;

    /* renamed from: h */
    private C9975i f20454h;

    y23(Context context, Executor executor, e23 e23, g23 g23, v23 v23, w23 w23) {
        this.f20447a = context;
        this.f20448b = executor;
        this.f20449c = e23;
        this.f20450d = g23;
        this.f20451e = v23;
        this.f20452f = w23;
    }

    /* renamed from: e */
    public static y23 m23722e(Context context, Executor executor, e23 e23, g23 g23) {
        y23 y23 = new y23(context, executor, e23, g23, new v23(), new w23());
        if (y23.f20450d.mo10381d()) {
            y23.f20453g = y23.m23724h(new s23(y23));
        } else {
            y23.f20453g = C9980l.m51031e(y23.f20451e.zza());
        }
        y23.f20454h = y23.m23724h(new t23(y23));
        return y23;
    }

    /* renamed from: g */
    private static C2730pc m23723g(C9975i iVar, C2730pc pcVar) {
        if (!iVar.mo26362q()) {
            return pcVar;
        }
        return (C2730pc) iVar.mo26358m();
    }

    /* renamed from: h */
    private final C9975i m23724h(Callable callable) {
        return C9980l.m51029c(this.f20448b, callable).mo26350e(this.f20448b, new u23(this));
    }

    /* renamed from: a */
    public final C2730pc mo15314a() {
        return m23723g(this.f20453g, this.f20451e.zza());
    }

    /* renamed from: b */
    public final C2730pc mo15315b() {
        return m23723g(this.f20454h, this.f20452f.zza());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C2730pc mo15316c() throws Exception {
        Context context = this.f20447a;
        C3063yb g0 = C2730pc.m18499g0();
        C4076a.C4077a a = C4076a.m28009a(context);
        String a2 = a.mo17308a();
        if (a2 != null && a2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a2);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a2 = Base64.encodeToString(bArr, 11);
        }
        if (a2 != null) {
            g0.mo15403r0(a2);
            g0.mo15401q0(a.mo17309b());
            g0.mo15379U(6);
        }
        return (C2730pc) g0.mo13423m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C2730pc mo15317d() throws Exception {
        Context context = this.f20447a;
        return n23.m16868a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo15318f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f20449c.mo9788c(2025, -1, exc);
    }
}
