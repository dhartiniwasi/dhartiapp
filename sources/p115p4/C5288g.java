package p115p4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: p4.g */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C5288g {

    /* renamed from: a */
    private final String f27280a;

    /* synthetic */ C5288g(C5284e eVar, C5286f fVar) {
        this.f27280a = eVar.f27275a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2378fv mo19274a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f27280a
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1999289321: goto L_0x002b;
                case -1372958932: goto L_0x0021;
                case 543046670: goto L_0x0017;
                case 1951953708: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 3
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0047
            if (r0 == r3) goto L_0x0044
            if (r0 == r2) goto L_0x0041
            com.google.android.gms.internal.ads.fv r0 = com.google.android.gms.internal.ads.C2378fv.AD_INITIATER_UNSPECIFIED
            return r0
        L_0x0041:
            com.google.android.gms.internal.ads.fv r0 = com.google.android.gms.internal.ads.C2378fv.REWARD_BASED_VIDEO_AD
            return r0
        L_0x0044:
            com.google.android.gms.internal.ads.fv r0 = com.google.android.gms.internal.ads.C2378fv.AD_LOADER
            return r0
        L_0x0047:
            com.google.android.gms.internal.ads.fv r0 = com.google.android.gms.internal.ads.C2378fv.INTERSTITIAL
            return r0
        L_0x004a:
            com.google.android.gms.internal.ads.fv r0 = com.google.android.gms.internal.ads.C2378fv.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p115p4.C5288g.mo19274a():com.google.android.gms.internal.ads.fv");
    }

    /* renamed from: b */
    public final String mo19275b() {
        return this.f27280a.toLowerCase(Locale.ROOT);
    }

    /* renamed from: c */
    public final Set mo19276c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f27280a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
