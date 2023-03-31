package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.C0726d;
import androidx.emoji2.text.C1014e;

/* renamed from: androidx.emoji2.text.d */
/* compiled from: DefaultGlyphChecker */
class C1013d implements C1014e.C1019d {

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f2715b = new ThreadLocal<>();

    /* renamed from: a */
    private final TextPaint f2716a;

    C1013d() {
        TextPaint textPaint = new TextPaint();
        this.f2716a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m4541b() {
        ThreadLocal<StringBuilder> threadLocal = f2715b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo3626a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        StringBuilder b = m4541b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return C0726d.m3322a(this.f2716a, b.toString());
    }
}
