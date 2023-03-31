package p410yd;

import p217de.C9950a;
import p217de.C9951b;
import p243gd.C10339k;
import p272jd.C11565d;
import p272jd.C11569f;
import p344rd.C12439l;
import p344rd.C12443p;

/* renamed from: yd.l0 */
/* compiled from: CoroutineStart.kt */
public enum C13323l0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: yd.l0$a */
    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class C13324a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47645a = null;

        static {
            int[] iArr = new int[C13323l0.values().length];
            iArr[C13323l0.DEFAULT.ordinal()] = 1;
            iArr[C13323l0.ATOMIC.ordinal()] = 2;
            iArr[C13323l0.UNDISPATCHED.ordinal()] = 3;
            iArr[C13323l0.LAZY.ordinal()] = 4;
            f47645a = iArr;
        }
    }

    /* renamed from: b */
    public final <R, T> void mo38461b(C12443p<? super R, ? super C11565d<? super T>, ? extends Object> pVar, R r, C11565d<? super T> dVar) {
        int i = C13324a.f47645a[ordinal()];
        if (i == 1) {
            C9950a.m50943d(pVar, r, dVar, (C12439l) null, 4, (Object) null);
        } else if (i == 2) {
            C11569f.m56505a(pVar, r, dVar);
        } else if (i == 3) {
            C9951b.m50944a(pVar, r, dVar);
        } else if (i != 4) {
            throw new C10339k();
        }
    }

    /* renamed from: c */
    public final boolean mo38462c() {
        return this == LAZY;
    }
}
