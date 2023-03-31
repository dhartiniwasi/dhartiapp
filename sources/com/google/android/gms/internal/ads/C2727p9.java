package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.p9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2727p9 implements Comparable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2171aa f15751a;

    /* renamed from: b */
    private final int f15752b;

    /* renamed from: c */
    private final String f15753c;

    /* renamed from: d */
    private final int f15754d;

    /* renamed from: e */
    private final Object f15755e;

    /* renamed from: f */
    private final C2876t9 f15756f;

    /* renamed from: g */
    private Integer f15757g;

    /* renamed from: h */
    private C2839s9 f15758h;

    /* renamed from: i */
    private boolean f15759i;

    /* renamed from: r */
    private C3023x8 f15760r;

    /* renamed from: s */
    private C2690o9 f15761s;

    /* renamed from: t */
    private final C2244c9 f15762t;

    public C2727p9(int i, String str, C2876t9 t9Var) {
        Uri parse;
        String host;
        this.f15751a = C2171aa.f6496c ? new C2171aa() : null;
        this.f15755e = new Object();
        int i2 = 0;
        this.f15759i = false;
        this.f15760r = null;
        this.f15752b = i;
        this.f15753c = str;
        this.f15756f = t9Var;
        this.f15762t = new C2244c9();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.f15754d = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo13169A(int i) {
        C2839s9 s9Var = this.f15758h;
        if (s9Var != null) {
            s9Var.mo13964c(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo13170B(C2690o9 o9Var) {
        synchronized (this.f15755e) {
            this.f15761s = o9Var;
        }
    }

    /* renamed from: C */
    public final boolean mo13171C() {
        boolean z;
        synchronized (this.f15755e) {
            z = this.f15759i;
        }
        return z;
    }

    /* renamed from: D */
    public final boolean mo13172D() {
        synchronized (this.f15755e) {
        }
        return false;
    }

    /* renamed from: E */
    public byte[] mo13173E() throws C2986w8 {
        return null;
    }

    /* renamed from: F */
    public final C2244c9 mo13174F() {
        return this.f15762t;
    }

    /* renamed from: a */
    public final int mo13175a() {
        return this.f15762t.mo9076b();
    }

    /* renamed from: b */
    public final int mo13176b() {
        return this.f15754d;
    }

    /* renamed from: c */
    public final C3023x8 mo13177c() {
        return this.f15760r;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15757g.intValue() - ((C2727p9) obj).f15757g.intValue();
    }

    /* renamed from: j */
    public final C2727p9 mo13179j(C3023x8 x8Var) {
        this.f15760r = x8Var;
        return this;
    }

    /* renamed from: k */
    public final C2727p9 mo13180k(C2839s9 s9Var) {
        this.f15758h = s9Var;
        return this;
    }

    /* renamed from: n */
    public final C2727p9 mo13181n(int i) {
        this.f15757g = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C2950v9 mo13182o(C2542k9 k9Var);

    /* renamed from: q */
    public final String mo13183q() {
        String str = this.f15753c;
        if (this.f15752b == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    /* renamed from: r */
    public final String mo13184r() {
        return this.f15753c;
    }

    /* renamed from: s */
    public Map mo13185s() throws C2986w8 {
        return Collections.emptyMap();
    }

    /* renamed from: t */
    public final void mo13186t(String str) {
        if (C2171aa.f6496c) {
            this.f15751a.mo8279a(str, Thread.currentThread().getId());
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.f15754d);
        mo13172D();
        String str = this.f15753c;
        Integer num = this.f15757g;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    /* renamed from: u */
    public final void mo13188u(C3061y9 y9Var) {
        C2876t9 t9Var;
        synchronized (this.f15755e) {
            t9Var = this.f15756f;
        }
        if (t9Var != null) {
            t9Var.mo14250a(y9Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo13189v(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo13190w(String str) {
        C2839s9 s9Var = this.f15758h;
        if (s9Var != null) {
            s9Var.mo13963b(this);
        }
        if (C2171aa.f6496c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C2653n9(this, str, id));
                return;
            }
            this.f15751a.mo8279a(str, id);
            this.f15751a.mo8280b(toString());
        }
    }

    /* renamed from: x */
    public final void mo13191x() {
        synchronized (this.f15755e) {
            this.f15759i = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo13192y() {
        C2690o9 o9Var;
        synchronized (this.f15755e) {
            o9Var = this.f15761s;
        }
        if (o9Var != null) {
            o9Var.mo9098a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo13193z(C2950v9 v9Var) {
        C2690o9 o9Var;
        synchronized (this.f15755e) {
            o9Var = this.f15761s;
        }
        if (o9Var != null) {
            o9Var.mo9099b(this, v9Var);
        }
    }

    public final int zza() {
        return this.f15752b;
    }
}
