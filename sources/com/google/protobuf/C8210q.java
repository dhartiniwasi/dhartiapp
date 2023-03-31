package com.google.protobuf;

import com.google.protobuf.C8260z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.q */
/* compiled from: ExtensionRegistryLite */
public class C8210q {

    /* renamed from: b */
    private static boolean f35045b = true;

    /* renamed from: c */
    private static volatile C8210q f35046c;

    /* renamed from: d */
    static final C8210q f35047d = new C8210q(true);

    /* renamed from: a */
    private final Map<C8211a, C8260z.C8265e<?, ?>> f35048a;

    /* renamed from: com.google.protobuf.q$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class C8211a {

        /* renamed from: a */
        private final Object f35049a;

        /* renamed from: b */
        private final int f35050b;

        C8211a(Object obj, int i) {
            this.f35049a = obj;
            this.f35050b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8211a)) {
                return false;
            }
            C8211a aVar = (C8211a) obj;
            if (this.f35049a == aVar.f35049a && this.f35050b == aVar.f35050b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f35049a) * 65535) + this.f35050b;
        }
    }

    C8210q() {
        this.f35048a = new HashMap();
    }

    /* renamed from: b */
    public static C8210q m45546b() {
        C8210q qVar = f35046c;
        if (qVar == null) {
            synchronized (C8210q.class) {
                qVar = f35046c;
                if (qVar == null) {
                    qVar = f35045b ? C8207p.m45475a() : f35047d;
                    f35046c = qVar;
                }
            }
        }
        return qVar;
    }

    /* renamed from: a */
    public <ContainingType extends C8243v0> C8260z.C8265e<ContainingType, ?> mo27220a(ContainingType containingtype, int i) {
        return this.f35048a.get(new C8211a(containingtype, i));
    }

    C8210q(boolean z) {
        this.f35048a = Collections.emptyMap();
    }
}
