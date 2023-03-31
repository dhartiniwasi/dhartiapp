package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1515e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f4365a;

    public /* synthetic */ C1515e(Set set) {
        this.f4365a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m62923translateActivityPredicates$lambda6(this.f4365a, (Activity) obj);
    }
}
