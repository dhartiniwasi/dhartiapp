package p190b7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p182a7.C6431n;
import p182a7.C6444t;

/* renamed from: b7.c0 */
/* compiled from: Multimaps */
public final class C6625c0 {

    /* renamed from: b7.c0$a */
    /* compiled from: Multimaps */
    private static class C6626a<K, V> extends C6624c<K, V> {

        /* renamed from: f */
        transient C6444t<? extends List<V>> f31093f;

        C6626a(Map<K, Collection<V>> map, C6444t<? extends List<V>> tVar) {
            super(map);
            this.f31093f = (C6444t) C6431n.m37561n(tVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<K, Collection<V>> mo22265c() {
            return mo22273q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<K> mo22266d() {
            return mo22274r();
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public List<V> mo22267o() {
            return (List) this.f31093f.get();
        }
    }

    /* renamed from: a */
    static boolean m38258a(C6714z<?, ?> zVar, Object obj) {
        if (obj == zVar) {
            return true;
        }
        if (obj instanceof C6714z) {
            return zVar.mo22260a().equals(((C6714z) obj).mo22260a());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> C6702v<K, V> m38259b(Map<K, Collection<V>> map, C6444t<? extends List<V>> tVar) {
        return new C6626a(map, tVar);
    }
}
