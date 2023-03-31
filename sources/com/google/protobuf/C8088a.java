package com.google.protobuf;

import com.google.protobuf.C8088a;
import com.google.protobuf.C8088a.C8089a;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8243v0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a */
/* compiled from: AbstractMessageLite */
public abstract class C8088a<MessageType extends C8088a<MessageType, BuilderType>, BuilderType extends C8089a<MessageType, BuilderType>> implements C8243v0 {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C8089a<MessageType extends C8088a<MessageType, BuilderType>, BuilderType extends C8089a<MessageType, BuilderType>> implements C8243v0.C8244a {
        /* renamed from: k */
        protected static <T> void m44484k(Iterable<T> iterable, List<? super T> list) {
            C8119d0.m44649a(iterable);
            if (iterable instanceof C8178k0) {
                List<?> r0 = ((C8178k0) iterable).mo27032r0();
                C8178k0 k0Var = (C8178k0) list;
                int size = list.size();
                for (Object next : r0) {
                    if (next == null) {
                        String str = "Element at index " + (k0Var.size() - size) + " is null.";
                        for (int size2 = k0Var.size() - 1; size2 >= size; size2--) {
                            k0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C8153i) {
                        k0Var.mo27022Q((C8153i) next);
                    } else {
                        k0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C8146g1) {
                list.addAll((Collection) iterable);
            } else {
                m44485l(iterable, list);
            }
        }

        /* renamed from: l */
        private static <T> void m44485l(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: o */
        protected static C8239u1 m44486o(C8243v0 v0Var) {
            return new C8239u1(v0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract BuilderType mo26779m(MessageType messagetype);

        /* renamed from: n */
        public BuilderType mo26778M0(C8243v0 v0Var) {
            if (mo27346a().getClass().isInstance(v0Var)) {
                return mo26779m((C8088a) v0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: k */
    protected static <T> void m44475k(Iterable<T> iterable, List<? super T> list) {
        C8089a.m44484k(iterable, list);
    }

    /* renamed from: n */
    private String m44476n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: c */
    public void mo26771c(OutputStream outputStream) throws IOException {
        C8180l f0 = C8180l.m45148f0(outputStream, C8180l.m45126J(mo27319f()));
        mo27318d(f0);
        f0.mo27117c0();
    }

    /* renamed from: e */
    public C8153i mo26772e() {
        try {
            C8153i.C8161h A = C8153i.m44766A(mo27319f());
            mo27318d(A.mo26954b());
            return A.mo26953a();
        } catch (IOException e) {
            throw new RuntimeException(m44476n("ByteString"), e);
        }
    }

    /* renamed from: h */
    public byte[] mo26773h() {
        try {
            byte[] bArr = new byte[mo27319f()];
            C8180l g0 = C8180l.m45150g0(bArr);
            mo27318d(g0);
            g0.mo27118d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m44476n("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo26774l() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo26775m(C8202n1 n1Var) {
        int l = mo26774l();
        if (l != -1) {
            return l;
        }
        int h = n1Var.mo27204h(this);
        mo26777p(h);
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C8239u1 mo26776o() {
        return new C8239u1(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo26777p(int i) {
        throw new UnsupportedOperationException();
    }
}
