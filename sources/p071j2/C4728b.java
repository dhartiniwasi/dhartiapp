package p071j2;

import java.util.List;
import p166x2.C6044b;

/* renamed from: j2.b */
/* compiled from: MotionPhotoDescription */
final class C4728b {

    /* renamed from: a */
    public final long f25319a;

    /* renamed from: b */
    public final List<C4729a> f25320b;

    /* renamed from: j2.b$a */
    /* compiled from: MotionPhotoDescription */
    public static final class C4729a {

        /* renamed from: a */
        public final String f25321a;

        /* renamed from: b */
        public final String f25322b;

        /* renamed from: c */
        public final long f25323c;

        /* renamed from: d */
        public final long f25324d;

        public C4729a(String str, String str2, long j, long j2) {
            this.f25321a = str;
            this.f25322b = str2;
            this.f25323c = j;
            this.f25324d = j2;
        }
    }

    public C4728b(long j, List<C4729a> list) {
        this.f25319a = j;
        this.f25320b = list;
    }

    /* renamed from: a */
    public C6044b mo18393a(long j) {
        long j2;
        if (this.f25320b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f25320b.size() - 1; size >= 0; size--) {
            C4729a aVar = this.f25320b.get(size);
            boolean equals = "video/mp4".equals(aVar.f25321a) | z;
            if (size == 0) {
                j2 = j3 - aVar.f25324d;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= aVar.f25323c;
                j2 = j8;
            }
            if (!equals || j3 == j2) {
                z = equals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C6044b(j4, j5, this.f25319a, j6, j7);
    }
}
