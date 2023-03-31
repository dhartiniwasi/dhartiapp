package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1506a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1506a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2011a = (IconCompat) aVar.mo5939I(remoteActionCompat.f2011a, 1);
        remoteActionCompat.f2012b = aVar.mo5977o(remoteActionCompat.f2012b, 2);
        remoteActionCompat.f2013c = aVar.mo5977o(remoteActionCompat.f2013c, 3);
        remoteActionCompat.f2014d = (PendingIntent) aVar.mo5931A(remoteActionCompat.f2014d, 4);
        remoteActionCompat.f2015e = aVar.mo5966i(remoteActionCompat.f2015e, 5);
        remoteActionCompat.f2016f = aVar.mo5966i(remoteActionCompat.f2016f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5975m0(remoteActionCompat.f2011a, 1);
        aVar.mo5949S(remoteActionCompat.f2012b, 2);
        aVar.mo5949S(remoteActionCompat.f2013c, 3);
        aVar.mo5960d0(remoteActionCompat.f2014d, 4);
        aVar.mo5943M(remoteActionCompat.f2015e, 5);
        aVar.mo5943M(remoteActionCompat.f2016f, 6);
    }
}
