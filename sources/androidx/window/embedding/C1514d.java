package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

/* renamed from: androidx.window.embedding.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1514d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ SplitRule f4364a;

    public /* synthetic */ C1514d(SplitRule splitRule) {
        this.f4364a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m62925translateParentMetricsPredicate$lambda4(this.f4364a, (WindowMetrics) obj);
    }
}
