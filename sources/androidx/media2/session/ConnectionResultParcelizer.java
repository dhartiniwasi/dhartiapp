package androidx.media2.session;

import android.app.PendingIntent;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.C1506a;

public final class ConnectionResultParcelizer {
    public static ConnectionResult read(C1506a aVar) {
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.f3575a = aVar.mo5983v(connectionResult.f3575a, 0);
        connectionResult.f3577c = aVar.mo5937G(connectionResult.f3577c, 1);
        connectionResult.f3587m = aVar.mo5983v(connectionResult.f3587m, 10);
        connectionResult.f3588n = aVar.mo5983v(connectionResult.f3588n, 11);
        connectionResult.f3589o = (ParcelImplListSlice) aVar.mo5931A(connectionResult.f3589o, 12);
        connectionResult.f3590p = (SessionCommandGroup) aVar.mo5939I(connectionResult.f3590p, 13);
        connectionResult.f3591q = aVar.mo5983v(connectionResult.f3591q, 14);
        connectionResult.f3592r = aVar.mo5983v(connectionResult.f3592r, 15);
        connectionResult.f3593s = aVar.mo5983v(connectionResult.f3593s, 16);
        connectionResult.f3594t = aVar.mo5970k(connectionResult.f3594t, 17);
        connectionResult.f3595u = (VideoSize) aVar.mo5939I(connectionResult.f3595u, 18);
        connectionResult.f3596v = aVar.mo5984w(connectionResult.f3596v, 19);
        connectionResult.f3578d = (PendingIntent) aVar.mo5931A(connectionResult.f3578d, 2);
        connectionResult.f3597w = (SessionPlayer$TrackInfo) aVar.mo5939I(connectionResult.f3597w, 20);
        connectionResult.f3598x = (SessionPlayer$TrackInfo) aVar.mo5939I(connectionResult.f3598x, 21);
        connectionResult.f3599y = (SessionPlayer$TrackInfo) aVar.mo5939I(connectionResult.f3599y, 23);
        connectionResult.f3600z = (SessionPlayer$TrackInfo) aVar.mo5939I(connectionResult.f3600z, 24);
        connectionResult.f3573A = (MediaMetadata) aVar.mo5939I(connectionResult.f3573A, 25);
        connectionResult.f3574B = aVar.mo5983v(connectionResult.f3574B, 26);
        connectionResult.f3579e = aVar.mo5983v(connectionResult.f3579e, 3);
        connectionResult.f3581g = (MediaItem) aVar.mo5939I(connectionResult.f3581g, 4);
        connectionResult.f3582h = aVar.mo5986y(connectionResult.f3582h, 5);
        connectionResult.f3583i = aVar.mo5986y(connectionResult.f3583i, 6);
        connectionResult.f3584j = aVar.mo5980s(connectionResult.f3584j, 7);
        connectionResult.f3585k = aVar.mo5986y(connectionResult.f3585k, 8);
        connectionResult.f3586l = (MediaController$PlaybackInfo) aVar.mo5939I(connectionResult.f3586l, 9);
        connectionResult.mo3057c();
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, C1506a aVar) {
        aVar.mo5941K(false, false);
        connectionResult.mo3058d(aVar.mo5962g());
        aVar.mo5953Y(connectionResult.f3575a, 0);
        aVar.mo5969j0(connectionResult.f3577c, 1);
        aVar.mo5953Y(connectionResult.f3587m, 10);
        aVar.mo5953Y(connectionResult.f3588n, 11);
        aVar.mo5960d0(connectionResult.f3589o, 12);
        aVar.mo5975m0(connectionResult.f3590p, 13);
        aVar.mo5953Y(connectionResult.f3591q, 14);
        aVar.mo5953Y(connectionResult.f3592r, 15);
        aVar.mo5953Y(connectionResult.f3593s, 16);
        aVar.mo5945O(connectionResult.f3594t, 17);
        aVar.mo5975m0(connectionResult.f3595u, 18);
        aVar.mo5954Z(connectionResult.f3596v, 19);
        aVar.mo5960d0(connectionResult.f3578d, 2);
        aVar.mo5975m0(connectionResult.f3597w, 20);
        aVar.mo5975m0(connectionResult.f3598x, 21);
        aVar.mo5975m0(connectionResult.f3599y, 23);
        aVar.mo5975m0(connectionResult.f3600z, 24);
        aVar.mo5975m0(connectionResult.f3573A, 25);
        aVar.mo5953Y(connectionResult.f3574B, 26);
        aVar.mo5953Y(connectionResult.f3579e, 3);
        aVar.mo5975m0(connectionResult.f3581g, 4);
        aVar.mo5958b0(connectionResult.f3582h, 5);
        aVar.mo5958b0(connectionResult.f3583i, 6);
        aVar.mo5951W(connectionResult.f3584j, 7);
        aVar.mo5958b0(connectionResult.f3585k, 8);
        aVar.mo5975m0(connectionResult.f3586l, 9);
    }
}
