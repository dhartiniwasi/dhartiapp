package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nm3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f14114a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f14115b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f14116c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f14117d;

    public nm3() {
        this.f14114a = new HashMap();
        this.f14115b = new HashMap();
        this.f14116c = new HashMap();
        this.f14117d = new HashMap();
    }

    /* renamed from: a */
    public final nm3 mo12663a(ol3 ol3) throws GeneralSecurityException {
        pm3 pm3 = new pm3(ol3.mo12975b(), ol3.mo12974a(), (om3) null);
        if (this.f14115b.containsKey(pm3)) {
            ol3 ol32 = (ol3) this.f14115b.get(pm3);
            if (!ol32.equals(ol3) || !ol3.equals(ol32)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(pm3.toString()));
            }
        } else {
            this.f14115b.put(pm3, ol3);
        }
        return this;
    }

    /* renamed from: b */
    public final nm3 mo12664b(rl3 rl3) throws GeneralSecurityException {
        rm3 rm3 = new rm3(rl3.mo13850a(), rl3.mo13851b(), (qm3) null);
        if (this.f14114a.containsKey(rm3)) {
            rl3 rl32 = (rl3) this.f14114a.get(rm3);
            if (!rl32.equals(rl3) || !rl3.equals(rl32)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(rm3.toString()));
            }
        } else {
            this.f14114a.put(rm3, rl3);
        }
        return this;
    }

    /* renamed from: c */
    public final nm3 mo12665c(fm3 fm3) throws GeneralSecurityException {
        pm3 pm3 = new pm3(fm3.mo10215b(), fm3.mo10214a(), (om3) null);
        if (this.f14117d.containsKey(pm3)) {
            fm3 fm32 = (fm3) this.f14117d.get(pm3);
            if (!fm32.equals(fm3) || !fm3.equals(fm32)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(pm3.toString()));
            }
        } else {
            this.f14117d.put(pm3, fm3);
        }
        return this;
    }

    /* renamed from: d */
    public final nm3 mo12666d(im3 im3) throws GeneralSecurityException {
        rm3 rm3 = new rm3(im3.mo11165a(), im3.mo11166b(), (qm3) null);
        if (this.f14116c.containsKey(rm3)) {
            im3 im32 = (im3) this.f14116c.get(rm3);
            if (!im32.equals(im3) || !im3.equals(im32)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(rm3.toString()));
            }
        } else {
            this.f14116c.put(rm3, im3);
        }
        return this;
    }

    public nm3(tm3 tm3) {
        this.f14114a = new HashMap(tm3.f18162a);
        this.f14115b = new HashMap(tm3.f18163b);
        this.f14116c = new HashMap(tm3.f18164c);
        this.f14117d = new HashMap(tm3.f18165d);
    }
}
