package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0336b;
import p048g.C4297j;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: ActionBar */
public abstract class C0275a {

    /* renamed from: androidx.appcompat.app.a$b */
    /* compiled from: ActionBar */
    public interface C0277b {
        /* renamed from: a */
        void mo862a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* compiled from: ActionBar */
    public static abstract class C0278c {
        /* renamed from: a */
        public abstract CharSequence mo863a();

        /* renamed from: b */
        public abstract View mo864b();

        /* renamed from: c */
        public abstract Drawable mo865c();

        /* renamed from: d */
        public abstract CharSequence mo866d();

        /* renamed from: e */
        public abstract void mo867e();
    }

    /* renamed from: f */
    public boolean mo841f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo842g();

    /* renamed from: h */
    public abstract void mo843h(boolean z);

    /* renamed from: i */
    public abstract int mo844i();

    /* renamed from: j */
    public abstract Context mo845j();

    /* renamed from: k */
    public abstract void mo846k();

    /* renamed from: l */
    public boolean mo847l() {
        return false;
    }

    /* renamed from: m */
    public abstract boolean mo848m();

    /* renamed from: n */
    public void mo849n(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo850o() {
    }

    /* renamed from: p */
    public abstract boolean mo851p(int i, KeyEvent keyEvent);

    /* renamed from: q */
    public boolean mo852q(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: r */
    public boolean mo853r() {
        return false;
    }

    /* renamed from: s */
    public abstract void mo854s(Drawable drawable);

    /* renamed from: t */
    public abstract void mo855t(boolean z);

    /* renamed from: u */
    public abstract void mo856u(boolean z);

    /* renamed from: v */
    public abstract void mo857v(boolean z);

    /* renamed from: w */
    public abstract void mo858w(CharSequence charSequence);

    /* renamed from: x */
    public abstract void mo859x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo860y();

    /* renamed from: z */
    public C0336b mo861z(C0336b.C0337a aVar) {
        return null;
    }

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: ActionBar */
    public static class C0276a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f731a;

        public C0276a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f731a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f24140t);
            this.f731a = obtainStyledAttributes.getInt(C4297j.f24145u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0276a(int i, int i2) {
            super(i, i2);
            this.f731a = 0;
            this.f731a = 8388627;
        }

        public C0276a(C0276a aVar) {
            super(aVar);
            this.f731a = 0;
            this.f731a = aVar.f731a;
        }

        public C0276a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f731a = 0;
        }
    }
}
