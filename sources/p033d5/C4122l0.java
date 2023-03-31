package p033d5;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C2051a;
import p180z4.C6370f;

/* renamed from: d5.l0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4122l0 {

    /* renamed from: a */
    private final SparseIntArray f23350a = new SparseIntArray();

    /* renamed from: b */
    private C6370f f23351b;

    public C4122l0(C6370f fVar) {
        C4141r.m28221k(fVar);
        this.f23351b = fVar;
    }

    /* renamed from: a */
    public final int mo17421a(Context context, int i) {
        return this.f23350a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo17422b(Context context, C2051a.C2060f fVar) {
        C4141r.m28221k(context);
        C4141r.m28221k(fVar);
        int i = 0;
        if (!fVar.mo6941l()) {
            return 0;
        }
        int m = fVar.mo6942m();
        int a = mo17421a(context, m);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f23350a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f23350a.keyAt(i2);
                if (keyAt > m && this.f23350a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            a = i == -1 ? this.f23351b.mo21777j(context, m) : i;
            this.f23350a.put(m, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo17423c() {
        this.f23350a.clear();
    }
}
