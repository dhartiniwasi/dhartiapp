package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1516f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f4366a;

    public /* synthetic */ C1516f(Set set) {
        this.f4366a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m62924translateIntentPredicates$lambda8(this.f4366a, (Intent) obj);
    }
}
