package p331q9;

import androidx.recyclerview.widget.RecyclerView;
import p212d9.C9918j;
import p322p9.C12156k;

/* renamed from: q9.a */
/* compiled from: AbstractRSSReader */
public abstract class C12194a extends C12156k {

    /* renamed from: a */
    private final int[] f45281a = new int[4];

    /* renamed from: b */
    private final int[] f45282b;

    /* renamed from: c */
    private final float[] f45283c;

    /* renamed from: d */
    private final float[] f45284d;

    /* renamed from: e */
    private final int[] f45285e;

    /* renamed from: f */
    private final int[] f45286f;

    protected C12194a() {
        int[] iArr = new int[8];
        this.f45282b = iArr;
        this.f45283c = new float[4];
        this.f45284d = new float[4];
        this.f45285e = new int[(iArr.length / 2)];
        this.f45286f = new int[(iArr.length / 2)];
    }

    /* renamed from: g */
    protected static void m58488g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: n */
    protected static void m58489n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: o */
    protected static boolean m58490o(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = RecyclerView.UNDEFINED_DURATION;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    protected static int m58491p(int[] iArr, int[][] iArr2) throws C9918j {
        for (int i = 0; i < iArr2.length; i++) {
            if (C12156k.m58390d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int[] mo36707h() {
        return this.f45282b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int[] mo36708i() {
        return this.f45281a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo36709j() {
        return this.f45286f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final float[] mo36710k() {
        return this.f45284d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] mo36711l() {
        return this.f45285e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] mo36712m() {
        return this.f45283c;
    }
}
