package p030d2;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import p021c2.C1841b;
import p030d2.C4048w;

/* renamed from: d2.o */
/* compiled from: DrmSession */
public interface C4042o {

    /* renamed from: d2.o$a */
    /* compiled from: DrmSession */
    public static class C4043a extends IOException {

        /* renamed from: a */
        public final int f23121a;

        public C4043a(Throwable th, int i) {
            super(th);
            this.f23121a = i;
        }
    }

    /* renamed from: a */
    void mo17177a(C4048w.C4049a aVar);

    /* renamed from: b */
    UUID mo17178b();

    /* renamed from: c */
    void mo17179c(C4048w.C4049a aVar);

    /* renamed from: d */
    boolean mo17180d();

    /* renamed from: e */
    Map<String, String> mo17181e();

    /* renamed from: f */
    boolean mo17182f(String str);

    /* renamed from: g */
    C4043a mo17183g();

    int getState();

    /* renamed from: h */
    C1841b mo17185h();
}
