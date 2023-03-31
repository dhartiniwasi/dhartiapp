package p246h7;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: h7.p */
/* compiled from: StartupTime */
public abstract class C10427p {
    /* renamed from: a */
    public static C10427p m52629a(long j, long j2, long j3) {
        return new C10407a(j, j2, j3);
    }

    /* renamed from: e */
    public static C10427p m52630e() {
        return m52629a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo33453b();

    /* renamed from: c */
    public abstract long mo33454c();

    /* renamed from: d */
    public abstract long mo33455d();
}
