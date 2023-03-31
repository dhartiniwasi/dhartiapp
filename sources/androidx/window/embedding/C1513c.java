package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1513c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ EmbeddingAdapter f4362a;

    /* renamed from: b */
    public final /* synthetic */ Set f4363b;

    public /* synthetic */ C1513c(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f4362a = embeddingAdapter;
        this.f4363b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m62922translateActivityPairPredicates$lambda1(this.f4362a, this.f4363b, (Pair) obj);
    }
}
