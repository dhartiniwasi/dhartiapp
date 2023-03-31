package p310o6;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0723b;
import p227f6.C10126b;
import p283l6.C11758a;
import p346s6.C12455b;

/* renamed from: o6.a */
/* compiled from: ElevationOverlayProvider */
public class C12015a {

    /* renamed from: a */
    private final boolean f44980a;

    /* renamed from: b */
    private final int f44981b;

    /* renamed from: c */
    private final int f44982c;

    /* renamed from: d */
    private final float f44983d;

    public C12015a(Context context) {
        this.f44980a = C12455b.m59417b(context, C10126b.elevationOverlayEnabled, false);
        this.f44981b = C11758a.m57060a(context, C10126b.elevationOverlayColor, 0);
        this.f44982c = C11758a.m57060a(context, C10126b.colorSurface, 0);
        this.f44983d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m57913e(int i) {
        return C0723b.m3315f(i, 255) == this.f44982c;
    }

    /* renamed from: a */
    public float mo36377a(float f) {
        float f2 = this.f44983d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo36378b(int i, float f) {
        float a = mo36377a(f);
        return C0723b.m3315f(C11758a.m57065f(C0723b.m3315f(i, 255), this.f44981b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo36379c(int i, float f) {
        return (!this.f44980a || !m57913e(i)) ? i : mo36378b(i, f);
    }

    /* renamed from: d */
    public boolean mo36380d() {
        return this.f44980a;
    }
}
