package p155v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: v3.n0 */
/* compiled from: SlidingPercentile */
public class C5832n0 {

    /* renamed from: h */
    private static final Comparator<C5834b> f28865h = C12803m0.f46814a;

    /* renamed from: i */
    private static final Comparator<C5834b> f28866i = C12802l0.f46813a;

    /* renamed from: a */
    private final int f28867a;

    /* renamed from: b */
    private final ArrayList<C5834b> f28868b = new ArrayList<>();

    /* renamed from: c */
    private final C5834b[] f28869c = new C5834b[5];

    /* renamed from: d */
    private int f28870d = -1;

    /* renamed from: e */
    private int f28871e;

    /* renamed from: f */
    private int f28872f;

    /* renamed from: g */
    private int f28873g;

    /* renamed from: v3.n0$b */
    /* compiled from: SlidingPercentile */
    private static class C5834b {

        /* renamed from: a */
        public int f28874a;

        /* renamed from: b */
        public int f28875b;

        /* renamed from: c */
        public float f28876c;

        private C5834b() {
        }
    }

    public C5832n0(int i) {
        this.f28867a = i;
    }

    /* renamed from: d */
    private void m34618d() {
        if (this.f28870d != 1) {
            Collections.sort(this.f28868b, f28865h);
            this.f28870d = 1;
        }
    }

    /* renamed from: e */
    private void m34619e() {
        if (this.f28870d != 0) {
            Collections.sort(this.f28868b, f28866i);
            this.f28870d = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m34620g(C5834b bVar, C5834b bVar2) {
        return bVar.f28874a - bVar2.f28874a;
    }

    /* renamed from: c */
    public void mo20359c(int i, float f) {
        C5834b bVar;
        m34618d();
        int i2 = this.f28873g;
        if (i2 > 0) {
            C5834b[] bVarArr = this.f28869c;
            int i3 = i2 - 1;
            this.f28873g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C5834b();
        }
        int i4 = this.f28871e;
        this.f28871e = i4 + 1;
        bVar.f28874a = i4;
        bVar.f28875b = i;
        bVar.f28876c = f;
        this.f28868b.add(bVar);
        this.f28872f += i;
        while (true) {
            int i5 = this.f28872f;
            int i6 = this.f28867a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C5834b bVar2 = this.f28868b.get(0);
                int i8 = bVar2.f28875b;
                if (i8 <= i7) {
                    this.f28872f -= i8;
                    this.f28868b.remove(0);
                    int i9 = this.f28873g;
                    if (i9 < 5) {
                        C5834b[] bVarArr2 = this.f28869c;
                        this.f28873g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f28875b = i8 - i7;
                    this.f28872f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public float mo20360f(float f) {
        m34619e();
        float f2 = f * ((float) this.f28872f);
        int i = 0;
        for (int i2 = 0; i2 < this.f28868b.size(); i2++) {
            C5834b bVar = this.f28868b.get(i2);
            i += bVar.f28875b;
            if (((float) i) >= f2) {
                return bVar.f28876c;
            }
        }
        if (this.f28868b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C5834b> arrayList = this.f28868b;
        return arrayList.get(arrayList.size() - 1).f28876c;
    }

    /* renamed from: i */
    public void mo20361i() {
        this.f28868b.clear();
        this.f28870d = -1;
        this.f28871e = 0;
        this.f28872f = 0;
    }
}
