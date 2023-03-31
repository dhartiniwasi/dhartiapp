package p015b3;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p155v3.C5837p;

/* renamed from: b3.q */
/* compiled from: LoadEventInfo */
public final class C1748q {

    /* renamed from: h */
    private static final AtomicLong f5202h = new AtomicLong();

    /* renamed from: a */
    public final long f5203a;

    /* renamed from: b */
    public final C5837p f5204b;

    /* renamed from: c */
    public final Uri f5205c;

    /* renamed from: d */
    public final Map<String, List<String>> f5206d;

    /* renamed from: e */
    public final long f5207e;

    /* renamed from: f */
    public final long f5208f;

    /* renamed from: g */
    public final long f5209g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1748q(long r13, p155v3.C5837p r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f28881a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1748q.<init>(long, v3.p, long):void");
    }

    /* renamed from: a */
    public static long m8237a() {
        return f5202h.getAndIncrement();
    }

    public C1748q(long j, C5837p pVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f5203a = j;
        this.f5204b = pVar;
        this.f5205c = uri;
        this.f5206d = map;
        this.f5207e = j2;
        this.f5208f = j3;
        this.f5209g = j4;
    }
}
