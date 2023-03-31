package p180z4;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p123q5.C5412j;

/* renamed from: z4.o */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C6387o extends C5412j {

    /* renamed from: a */
    private final Context f30636a;

    /* renamed from: b */
    final /* synthetic */ C6368e f30637b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6387o(C6368e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f30637b = eVar;
        this.f30636a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = this.f30637b.mo21776i(this.f30636a);
        if (this.f30637b.mo21778m(i2)) {
            this.f30637b.mo21782s(this.f30636a, i2);
        }
    }
}
