package p031d3;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p015b3.C1748q;
import p155v3.C5810h0;
import p155v3.C5828l;
import p155v3.C5836o0;
import p155v3.C5837p;
import p161w3.C5917a;
import p177z1.C6272r1;

/* renamed from: d3.f */
/* compiled from: Chunk */
public abstract class C4060f implements C5810h0.C5815e {

    /* renamed from: a */
    public final long f23162a = C1748q.m8237a();

    /* renamed from: b */
    public final C5837p f23163b;

    /* renamed from: c */
    public final int f23164c;

    /* renamed from: d */
    public final C6272r1 f23165d;

    /* renamed from: e */
    public final int f23166e;

    /* renamed from: f */
    public final Object f23167f;

    /* renamed from: g */
    public final long f23168g;

    /* renamed from: h */
    public final long f23169h;

    /* renamed from: i */
    protected final C5836o0 f23170i;

    public C4060f(C5828l lVar, C5837p pVar, int i, C6272r1 r1Var, int i2, Object obj, long j, long j2) {
        this.f23170i = new C5836o0(lVar);
        this.f23163b = (C5837p) C5917a.m34872e(pVar);
        this.f23164c = i;
        this.f23165d = r1Var;
        this.f23166e = i2;
        this.f23167f = obj;
        this.f23168g = j;
        this.f23169h = j2;
    }

    /* renamed from: a */
    public final long mo17278a() {
        return this.f23170i.mo20362q();
    }

    /* renamed from: d */
    public final long mo17279d() {
        return this.f23169h - this.f23168g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> mo17280e() {
        return this.f23170i.mo20364s();
    }

    /* renamed from: f */
    public final Uri mo17281f() {
        return this.f23170i.mo20363r();
    }
}
