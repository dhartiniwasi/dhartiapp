package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
/* compiled from: TypefaceEmojiSpan */
public final class C1043o extends C1030i {

    /* renamed from: f */
    private static Paint f2799f;

    public C1043o(C1026g gVar) {
        super(gVar);
    }

    /* renamed from: c */
    private static Paint m4659c() {
        if (f2799f == null) {
            TextPaint textPaint = new TextPaint();
            f2799f = textPaint;
            textPaint.setColor(C1014e.m4544b().mo3627c());
            f2799f.setStyle(Paint.Style.FILL);
        }
        return f2799f;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C1014e.m4544b().mo3629i()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo3668b()), (float) i5, m4659c());
        }
        mo3667a().mo3651a(canvas, f, (float) i4, paint);
    }
}
