package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.core.util.C0823a;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p243gd.C10349s;

@ExperimentalWindowApi
/* compiled from: ExtensionEmbeddingBackend.kt */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    public static final Companion Companion = new Companion((C11665g) null);
    private static final String TAG = "EmbeddingBackend";
    /* access modifiers changed from: private */
    public static volatile ExtensionEmbeddingBackend globalInstance;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    private EmbeddingInterfaceCompat embeddingExtension;
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks = new CopyOnWriteArrayList<>();
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;

    /* compiled from: ExtensionEmbeddingBackend.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C11665g gVar) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            EmbeddingCompat embeddingCompat = null;
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    embeddingCompat = new EmbeddingCompat();
                }
            } catch (Throwable th) {
                Log.d(ExtensionEmbeddingBackend.TAG, C11669k.m56792j("Failed to load embedding extension: ", th));
            }
            if (embeddingCompat == null) {
                Log.d(ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat;
        }

        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = ExtensionEmbeddingBackend.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension());
                    }
                    C10349s sVar = C10349s.f40964a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            ExtensionEmbeddingBackend access$getGlobalInstance$cp = ExtensionEmbeddingBackend.globalInstance;
            C11669k.m56784b(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final boolean isExtensionVersionSupported(Integer num) {
            return num != null && num.intValue() >= 1;
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo;
        final /* synthetic */ ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend extensionEmbeddingBackend) {
            C11669k.m56787e(extensionEmbeddingBackend, "this$0");
            this.this$0 = extensionEmbeddingBackend;
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        public void onSplitInfoChanged(List<SplitInfo> list) {
            C11669k.m56787e(list, "splitInfo");
            this.lastInfo = list;
            Iterator<SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(list);
            }
        }

        public final void setLastInfo(List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    public static final class SplitListenerWrapper {
        private final Activity activity;
        private final C0823a<List<SplitInfo>> callback;
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(Activity activity2, Executor executor2, C0823a<List<SplitInfo>> aVar) {
            C11669k.m56787e(activity2, "activity");
            C11669k.m56787e(executor2, "executor");
            C11669k.m56787e(aVar, "callback");
            this.activity = activity2;
            this.executor = executor2;
            this.callback = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: accept$lambda-1  reason: not valid java name */
        public static final void m62926accept$lambda1(SplitListenerWrapper splitListenerWrapper, List list) {
            C11669k.m56787e(splitListenerWrapper, "this$0");
            C11669k.m56787e(list, "$splitsWithActivity");
            splitListenerWrapper.getCallback().accept(list);
        }

        public final void accept(List<SplitInfo> list) {
            C11669k.m56787e(list, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((SplitInfo) next).contains(this.activity)) {
                    arrayList.add(next);
                }
            }
            if (!C11669k.m56783a(arrayList, this.lastValue)) {
                this.lastValue = arrayList;
                this.executor.execute(new C1517g(this, arrayList));
            }
        }

        public final C0823a<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    public void registerRule(EmbeddingRule embeddingRule) {
        C11669k.m56787e(embeddingRule, "rule");
        if (!this.splitRules.contains(embeddingRule)) {
            this.splitRules.add(embeddingRule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    public void registerSplitListenerForActivity(Activity activity, Executor executor, C0823a<List<SplitInfo>> aVar) {
        C11669k.m56787e(activity, "activity");
        C11669k.m56787e(executor, "executor");
        C11669k.m56787e(aVar, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                Log.v(TAG, "Extension not loaded, skipping callback registration.");
                aVar.accept(C10522j.m52968d());
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, aVar);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                C11669k.m56784b(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(C10522j.m52968d());
            }
            C10349s sVar = C10349s.f40964a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        C11669k.m56787e(set, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(set);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    public void unregisterRule(EmbeddingRule embeddingRule) {
        C11669k.m56787e(embeddingRule, "rule");
        if (this.splitRules.contains(embeddingRule)) {
            this.splitRules.remove(embeddingRule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    public void unregisterSplitListenerForActivity(C0823a<List<SplitInfo>> aVar) {
        C11669k.m56787e(aVar, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = getSplitChangeCallbacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (C11669k.m56783a(next.getCallback(), aVar)) {
                    getSplitChangeCallbacks().remove(next);
                    break;
                }
            }
            C10349s sVar = C10349s.f40964a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
