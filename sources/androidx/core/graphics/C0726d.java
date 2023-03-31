package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.C0827d;

/* renamed from: androidx.core.graphics.d */
/* compiled from: PaintCompat */
public final class C0726d {

    /* renamed from: a */
    private static final ThreadLocal<C0827d<Rect, Rect>> f2270a = new ThreadLocal<>();

    /* renamed from: androidx.core.graphics.d$a */
    /* compiled from: PaintCompat */
    static class C0727a {
        /* renamed from: a */
        static boolean m3324a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m3322a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0727a.m3324a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C0827d<Rect, Rect> b = m3323b();
        paint.getTextBounds("󟿽", 0, 2, (Rect) b.f2438a);
        paint.getTextBounds(str, 0, length, (Rect) b.f2439b);
        return !((Rect) b.f2438a).equals(b.f2439b);
    }

    /* renamed from: b */
    private static C0827d<Rect, Rect> m3323b() {
        ThreadLocal<C0827d<Rect, Rect>> threadLocal = f2270a;
        C0827d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            C0827d<Rect, Rect> dVar2 = new C0827d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        ((Rect) dVar.f2438a).setEmpty();
        ((Rect) dVar.f2439b).setEmpty();
        return dVar;
    }
}
