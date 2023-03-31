package p346s6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0707h;
import p227f6.C10135k;

/* renamed from: s6.d */
/* compiled from: TextAppearance */
public class C12457d {

    /* renamed from: a */
    public final float f45803a;

    /* renamed from: b */
    public final ColorStateList f45804b;

    /* renamed from: c */
    public final ColorStateList f45805c;

    /* renamed from: d */
    public final ColorStateList f45806d;

    /* renamed from: e */
    public final int f45807e;

    /* renamed from: f */
    public final int f45808f;

    /* renamed from: g */
    public final String f45809g;

    /* renamed from: h */
    public final boolean f45810h;

    /* renamed from: i */
    public final ColorStateList f45811i;

    /* renamed from: j */
    public final float f45812j;

    /* renamed from: k */
    public final float f45813k;

    /* renamed from: l */
    public final float f45814l;

    /* renamed from: m */
    private final int f45815m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f45816n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Typeface f45817o;

    /* renamed from: s6.d$a */
    /* compiled from: TextAppearance */
    class C12458a extends C0707h.C0713f {

        /* renamed from: a */
        final /* synthetic */ C12461f f45818a;

        C12458a(C12461f fVar) {
            this.f45818a = fVar;
        }

        /* renamed from: h */
        public void mo2109h(int i) {
            boolean unused = C12457d.this.f45816n = true;
            this.f45818a.mo25210a(i);
        }

        /* renamed from: i */
        public void mo2110i(Typeface typeface) {
            C12457d dVar = C12457d.this;
            Typeface unused = dVar.f45817o = Typeface.create(typeface, dVar.f45807e);
            boolean unused2 = C12457d.this.f45816n = true;
            this.f45818a.mo25211b(C12457d.this.f45817o, false);
        }
    }

    /* renamed from: s6.d$b */
    /* compiled from: TextAppearance */
    class C12459b extends C12461f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f45820a;

        /* renamed from: b */
        final /* synthetic */ C12461f f45821b;

        C12459b(TextPaint textPaint, C12461f fVar) {
            this.f45820a = textPaint;
            this.f45821b = fVar;
        }

        /* renamed from: a */
        public void mo25210a(int i) {
            this.f45821b.mo25210a(i);
        }

        /* renamed from: b */
        public void mo25211b(Typeface typeface, boolean z) {
            C12457d.this.mo37213k(this.f45820a, typeface);
            this.f45821b.mo25211b(typeface, z);
        }
    }

    public C12457d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10135k.f40366Z2);
        this.f45803a = obtainStyledAttributes.getDimension(C10135k.f40372a3, 0.0f);
        this.f45804b = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40390d3);
        this.f45805c = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40396e3);
        this.f45806d = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40402f3);
        this.f45807e = obtainStyledAttributes.getInt(C10135k.f40384c3, 0);
        this.f45808f = obtainStyledAttributes.getInt(C10135k.f40378b3, 1);
        int e = C12456c.m59424e(obtainStyledAttributes, C10135k.f40438l3, C10135k.f40432k3);
        this.f45815m = obtainStyledAttributes.getResourceId(e, 0);
        this.f45809g = obtainStyledAttributes.getString(e);
        this.f45810h = obtainStyledAttributes.getBoolean(C10135k.f40444m3, false);
        this.f45811i = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40408g3);
        this.f45812j = obtainStyledAttributes.getFloat(C10135k.f40414h3, 0.0f);
        this.f45813k = obtainStyledAttributes.getFloat(C10135k.f40420i3, 0.0f);
        this.f45814l = obtainStyledAttributes.getFloat(C10135k.f40426j3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m59429d() {
        String str;
        if (this.f45817o == null && (str = this.f45809g) != null) {
            this.f45817o = Typeface.create(str, this.f45807e);
        }
        if (this.f45817o == null) {
            int i = this.f45808f;
            if (i == 1) {
                this.f45817o = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f45817o = Typeface.SERIF;
            } else if (i != 3) {
                this.f45817o = Typeface.DEFAULT;
            } else {
                this.f45817o = Typeface.MONOSPACE;
            }
            this.f45817o = Typeface.create(this.f45817o, this.f45807e);
        }
    }

    /* renamed from: e */
    public Typeface mo37207e() {
        m59429d();
        return this.f45817o;
    }

    /* renamed from: f */
    public Typeface mo37208f(Context context) {
        if (this.f45816n) {
            return this.f45817o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface f = C0707h.m3260f(context, this.f45815m);
                this.f45817o = f;
                if (f != null) {
                    this.f45817o = Typeface.create(f, this.f45807e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f45809g, e);
            }
        }
        m59429d();
        this.f45816n = true;
        return this.f45817o;
    }

    /* renamed from: g */
    public void mo37209g(Context context, TextPaint textPaint, C12461f fVar) {
        mo37213k(textPaint, mo37207e());
        mo37210h(context, new C12459b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo37210h(Context context, C12461f fVar) {
        if (C12460e.m59441a()) {
            mo37208f(context);
        } else {
            m59429d();
        }
        int i = this.f45815m;
        if (i == 0) {
            this.f45816n = true;
        }
        if (this.f45816n) {
            fVar.mo25211b(this.f45817o, true);
            return;
        }
        try {
            C0707h.m3262h(context, i, new C12458a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f45816n = true;
            fVar.mo25210a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f45809g, e);
            this.f45816n = true;
            fVar.mo25210a(-3);
        }
    }

    /* renamed from: i */
    public void mo37211i(Context context, TextPaint textPaint, C12461f fVar) {
        mo37212j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f45804b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f45814l;
        float f2 = this.f45812j;
        float f3 = this.f45813k;
        ColorStateList colorStateList2 = this.f45811i;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void mo37212j(Context context, TextPaint textPaint, C12461f fVar) {
        if (C12460e.m59441a()) {
            mo37213k(textPaint, mo37208f(context));
        } else {
            mo37209g(context, textPaint, fVar);
        }
    }

    /* renamed from: k */
    public void mo37213k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f45807e;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f45803a);
    }
}
