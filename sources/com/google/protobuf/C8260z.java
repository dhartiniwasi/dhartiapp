package com.google.protobuf;

import com.google.protobuf.C8088a;
import com.google.protobuf.C8105b2;
import com.google.protobuf.C8119d0;
import com.google.protobuf.C8139f;
import com.google.protobuf.C8240v;
import com.google.protobuf.C8243v0;
import com.google.protobuf.C8260z;
import com.google.protobuf.C8260z.C8261a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.z */
/* compiled from: GeneratedMessageLite */
public abstract class C8260z<MessageType extends C8260z<MessageType, BuilderType>, BuilderType extends C8261a<MessageType, BuilderType>> extends C8088a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C8260z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C8250w1 unknownFields = C8250w1.m45718c();

    /* renamed from: com.google.protobuf.z$a */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C8261a<MessageType extends C8260z<MessageType, BuilderType>, BuilderType extends C8261a<MessageType, BuilderType>> extends C8088a.C8089a<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f35195a;

        /* renamed from: b */
        protected MessageType f35196b;

        protected C8261a(MessageType messagetype) {
            this.f35195a = messagetype;
            if (!messagetype.mo27417J()) {
                this.f35196b = m45931C();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        /* renamed from: B */
        private static <MessageType> void m45930B(MessageType messagetype, MessageType messagetype2) {
            C8166i1.m44835a().mo26962d(messagetype).mo27197a(messagetype, messagetype2);
        }

        /* renamed from: C */
        private MessageType m45931C() {
            return this.f35195a.mo27421Q();
        }

        /* renamed from: A */
        public BuilderType mo27435A(MessageType messagetype) {
            if (mo27346a().equals(messagetype)) {
                return this;
            }
            mo27440u();
            m45930B(this.f35196b, messagetype);
            return this;
        }

        public final boolean isInitialized() {
            return C8260z.m45889I(this.f35196b, false);
        }

        /* renamed from: p */
        public final MessageType build() {
            MessageType r = mo27323U0();
            if (r.isInitialized()) {
                return r;
            }
            throw C8088a.C8089a.m44486o(r);
        }

        /* renamed from: r */
        public MessageType mo27323U0() {
            if (!this.f35196b.mo27417J()) {
                return this.f35196b;
            }
            this.f35196b.mo27418K();
            return this.f35196b;
        }

        /* renamed from: s */
        public BuilderType clone() {
            BuilderType O = mo27346a().mo27320i();
            O.f35196b = mo27323U0();
            return O;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public final void mo27440u() {
            if (!this.f35196b.mo27417J()) {
                mo27441v();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo27441v() {
            MessageType C = m45931C();
            m45930B(C, this.f35196b);
            this.f35196b = C;
        }

        /* renamed from: x */
        public MessageType mo27346a() {
            return this.f35195a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public BuilderType mo26779m(MessageType messagetype) {
            return mo27435A(messagetype);
        }

        /* renamed from: z */
        public BuilderType mo27322R0(C8167j jVar, C8210q qVar) throws IOException {
            mo27440u();
            try {
                C8166i1.m44835a().mo26962d(this.f35196b).mo27201e(this.f35196b, C8176k.m45055P(jVar), qVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* renamed from: com.google.protobuf.z$b */
    /* compiled from: GeneratedMessageLite */
    protected static class C8262b<T extends C8260z<T, ?>> extends C8100b<T> {

        /* renamed from: b */
        private final T f35197b;

        public C8262b(T t) {
            this.f35197b = t;
        }

        /* renamed from: i */
        public T mo26898c(C8167j jVar, C8210q qVar) throws C8135e0 {
            return C8260z.m45897V(this.f35197b, jVar, qVar);
        }
    }

    /* renamed from: com.google.protobuf.z$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C8263c<MessageType extends C8263c<MessageType, BuilderType>, BuilderType> extends C8260z<MessageType, BuilderType> implements C8249w0 {
        protected C8240v<C8264d> extensions = C8240v.m45656h();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C8243v0 mo27346a() {
            return C8260z.super.mo27346a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public C8240v<C8264d> mo27446a0() {
            if (this.extensions.mo27305o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C8243v0.C8244a mo27317b() {
            return C8260z.super.mo27317b();
        }

        /* renamed from: i */
        public /* bridge */ /* synthetic */ C8243v0.C8244a mo27320i() {
            return C8260z.super.mo27320i();
        }
    }

    /* renamed from: com.google.protobuf.z$d */
    /* compiled from: GeneratedMessageLite */
    static final class C8264d implements C8240v.C8242b<C8264d> {

        /* renamed from: a */
        final C8119d0.C8123d<?> f35198a;

        /* renamed from: b */
        final int f35199b;

        /* renamed from: c */
        final C8105b2.C8107b f35200c;

        /* renamed from: d */
        final boolean f35201d;

        /* renamed from: e */
        final boolean f35202e;

        /* renamed from: a */
        public int compareTo(C8264d dVar) {
            return this.f35199b - dVar.f35199b;
        }

        /* renamed from: b */
        public C8119d0.C8123d<?> mo27448b() {
            return this.f35198a;
        }

        /* renamed from: f */
        public int mo27311f() {
            return this.f35199b;
        }

        /* renamed from: g */
        public boolean mo27312g() {
            return this.f35201d;
        }

        /* renamed from: h */
        public C8105b2.C8107b mo27313h() {
            return this.f35200c;
        }

        /* renamed from: i */
        public C8243v0.C8244a mo27314i(C8243v0.C8244a aVar, C8243v0 v0Var) {
            return ((C8261a) aVar).mo27435A((C8260z) v0Var);
        }

        /* renamed from: l */
        public C8105b2.C8112c mo27315l() {
            return this.f35200c.mo26800a();
        }

        /* renamed from: m */
        public boolean mo27316m() {
            return this.f35202e;
        }
    }

    /* renamed from: com.google.protobuf.z$e */
    /* compiled from: GeneratedMessageLite */
    public static class C8265e<ContainingType extends C8243v0, Type> extends C8203o<ContainingType, Type> {

        /* renamed from: a */
        final C8243v0 f35203a;

        /* renamed from: b */
        final C8264d f35204b;

        /* renamed from: a */
        public C8105b2.C8107b mo27450a() {
            return this.f35204b.mo27313h();
        }

        /* renamed from: b */
        public C8243v0 mo27451b() {
            return this.f35203a;
        }

        /* renamed from: c */
        public int mo27452c() {
            return this.f35204b.mo27311f();
        }

        /* renamed from: d */
        public boolean mo27453d() {
            return this.f35204b.f35201d;
        }
    }

    /* renamed from: com.google.protobuf.z$f */
    /* compiled from: GeneratedMessageLite */
    public enum C8266f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: B */
    protected static C8119d0.C8126g m45885B() {
        return C8114c0.m44589j();
    }

    /* renamed from: C */
    protected static <E> C8119d0.C8130j<E> m45886C() {
        return C8175j1.m45050f();
    }

    /* renamed from: D */
    static <T extends C8260z<?, ?>> T m45887D(Class<T> cls) {
        T t = (C8260z) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C8260z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C8260z) C8268z1.m46013l(cls)).mo27346a();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: H */
    static Object m45888H(Method method, Object obj, Object... objArr) {
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

    /* renamed from: I */
    protected static final <T extends C8260z<T, ?>> boolean m45889I(T t, boolean z) {
        byte byteValue = ((Byte) t.mo27433y(C8266f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C8166i1.m44835a().mo26962d(t).mo27200d(t);
        if (z) {
            t.mo27434z(C8266f.SET_MEMOIZED_IS_INITIALIZED, d ? t : null);
        }
        return d;
    }

    /* renamed from: M */
    protected static C8119d0.C8126g m45890M(C8119d0.C8126g gVar) {
        int size = gVar.size();
        return gVar.mo26823m(size == 0 ? 10 : size * 2);
    }

    /* renamed from: N */
    protected static <E> C8119d0.C8130j<E> m45891N(C8119d0.C8130j<E> jVar) {
        int size = jVar.size();
        return jVar.mo26823m(size == 0 ? 10 : size * 2);
    }

    /* renamed from: P */
    protected static Object m45892P(C8243v0 v0Var, String str, Object[] objArr) {
        return new C8179k1(v0Var, str, objArr);
    }

    /* renamed from: R */
    protected static <T extends C8260z<T, ?>> T m45893R(T t, C8153i iVar) throws C8135e0 {
        return m45900r(m45894S(t, iVar, C8210q.m45546b()));
    }

    /* renamed from: S */
    protected static <T extends C8260z<T, ?>> T m45894S(T t, C8153i iVar, C8210q qVar) throws C8135e0 {
        return m45900r(m45896U(t, iVar, qVar));
    }

    /* renamed from: T */
    protected static <T extends C8260z<T, ?>> T m45895T(T t, byte[] bArr) throws C8135e0 {
        return m45900r(m45898W(t, bArr, 0, bArr.length, C8210q.m45546b()));
    }

    /* renamed from: U */
    private static <T extends C8260z<T, ?>> T m45896U(T t, C8153i iVar, C8210q qVar) throws C8135e0 {
        C8167j B = iVar.mo26878B();
        T V = m45897V(t, B, qVar);
        try {
            B.mo26971a(0);
            return V;
        } catch (C8135e0 e) {
            throw e.mo26894k(V);
        }
    }

    /* renamed from: V */
    static <T extends C8260z<T, ?>> T m45897V(T t, C8167j jVar, C8210q qVar) throws C8135e0 {
        T Q = t.mo27421Q();
        try {
            C8202n1 d = C8166i1.m44835a().mo26962d(Q);
            d.mo27201e(Q, C8176k.m45055P(jVar), qVar);
            d.mo27199c(Q);
            return Q;
        } catch (C8135e0 e) {
            e = e;
            if (e.mo26892a()) {
                e = new C8135e0((IOException) e);
            }
            throw e.mo26894k(Q);
        } catch (C8239u1 e2) {
            throw e2.mo27294a().mo26894k(Q);
        } catch (IOException e3) {
            if (e3.getCause() instanceof C8135e0) {
                throw ((C8135e0) e3.getCause());
            }
            throw new C8135e0(e3).mo26894k(Q);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C8135e0) {
                throw ((C8135e0) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: W */
    private static <T extends C8260z<T, ?>> T m45898W(T t, byte[] bArr, int i, int i2, C8210q qVar) throws C8135e0 {
        T Q = t.mo27421Q();
        try {
            C8202n1 d = C8166i1.m44835a().mo26962d(Q);
            d.mo27202f(Q, bArr, i, i + i2, new C8139f.C8141b(qVar));
            d.mo27199c(Q);
            return Q;
        } catch (C8135e0 e) {
            e = e;
            if (e.mo26892a()) {
                e = new C8135e0((IOException) e);
            }
            throw e.mo26894k(Q);
        } catch (C8239u1 e2) {
            throw e2.mo27294a().mo26894k(Q);
        } catch (IOException e3) {
            if (e3.getCause() instanceof C8135e0) {
                throw ((C8135e0) e3.getCause());
            }
            throw new C8135e0(e3).mo26894k(Q);
        } catch (IndexOutOfBoundsException unused) {
            throw C8135e0.m44692m().mo26894k(Q);
        }
    }

    /* renamed from: X */
    protected static <T extends C8260z<?, ?>> void m45899X(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
        t.mo27418K();
    }

    /* renamed from: r */
    private static <T extends C8260z<T, ?>> T m45900r(T t) throws C8135e0 {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.mo26776o().mo27294a().mo26894k(t);
    }

    /* renamed from: v */
    private int m45901v(C8202n1<?> n1Var) {
        if (n1Var == null) {
            return C8166i1.m44835a().mo26962d(this).mo27204h(this);
        }
        return n1Var.mo27204h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract Object mo22642A(C8266f fVar, Object obj, Object obj2);

    /* renamed from: E */
    public final MessageType mo27346a() {
        return (C8260z) mo27433y(C8266f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo27415F() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo27416G() {
        return mo27415F() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo27417J() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo27418K() {
        C8166i1.m44835a().mo26962d(this).mo27199c(this);
        mo27419L();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo27419L() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: O */
    public final BuilderType mo27320i() {
        return (C8261a) mo27433y(C8266f.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public MessageType mo27421Q() {
        return (C8260z) mo27433y(C8266f.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo27422Y(int i) {
        this.memoizedHashCode = i;
    }

    /* renamed from: Z */
    public final BuilderType mo27317b() {
        return ((C8261a) mo27433y(C8266f.NEW_BUILDER)).mo27435A(this);
    }

    /* renamed from: d */
    public void mo27318d(C8180l lVar) throws IOException {
        C8166i1.m44835a().mo26962d(this).mo27198b(this, C8191m.m45345P(lVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C8166i1.m44835a().mo26962d(this).mo27203g(this, (C8260z) obj);
        }
        return false;
    }

    /* renamed from: f */
    public int mo27319f() {
        return mo26775m((C8202n1) null);
    }

    public int hashCode() {
        if (mo27417J()) {
            return mo27430u();
        }
        if (mo27416G()) {
            mo27422Y(mo27430u());
        }
        return mo27415F();
    }

    public final boolean isInitialized() {
        return m45889I(this, true);
    }

    /* renamed from: j */
    public final C8143f1<MessageType> mo27321j() {
        return (C8143f1) mo27433y(C8266f.GET_PARSER);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo26774l() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo26775m(C8202n1 n1Var) {
        if (mo27417J()) {
            int v = m45901v(n1Var);
            if (v >= 0) {
                return v;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        } else if (mo26774l() != Integer.MAX_VALUE) {
            return mo26774l();
        } else {
            int v2 = m45901v(n1Var);
            mo26777p(v2);
            return v2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo26777p(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Object mo27426q() throws Exception {
        return mo27433y(C8266f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo27427s() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo27428t() {
        mo26777p(Integer.MAX_VALUE);
    }

    public String toString() {
        return C8252x0.m45753f(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo27430u() {
        return C8166i1.m44835a().mo26962d(this).mo27206j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final <MessageType extends C8260z<MessageType, BuilderType>, BuilderType extends C8261a<MessageType, BuilderType>> BuilderType mo27431w() {
        return (C8261a) mo27433y(C8266f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final <MessageType extends C8260z<MessageType, BuilderType>, BuilderType extends C8261a<MessageType, BuilderType>> BuilderType mo27432x(MessageType messagetype) {
        return mo27431w().mo27435A(messagetype);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Object mo27433y(C8266f fVar) {
        return mo22642A(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Object mo27434z(C8266f fVar, Object obj) {
        return mo22642A(fVar, obj, (Object) null);
    }
}
