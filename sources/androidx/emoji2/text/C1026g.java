package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p002a0.C0002a;

/* renamed from: androidx.emoji2.text.g */
/* compiled from: EmojiMetadata */
public class C1026g {

    /* renamed from: d */
    private static final ThreadLocal<C0002a> f2752d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f2753a;

    /* renamed from: b */
    private final C1039m f2754b;

    /* renamed from: c */
    private volatile int f2755c = 0;

    C1026g(C1039m mVar, int i) {
        this.f2754b = mVar;
        this.f2753a = i;
    }

    /* renamed from: g */
    private C0002a m4582g() {
        ThreadLocal<C0002a> threadLocal = f2752d;
        C0002a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C0002a();
            threadLocal.set(aVar);
        }
        this.f2754b.mo3685d().mo17j(aVar, this.f2753a);
        return aVar;
    }

    /* renamed from: a */
    public void mo3651a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.f2754b.mo3688g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f2754b.mo3684c(), this.f2753a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo3652b(int i) {
        return m4582g().mo8h(i);
    }

    /* renamed from: c */
    public int mo3653c() {
        return m4582g().mo9i();
    }

    /* renamed from: d */
    public int mo3654d() {
        return this.f2755c;
    }

    /* renamed from: e */
    public short mo3655e() {
        return m4582g().mo11k();
    }

    /* renamed from: f */
    public int mo3656f() {
        return m4582g().mo12l();
    }

    /* renamed from: h */
    public short mo3657h() {
        return m4582g().mo13m();
    }

    /* renamed from: i */
    public short mo3658i() {
        return m4582g().mo14n();
    }

    /* renamed from: j */
    public boolean mo3659j() {
        return m4582g().mo10j();
    }

    /* renamed from: k */
    public void mo3660k(boolean z) {
        this.f2755c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo3656f()));
        sb.append(", codepoints:");
        int c = mo3653c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(mo3652b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
