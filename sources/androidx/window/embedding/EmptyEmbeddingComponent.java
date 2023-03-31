package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.C11669k;

/* compiled from: EmbeddingCompat.kt */
final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent {
    public void setEmbeddingRules(Set<EmbeddingRule> set) {
        C11669k.m56787e(set, "splitRules");
    }

    public void setSplitInfoCallback(Consumer<List<SplitInfo>> consumer) {
        C11669k.m56787e(consumer, "consumer");
    }
}
