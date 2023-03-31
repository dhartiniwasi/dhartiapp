package p033d5;

import android.app.Activity;
import android.content.Intent;

/* renamed from: d5.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4100e0 extends C4106g0 {

    /* renamed from: a */
    final /* synthetic */ Intent f23293a;

    /* renamed from: b */
    final /* synthetic */ Activity f23294b;

    /* renamed from: c */
    final /* synthetic */ int f23295c;

    C4100e0(Intent intent, Activity activity, int i) {
        this.f23293a = intent;
        this.f23294b = activity;
        this.f23295c = i;
    }

    /* renamed from: a */
    public final void mo17383a() {
        Intent intent = this.f23293a;
        if (intent != null) {
            this.f23294b.startActivityForResult(intent, this.f23295c);
        }
    }
}
