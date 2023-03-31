package com.startapp.networkTest.controller;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.startapp.C8821a5;
import com.startapp.C9060k2;
import com.startapp.C9603va;
import com.startapp.C9632x2;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.enums.LocationProviders;
import java.util.List;

/* compiled from: Sta */
public class LocationController {

    /* renamed from: j */
    private static double f37371j = 0.0d;

    /* renamed from: k */
    private static double f37372k = 0.0d;

    /* renamed from: l */
    private static final String f37373l = "LocationController";

    /* renamed from: m */
    private static final boolean f37374m = false;

    /* renamed from: a */
    private LocationManager f37375a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f37376b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LocationInfo f37377c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Location f37378d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f37379e;

    /* renamed from: f */
    private C9161b f37380f;

    /* renamed from: g */
    private long f37381g = 4000;

    /* renamed from: h */
    private boolean f37382h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9162c f37383i;

    /* compiled from: Sta */
    public enum ProviderMode {
        Passive,
        Network,
        Gps,
        GpsAndNetwork,
        RailNet
    }

    /* renamed from: com.startapp.networkTest.controller.LocationController$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C9160a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37390a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.networkTest.controller.LocationController$ProviderMode[] r0 = com.startapp.networkTest.controller.LocationController.ProviderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37390a = r0
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Gps     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37390a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.GpsAndNetwork     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37390a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Network     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37390a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Passive     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.networkTest.controller.LocationController.C9160a.<clinit>():void");
        }
    }

    /* renamed from: com.startapp.networkTest.controller.LocationController$b */
    /* compiled from: Sta */
    public class C9161b implements LocationListener {
        private C9161b() {
        }

        public void onLocationChanged(Location location) {
            if (location != null && location.getProvider() != null) {
                if (LocationController.this.f37378d == null || location.getProvider().equals("gps") || LocationController.this.f37378d.getProvider() == null || !LocationController.this.f37378d.getProvider().equals("gps") || SystemClock.elapsedRealtime() - LocationController.this.f37376b >= 5000) {
                    Location unused = LocationController.this.f37378d = location;
                    long unused2 = LocationController.this.f37379e = SystemClock.elapsedRealtime();
                    LocationInfo unused3 = LocationController.this.f37377c = LocationController.m49024b(location);
                    LocationController.this.f37377c.LocationAge = 0;
                    long unused4 = LocationController.this.f37376b = SystemClock.elapsedRealtime();
                    if (LocationController.this.f37383i != null) {
                        LocationController.this.f37383i.mo29731a(LocationController.this.f37377c);
                    }
                    if (location.getProvider().equals("gps")) {
                        C8821a5.m48258f().mo31331a(location);
                    }
                }
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        public /* synthetic */ C9161b(LocationController locationController, C9160a aVar) {
            this();
        }
    }

    /* renamed from: com.startapp.networkTest.controller.LocationController$c */
    /* compiled from: Sta */
    public interface C9162c {
        /* renamed from: a */
        void mo29731a(LocationInfo locationInfo);
    }

    public LocationController(Context context) {
        this.f37375a = (LocationManager) context.getSystemService("location");
        this.f37380f = new C9161b(this, (C9160a) null);
    }

    /* renamed from: e */
    public long mo29725e() {
        return this.f37381g;
    }

    /* renamed from: f */
    public void mo29726f() {
        C9161b bVar;
        LocationManager locationManager = this.f37375a;
        if (!(locationManager == null || (bVar = this.f37380f) == null)) {
            try {
                locationManager.removeUpdates(bVar);
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        this.f37382h = false;
    }

    /* renamed from: d */
    private void m49027d() {
        Location location;
        List<String> allProviders = this.f37375a.getAllProviders();
        Location location2 = null;
        if (allProviders != null && allProviders.size() > 0) {
            Location location3 = null;
            for (int i = 0; i < allProviders.size(); i++) {
                try {
                    location = this.f37375a.getLastKnownLocation(allProviders.get(i));
                } catch (SecurityException e) {
                    C9632x2.m50512b(e);
                    location = null;
                    location3 = location;
                } catch (Throwable th) {
                    C9632x2.m50510a(th);
                    location = null;
                    location3 = location;
                }
                if (location != null && (location3 == null || location.getTime() > location3.getTime())) {
                    location3 = location;
                }
            }
            location2 = location3;
        }
        if (location2 != null) {
            this.f37378d = location2;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f37379e = location2.getElapsedRealtimeNanos() / 1000000;
            } else {
                this.f37379e = (System.currentTimeMillis() - location2.getTime()) + SystemClock.elapsedRealtime();
            }
            this.f37377c = m49024b(location2);
        }
    }

    /* renamed from: c */
    public LocationInfo mo29724c() {
        if (this.f37377c == null) {
            m49027d();
        }
        if (this.f37377c == null) {
            LocationInfo locationInfo = new LocationInfo();
            this.f37377c = locationInfo;
            locationInfo.LocationProvider = LocationProviders.Unknown;
        }
        LocationInfo locationInfo2 = this.f37377c;
        if (locationInfo2.LocationProvider != LocationProviders.Unknown) {
            locationInfo2.LocationAge = SystemClock.elapsedRealtime() - this.f37379e;
        }
        LocationInfo locationInfo3 = this.f37377c;
        f37371j = locationInfo3.LocationLatitude;
        f37372k = locationInfo3.LocationLongitude;
        try {
            return (LocationInfo) locationInfo3.clone();
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return this.f37377c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static LocationInfo m49024b(Location location) {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.LocationAccuracyHorizontal = (double) location.getAccuracy();
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || !location.hasVerticalAccuracy()) {
            locationInfo.LocationAccuracyVertical = (double) location.getAccuracy();
        } else {
            locationInfo.LocationAccuracyVertical = (double) location.getVerticalAccuracyMeters();
        }
        long d = C9603va.m50435d();
        locationInfo.locationTimestampMillis = d;
        locationInfo.LocationTimestamp = C9060k2.m48736b(d);
        locationInfo.LocationAltitude = location.getAltitude();
        locationInfo.LocationBearing = (double) location.getBearing();
        locationInfo.LocationLatitude = location.getLatitude();
        locationInfo.LocationLongitude = location.getLongitude();
        if (i >= 18) {
            locationInfo.IsMocked = location.isFromMockProvider() ? 1 : 0;
        }
        if (location.getProvider() == null) {
            locationInfo.LocationProvider = LocationProviders.Unknown;
        } else if (location.getProvider().equals("gps")) {
            locationInfo.LocationProvider = LocationProviders.Gps;
        } else if (location.getProvider().equals("network")) {
            locationInfo.LocationProvider = LocationProviders.Network;
        } else if (location.getProvider().equals("fused")) {
            locationInfo.LocationProvider = LocationProviders.Fused;
        } else {
            locationInfo.LocationProvider = LocationProviders.Unknown;
        }
        locationInfo.LocationSpeed = (double) location.getSpeed();
        return locationInfo;
    }

    /* renamed from: a */
    public void mo29722a(ProviderMode providerMode) {
        LocationManager locationManager;
        boolean z;
        boolean z2;
        if (providerMode != null && (locationManager = this.f37375a) != null) {
            this.f37382h = true;
            List<String> allProviders = locationManager.getAllProviders();
            boolean z3 = false;
            if (allProviders != null) {
                boolean z4 = false;
                z2 = false;
                z = false;
                for (String next : allProviders) {
                    next.getClass();
                    char c = 65535;
                    switch (next.hashCode()) {
                        case -792039641:
                            if (next.equals("passive")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 102570:
                            if (next.equals("gps")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1843485230:
                            if (next.equals("network")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            z = true;
                            break;
                        case 1:
                            z4 = true;
                            break;
                        case 2:
                            z2 = true;
                            break;
                    }
                }
                z3 = z4;
            } else {
                z2 = false;
                z = false;
            }
            try {
                int i = C9160a.f37390a[providerMode.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (z3) {
                            this.f37375a.requestLocationUpdates("gps", 500, 5.0f, this.f37380f);
                        }
                        if (z2) {
                            this.f37375a.requestLocationUpdates("network", 0, 0.0f, this.f37380f);
                        }
                    } else if (i != 3) {
                        if (i == 4) {
                            if (z) {
                                this.f37375a.requestLocationUpdates("passive", 0, 0.0f, this.f37380f);
                            }
                        }
                    } else if (z2) {
                        this.f37375a.requestLocationUpdates("network", 0, 0.0f, this.f37380f);
                    }
                } else if (z3) {
                    this.f37375a.requestLocationUpdates("gps", 500, 5.0f, this.f37380f);
                }
            } catch (SecurityException e) {
                C9632x2.m50512b(e);
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo29723a(C9162c cVar) {
        this.f37383i = cVar;
    }

    /* renamed from: a */
    public static double m49015a() {
        return f37371j;
    }

    /* renamed from: a */
    public void mo29721a(long j) {
        this.f37381g = j;
    }

    /* renamed from: b */
    public static double m49021b() {
        return f37372k;
    }
}
