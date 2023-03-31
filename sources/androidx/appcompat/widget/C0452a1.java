package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0707h;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.a1 */
/* compiled from: TintTypedArray */
public class C0452a1 {

    /* renamed from: a */
    private final Context f1499a;

    /* renamed from: b */
    private final TypedArray f1500b;

    /* renamed from: c */
    private TypedValue f1501c;

    private C0452a1(Context context, TypedArray typedArray) {
        this.f1499a = context;
        this.f1500b = typedArray;
    }

    /* renamed from: t */
    public static C0452a1 m2208t(Context context, int i, int[] iArr) {
        return new C0452a1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0452a1 m2209u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0452a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0452a1 m2210v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0452a1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo2042a(int i, boolean z) {
        return this.f1500b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo2043b(int i, int i2) {
        return this.f1500b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo2044c(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f1500b.hasValue(i) || (resourceId = this.f1500b.getResourceId(i, 0)) == 0 || (a = C4411a.m29345a(this.f1499a, resourceId)) == null) {
            return this.f1500b.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: d */
    public float mo2045d(int i, float f) {
        return this.f1500b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo2046e(int i, int i2) {
        return this.f1500b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo2047f(int i, int i2) {
        return this.f1500b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo2048g(int i) {
        int resourceId;
        if (!this.f1500b.hasValue(i) || (resourceId = this.f1500b.getResourceId(i, 0)) == 0) {
            return this.f1500b.getDrawable(i);
        }
        return C4411a.m29346b(this.f1499a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo2049h(int i) {
        int resourceId;
        if (!this.f1500b.hasValue(i) || (resourceId = this.f1500b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0509k.m2499b().mo2400d(this.f1499a, resourceId, true);
    }

    /* renamed from: i */
    public float mo2050i(int i, float f) {
        return this.f1500b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo2051j(int i, int i2, C0707h.C0713f fVar) {
        int resourceId = this.f1500b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1501c == null) {
            this.f1501c = new TypedValue();
        }
        return C0707h.m3261g(this.f1499a, resourceId, this.f1501c, i2, fVar);
    }

    /* renamed from: k */
    public int mo2052k(int i, int i2) {
        return this.f1500b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo2053l(int i, int i2) {
        return this.f1500b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo2054m(int i, int i2) {
        return this.f1500b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo2055n(int i, int i2) {
        return this.f1500b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo2056o(int i) {
        return this.f1500b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo2057p(int i) {
        return this.f1500b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo2058q(int i) {
        return this.f1500b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo2059r() {
        return this.f1500b;
    }

    /* renamed from: s */
    public boolean mo2060s(int i) {
        return this.f1500b.hasValue(i);
    }

    /* renamed from: w */
    public void mo2061w() {
        this.f1500b.recycle();
    }
}
