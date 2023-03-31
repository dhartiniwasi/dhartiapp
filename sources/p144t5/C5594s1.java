package p144t5;

import java.util.concurrent.Executor;

/* renamed from: t5.s1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5594s1 {

    /* renamed from: a */
    private final Executor f28206a;

    C5594s1(Executor executor) {
        this.f28206a = executor;
    }

    /* renamed from: a */
    public final Executor mo19893a() {
        return this.f28206a;
    }

    /* renamed from: b */
    public final void mo19894b(String str, String str2, C5591r1... r1VarArr) {
        this.f28206a.execute(new C5585p1(str, str2, r1VarArr));
    }
}
