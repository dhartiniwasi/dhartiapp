package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.io */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2483io implements C2333eo {

    /* renamed from: a */
    private final C2333eo[] f10886a;

    /* renamed from: b */
    private final ArrayList f10887b;

    /* renamed from: c */
    private final C2217bj f10888c = new C2217bj();

    /* renamed from: d */
    private C2296do f10889d;

    /* renamed from: e */
    private C2254cj f10890e;

    /* renamed from: f */
    private int f10891f = -1;

    /* renamed from: g */
    private C2445ho f10892g;

    public C2483io(C2333eo... eoVarArr) {
        this.f10886a = eoVarArr;
        this.f10887b = new ArrayList(Arrays.asList(eoVarArr));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m14458d(C2483io ioVar, int i, C2254cj cjVar, Object obj) {
        C2445ho hoVar;
        if (ioVar.f10892g == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                cjVar.mo9187g(i2, ioVar.f10888c, false);
            }
            int i3 = ioVar.f10891f;
            if (i3 == -1) {
                ioVar.f10891f = 1;
            } else if (i3 != 1) {
                hoVar = new C2445ho(1);
                ioVar.f10892g = hoVar;
            }
            hoVar = null;
            ioVar.f10892g = hoVar;
        }
        if (ioVar.f10892g == null) {
            ioVar.f10887b.remove(ioVar.f10886a[i]);
            if (i == 0) {
                ioVar.f10890e = cjVar;
            }
            if (ioVar.f10887b.isEmpty()) {
                ioVar.f10889d.mo8447d(ioVar.f10890e, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final C2259co mo8444a(int i, C2781qp qpVar) {
        int length = this.f10886a.length;
        C2259co[] coVarArr = new C2259co[length];
        for (int i2 = 0; i2 < length; i2++) {
            coVarArr[i2] = this.f10886a[i2].mo8444a(i, qpVar);
        }
        return new C2371fo(coVarArr);
    }

    /* renamed from: b */
    public final void mo8445b() {
        for (C2333eo b : this.f10886a) {
            b.mo8445b();
        }
    }

    /* renamed from: c */
    public final void mo8446c(C2402gi giVar, boolean z, C2296do doVar) {
        this.f10889d = doVar;
        int i = 0;
        while (true) {
            C2333eo[] eoVarArr = this.f10886a;
            if (i < eoVarArr.length) {
                eoVarArr[i].mo8446c(giVar, false, new C2408go(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo8448e(C2259co coVar) {
        C2371fo foVar = (C2371fo) coVar;
        int i = 0;
        while (true) {
            C2333eo[] eoVarArr = this.f10886a;
            if (i < eoVarArr.length) {
                eoVarArr[i].mo8448e(foVar.f9364a[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zza() throws IOException {
        C2445ho hoVar = this.f10892g;
        if (hoVar == null) {
            for (C2333eo zza : this.f10886a) {
                zza.zza();
            }
            return;
        }
        throw hoVar;
    }
}
