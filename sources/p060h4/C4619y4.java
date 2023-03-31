package p060h4;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.startapp.sdk.adsbase.model.AdPreferences;
import p179z3.C6337h;
import p179z3.C6350t;

/* renamed from: h4.y4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4619y4 {

    /* renamed from: a */
    private final C6337h[] f25060a;

    /* renamed from: b */
    private final String f25061b;

    public C4619y4(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C6350t.f30544a);
        String string = obtainAttributes.getString(C6350t.f30545b);
        String string2 = obtainAttributes.getString(C6350t.f30546c);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.f25060a = m30123c(string);
        } else if (!z && z2) {
            this.f25060a = m30123c(string2);
        } else if (z) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(C6350t.f30547d);
        this.f25061b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: c */
    private static C6337h[] m30123c(String str) {
        int i;
        int i2;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        C6337h[] hVarArr = new C6337h[length];
        for (int i3 = 0; i3 < split.length; i3++) {
            String trim = split[i3].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        i = -1;
                    } else {
                        i = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        i2 = -2;
                    } else {
                        i2 = Integer.parseInt(split2[1]);
                    }
                    hVarArr[i3] = new C6337h(i, i2);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if (AdPreferences.TYPE_BANNER.equals(trim)) {
                hVarArr[i3] = C6337h.f30518i;
            } else if ("LARGE_BANNER".equals(trim)) {
                hVarArr[i3] = C6337h.f30520k;
            } else if ("FULL_BANNER".equals(trim)) {
                hVarArr[i3] = C6337h.f30519j;
            } else if ("LEADERBOARD".equals(trim)) {
                hVarArr[i3] = C6337h.f30521l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                hVarArr[i3] = C6337h.f30522m;
            } else if ("SMART_BANNER".equals(trim)) {
                hVarArr[i3] = C6337h.f30524o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                hVarArr[i3] = C6337h.f30523n;
            } else if ("FLUID".equals(trim)) {
                hVarArr[i3] = C6337h.f30525p;
            } else if ("ICON".equals(trim)) {
                hVarArr[i3] = C6337h.f30528s;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    /* renamed from: a */
    public final String mo18184a() {
        return this.f25061b;
    }

    /* renamed from: b */
    public final C6337h[] mo18185b(boolean z) {
        if (z || this.f25060a.length == 1) {
            return this.f25060a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
