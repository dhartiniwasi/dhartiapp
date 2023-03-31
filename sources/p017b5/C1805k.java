package p017b5;

import com.google.android.gms.common.api.Status;
import p007a5.C0104a;
import p218e6.C9977j;

/* renamed from: b5.k */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C1805k {
    /* renamed from: a */
    public static void m8469a(Status status, C9977j<Void> jVar) {
        m8470b(status, (Object) null, jVar);
    }

    /* renamed from: b */
    public static <TResult> void m8470b(Status status, TResult tresult, C9977j<TResult> jVar) {
        if (status.mo7953M1()) {
            jVar.mo32544c(tresult);
        } else {
            jVar.mo32543b(new C0104a(status));
        }
    }
}
