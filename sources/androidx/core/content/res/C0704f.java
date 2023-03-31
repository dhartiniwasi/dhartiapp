package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p138t.C5496g;

/* renamed from: androidx.core.content.res.f */
/* compiled from: GradientColorInflaterCompat */
final class C0704f {
    /* renamed from: a */
    private static C0705a m3248a(C0705a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0705a(i, i3, i2);
        }
        return new C0705a(i, i2);
    }

    /* renamed from: b */
    static Shader m3249b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray k = C0719k.m3295k(resources, theme2, attributeSet, C5496g.f27915A);
            float f = C0719k.m3290f(k, xmlPullParser2, "startX", C5496g.f27924J, 0.0f);
            float f2 = C0719k.m3290f(k, xmlPullParser2, "startY", C5496g.f27925K, 0.0f);
            float f3 = C0719k.m3290f(k, xmlPullParser2, "endX", C5496g.f27926L, 0.0f);
            float f4 = C0719k.m3290f(k, xmlPullParser2, "endY", C5496g.f27927M, 0.0f);
            float f5 = C0719k.m3290f(k, xmlPullParser2, "centerX", C5496g.f27919E, 0.0f);
            float f6 = C0719k.m3290f(k, xmlPullParser2, "centerY", C5496g.f27920F, 0.0f);
            int g = C0719k.m3291g(k, xmlPullParser2, "type", C5496g.f27918D, 0);
            int b = C0719k.m3286b(k, xmlPullParser2, "startColor", C5496g.f27916B, 0);
            boolean j = C0719k.m3294j(xmlPullParser2, "centerColor");
            int b2 = C0719k.m3286b(k, xmlPullParser2, "centerColor", C5496g.f27923I, 0);
            int b3 = C0719k.m3286b(k, xmlPullParser2, "endColor", C5496g.f27917C, 0);
            int g2 = C0719k.m3291g(k, xmlPullParser2, "tileMode", C5496g.f27922H, 0);
            float f7 = f5;
            float f8 = C0719k.m3290f(k, xmlPullParser2, "gradientRadius", C5496g.f27921G, 0.0f);
            k.recycle();
            C0705a a = m3248a(m3250c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g == 1) {
                float f9 = f7;
                if (f8 > 0.0f) {
                    int[] iArr = a.f2236a;
                    return new RadialGradient(f9, f6, f8, iArr, a.f2237b, m3251d(g2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g != 2) {
                return new LinearGradient(f, f2, f3, f4, a.f2236a, a.f2237b, m3251d(g2));
            } else {
                return new SweepGradient(f7, f6, a.f2236a, a.f2237b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0704f.C0705a m3250c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p138t.C5496g.f27928N
            android.content.res.TypedArray r3 = androidx.core.content.res.C0719k.m3295k(r9, r12, r11, r3)
            int r5 = p138t.C5496g.f27929O
            boolean r6 = r3.hasValue(r5)
            int r7 = p138t.C5496g.f27930P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0704f.m3250c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m3251d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: androidx.core.content.res.f$a */
    /* compiled from: GradientColorInflaterCompat */
    static final class C0705a {

        /* renamed from: a */
        final int[] f2236a;

        /* renamed from: b */
        final float[] f2237b;

        C0705a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2236a = new int[size];
            this.f2237b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2236a[i] = list.get(i).intValue();
                this.f2237b[i] = list2.get(i).floatValue();
            }
        }

        C0705a(int i, int i2) {
            this.f2236a = new int[]{i, i2};
            this.f2237b = new float[]{0.0f, 1.0f};
        }

        C0705a(int i, int i2, int i3) {
            this.f2236a = new int[]{i, i2, i3};
            this.f2237b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
