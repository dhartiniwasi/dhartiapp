package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0835a0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.e0 */
/* compiled from: AppCompatTextViewAutoSizeHelper */
class C0482e0 {

    /* renamed from: l */
    private static final RectF f1594l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1595m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1596n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1597a = 0;

    /* renamed from: b */
    private boolean f1598b = false;

    /* renamed from: c */
    private float f1599c = -1.0f;

    /* renamed from: d */
    private float f1600d = -1.0f;

    /* renamed from: e */
    private float f1601e = -1.0f;

    /* renamed from: f */
    private int[] f1602f = new int[0];

    /* renamed from: g */
    private boolean f1603g = false;

    /* renamed from: h */
    private TextPaint f1604h;

    /* renamed from: i */
    private final TextView f1605i;

    /* renamed from: j */
    private final Context f1606j;

    /* renamed from: k */
    private final C0488f f1607k;

    /* renamed from: androidx.appcompat.widget.e0$a */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static final class C0483a {
        /* renamed from: a */
        static StaticLayout m2400a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        static int m2401b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static final class C0484b {
        /* renamed from: a */
        static boolean m2402a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$c */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static final class C0485c {
        /* renamed from: a */
        static StaticLayout m2403a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0488f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo2234a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$d */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0486d extends C0488f {
        C0486d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2234a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0482e0.m2381p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$e */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0487e extends C0486d {
        C0487e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2234a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2235b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$f */
    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class C0488f {
        C0488f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2234a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2235b(TextView textView) {
            return ((Boolean) C0482e0.m2381p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0482e0(TextView textView) {
        this.f1605i = textView;
        this.f1606j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f1607k = new C0487e();
        } else if (i >= 23) {
            this.f1607k = new C0486d();
        } else {
            this.f1607k = new C0488f();
        }
    }

    /* renamed from: A */
    private boolean m2371A(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1605i.getText();
        TransformationMethod transformationMethod = this.f1605i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1605i)) == null)) {
            text = transformation;
        }
        int b = Build.VERSION.SDK_INT >= 16 ? C0483a.m2401b(this.f1605i) : -1;
        mo2227o(i);
        StaticLayout e = mo2221e(text, (Layout.Alignment) m2381p(this.f1605i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        return (b == -1 || (e.getLineCount() <= b && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: B */
    private boolean m2372B() {
        return !(this.f1605i instanceof C0514l);
    }

    /* renamed from: C */
    private void m2373C(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1597a = 1;
            this.f1600d = f;
            this.f1601e = f2;
            this.f1599c = f3;
            this.f1603g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m2374a(Object obj, String str, T t) {
        try {
            Field m = m2379m(str);
            if (m == null) {
                return t;
            }
            return m.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m2375c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m2376d() {
        this.f1597a = 0;
        this.f1600d = -1.0f;
        this.f1601e = -1.0f;
        this.f1599c = -1.0f;
        this.f1602f = new int[0];
        this.f1598b = false;
    }

    /* renamed from: f */
    private StaticLayout m2377f(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1604h, i, alignment, ((Float) m2374a(this.f1605i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m2374a(this.f1605i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m2374a(this.f1605i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: g */
    private int m2378g(RectF rectF) {
        int length = this.f1602f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m2371A(this.f1602f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1602f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: m */
    private static Field m2379m(String str) {
        try {
            Field field = f1596n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1596n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: n */
    private static Method m2380n(String str) {
        try {
            Method method = f1595m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1595m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: p */
    static <T> T m2381p(Object obj, String str, T t) {
        try {
            return m2380n(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: v */
    private void m2382v(float f) {
        if (f != this.f1605i.getPaint().getTextSize()) {
            this.f1605i.getPaint().setTextSize(f);
            boolean a = Build.VERSION.SDK_INT >= 18 ? C0484b.m2402a(this.f1605i) : false;
            if (this.f1605i.getLayout() != null) {
                this.f1598b = false;
                try {
                    Method n = m2380n("nullLayouts");
                    if (n != null) {
                        n.invoke(this.f1605i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a) {
                    this.f1605i.requestLayout();
                } else {
                    this.f1605i.forceLayout();
                }
                this.f1605i.invalidate();
            }
        }
    }

    /* renamed from: x */
    private boolean m2383x() {
        if (!m2372B() || this.f1597a != 1) {
            this.f1598b = false;
        } else {
            if (!this.f1603g || this.f1602f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1601e - this.f1600d) / this.f1599c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1600d + (((float) i) * this.f1599c));
                }
                this.f1602f = m2375c(iArr);
            }
            this.f1598b = true;
        }
        return this.f1598b;
    }

    /* renamed from: y */
    private void m2384y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1602f = m2375c(iArr);
            m2385z();
        }
    }

    /* renamed from: z */
    private boolean m2385z() {
        int[] iArr = this.f1602f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1603g = z;
        if (z) {
            this.f1597a = 1;
            this.f1600d = (float) iArr[0];
            this.f1601e = (float) iArr[length - 1];
            this.f1599c = -1.0f;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2220b() {
        int i;
        if (mo2228q()) {
            if (this.f1598b) {
                if (this.f1605i.getMeasuredHeight() > 0 && this.f1605i.getMeasuredWidth() > 0) {
                    if (this.f1607k.mo2235b(this.f1605i)) {
                        i = 1048576;
                    } else {
                        i = (this.f1605i.getMeasuredWidth() - this.f1605i.getTotalPaddingLeft()) - this.f1605i.getTotalPaddingRight();
                    }
                    int height = (this.f1605i.getHeight() - this.f1605i.getCompoundPaddingBottom()) - this.f1605i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f1594l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i;
                            rectF.bottom = (float) height;
                            float g = (float) m2378g(rectF);
                            if (g != this.f1605i.getTextSize()) {
                                mo2233w(0, g);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1598b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo2221e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return C0485c.m2403a(charSequence, alignment, i, i2, this.f1605i, this.f1604h, this.f1607k);
        } else if (i3 >= 16) {
            return C0483a.m2400a(charSequence, alignment, i, this.f1605i, this.f1604h);
        } else {
            return m2377f(charSequence, alignment, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo2222h() {
        return Math.round(this.f1601e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2223i() {
        return Math.round(this.f1600d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo2224j() {
        return Math.round(this.f1599c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo2225k() {
        return this.f1602f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2226l() {
        return this.f1597a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2227o(int i) {
        TextPaint textPaint = this.f1604h;
        if (textPaint == null) {
            this.f1604h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1604h.set(this.f1605i.getPaint());
        this.f1604h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo2228q() {
        return m2372B() && this.f1597a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2229r(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1606j;
        int[] iArr = C4297j.f24076g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1605i;
        C0835a0.m3737l0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C4297j.f24101l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1597a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C4297j.f24096k0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C4297j.f24086i0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C4297j.f24081h0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C4297j.f24091j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m2384y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m2372B()) {
            this.f1597a = 0;
        } else if (this.f1597a == 1) {
            if (!this.f1603g) {
                DisplayMetrics displayMetrics = this.f1606j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m2373C(dimension2, dimension3, dimension);
            }
            m2383x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2230s(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m2372B()) {
            DisplayMetrics displayMetrics = this.f1606j.getResources().getDisplayMetrics();
            m2373C(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m2383x()) {
                mo2220b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2231t(int[] iArr, int i) throws IllegalArgumentException {
        if (m2372B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1606j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1602f = m2375c(iArr2);
                if (!m2385z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1603g = false;
            }
            if (m2383x()) {
                mo2220b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2232u(int i) {
        if (!m2372B()) {
            return;
        }
        if (i == 0) {
            m2376d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1606j.getResources().getDisplayMetrics();
            m2373C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m2383x()) {
                mo2220b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2233w(int i, float f) {
        Resources resources;
        Context context = this.f1606j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m2382v(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}
