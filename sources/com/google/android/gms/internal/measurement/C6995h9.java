package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C6944e9;
import com.google.android.gms.internal.measurement.C6995h9;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.h9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class C6995h9<MessageType extends C6995h9<MessageType, BuilderType>, BuilderType extends C6944e9<MessageType, BuilderType>> extends C7121p7<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C7157rb zzc = C7157rb.m40813c();
    private int zzd = -1;

    /* renamed from: A */
    static C6995h9 m40152A(Class cls) {
        Map map = zza;
        C6995h9 h9Var = (C6995h9) map.get(cls);
        if (h9Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                h9Var = (C6995h9) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (h9Var == null) {
            h9Var = (C6995h9) ((C6995h9) C6879ac.m39544j(cls)).mo23001B(6, (Object) null, (Object) null);
            if (h9Var != null) {
                map.put(cls, h9Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return h9Var;
    }

    /* renamed from: i */
    private final int m40153i(C7268ya yaVar) {
        if (yaVar == null) {
            return C7220va.m41045a().mo23957b(getClass()).mo23783b(this);
        }
        return yaVar.mo23783b(this);
    }

    /* renamed from: k */
    protected static C7059l9 m40154k() {
        return C7011i9.m40203f();
    }

    /* renamed from: l */
    protected static C7075m9 m40155l() {
        return C6911ca.m39876c();
    }

    /* renamed from: m */
    protected static C7075m9 m40156m(C7075m9 m9Var) {
        int size = m9Var.size();
        return m9Var.mo23258n(size == 0 ? 10 : size + size);
    }

    /* renamed from: n */
    protected static C7091n9 m40157n() {
        return C7236wa.m41066c();
    }

    /* renamed from: o */
    protected static C7091n9 m40158o(C7091n9 n9Var) {
        int size = n9Var.size();
        return n9Var.mo23012h(size == 0 ? 10 : size + size);
    }

    /* renamed from: p */
    static Object m40159p(Method method, Object obj, Object... objArr) {
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

    /* renamed from: r */
    protected static Object m40160r(C7092na naVar, String str, Object[] objArr) {
        return new C7252xa(naVar, str, objArr);
    }

    /* renamed from: u */
    protected static void m40161u(Class cls, C6995h9 h9Var) {
        zza.put(cls, h9Var);
        h9Var.mo23494s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract Object mo23001B(int i, Object obj, Object obj2);

    /* renamed from: b */
    public final void mo23486b(C7106o8 o8Var) throws IOException {
        C7220va.m41045a().mo23957b(getClass()).mo23789h(this, C7122p8.m40562b(o8Var));
    }

    /* renamed from: c */
    public final /* synthetic */ C7076ma mo23487c() {
        return (C6944e9) mo23001B(5, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final int mo23488d() {
        int i;
        if (mo23498w()) {
            i = m40153i((C7268ya) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m40153i((C7268ya) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final /* synthetic */ C7092na mo23489e() {
        return (C6995h9) mo23001B(6, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C7220va.m41045a().mo23957b(getClass()).mo23788g(this, (C6995h9) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo23491f(C7268ya yaVar) {
        if (mo23498w()) {
            int i = m40153i(yaVar);
            if (i >= 0) {
                return i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int i3 = m40153i(yaVar);
        if (i3 >= 0) {
            this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | i3;
            return i3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i3);
    }

    public final int hashCode() {
        if (mo23498w()) {
            return mo23499x();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int x = mo23499x();
        this.zzb = x;
        return x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C6995h9 mo23493j() {
        return (C6995h9) mo23001B(4, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo23494s() {
        C7220va.m41045a().mo23957b(getClass()).mo23786e(this);
        mo23495t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo23495t() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        return C7124pa.m40599a(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo23497v(int i) {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo23498w() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final int mo23499x() {
        return C7220va.m41045a().mo23957b(getClass()).mo23784c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C6944e9 mo23500y() {
        return (C6944e9) mo23001B(5, (Object) null, (Object) null);
    }

    /* renamed from: z */
    public final C6944e9 mo23501z() {
        C6944e9 e9Var = (C6944e9) mo23001B(5, (Object) null, (Object) null);
        e9Var.mo23355i(this);
        return e9Var;
    }
}
