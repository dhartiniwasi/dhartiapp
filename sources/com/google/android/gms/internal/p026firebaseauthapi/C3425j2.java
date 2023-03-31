package com.google.android.gms.internal.p026firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p026firebaseauthapi.C3326g2;
import com.google.android.gms.internal.p026firebaseauthapi.C3425j2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3425j2<MessageType extends C3425j2<MessageType, BuilderType>, BuilderType extends C3326g2<MessageType, BuilderType>> extends C3621p0<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected C3757t4 zzc = C3757t4.m26978c();
    private int zzd = -1;

    /* renamed from: d */
    protected static C3590o2 m25859d(C3590o2 o2Var) {
        int size = o2Var.size();
        return o2Var.mo15892h(size == 0 ? 10 : size + size);
    }

    /* renamed from: e */
    static Object m25860e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: f */
    protected static Object m25861f(C3591o3 o3Var, String str, Object[] objArr) {
        return new C3918y3(o3Var, str, objArr);
    }

    /* renamed from: j */
    protected static void m25862j(Class cls, C3425j2 j2Var) {
        zzb.put(cls, j2Var);
        j2Var.mo16203g();
    }

    /* renamed from: n */
    private final int m25863n(C3130a4 a4Var) {
        if (a4Var == null) {
            return C3854w3.m27268a().mo16976b(getClass()).mo15700b(this);
        }
        return a4Var.mo15700b(this);
    }

    /* renamed from: o */
    private static C3425j2 m25864o(C3425j2 j2Var) throws C3689r2 {
        if (j2Var == null || j2Var.mo16207l()) {
            return j2Var;
        }
        C3689r2 a = new C3691r4(j2Var).mo16667a();
        a.mo16665h(j2Var);
        throw a;
    }

    /* renamed from: p */
    private static C3425j2 m25865p(C3425j2 j2Var, byte[] bArr, int i, int i2, C3852w1 w1Var) throws C3689r2 {
        C3425j2 v = j2Var.mo16214v();
        try {
            C3130a4 b = C3854w3.m27268a().mo16976b(v.getClass());
            b.mo15706h(v, bArr, 0, i2, new C3720s0(w1Var));
            b.mo15703e(v);
            return v;
        } catch (C3689r2 e) {
            e.mo16665h(v);
            throw e;
        } catch (C3691r4 e2) {
            C3689r2 a = e2.mo16667a();
            a.mo16665h(v);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C3689r2) {
                throw ((C3689r2) e3.getCause());
            }
            C3689r2 r2Var = new C3689r2(e3);
            r2Var.mo16665h(v);
            throw r2Var;
        } catch (IndexOutOfBoundsException unused) {
            C3689r2 i3 = C3689r2.m26703i();
            i3.mo16665h(v);
            throw i3;
        }
    }

    /* renamed from: u */
    static C3425j2 m25866u(Class cls) {
        Map map = zzb;
        C3425j2 j2Var = (C3425j2) map.get(cls);
        if (j2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                j2Var = (C3425j2) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (j2Var == null) {
            j2Var = (C3425j2) ((C3425j2) C3197c5.m25302j(cls)).mo15734q(6, (Object) null, (Object) null);
            if (j2Var != null) {
                map.put(cls, j2Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return j2Var;
    }

    /* renamed from: w */
    protected static C3425j2 m25867w(C3425j2 j2Var, C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        C3457k1 l = g1Var.mo15879l();
        C3425j2 v = j2Var.mo16214v();
        try {
            C3130a4 b = C3854w3.m27268a().mo16976b(v.getClass());
            b.mo15708j(v, C3490l1.m26037H(l), w1Var);
            b.mo15703e(v);
            try {
                l.mo16129g(0);
                m25864o(v);
                return v;
            } catch (C3689r2 e) {
                e.mo16665h(v);
                throw e;
            }
        } catch (C3689r2 e2) {
            e2.mo16665h(v);
            throw e2;
        } catch (C3691r4 e3) {
            C3689r2 a = e3.mo16667a();
            a.mo16665h(v);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C3689r2) {
                throw ((C3689r2) e4.getCause());
            }
            C3689r2 r2Var = new C3689r2(e4);
            r2Var.mo16665h(v);
            throw r2Var;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C3689r2) {
                throw ((C3689r2) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: x */
    protected static C3425j2 m25868x(C3425j2 j2Var, byte[] bArr, C3852w1 w1Var) throws C3689r2 {
        C3425j2 p = m25865p(j2Var, bArr, 0, bArr.length, w1Var);
        m25864o(p);
        return p;
    }

    /* renamed from: y */
    protected static C3590o2 m25869y() {
        return C3886x3.m27348c();
    }

    /* renamed from: I */
    public final /* synthetic */ C3591o3 mo16198I() {
        return (C3425j2) mo15734q(6, (Object) null, (Object) null);
    }

    /* renamed from: a */
    public final void mo16199a(C3688r1 r1Var) throws IOException {
        C3854w3.m27268a().mo16976b(getClass()).mo15707i(this, C3721s1.m26818l(r1Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo16200b(C3130a4 a4Var) {
        if (mo16209m()) {
            int n = m25863n(a4Var);
            if (n >= 0) {
                return n;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + n);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int n2 = m25863n(a4Var);
        if (n2 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | n2;
            return n2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + n2);
    }

    /* renamed from: d0 */
    public final int mo16201d0() {
        int i;
        if (mo16209m()) {
            i = m25863n((C3130a4) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m25863n((C3130a4) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C3854w3.m27268a().mo16976b(getClass()).mo15705g(this, (C3425j2) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo16203g() {
        C3854w3.m27268a().mo16976b(getClass()).mo15703e(this);
        mo16205i();
    }

    public final int hashCode() {
        if (mo16209m()) {
            return mo16210r();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int r = mo16210r();
        this.zza = r;
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo16205i() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo16206k(int i) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    /* renamed from: l */
    public final boolean mo16207l() {
        byte byteValue = ((Byte) mo15734q(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C3854w3.m27268a().mo16976b(getClass()).mo15702d(this);
        mo15734q(2, true != d ? null : this, (Object) null);
        return d;
    }

    /* renamed from: l0 */
    public final /* synthetic */ C3558n3 mo16208l0() {
        return (C3326g2) mo15734q(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo16209m() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Object mo15734q(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo16210r() {
        return C3854w3.m27268a().mo16976b(getClass()).mo15701c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final C3326g2 mo16211s() {
        return (C3326g2) mo15734q(5, (Object) null, (Object) null);
    }

    /* renamed from: t */
    public final C3326g2 mo16212t() {
        C3326g2 g2Var = (C3326g2) mo15734q(5, (Object) null, (Object) null);
        g2Var.mo16061d(this);
        return g2Var;
    }

    public final String toString() {
        return C3657q3.m26538a(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C3425j2 mo16214v() {
        return (C3425j2) mo15734q(4, (Object) null, (Object) null);
    }
}
