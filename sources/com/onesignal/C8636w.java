package com.onesignal;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationServices;
import com.onesignal.C8338d3;
import com.pichillilorenzo.flutter_inappwebview.C8710R;

/* renamed from: com.onesignal.w */
/* compiled from: HMSLocationController */
class C8636w extends C8303b0 {

    /* renamed from: j */
    private static FusedLocationProviderClient f36095j;

    /* renamed from: k */
    static C8639c f36096k;

    /* renamed from: com.onesignal.w$a */
    /* compiled from: HMSLocationController */
    class C8637a implements OnFailureListener {
        C8637a() {
        }
    }

    /* renamed from: com.onesignal.w$b */
    /* compiled from: HMSLocationController */
    class C8638b implements OnSuccessListener<Location> {
        C8638b() {
        }
    }

    /* renamed from: com.onesignal.w$c */
    /* compiled from: HMSLocationController */
    static class C8639c extends LocationCallback {

        /* renamed from: a */
        private FusedLocationProviderClient f36097a;

        C8639c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.f36097a = fusedLocationProviderClient;
            m47804a();
        }

        /* renamed from: a */
        private void m47804a() {
            long j = C8338d3.m46518g1() ? 270000 : 570000;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (((double) j) * 1.5d)).setPriority(C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.f36097a.requestLocationUpdates(priority, this, C8303b0.m46290h().getLooper());
        }
    }

    /* renamed from: e */
    static void m47800e() {
        synchronized (C8303b0.f35333d) {
            f36095j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m47801l() {
        /*
            java.lang.Object r0 = com.onesignal.C8303b0.f35333d
            monitor-enter(r0)
            com.onesignal.d3$r0 r1 = com.onesignal.C8338d3.C8384r0.DEBUG     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "HMSLocationController onFocusChange!"
            com.onesignal.C8338d3.m46492a(r1, r2)     // Catch:{ all -> 0x002c }
            boolean r1 = com.onesignal.C8303b0.m46293k()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0016
            com.huawei.hms.location.FusedLocationProviderClient r1 = f36095j     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0016:
            com.huawei.hms.location.FusedLocationProviderClient r1 = f36095j     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            com.onesignal.w$c r2 = f36096k     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0021
            r1.removeLocationUpdates(r2)     // Catch:{ all -> 0x002c }
        L_0x0021:
            com.onesignal.w$c r1 = new com.onesignal.w$c     // Catch:{ all -> 0x002c }
            com.huawei.hms.location.FusedLocationProviderClient r2 = f36095j     // Catch:{ all -> 0x002c }
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            f36096k = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8636w.m47801l():void");
    }

    /* renamed from: p */
    static void m47802p() {
        m47803q();
    }

    /* renamed from: q */
    private static void m47803q() {
        synchronized (C8303b0.f35333d) {
            if (f36095j == null) {
                try {
                    f36095j = LocationServices.getFusedLocationProviderClient(C8303b0.f35336g);
                } catch (Exception e) {
                    C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                    C8338d3.m46492a(r0Var, "Huawei LocationServices getFusedLocationProviderClient failed! " + e);
                    m47800e();
                    return;
                }
            }
            Location location = C8303b0.f35337h;
            if (location != null) {
                C8303b0.m46286d(location);
            } else {
                f36095j.getLastLocation().addOnSuccessListener(new C8638b()).addOnFailureListener(new C8637a());
            }
        }
    }
}
