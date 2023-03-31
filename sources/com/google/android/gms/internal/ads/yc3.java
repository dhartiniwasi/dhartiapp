package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yc3 implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f20555a;

    public yc3(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f20555a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f20555a.matcher(str).matches();
    }
}
