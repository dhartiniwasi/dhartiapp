package androidx.media2.session;

import androidx.versionedparcelable.C1506a;

public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(C1506a aVar) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.f3569a = aVar.mo5983v(connectionRequest.f3569a, 0);
        connectionRequest.f3570b = aVar.mo5935E(connectionRequest.f3570b, 1);
        connectionRequest.f3571c = aVar.mo5983v(connectionRequest.f3571c, 2);
        connectionRequest.f3572d = aVar.mo5970k(connectionRequest.f3572d, 3);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, C1506a aVar) {
        aVar.mo5941K(false, false);
        aVar.mo5953Y(connectionRequest.f3569a, 0);
        aVar.mo5965h0(connectionRequest.f3570b, 1);
        aVar.mo5953Y(connectionRequest.f3571c, 2);
        aVar.mo5945O(connectionRequest.f3572d, 3);
    }
}
