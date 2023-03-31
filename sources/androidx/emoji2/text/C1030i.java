package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C0831h;

/* renamed from: androidx.emoji2.text.i */
/* compiled from: EmojiSpan */
public abstract class C1030i extends ReplacementSpan {

    /* renamed from: a */
    private final Paint.FontMetricsInt f2769a = new Paint.FontMetricsInt();

    /* renamed from: b */
    private final C1026g f2770b;

    /* renamed from: c */
    private short f2771c = -1;

    /* renamed from: d */
    private short f2772d = -1;

    /* renamed from: e */
    private float f2773e = 1.0f;

    C1030i(C1026g gVar) {
        C0831h.m3663g(gVar, "metadata cannot be null");
        this.f2770b = gVar;
    }

    /* renamed from: a */
    public final C1026g mo3667a() {
        return this.f2770b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3668b() {
        return this.f2771c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2769a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2769a;
        this.f2773e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f2770b.mo3655e());
        this.f2772d = (short) ((int) (((float) this.f2770b.mo3655e()) * this.f2773e));
        short i3 = (short) ((int) (((float) this.f2770b.mo3658i()) * this.f2773e));
        this.f2771c = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2769a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
