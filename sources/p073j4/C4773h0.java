package p073j4;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j4.h0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4773h0 {

    /* renamed from: a */
    private final String[] f25435a;

    /* renamed from: b */
    private final double[] f25436b;

    /* renamed from: c */
    private final double[] f25437c;

    /* renamed from: d */
    private final int[] f25438d;

    /* renamed from: e */
    private int f25439e = 0;

    /* synthetic */ C4773h0(C4765f0 f0Var, C4769g0 g0Var) {
        int size = f0Var.f25426b.size();
        this.f25435a = (String[]) f0Var.f25425a.toArray(new String[size]);
        this.f25436b = m30665c(f0Var.f25426b);
        this.f25437c = m30665c(f0Var.f25427c);
        this.f25438d = new int[size];
    }

    /* renamed from: c */
    private static final double[] m30665c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List mo18460a() {
        ArrayList arrayList = new ArrayList(this.f25435a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f25435a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f25437c[i];
            double d2 = this.f25436b[i];
            int i2 = this.f25438d[i];
            arrayList.add(new C4761e0(str, d, d2, ((double) i2) / ((double) this.f25439e), i2));
            i++;
        }
    }

    /* renamed from: b */
    public final void mo18461b(double d) {
        this.f25439e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f25437c;
            if (i < dArr.length) {
                double d2 = dArr[i];
                if (d2 <= d && d < this.f25436b[i]) {
                    int[] iArr = this.f25438d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= d2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
