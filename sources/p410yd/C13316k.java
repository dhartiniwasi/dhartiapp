package p410yd;

import p243gd.C10349s;
import p272jd.C11565d;
import p344rd.C12439l;

/* renamed from: yd.k */
/* compiled from: CancellableContinuation.kt */
public interface C13316k<T> extends C11565d<T> {

    /* renamed from: yd.k$a */
    /* compiled from: CancellableContinuation.kt */
    public static final class C13317a {
        /* renamed from: a */
        public static /* synthetic */ Object m62234a(C13316k kVar, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return kVar.mo38442a(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: a */
    Object mo38442a(T t, Object obj);

    /* renamed from: c */
    Object mo38443c(T t, Object obj, C12439l<? super Throwable, C10349s> lVar);

    /* renamed from: e */
    Object mo38444e(Throwable th);

    /* renamed from: i */
    void mo38445i(T t, C12439l<? super Throwable, C10349s> lVar);

    /* renamed from: j */
    void mo38446j(C12439l<? super Throwable, C10349s> lVar);

    /* renamed from: k */
    void mo38447k(Object obj);
}
