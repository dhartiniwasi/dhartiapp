package p067i5;

import android.os.SystemClock;

/* renamed from: i5.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4694h implements C4691e {

    /* renamed from: a */
    private static final C4694h f25252a = new C4694h();

    private C4694h() {
    }

    /* renamed from: d */
    public static C4691e m30388d() {
        return f25252a;
    }

    /* renamed from: a */
    public final long mo18370a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo18371b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo18372c() {
        return System.nanoTime();
    }
}
