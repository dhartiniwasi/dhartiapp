package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: androidx.core.content.res.d */
/* compiled from: ComplexColorCompat */
public final class C0697d {

    /* renamed from: a */
    private final Shader f2222a;

    /* renamed from: b */
    private final ColorStateList f2223b;

    /* renamed from: c */
    private int f2224c;

    private C0697d(Shader shader, ColorStateList colorStateList, int i) {
        this.f2222a = shader;
        this.f2223b = colorStateList;
        this.f2224c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0697d m3216a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.res.C0696c.m3209b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m3218c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.res.C0704f.m3249b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m3219d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0697d.m3216a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.d");
    }

    /* renamed from: b */
    static C0697d m3217b(int i) {
        return new C0697d((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C0697d m3218c(ColorStateList colorStateList) {
        return new C0697d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0697d m3219d(Shader shader) {
        return new C0697d(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C0697d m3220g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m3216a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo3019e() {
        return this.f2224c;
    }

    /* renamed from: f */
    public Shader mo3020f() {
        return this.f2222a;
    }

    /* renamed from: h */
    public boolean mo3021h() {
        return this.f2222a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f2223b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3022i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f2222a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f2223b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0697d.mo3022i():boolean");
    }

    /* renamed from: j */
    public boolean mo3023j(int[] iArr) {
        if (mo3022i()) {
            ColorStateList colorStateList = this.f2223b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2224c) {
                this.f2224c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo3024k(int i) {
        this.f2224c = i;
    }

    /* renamed from: l */
    public boolean mo3025l() {
        return mo3021h() || this.f2224c != 0;
    }
}
