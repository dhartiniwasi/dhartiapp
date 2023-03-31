package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.onesignal.C8338d3;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p180z4.C6362b;

/* renamed from: com.onesignal.q */
/* compiled from: GMSLocationController */
class C8566q extends C8303b0 {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C8621u f35910j;

    /* renamed from: k */
    static C8570d f35911k;

    /* renamed from: com.onesignal.q$a */
    /* compiled from: GMSLocationController */
    class C8567a implements Runnable {
        C8567a() {
        }

        public void run() {
            try {
                Thread.sleep((long) C8566q.m47429s());
                C8338d3.m46492a(C8338d3.C8384r0.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                C8303b0.m46287e();
                C8303b0.m46295m(C8303b0.f35336g);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.onesignal.q$b */
    /* compiled from: GMSLocationController */
    static class C8568b {
        /* renamed from: a */
        static Location m47432a(GoogleApiClient googleApiClient) {
            synchronized (C8303b0.f35333d) {
                if (!googleApiClient.mo6966h()) {
                    return null;
                }
                Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
                return lastLocation;
            }
        }

        /* renamed from: b */
        static void m47433b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            try {
                synchronized (C8303b0.f35333d) {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.mo6966h()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                }
            } catch (Throwable th) {
                C8338d3.m46496b(C8338d3.C8384r0.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    /* renamed from: com.onesignal.q$c */
    /* compiled from: GMSLocationController */
    private static class C8569c implements GoogleApiClient.C2049b, GoogleApiClient.C2050c {
        private C8569c() {
        }

        /* renamed from: B0 */
        public void mo6954B0(C6362b bVar) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar);
            C8566q.m47424e();
        }

        /* renamed from: P0 */
        public void mo6918P0(Bundle bundle) {
            synchronized (C8303b0.f35333d) {
                if (C8566q.f35910j != null) {
                    if (C8566q.f35910j.mo28233c() != null) {
                        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                        C8338d3.m46492a(r0Var, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + C8303b0.f35337h);
                        if (C8303b0.f35337h == null) {
                            C8303b0.f35337h = C8568b.m47432a(C8566q.f35910j.mo28233c());
                            C8338d3.m46492a(r0Var, "GMSLocationController GoogleApiClientListener lastLocation: " + C8303b0.f35337h);
                            Location location = C8303b0.f35337h;
                            if (location != null) {
                                C8303b0.m46286d(location);
                            }
                        }
                        C8566q.f35911k = new C8570d(C8566q.f35910j.mo28233c());
                        return;
                    }
                }
                C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        /* renamed from: p */
        public void mo6919p(int i) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i);
            C8566q.m47424e();
        }

        /* synthetic */ C8569c(C8567a aVar) {
            this();
        }
    }

    /* renamed from: com.onesignal.q$d */
    /* compiled from: GMSLocationController */
    static class C8570d implements LocationListener {

        /* renamed from: a */
        private GoogleApiClient f35912a;

        C8570d(GoogleApiClient googleApiClient) {
            this.f35912a = googleApiClient;
            m47437a();
        }

        /* renamed from: a */
        private void m47437a() {
            long j = C8338d3.m46518g1() ? 270000 : 570000;
            if (this.f35912a != null) {
                LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (((double) j) * 1.5d)).setPriority(C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                C8568b.m47433b(this.f35912a, priority, this);
            }
        }
    }

    /* renamed from: e */
    static void m47424e() {
        synchronized (C8303b0.f35333d) {
            C8621u uVar = f35910j;
            if (uVar != null) {
                uVar.mo28232b();
            }
            f35910j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m47425l() {
        /*
            java.lang.Object r0 = com.onesignal.C8303b0.f35333d
            monitor-enter(r0)
            com.onesignal.d3$r0 r1 = com.onesignal.C8338d3.C8384r0.DEBUG     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "GMSLocationController onFocusChange!"
            com.onesignal.C8338d3.m46492a(r1, r2)     // Catch:{ all -> 0x0037 }
            com.onesignal.u r1 = f35910j     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.mo28233c()     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.mo6966h()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0035
        L_0x0019:
            com.onesignal.u r1 = f35910j     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.mo28233c()     // Catch:{ all -> 0x0037 }
            com.onesignal.q$d r2 = f35911k     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.location.FusedLocationProviderApi r2 = com.google.android.gms.location.LocationServices.FusedLocationApi     // Catch:{ all -> 0x0037 }
            com.onesignal.q$d r3 = f35911k     // Catch:{ all -> 0x0037 }
            r2.removeLocationUpdates(r1, r3)     // Catch:{ all -> 0x0037 }
        L_0x002c:
            com.onesignal.q$d r2 = new com.onesignal.q$d     // Catch:{ all -> 0x0037 }
            r2.<init>(r1)     // Catch:{ all -> 0x0037 }
            f35911k = r2     // Catch:{ all -> 0x0037 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8566q.m47425l():void");
    }

    /* renamed from: p */
    static void m47426p() {
        m47430t();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static int m47429s() {
        return 30000;
    }

    /* renamed from: t */
    private static void m47430t() {
        if (C8303b0.f35335f == null) {
            synchronized (C8303b0.f35333d) {
                m47431u();
                if (f35910j != null) {
                    Location location = C8303b0.f35337h;
                    if (location != null) {
                        C8303b0.m46286d(location);
                    }
                }
                C8569c cVar = new C8569c((C8567a) null);
                C8621u uVar = new C8621u(new GoogleApiClient.C2048a(C8303b0.f35336g).mo7938a(LocationServices.API).mo7939b(cVar).mo7940c(cVar).mo7942e(C8303b0.m46290h().f35339a).mo7941d());
                f35910j = uVar;
                uVar.mo28231a();
            }
        }
    }

    /* renamed from: u */
    private static void m47431u() {
        Thread thread = new Thread(new C8567a(), "OS_GMS_LOCATION_FALLBACK");
        C8303b0.f35335f = thread;
        thread.start();
    }
}
