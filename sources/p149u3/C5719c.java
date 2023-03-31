package p149u3;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p015b3.C1776x0;
import p031d3.C4060f;
import p031d3.C4072n;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: u3.c */
/* compiled from: BaseTrackSelection */
public abstract class C5719c implements C5735s {

    /* renamed from: a */
    protected final C1776x0 f28533a;

    /* renamed from: b */
    protected final int f28534b;

    /* renamed from: c */
    protected final int[] f28535c;

    /* renamed from: d */
    private final int f28536d;

    /* renamed from: e */
    private final C6272r1[] f28537e;

    /* renamed from: f */
    private final long[] f28538f;

    /* renamed from: g */
    private int f28539g;

    public C5719c(C1776x0 x0Var, int... iArr) {
        this(x0Var, iArr, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ int m34090w(C6272r1 r1Var, C6272r1 r1Var2) {
        return r1Var2.f30239h - r1Var.f30239h;
    }

    /* renamed from: a */
    public final C1776x0 mo20142a() {
        return this.f28533a;
    }

    /* renamed from: b */
    public final int mo20143b(C6272r1 r1Var) {
        for (int i = 0; i < this.f28534b; i++) {
            if (this.f28537e[i] == r1Var) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final C6272r1 mo20144c(int i) {
        return this.f28537e[i];
    }

    /* renamed from: d */
    public final int mo20145d(int i) {
        return this.f28535c[i];
    }

    /* renamed from: e */
    public final int mo20146e(int i) {
        for (int i2 = 0; i2 < this.f28534b; i2++) {
            if (this.f28535c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5719c cVar = (C5719c) obj;
        if (this.f28533a != cVar.f28533a || !Arrays.equals(this.f28535c, cVar.f28535c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo20124f() {
    }

    /* renamed from: g */
    public /* synthetic */ boolean mo20148g(long j, C4060f fVar, List list) {
        return C5734r.m34247d(this, j, fVar, list);
    }

    public int hashCode() {
        if (this.f28539g == 0) {
            this.f28539g = (System.identityHashCode(this.f28533a) * 31) + Arrays.hashCode(this.f28535c);
        }
        return this.f28539g;
    }

    /* renamed from: j */
    public boolean mo20150j(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean k = mo20151k(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f28534b && !k) {
            k = i2 != i && !mo20151k(i2, elapsedRealtime);
            i2++;
        }
        if (!k) {
            return false;
        }
        long[] jArr = this.f28538f;
        jArr[i] = Math.max(jArr[i], C5953m0.m35122b(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    /* renamed from: k */
    public boolean mo20151k(int i, long j) {
        return this.f28538f[i] > j;
    }

    /* renamed from: l */
    public /* synthetic */ void mo20152l(boolean z) {
        C5734r.m34245b(this, z);
    }

    public final int length() {
        return this.f28535c.length;
    }

    /* renamed from: m */
    public void mo20125m() {
    }

    /* renamed from: n */
    public int mo20126n(long j, List<? extends C4072n> list) {
        return list.size();
    }

    /* renamed from: o */
    public final int mo20154o() {
        return this.f28535c[mo17830i()];
    }

    /* renamed from: p */
    public final C6272r1 mo20155p() {
        return this.f28537e[mo17830i()];
    }

    /* renamed from: r */
    public void mo20127r(float f) {
    }

    /* renamed from: t */
    public /* synthetic */ void mo20156t() {
        C5734r.m34244a(this);
    }

    /* renamed from: u */
    public /* synthetic */ void mo20157u() {
        C5734r.m34246c(this);
    }

    public C5719c(C1776x0 x0Var, int[] iArr, int i) {
        int i2 = 0;
        C5917a.m34873f(iArr.length > 0);
        this.f28536d = i;
        this.f28533a = (C1776x0) C5917a.m34872e(x0Var);
        int length = iArr.length;
        this.f28534b = length;
        this.f28537e = new C6272r1[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f28537e[i3] = x0Var.mo6897b(iArr[i3]);
        }
        Arrays.sort(this.f28537e, C12664b.f46429a);
        this.f28535c = new int[this.f28534b];
        while (true) {
            int i4 = this.f28534b;
            if (i2 < i4) {
                this.f28535c[i2] = x0Var.mo6898c(this.f28537e[i2]);
                i2++;
            } else {
                this.f28538f = new long[i4];
                return;
            }
        }
    }
}
