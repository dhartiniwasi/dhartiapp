package p144t5;

import java.util.concurrent.ThreadFactory;

/* renamed from: t5.e1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class C5545e1 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ C5549f1 f28081a;

    /* renamed from: b */
    public final /* synthetic */ String f28082b = "Google consent worker";

    public /* synthetic */ C5545e1(C5549f1 f1Var, String str) {
        this.f28081a = f1Var;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f28081a.mo19850b(this.f28082b, runnable);
    }
}
