package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1512b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ EmbeddingAdapter f4360a;

    /* renamed from: b */
    public final /* synthetic */ Set f4361b;

    public /* synthetic */ C1512b(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f4360a = embeddingAdapter;
        this.f4361b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m62921translateActivityIntentPredicates$lambda3(this.f4360a, this.f4361b, (Pair) obj);
    }
}
