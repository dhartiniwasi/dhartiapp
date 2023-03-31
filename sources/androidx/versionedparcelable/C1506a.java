package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p124r.C5413a;
import p124r.C5415b;
import p152v0.C5755b;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: VersionedParcel */
public abstract class C1506a {

    /* renamed from: a */
    protected final C5413a<String, Method> f4345a;

    /* renamed from: b */
    protected final C5413a<String, Method> f4346b;

    /* renamed from: c */
    protected final C5413a<String, Class> f4347c;

    /* renamed from: androidx.versionedparcelable.a$a */
    /* compiled from: VersionedParcel */
    class C1507a extends ObjectInputStream {
        C1507a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            if (cls != null) {
                return cls;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public C1506a(C5413a<String, Method> aVar, C5413a<String, Method> aVar2, C5413a<String, Class> aVar3) {
        this.f4345a = aVar;
        this.f4346b = aVar2;
        this.f4347c = aVar3;
    }

    /* renamed from: T */
    private <T> void m6968T(Collection<T> collection) {
        if (collection == null) {
            mo5952X(-1);
            return;
        }
        int size = collection.size();
        mo5952X(size);
        if (size > 0) {
            int e = m6972e(collection.iterator().next());
            mo5952X(e);
            switch (e) {
                case 1:
                    for (T l0 : collection) {
                        mo5973l0(l0);
                    }
                    return;
                case 2:
                    for (T c0 : collection) {
                        mo5959c0(c0);
                    }
                    return;
                case 3:
                    for (T e0 : collection) {
                        m6973e0(e0);
                    }
                    return;
                case 4:
                    for (T g0 : collection) {
                        mo5963g0(g0);
                    }
                    return;
                case 5:
                    for (T i0 : collection) {
                        mo5967i0(i0);
                    }
                    return;
                case 7:
                    for (T intValue : collection) {
                        mo5952X(intValue.intValue());
                    }
                    return;
                case 8:
                    for (T floatValue : collection) {
                        mo5950V(floatValue.floatValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: U */
    private <T> void m6969U(Collection<T> collection, int i) {
        mo5940J(i);
        m6968T(collection);
    }

    /* renamed from: c */
    private Class m6970c(Class<? extends C5755b> cls) throws ClassNotFoundException {
        Class cls2 = this.f4347c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4347c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m6971d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<C1506a> cls = C1506a.class;
        Method method = this.f4345a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4345a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private <T> int m6972e(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof C5755b) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    /* renamed from: e0 */
    private void m6973e0(Serializable serializable) {
        if (serializable == null) {
            mo5963g0((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        mo5963g0(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            mo5946P(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
        }
    }

    /* renamed from: f */
    private Method m6974f(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f4346b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m6970c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1506a.class});
        this.f4346b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: n0 */
    private void m6975n0(C5755b bVar) {
        try {
            mo5963g0(m6970c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: p */
    private <T, S extends Collection<T>> S m6976p(S s) {
        int u = mo5982u();
        if (u < 0) {
            return null;
        }
        if (u != 0) {
            int u2 = mo5982u();
            if (u < 0) {
                return null;
            }
            if (u2 == 1) {
                while (u > 0) {
                    s.add(mo5938H());
                    u--;
                }
            } else if (u2 == 2) {
                while (u > 0) {
                    s.add(mo5987z());
                    u--;
                }
            } else if (u2 == 3) {
                while (u > 0) {
                    s.add(mo5932B());
                    u--;
                }
            } else if (u2 == 4) {
                while (u > 0) {
                    s.add(mo5934D());
                    u--;
                }
            } else if (u2 == 5) {
                while (u > 0) {
                    s.add(mo5936F());
                    u--;
                }
            }
        }
        return s;
    }

    /* renamed from: A */
    public <T extends Parcelable> T mo5931A(T t, int i) {
        if (!mo5978q(i)) {
            return t;
        }
        return mo5987z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public Serializable mo5932B() {
        String D = mo5934D();
        if (D == null) {
            return null;
        }
        try {
            return (Serializable) new C1507a(new ByteArrayInputStream(mo5972l())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + D + ")", e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + D + ")", e2);
        }
    }

    /* renamed from: C */
    public <T> Set<T> mo5933C(Set<T> set, int i) {
        if (!mo5978q(i)) {
            return set;
        }
        return (Set) m6976p(new C5415b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo5934D();

    /* renamed from: E */
    public String mo5935E(String str, int i) {
        if (!mo5978q(i)) {
            return str;
        }
        return mo5934D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract IBinder mo5936F();

    /* renamed from: G */
    public IBinder mo5937G(IBinder iBinder, int i) {
        if (!mo5978q(i)) {
            return iBinder;
        }
        return mo5936F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public <T extends C5755b> T mo5938H() {
        String D = mo5934D();
        if (D == null) {
            return null;
        }
        return mo5981t(D, mo5957b());
    }

    /* renamed from: I */
    public <T extends C5755b> T mo5939I(T t, int i) {
        if (!mo5978q(i)) {
            return t;
        }
        return mo5938H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract void mo5940J(int i);

    /* renamed from: K */
    public void mo5941K(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract void mo5942L(boolean z);

    /* renamed from: M */
    public void mo5943M(boolean z, int i) {
        mo5940J(i);
        mo5942L(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo5944N(Bundle bundle);

    /* renamed from: O */
    public void mo5945O(Bundle bundle, int i) {
        mo5940J(i);
        mo5944N(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract void mo5946P(byte[] bArr);

    /* renamed from: Q */
    public void mo5947Q(byte[] bArr, int i) {
        mo5940J(i);
        mo5946P(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract void mo5948R(CharSequence charSequence);

    /* renamed from: S */
    public void mo5949S(CharSequence charSequence, int i) {
        mo5940J(i);
        mo5948R(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract void mo5950V(float f);

    /* renamed from: W */
    public void mo5951W(float f, int i) {
        mo5940J(i);
        mo5950V(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public abstract void mo5952X(int i);

    /* renamed from: Y */
    public void mo5953Y(int i, int i2) {
        mo5940J(i2);
        mo5952X(i);
    }

    /* renamed from: Z */
    public <T> void mo5954Z(List<T> list, int i) {
        m6969U(list, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5955a();

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public abstract void mo5956a0(long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1506a mo5957b();

    /* renamed from: b0 */
    public void mo5958b0(long j, int i) {
        mo5940J(i);
        mo5956a0(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public abstract void mo5959c0(Parcelable parcelable);

    /* renamed from: d0 */
    public void mo5960d0(Parcelable parcelable, int i) {
        mo5940J(i);
        mo5959c0(parcelable);
    }

    /* renamed from: f0 */
    public <T> void mo5961f0(Set<T> set, int i) {
        m6969U(set, i);
    }

    /* renamed from: g */
    public boolean mo5962g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public abstract void mo5963g0(String str);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo5964h();

    /* renamed from: h0 */
    public void mo5965h0(String str, int i) {
        mo5940J(i);
        mo5963g0(str);
    }

    /* renamed from: i */
    public boolean mo5966i(boolean z, int i) {
        if (!mo5978q(i)) {
            return z;
        }
        return mo5964h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public abstract void mo5967i0(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Bundle mo5968j();

    /* renamed from: j0 */
    public void mo5969j0(IBinder iBinder, int i) {
        mo5940J(i);
        mo5967i0(iBinder);
    }

    /* renamed from: k */
    public Bundle mo5970k(Bundle bundle, int i) {
        if (!mo5978q(i)) {
            return bundle;
        }
        return mo5968j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public <T extends C5755b> void mo5971k0(T t, C1506a aVar) {
        try {
            m6974f(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract byte[] mo5972l();

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public void mo5973l0(C5755b bVar) {
        if (bVar == null) {
            mo5963g0((String) null);
            return;
        }
        m6975n0(bVar);
        C1506a b = mo5957b();
        mo5971k0(bVar, b);
        b.mo5955a();
    }

    /* renamed from: m */
    public byte[] mo5974m(byte[] bArr, int i) {
        if (!mo5978q(i)) {
            return bArr;
        }
        return mo5972l();
    }

    /* renamed from: m0 */
    public void mo5975m0(C5755b bVar, int i) {
        mo5940J(i);
        mo5973l0(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract CharSequence mo5976n();

    /* renamed from: o */
    public CharSequence mo5977o(CharSequence charSequence, int i) {
        if (!mo5978q(i)) {
            return charSequence;
        }
        return mo5976n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract boolean mo5978q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract float mo5979r();

    /* renamed from: s */
    public float mo5980s(float f, int i) {
        if (!mo5978q(i)) {
            return f;
        }
        return mo5979r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public <T extends C5755b> T mo5981t(String str, C1506a aVar) {
        try {
            return (C5755b) m6971d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo5982u();

    /* renamed from: v */
    public int mo5983v(int i, int i2) {
        if (!mo5978q(i2)) {
            return i;
        }
        return mo5982u();
    }

    /* renamed from: w */
    public <T> List<T> mo5984w(List<T> list, int i) {
        if (!mo5978q(i)) {
            return list;
        }
        return (List) m6976p(new ArrayList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract long mo5985x();

    /* renamed from: y */
    public long mo5986y(long j, int i) {
        if (!mo5978q(i)) {
            return j;
        }
        return mo5985x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract <T extends Parcelable> T mo5987z();
}
