package p174y4;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: y4.s */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C6162s {

    /* renamed from: a */
    private final Messenger f29615a;

    /* renamed from: b */
    private final C6152i f29616b;

    C6162s(IBinder iBinder) throws RemoteException {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f29615a = new Messenger(iBinder);
            this.f29616b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f29616b = new C6152i(iBinder);
            this.f29615a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21038a(Message message) throws RemoteException {
        Messenger messenger = this.f29615a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C6152i iVar = this.f29616b;
        if (iVar != null) {
            iVar.mo21017b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
