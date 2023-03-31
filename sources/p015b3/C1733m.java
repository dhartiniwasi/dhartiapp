package p015b3;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p015b3.C1772x;
import p037e2.C4221r;
import p155v3.C5828l;
import p155v3.C5847t;
import p182a7.C6444t;

/* renamed from: b3.m */
/* compiled from: DefaultMediaSourceFactory */
public final class C1733m implements C1772x.C1773a {

    /* renamed from: a */
    private final C1734a f5133a;

    /* renamed from: b */
    private C5828l.C5829a f5134b;

    /* renamed from: c */
    private long f5135c;

    /* renamed from: d */
    private long f5136d;

    /* renamed from: e */
    private long f5137e;

    /* renamed from: f */
    private float f5138f;

    /* renamed from: g */
    private float f5139g;

    /* renamed from: b3.m$a */
    /* compiled from: DefaultMediaSourceFactory */
    private static final class C1734a {

        /* renamed from: a */
        private final C4221r f5140a;

        /* renamed from: b */
        private final Map<Integer, C6444t<C1772x.C1773a>> f5141b = new HashMap();

        /* renamed from: c */
        private final Set<Integer> f5142c = new HashSet();

        /* renamed from: d */
        private final Map<Integer, C1772x.C1773a> f5143d = new HashMap();

        /* renamed from: e */
        private C5828l.C5829a f5144e;

        public C1734a(C4221r rVar) {
            this.f5140a = rVar;
        }

        /* renamed from: a */
        public void mo6792a(C5828l.C5829a aVar) {
            if (aVar != this.f5144e) {
                this.f5144e = aVar;
                this.f5141b.clear();
                this.f5143d.clear();
            }
        }
    }

    public C1733m(Context context, C4221r rVar) {
        this((C5828l.C5829a) new C5847t.C5848a(context), rVar);
    }

    public C1733m(C5828l.C5829a aVar, C4221r rVar) {
        this.f5134b = aVar;
        C1734a aVar2 = new C1734a(rVar);
        this.f5133a = aVar2;
        aVar2.mo6792a(aVar);
        this.f5135c = -9223372036854775807L;
        this.f5136d = -9223372036854775807L;
        this.f5137e = -9223372036854775807L;
        this.f5138f = -3.4028235E38f;
        this.f5139g = -3.4028235E38f;
    }
}
