package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fo4 {

    /* renamed from: c */
    private static final Pattern f9378c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f9379a = -1;

    /* renamed from: b */
    public int f9380b = -1;

    /* renamed from: c */
    private final boolean m12771c(String str) {
        Matcher matcher = f9378c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = gb2.f9812a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f9379a = parseInt;
            this.f9380b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo10237a() {
        return (this.f9379a == -1 || this.f9380b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo10238b(k60 k60) {
        for (int i = 0; i < k60.mo11568a(); i++) {
            j50 b = k60.mo11569b(i);
            if (b instanceof C2163a2) {
                C2163a2 a2Var = (C2163a2) b;
                if ("iTunSMPB".equals(a2Var.f6375c) && m12771c(a2Var.f6376d)) {
                    return true;
                }
            } else if (b instanceof C2535k2) {
                C2535k2 k2Var = (C2535k2) b;
                if ("com.apple.iTunes".equals(k2Var.f11871b) && "iTunSMPB".equals(k2Var.f11872c) && m12771c(k2Var.f11873d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
