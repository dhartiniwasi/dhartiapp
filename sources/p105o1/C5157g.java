package p105o1;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: o1.g */
/* compiled from: BackendResponse */
public abstract class C5157g {

    /* renamed from: o1.g$a */
    /* compiled from: BackendResponse */
    public enum C5158a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static C5157g m32067a() {
        return new C5151b(C5158a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C5157g m32068d() {
        return new C5151b(C5158a.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static C5157g m32069e(long j) {
        return new C5151b(C5158a.OK, j);
    }

    /* renamed from: f */
    public static C5157g m32070f() {
        return new C5151b(C5158a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo19126b();

    /* renamed from: c */
    public abstract C5158a mo19127c();
}
