package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2985w7 {

    /* renamed from: a */
    public final int f19511a;

    /* renamed from: b */
    public final String f19512b;

    /* renamed from: c */
    public final List f19513c;

    /* renamed from: d */
    public final byte[] f19514d;

    public C2985w7(int i, String str, List list, byte[] bArr) {
        List list2;
        this.f19511a = i;
        this.f19512b = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f19513c = list2;
        this.f19514d = bArr;
    }
}
