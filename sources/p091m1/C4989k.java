package p091m1;

import com.google.auto.value.AutoValue;
import p091m1.C4975e;

@AutoValue
/* renamed from: m1.k */
/* compiled from: ClientInfo */
public abstract class C4989k {

    @AutoValue.Builder
    /* renamed from: m1.k$a */
    /* compiled from: ClientInfo */
    public static abstract class C4990a {
        /* renamed from: a */
        public abstract C4989k mo18874a();

        /* renamed from: b */
        public abstract C4990a mo18875b(C4962a aVar);

        /* renamed from: c */
        public abstract C4990a mo18876c(C4991b bVar);
    }

    /* renamed from: m1.k$b */
    /* compiled from: ClientInfo */
    public enum C4991b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: a */
        private final int f26144a;

        private C4991b(int i) {
            this.f26144a = i;
        }
    }

    /* renamed from: a */
    public static C4990a m31498a() {
        return new C4975e.C4977b();
    }

    /* renamed from: b */
    public abstract C4962a mo18869b();

    /* renamed from: c */
    public abstract C4991b mo18870c();
}
