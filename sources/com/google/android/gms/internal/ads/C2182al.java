package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.al */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2182al {

    /* renamed from: c */
    public static final C2593ln f6664c = new C3109zk();

    /* renamed from: d */
    private static final Pattern f6665d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f6666a = -1;

    /* renamed from: b */
    public int f6667b = -1;

    /* renamed from: a */
    public final boolean mo8426a() {
        return (this.f6666a == -1 || this.f6667b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo8427b(C2407gn gnVar) {
        for (int i = 0; i < gnVar.mo10581a(); i++) {
            C2370fn b = gnVar.mo10582b(i);
            if (b instanceof C2556kn) {
                C2556kn knVar = (C2556kn) b;
                String str = knVar.f12174c;
                String str2 = knVar.f12175d;
                if (!"iTunSMPB".equals(str)) {
                    continue;
                } else {
                    Matcher matcher = f6665d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f6666a = parseInt;
                                this.f6667b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
