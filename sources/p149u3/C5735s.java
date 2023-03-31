package p149u3;

import java.util.List;
import p015b3.C1772x;
import p015b3.C1776x0;
import p031d3.C4060f;
import p031d3.C4072n;
import p031d3.C4073o;
import p155v3.C5798f;
import p161w3.C5961r;
import p177z1.C6266q3;
import p177z1.C6272r1;

/* renamed from: u3.s */
/* compiled from: ExoTrackSelection */
public interface C5735s extends C5741v {

    /* renamed from: u3.s$a */
    /* compiled from: ExoTrackSelection */
    public static final class C5736a {

        /* renamed from: a */
        public final C1776x0 f28644a;

        /* renamed from: b */
        public final int[] f28645b;

        /* renamed from: c */
        public final int f28646c;

        public C5736a(C1776x0 x0Var, int... iArr) {
            this(x0Var, iArr, 0);
        }

        public C5736a(C1776x0 x0Var, int[] iArr, int i) {
            if (iArr.length == 0) {
                C5961r.m35210d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f28644a = x0Var;
            this.f28645b = iArr;
            this.f28646c = i;
        }
    }

    /* renamed from: u3.s$b */
    /* compiled from: ExoTrackSelection */
    public interface C5737b {
        /* renamed from: a */
        C5735s[] mo20131a(C5736a[] aVarArr, C5798f fVar, C1772x.C1774b bVar, C6266q3 q3Var);
    }

    /* renamed from: f */
    void mo20124f();

    /* renamed from: g */
    boolean mo20148g(long j, C4060f fVar, List<? extends C4072n> list);

    /* renamed from: h */
    void mo17829h(long j, long j2, long j3, List<? extends C4072n> list, C4073o[] oVarArr);

    /* renamed from: i */
    int mo17830i();

    /* renamed from: j */
    boolean mo20150j(int i, long j);

    /* renamed from: k */
    boolean mo20151k(int i, long j);

    /* renamed from: l */
    void mo20152l(boolean z);

    /* renamed from: m */
    void mo20125m();

    /* renamed from: n */
    int mo20126n(long j, List<? extends C4072n> list);

    /* renamed from: o */
    int mo20154o();

    /* renamed from: p */
    C6272r1 mo20155p();

    /* renamed from: q */
    int mo17831q();

    /* renamed from: r */
    void mo20127r(float f);

    /* renamed from: s */
    Object mo17832s();

    /* renamed from: t */
    void mo20156t();

    /* renamed from: u */
    void mo20157u();
}
