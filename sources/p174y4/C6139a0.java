package p174y4;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p218e6.C9959a;
import p218e6.C9975i;

/* renamed from: y4.a0 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C6139a0 implements C9959a {

    /* renamed from: a */
    public static final /* synthetic */ C6139a0 f29573a = new C6139a0();

    private /* synthetic */ C6139a0() {
    }

    /* renamed from: a */
    public final Object mo279a(C9975i iVar) {
        if (iVar.mo26362q()) {
            return (Bundle) iVar.mo26358m();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.mo26357l());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.mo26357l());
    }
}
