package p190b7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p182a7.C6431n;
import p182a7.C6444t;

/* renamed from: b7.b0 */
/* compiled from: MultimapBuilder */
public abstract class C6618b0<K0, V0> {

    /* renamed from: b7.b0$a */
    /* compiled from: MultimapBuilder */
    class C6619a extends C6622d<K0> {

        /* renamed from: a */
        final /* synthetic */ Comparator f31089a;

        C6619a(Comparator comparator) {
            this.f31089a = comparator;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo22255c() {
            return new TreeMap(this.f31089a);
        }
    }

    /* renamed from: b7.b0$b */
    /* compiled from: MultimapBuilder */
    private static final class C6620b<V> implements C6444t<List<V>>, Serializable {

        /* renamed from: a */
        private final int f31090a;

        C6620b(int i) {
            this.f31090a = C6652h.m38335b(i, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f31090a);
        }
    }

    /* renamed from: b7.b0$c */
    /* compiled from: MultimapBuilder */
    public static abstract class C6621c<K0, V0> extends C6618b0<K0, V0> {
        C6621c() {
            super((C6614a0) null);
        }

        /* renamed from: c */
        public abstract <K extends K0, V extends V0> C6702v<K, V> mo22257c();
    }

    /* renamed from: b7.b0$d */
    /* compiled from: MultimapBuilder */
    public static abstract class C6622d<K0> {

        /* renamed from: b7.b0$d$a */
        /* compiled from: MultimapBuilder */
        class C6623a extends C6621c<K0, Object> {

            /* renamed from: a */
            final /* synthetic */ int f31091a;

            C6623a(int i) {
                this.f31091a = i;
            }

            /* renamed from: c */
            public <K extends K0, V> C6702v<K, V> mo22257c() {
                return C6625c0.m38259b(C6622d.this.mo22255c(), new C6620b(this.f31091a));
            }
        }

        C6622d() {
        }

        /* renamed from: a */
        public C6621c<K0, Object> mo22258a() {
            return mo22259b(2);
        }

        /* renamed from: b */
        public C6621c<K0, Object> mo22259b(int i) {
            C6652h.m38335b(i, "expectedValuesPerKey");
            return new C6623a(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo22255c();
    }

    /* synthetic */ C6618b0(C6614a0 a0Var) {
        this();
    }

    /* renamed from: a */
    public static C6622d<Comparable> m38246a() {
        return m38247b(C6653h0.m38338b());
    }

    /* renamed from: b */
    public static <K0> C6622d<K0> m38247b(Comparator<K0> comparator) {
        C6431n.m37561n(comparator);
        return new C6619a(comparator);
    }

    private C6618b0() {
    }
}
