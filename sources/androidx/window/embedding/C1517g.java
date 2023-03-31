package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

/* renamed from: androidx.window.embedding.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1517g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f4367a;

    /* renamed from: b */
    public final /* synthetic */ List f4368b;

    public /* synthetic */ C1517g(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f4367a = splitListenerWrapper;
        this.f4368b = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m62926accept$lambda1(this.f4367a, this.f4368b);
    }
}
