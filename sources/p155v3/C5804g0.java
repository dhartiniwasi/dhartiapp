package p155v3;

import java.io.IOException;
import p015b3.C1748q;
import p015b3.C1759t;
import p161w3.C5917a;

/* renamed from: v3.g0 */
/* compiled from: LoadErrorHandlingPolicy */
public interface C5804g0 {

    /* renamed from: v3.g0$a */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C5805a {

        /* renamed from: a */
        public final int f28805a;

        /* renamed from: b */
        public final int f28806b;

        /* renamed from: c */
        public final int f28807c;

        /* renamed from: d */
        public final int f28808d;

        public C5805a(int i, int i2, int i3, int i4) {
            this.f28805a = i;
            this.f28806b = i2;
            this.f28807c = i3;
            this.f28808d = i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo20333a(int r4) {
            /*
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L_0x000c
                int r4 = r3.f28805a
                int r2 = r3.f28806b
                int r4 = r4 - r2
                if (r4 <= r1) goto L_0x0014
                goto L_0x0013
            L_0x000c:
                int r4 = r3.f28807c
                int r2 = r3.f28808d
                int r4 = r4 - r2
                if (r4 <= r1) goto L_0x0014
            L_0x0013:
                r0 = 1
            L_0x0014:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p155v3.C5804g0.C5805a.mo20333a(int):boolean");
        }
    }

    /* renamed from: v3.g0$b */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C5806b {

        /* renamed from: a */
        public final int f28809a;

        /* renamed from: b */
        public final long f28810b;

        public C5806b(int i, long j) {
            C5917a.m34868a(j >= 0);
            this.f28809a = i;
            this.f28810b = j;
        }
    }

    /* renamed from: v3.g0$c */
    /* compiled from: LoadErrorHandlingPolicy */
    public static final class C5807c {

        /* renamed from: a */
        public final C1748q f28811a;

        /* renamed from: b */
        public final C1759t f28812b;

        /* renamed from: c */
        public final IOException f28813c;

        /* renamed from: d */
        public final int f28814d;

        public C5807c(C1748q qVar, C1759t tVar, IOException iOException, int i) {
            this.f28811a = qVar;
            this.f28812b = tVar;
            this.f28813c = iOException;
            this.f28814d = i;
        }
    }

    /* renamed from: a */
    C5806b mo20329a(C5805a aVar, C5807c cVar);

    /* renamed from: b */
    void mo20330b(long j);

    /* renamed from: c */
    long mo20331c(C5807c cVar);

    /* renamed from: d */
    int mo20332d(int i);
}
