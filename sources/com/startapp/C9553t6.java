package com.startapp;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.startapp.t6 */
/* compiled from: Sta */
public final class C9553t6 {

    /* renamed from: c */
    public static final List<String> f39188c = Arrays.asList(new String[]{"portrait", "landscape", "none"});

    /* renamed from: a */
    public boolean f39189a;

    /* renamed from: b */
    public int f39190b;

    public C9553t6() {
        this(true, 2);
    }

    /* renamed from: a */
    public static int m50360a(String str) {
        int indexOf = f39188c.indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public C9553t6(boolean z, int i) {
        this.f39189a = z;
        this.f39190b = i;
    }
}
