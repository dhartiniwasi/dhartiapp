package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2079d<L> {

    /* renamed from: a */
    private volatile L f6142a;

    /* renamed from: b */
    private volatile C2080a<L> f6143b;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C2080a<L> {

        /* renamed from: a */
        private final L f6144a;

        /* renamed from: b */
        private final String f6145b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2080a)) {
                return false;
            }
            C2080a aVar = (C2080a) obj;
            return this.f6144a == aVar.f6144a && this.f6145b.equals(aVar.f6145b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f6144a) * 31) + this.f6145b.hashCode();
        }
    }

    /* renamed from: a */
    public void mo8049a() {
        this.f6142a = null;
        this.f6143b = null;
    }
}
