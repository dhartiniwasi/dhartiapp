package p253he;

import java.util.concurrent.ThreadFactory;

/* renamed from: he.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10542d implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f41558a;

    /* renamed from: b */
    public final /* synthetic */ boolean f41559b;

    public /* synthetic */ C10542d(String str, boolean z) {
        this.f41558a = str;
        this.f41559b = z;
    }

    public final Thread newThread(Runnable runnable) {
        return C10543e.m53028A(this.f41558a, this.f41559b, runnable);
    }
}
