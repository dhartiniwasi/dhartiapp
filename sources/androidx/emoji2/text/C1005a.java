package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1005a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f2713a;

    public /* synthetic */ C1005a(String str) {
        this.f2713a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C1006b.m4523c(this.f2713a, runnable);
    }
}
