package p355t6;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0736b;
import p375v6.C12822g;
import p375v6.C12829k;
import p375v6.C12844n;

/* renamed from: t6.a */
/* compiled from: RippleDrawableCompat */
public class C12535a extends Drawable implements C12844n, C0736b {

    /* renamed from: a */
    private C12537b f46031a;

    /* renamed from: a */
    public C12535a mutate() {
        this.f46031a = new C12537b(this.f46031a);
        return this;
    }

    public void draw(Canvas canvas) {
        C12537b bVar = this.f46031a;
        if (bVar.f46033b) {
            bVar.f46032a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f46031a;
    }

    public int getOpacity() {
        return this.f46031a.f46032a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46031a.f46032a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f46031a.f46032a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = C12538b.m59729b(iArr);
        C12537b bVar = this.f46031a;
        if (bVar.f46033b == b) {
            return onStateChange;
        }
        bVar.f46033b = b;
        return true;
    }

    public void setAlpha(int i) {
        this.f46031a.f46032a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f46031a.f46032a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C12829k kVar) {
        this.f46031a.f46032a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f46031a.f46032a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f46031a.f46032a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f46031a.f46032a.setTintMode(mode);
    }

    public C12535a(C12829k kVar) {
        this(new C12537b(new C12822g(kVar)));
    }

    /* renamed from: t6.a$b */
    /* compiled from: RippleDrawableCompat */
    static final class C12537b extends Drawable.ConstantState {

        /* renamed from: a */
        C12822g f46032a;

        /* renamed from: b */
        boolean f46033b;

        public C12537b(C12822g gVar) {
            this.f46032a = gVar;
            this.f46033b = false;
        }

        /* renamed from: a */
        public C12535a newDrawable() {
            return new C12535a(new C12537b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C12537b(C12537b bVar) {
            this.f46032a = (C12822g) bVar.f46032a.getConstantState().newDrawable();
            this.f46033b = bVar.f46033b;
        }
    }

    private C12535a(C12537b bVar) {
        this.f46031a = bVar;
    }
}
