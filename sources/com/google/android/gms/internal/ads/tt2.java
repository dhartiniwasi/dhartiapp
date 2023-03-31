package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tt2 {

    /* renamed from: a */
    private final Pattern f18246a;

    public tt2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) C4596v.m30088c().mo12227b(C2679nz.f14467W5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f18246a = pattern;
    }

    /* renamed from: a */
    public final String mo14382a(String str) {
        Pattern pattern = this.f18246a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
