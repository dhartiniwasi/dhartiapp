package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.C0823a;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p243gd.C10349s;

@ExperimentalWindowApi
/* compiled from: SplitController.kt */
public final class SplitController {
    public static final Companion Companion = new Companion((C11665g) null);
    /* access modifiers changed from: private */
    public static volatile SplitController globalInstance = null;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;

    /* compiled from: SplitController.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C11665g gVar) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = SplitController.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        Companion companion = SplitController.Companion;
                        SplitController.globalInstance = new SplitController((C11665g) null);
                    }
                    C10349s sVar = C10349s.f40964a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            SplitController access$getGlobalInstance$cp = SplitController.globalInstance;
            C11669k.m56784b(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final void initialize(Context context, int i) {
            C11669k.m56787e(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i);
            SplitController instance = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = C10518g0.m52943b();
            }
            instance.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = C10518g0.m52943b();
    }

    public /* synthetic */ SplitController(C11665g gVar) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i) {
        Companion.initialize(context, i);
    }

    /* access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, C0823a<List<SplitInfo>> aVar) {
        C11669k.m56787e(activity, "activity");
        C11669k.m56787e(executor, "executor");
        C11669k.m56787e(aVar, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, aVar);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return C10530r.m52976B(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule embeddingRule) {
        C11669k.m56787e(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }

    public final void removeSplitListener(C0823a<List<SplitInfo>> aVar) {
        C11669k.m56787e(aVar, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(aVar);
    }

    public final void unregisterRule(EmbeddingRule embeddingRule) {
        C11669k.m56787e(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
}
