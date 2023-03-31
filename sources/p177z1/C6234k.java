package p177z1;

import p015b3.C1780z0;
import p149u3.C5735s;
import p155v3.C5789b;
import p155v3.C5841q;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: z1.k */
/* compiled from: DefaultLoadControl */
public class C6234k implements C6295x1 {

    /* renamed from: a */
    private final C5841q f30011a;

    /* renamed from: b */
    private final long f30012b;

    /* renamed from: c */
    private final long f30013c;

    /* renamed from: d */
    private final long f30014d;

    /* renamed from: e */
    private final long f30015e;

    /* renamed from: f */
    private final int f30016f;

    /* renamed from: g */
    private final boolean f30017g;

    /* renamed from: h */
    private final long f30018h;

    /* renamed from: i */
    private final boolean f30019i;

    /* renamed from: j */
    private int f30020j;

    /* renamed from: k */
    private boolean f30021k;

    /* renamed from: z1.k$a */
    /* compiled from: DefaultLoadControl */
    public static final class C6235a {

        /* renamed from: a */
        private C5841q f30022a;

        /* renamed from: b */
        private int f30023b = 50000;

        /* renamed from: c */
        private int f30024c = 50000;

        /* renamed from: d */
        private int f30025d = 2500;

        /* renamed from: e */
        private int f30026e = 5000;

        /* renamed from: f */
        private int f30027f = -1;

        /* renamed from: g */
        private boolean f30028g = false;

        /* renamed from: h */
        private int f30029h = 0;

        /* renamed from: i */
        private boolean f30030i = false;

        /* renamed from: j */
        private boolean f30031j;

        /* renamed from: a */
        public C6234k mo21368a() {
            C5917a.m34873f(!this.f30031j);
            this.f30031j = true;
            if (this.f30022a == null) {
                this.f30022a = new C5841q(true, 65536);
            }
            return new C6234k(this.f30022a, this.f30023b, this.f30024c, this.f30025d, this.f30026e, this.f30027f, this.f30028g, this.f30029h, this.f30030i);
        }

        /* renamed from: b */
        public C6235a mo21369b(int i, boolean z) {
            C5917a.m34873f(!this.f30031j);
            C6234k.m36558j(i, 0, "backBufferDurationMs", "0");
            this.f30029h = i;
            this.f30030i = z;
            return this;
        }

        /* renamed from: c */
        public C6235a mo21370c(int i, int i2, int i3, int i4) {
            C5917a.m34873f(!this.f30031j);
            C6234k.m36558j(i3, 0, "bufferForPlaybackMs", "0");
            C6234k.m36558j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            C6234k.m36558j(i, i3, "minBufferMs", "bufferForPlaybackMs");
            C6234k.m36558j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            C6234k.m36558j(i2, i, "maxBufferMs", "minBufferMs");
            this.f30023b = i;
            this.f30024c = i2;
            this.f30025d = i3;
            this.f30026e = i4;
            return this;
        }

        /* renamed from: d */
        public C6235a mo21371d(boolean z) {
            C5917a.m34873f(!this.f30031j);
            this.f30028g = z;
            return this;
        }

        /* renamed from: e */
        public C6235a mo21372e(int i) {
            C5917a.m34873f(!this.f30031j);
            this.f30027f = i;
            return this;
        }
    }

    public C6234k() {
        this(new C5841q(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static void m36558j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C5917a.m34869b(z, str + " cannot be less than " + str2);
    }

    /* renamed from: l */
    private static int m36559l(int i) {
        switch (i) {
            case -2:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: m */
    private void m36560m(boolean z) {
        int i = this.f30016f;
        if (i == -1) {
            i = 13107200;
        }
        this.f30020j = i;
        this.f30021k = false;
        if (z) {
            this.f30011a.mo20387g();
        }
    }

    /* renamed from: a */
    public boolean mo21358a() {
        return this.f30019i;
    }

    /* renamed from: b */
    public long mo21359b() {
        return this.f30018h;
    }

    /* renamed from: c */
    public void mo21360c(C6211d3[] d3VarArr, C1780z0 z0Var, C5735s[] sVarArr) {
        int i = this.f30016f;
        if (i == -1) {
            i = mo21366k(d3VarArr, sVarArr);
        }
        this.f30020j = i;
        this.f30011a.mo20388h(i);
    }

    /* renamed from: d */
    public void mo21361d() {
        m36560m(true);
    }

    /* renamed from: e */
    public boolean mo21362e(long j, float f, boolean z, long j2) {
        long e0 = C5953m0.m35129e0(j, f);
        long j3 = z ? this.f30015e : this.f30014d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || e0 >= j3 || (!this.f30017g && this.f30011a.mo20386f() >= this.f30020j);
    }

    /* renamed from: f */
    public boolean mo21363f(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f30011a.mo20386f() >= this.f30020j;
        long j3 = this.f30012b;
        if (f > 1.0f) {
            j3 = Math.min(C5953m0.m35118Z(j3, f), this.f30013c);
        }
        if (j2 < Math.max(j3, 500000)) {
            if (!this.f30017g && z2) {
                z = false;
            }
            this.f30021k = z;
            if (!z && j2 < 500000) {
                C5961r.m35215i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f30013c || z2) {
            this.f30021k = false;
        }
        return this.f30021k;
    }

    /* renamed from: g */
    public C5789b mo21364g() {
        return this.f30011a;
    }

    /* renamed from: h */
    public void mo21365h() {
        m36560m(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo21366k(C6211d3[] d3VarArr, C5735s[] sVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < d3VarArr.length; i2++) {
            if (sVarArr[i2] != null) {
                i += m36559l(d3VarArr[i2].mo21220g());
            }
        }
        return Math.max(13107200, i);
    }

    public void onPrepared() {
        m36560m(false);
    }

    protected C6234k(C5841q qVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m36558j(i3, 0, "bufferForPlaybackMs", "0");
        m36558j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m36558j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m36558j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m36558j(i2, i, "maxBufferMs", "minBufferMs");
        m36558j(i6, 0, "backBufferDurationMs", "0");
        this.f30011a = qVar;
        this.f30012b = C5953m0.m35071B0((long) i);
        this.f30013c = C5953m0.m35071B0((long) i2);
        this.f30014d = C5953m0.m35071B0((long) i3);
        this.f30015e = C5953m0.m35071B0((long) i4);
        this.f30016f = i5;
        this.f30020j = i5 == -1 ? 13107200 : i5;
        this.f30017g = z;
        this.f30018h = C5953m0.m35071B0((long) i6);
        this.f30019i = z2;
    }
}
