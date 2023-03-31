package kotlin.coroutines.jvm.internal;

import p272jd.C11565d;
import p272jd.C11570g;

/* renamed from: kotlin.coroutines.jvm.internal.c */
/* compiled from: ContinuationImpl.kt */
public final class C11647c implements C11565d<Object> {

    /* renamed from: a */
    public static final C11647c f44220a = new C11647c();

    private C11647c() {
    }

    public C11570g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
