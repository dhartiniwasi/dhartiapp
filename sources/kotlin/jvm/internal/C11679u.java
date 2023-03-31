package kotlin.jvm.internal;

import p243gd.C10330c;
import p344rd.C12428a;
import p344rd.C12429b;
import p344rd.C12430c;
import p344rd.C12431d;
import p344rd.C12432e;
import p344rd.C12433f;
import p344rd.C12434g;
import p344rd.C12435h;
import p344rd.C12436i;
import p344rd.C12437j;
import p344rd.C12438k;
import p344rd.C12439l;
import p344rd.C12440m;
import p344rd.C12441n;
import p344rd.C12442o;
import p344rd.C12443p;
import p344rd.C12444q;
import p344rd.C12445r;
import p344rd.C12446s;
import p344rd.C12447t;
import p344rd.C12448u;
import p344rd.C12449v;
import p344rd.C12450w;

/* renamed from: kotlin.jvm.internal.u */
/* compiled from: TypeIntrinsics */
public class C11679u {
    /* renamed from: a */
    public static Object m56812a(Object obj, int i) {
        if (obj != null && !m56814c(obj, i)) {
            m56817f(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: b */
    public static int m56813b(Object obj) {
        if (obj instanceof C11666h) {
            return ((C11666h) obj).getArity();
        }
        if (obj instanceof C12428a) {
            return 0;
        }
        if (obj instanceof C12439l) {
            return 1;
        }
        if (obj instanceof C12443p) {
            return 2;
        }
        if (obj instanceof C12444q) {
            return 3;
        }
        if (obj instanceof C12445r) {
            return 4;
        }
        if (obj instanceof C12446s) {
            return 5;
        }
        if (obj instanceof C12447t) {
            return 6;
        }
        if (obj instanceof C12448u) {
            return 7;
        }
        if (obj instanceof C12449v) {
            return 8;
        }
        if (obj instanceof C12450w) {
            return 9;
        }
        if (obj instanceof C12429b) {
            return 10;
        }
        if (obj instanceof C12430c) {
            return 11;
        }
        if (obj instanceof C12431d) {
            return 12;
        }
        if (obj instanceof C12432e) {
            return 13;
        }
        if (obj instanceof C12433f) {
            return 14;
        }
        if (obj instanceof C12434g) {
            return 15;
        }
        if (obj instanceof C12435h) {
            return 16;
        }
        if (obj instanceof C12436i) {
            return 17;
        }
        if (obj instanceof C12437j) {
            return 18;
        }
        if (obj instanceof C12438k) {
            return 19;
        }
        if (obj instanceof C12440m) {
            return 20;
        }
        if (obj instanceof C12441n) {
            return 21;
        }
        return obj instanceof C12442o ? 22 : -1;
    }

    /* renamed from: c */
    public static boolean m56814c(Object obj, int i) {
        return (obj instanceof C10330c) && m56813b(obj) == i;
    }

    /* renamed from: d */
    private static <T extends Throwable> T m56815d(T t) {
        return C11669k.m56791i(t, C11679u.class.getName());
    }

    /* renamed from: e */
    public static ClassCastException m56816e(ClassCastException classCastException) {
        throw ((ClassCastException) m56815d(classCastException));
    }

    /* renamed from: f */
    public static void m56817f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m56818g(name + " cannot be cast to " + str);
    }

    /* renamed from: g */
    public static void m56818g(String str) {
        throw m56816e(new ClassCastException(str));
    }
}
