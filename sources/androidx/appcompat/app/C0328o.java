package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0693c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.o */
/* compiled from: TwilightManager */
class C0328o {

    /* renamed from: d */
    private static C0328o f877d;

    /* renamed from: a */
    private final Context f878a;

    /* renamed from: b */
    private final LocationManager f879b;

    /* renamed from: c */
    private final C0329a f880c = new C0329a();

    /* renamed from: androidx.appcompat.app.o$a */
    /* compiled from: TwilightManager */
    private static class C0329a {

        /* renamed from: a */
        boolean f881a;

        /* renamed from: b */
        long f882b;

        /* renamed from: c */
        long f883c;

        /* renamed from: d */
        long f884d;

        /* renamed from: e */
        long f885e;

        /* renamed from: f */
        long f886f;

        C0329a() {
        }
    }

    C0328o(Context context, LocationManager locationManager) {
        this.f878a = context;
        this.f879b = locationManager;
    }

    /* renamed from: a */
    static C0328o m1551a(Context context) {
        if (f877d == null) {
            Context applicationContext = context.getApplicationContext();
            f877d = new C0328o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f877d;
    }

    /* renamed from: b */
    private Location m1552b() {
        Location location = null;
        Location c = C0693c.m3183b(this.f878a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1553c("network") : null;
        if (C0693c.m3183b(this.f878a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1553c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m1553c(String str) {
        try {
            if (this.f879b.isProviderEnabled(str)) {
                return this.f879b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m1554e() {
        return this.f880c.f886f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m1555f(Location location) {
        long j;
        C0329a aVar = this.f880c;
        long currentTimeMillis = System.currentTimeMillis();
        C0327n b = C0327n.m1549b();
        C0327n nVar = b;
        nVar.mo1066a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f874a;
        nVar.mo1066a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f876c == 1;
        long j3 = b.f875b;
        long j4 = j2;
        long j5 = b.f874a;
        long j6 = j3;
        boolean z2 = z;
        b.mo1066a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f875b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f881a = z2;
        aVar.f882b = j4;
        aVar.f883c = j6;
        aVar.f884d = j5;
        aVar.f885e = j7;
        aVar.f886f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1067d() {
        C0329a aVar = this.f880c;
        if (m1554e()) {
            return aVar.f881a;
        }
        Location b = m1552b();
        if (b != null) {
            m1555f(b);
            return aVar.f881a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
