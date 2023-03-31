package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class kz0 {

    /* renamed from: a */
    private final int f12515a;

    /* renamed from: b */
    private final int f12516b;

    /* renamed from: c */
    private final int f12517c;

    /* renamed from: d */
    private final int f12518d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f12519e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f12520f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12521g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ua3 f12522h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ua3 f12523i;

    /* renamed from: j */
    private final int f12524j;

    /* renamed from: k */
    private final int f12525k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ua3 f12526l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ua3 f12527m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f12528n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final HashMap f12529o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final HashSet f12530p;

    @Deprecated
    public kz0() {
        this.f12515a = Integer.MAX_VALUE;
        this.f12516b = Integer.MAX_VALUE;
        this.f12517c = Integer.MAX_VALUE;
        this.f12518d = Integer.MAX_VALUE;
        this.f12519e = Integer.MAX_VALUE;
        this.f12520f = Integer.MAX_VALUE;
        this.f12521g = true;
        this.f12522h = ua3.m21508w();
        this.f12523i = ua3.m21508w();
        this.f12524j = Integer.MAX_VALUE;
        this.f12525k = Integer.MAX_VALUE;
        this.f12526l = ua3.m21508w();
        this.f12527m = ua3.m21508w();
        this.f12528n = 0;
        this.f12529o = new HashMap();
        this.f12530p = new HashSet();
    }

    /* renamed from: d */
    public final kz0 mo11825d(Context context) {
        CaptioningManager captioningManager;
        if ((gb2.f9812a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f12528n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f12527m = ua3.m21509x(gb2.m13180n(locale));
            }
        }
        return this;
    }

    /* renamed from: e */
    public kz0 mo10825e(int i, int i2, boolean z) {
        this.f12519e = i;
        this.f12520f = i2;
        this.f12521g = true;
        return this;
    }

    protected kz0(l01 l01) {
        this.f12515a = Integer.MAX_VALUE;
        this.f12516b = Integer.MAX_VALUE;
        this.f12517c = Integer.MAX_VALUE;
        this.f12518d = Integer.MAX_VALUE;
        this.f12519e = l01.f12569i;
        this.f12520f = l01.f12570j;
        this.f12521g = l01.f12571k;
        this.f12522h = l01.f12572l;
        this.f12523i = l01.f12574n;
        this.f12524j = Integer.MAX_VALUE;
        this.f12525k = Integer.MAX_VALUE;
        this.f12526l = l01.f12578r;
        this.f12527m = l01.f12579s;
        this.f12528n = l01.f12580t;
        this.f12530p = new HashSet(l01.f12586z);
        this.f12529o = new HashMap(l01.f12585y);
    }
}
