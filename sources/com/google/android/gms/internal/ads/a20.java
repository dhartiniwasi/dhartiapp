package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class a20 extends i20 {

    /* renamed from: i */
    private static final int f6377i;

    /* renamed from: r */
    static final int f6378r = Color.rgb(204, 204, 204);

    /* renamed from: s */
    static final int f6379s;

    /* renamed from: a */
    private final String f6380a;

    /* renamed from: b */
    private final List f6381b = new ArrayList();

    /* renamed from: c */
    private final List f6382c = new ArrayList();

    /* renamed from: d */
    private final int f6383d;

    /* renamed from: e */
    private final int f6384e;

    /* renamed from: f */
    private final int f6385f;

    /* renamed from: g */
    private final int f6386g;

    /* renamed from: h */
    private final int f6387h;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f6377i = rgb;
        f6379s = rgb;
    }

    public a20(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        this.f6380a = str;
        for (int i5 = 0; i5 < list.size(); i5++) {
            d20 d20 = (d20) list.get(i5);
            this.f6381b.add(d20);
            this.f6382c.add(d20);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = f6378r;
        }
        this.f6383d = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = f6379s;
        }
        this.f6384e = i4;
        this.f6385f = num3 != null ? num3.intValue() : 12;
        this.f6386g = i;
        this.f6387h = i2;
    }

    /* renamed from: J6 */
    public final int mo8179J6() {
        return this.f6385f;
    }

    /* renamed from: K6 */
    public final List mo8180K6() {
        return this.f6381b;
    }

    /* renamed from: U */
    public final List mo8181U() {
        return this.f6382c;
    }

    /* renamed from: a */
    public final int mo8182a() {
        return this.f6384e;
    }

    /* renamed from: b */
    public final int mo8183b() {
        return this.f6383d;
    }

    /* renamed from: c */
    public final String mo8184c() {
        return this.f6380a;
    }

    /* renamed from: d */
    public final int mo8185d() {
        return this.f6386g;
    }

    /* renamed from: e */
    public final int mo8186e() {
        return this.f6387h;
    }
}
