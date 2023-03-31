package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.px3;
import com.google.android.gms.internal.ads.sx3;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class sx3<MessageType extends sx3<MessageType, BuilderType>, BuilderType extends px3<MessageType, BuilderType>> extends sv3<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected o04 zzc = o04.m17404c();
    protected int zzd = -1;

    /* renamed from: A */
    protected static Object m20700A(cz3 cz3, String str, Object[] objArr) {
        return new mz3(cz3, str, objArr);
    }

    /* renamed from: B */
    protected static void m20701B(Class cls, sx3 sx3) {
        zzb.put(cls, sx3);
    }

    /* renamed from: F */
    private static sx3 m20702F(sx3 sx3, byte[] bArr, int i, int i2, ex3 ex3) throws ey3 {
        sx3 sx32 = (sx3) sx3.mo8196E(4, (Object) null, (Object) null);
        try {
            wz3 b = kz3.m15715a().mo11837b(sx32.getClass());
            b.mo10368j(sx32, bArr, 0, i2, new vv3(ex3));
            b.mo10363e(sx32);
            if (sx32.zza == 0) {
                return sx32;
            }
            throw new RuntimeException();
        } catch (ey3 e) {
            e = e;
            if (e.mo10048l()) {
                e = new ey3((IOException) e);
            }
            e.mo10046h(sx32);
            throw e;
        } catch (m04 e2) {
            ey3 a = e2.mo12250a();
            a.mo10046h(sx32);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof ey3) {
                throw ((ey3) e3.getCause());
            }
            ey3 ey3 = new ey3(e3);
            ey3.mo10046h(sx32);
            throw ey3;
        } catch (IndexOutOfBoundsException unused) {
            ey3 j = ey3.m12345j();
            j.mo10046h(sx32);
            throw j;
        }
    }

    /* renamed from: k */
    private static sx3 m20703k(sx3 sx3) throws ey3 {
        if (sx3 == null || sx3.mo14159C()) {
            return sx3;
        }
        ey3 a = new m04(sx3).mo12250a();
        a.mo10046h(sx3);
        throw a;
    }

    /* renamed from: n */
    static sx3 m20704n(Class cls) {
        Map map = zzb;
        sx3 sx3 = (sx3) map.get(cls);
        if (sx3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sx3 = (sx3) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (sx3 == null) {
            sx3 = (sx3) ((sx3) y04.m23665o(cls)).mo8196E(6, (Object) null, (Object) null);
            if (sx3 != null) {
                map.put(cls, sx3);
            } else {
                throw new IllegalStateException();
            }
        }
        return sx3;
    }

    /* renamed from: o */
    protected static sx3 m20705o(sx3 sx3, jw3 jw3) throws ey3 {
        ex3 a = ex3.m12308a();
        sw3 x = jw3.mo10324x();
        sx3 sx32 = (sx3) sx3.mo8196E(4, (Object) null, (Object) null);
        try {
            wz3 b = kz3.m15715a().mo11837b(sx32.getClass());
            b.mo10366h(sx32, tw3.m21284J(x), a);
            b.mo10363e(sx32);
            try {
                x.mo12177B(0);
                m20703k(sx32);
                m20703k(sx32);
                return sx32;
            } catch (ey3 e) {
                e.mo10046h(sx32);
                throw e;
            }
        } catch (ey3 e2) {
            e = e2;
            if (e.mo10048l()) {
                e = new ey3((IOException) e);
            }
            e.mo10046h(sx32);
            throw e;
        } catch (m04 e3) {
            ey3 a2 = e3.mo12250a();
            a2.mo10046h(sx32);
            throw a2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof ey3) {
                throw ((ey3) e4.getCause());
            }
            ey3 ey3 = new ey3(e4);
            ey3.mo10046h(sx32);
            throw ey3;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof ey3) {
                throw ((ey3) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: p */
    protected static sx3 m20706p(sx3 sx3, byte[] bArr) throws ey3 {
        sx3 F = m20702F(sx3, bArr, 0, bArr.length, ex3.m12308a());
        m20703k(F);
        return F;
    }

    /* renamed from: q */
    protected static sx3 m20707q(sx3 sx3, jw3 jw3, ex3 ex3) throws ey3 {
        sw3 x = jw3.mo10324x();
        sx3 sx32 = (sx3) sx3.mo8196E(4, (Object) null, (Object) null);
        try {
            wz3 b = kz3.m15715a().mo11837b(sx32.getClass());
            b.mo10366h(sx32, tw3.m21284J(x), ex3);
            b.mo10363e(sx32);
            try {
                x.mo12177B(0);
                m20703k(sx32);
                return sx32;
            } catch (ey3 e) {
                e.mo10046h(sx32);
                throw e;
            }
        } catch (ey3 e2) {
            e = e2;
            if (e.mo10048l()) {
                e = new ey3((IOException) e);
            }
            e.mo10046h(sx32);
            throw e;
        } catch (m04 e3) {
            ey3 a = e3.mo12250a();
            a.mo10046h(sx32);
            throw a;
        } catch (IOException e4) {
            if (e4.getCause() instanceof ey3) {
                throw ((ey3) e4.getCause());
            }
            ey3 ey3 = new ey3(e4);
            ey3.mo10046h(sx32);
            throw ey3;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof ey3) {
                throw ((ey3) e5.getCause());
            }
            throw e5;
        }
    }

    /* renamed from: r */
    protected static sx3 m20708r(sx3 sx3, InputStream inputStream, ex3 ex3) throws ey3 {
        sw3 g = sw3.m20671g(inputStream, 4096);
        sx3 sx32 = (sx3) sx3.mo8196E(4, (Object) null, (Object) null);
        try {
            wz3 b = kz3.m15715a().mo11837b(sx32.getClass());
            b.mo10366h(sx32, tw3.m21284J(g), ex3);
            b.mo10363e(sx32);
            m20703k(sx32);
            return sx32;
        } catch (ey3 e) {
            e = e;
            if (e.mo10048l()) {
                e = new ey3((IOException) e);
            }
            e.mo10046h(sx32);
            throw e;
        } catch (m04 e2) {
            ey3 a = e2.mo12250a();
            a.mo10046h(sx32);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof ey3) {
                throw ((ey3) e3.getCause());
            }
            ey3 ey3 = new ey3(e3);
            ey3.mo10046h(sx32);
            throw ey3;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ey3) {
                throw ((ey3) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: s */
    protected static sx3 m20709s(sx3 sx3, byte[] bArr, ex3 ex3) throws ey3 {
        sx3 F = m20702F(sx3, bArr, 0, bArr.length, ex3);
        m20703k(F);
        return F;
    }

    /* renamed from: t */
    protected static xx3 m20710t() {
        return tx3.m21338f();
    }

    /* renamed from: u */
    protected static xx3 m20711u(xx3 xx3) {
        int size = xx3.size();
        return xx3.mo14420f0(size == 0 ? 10 : size + size);
    }

    /* renamed from: v */
    protected static ay3 m20712v() {
        return ry3.m20076f();
    }

    /* renamed from: x */
    protected static by3 m20713x() {
        return lz3.m16326c();
    }

    /* renamed from: y */
    protected static by3 m20714y(by3 by3) {
        int size = by3.size();
        return by3.mo8975h(size == 0 ? 10 : size + size);
    }

    /* renamed from: z */
    static Object m20715z(Method method, Object obj, Object... objArr) {
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

    /* renamed from: C */
    public final boolean mo14159C() {
        byte byteValue = ((Byte) mo8196E(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = kz3.m15715a().mo11837b(getClass()).mo10362d(this);
        mo8196E(2, true != d ? null : this, (Object) null);
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final px3 mo14160D() {
        return (px3) mo8196E(5, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract Object mo8196E(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final /* synthetic */ bz3 mo9399a() {
        px3 px3 = (px3) mo8196E(5, (Object) null, (Object) null);
        px3.mo13421j(this);
        return px3;
    }

    /* renamed from: c */
    public final /* synthetic */ cz3 mo9745c() {
        return (sx3) mo8196E(6, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final /* synthetic */ bz3 mo9401d() {
        return (px3) mo8196E(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return kz3.m15715a().mo11837b(getClass()).mo10365g(this, (sx3) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo9403f(zw3 zw3) throws IOException {
        kz3.m15715a().mo11837b(getClass()).mo10367i(this, ax3.m10092l(zw3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14147g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c = kz3.m15715a().mo11837b(getClass()).mo10361c(this);
        this.zza = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo14148i(int i) {
        this.zzd = i;
    }

    /* renamed from: l */
    public final int mo9404l() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int b = kz3.m15715a().mo11837b(getClass()).mo10360b(this);
        this.zzd = b;
        return b;
    }

    /* renamed from: m */
    public final px3 mo14163m() {
        px3 px3 = (px3) mo8196E(5, (Object) null, (Object) null);
        px3.mo13421j(this);
        return px3;
    }

    public final String toString() {
        return ez3.m12372a(this, super.toString());
    }
}
