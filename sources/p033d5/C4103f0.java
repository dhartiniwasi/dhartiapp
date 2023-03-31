package p033d5;

import android.content.Intent;
import p017b5.C1793e;

/* renamed from: d5.f0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4103f0 extends C4106g0 {

    /* renamed from: a */
    final /* synthetic */ Intent f23313a;

    /* renamed from: b */
    final /* synthetic */ C1793e f23314b;

    C4103f0(Intent intent, C1793e eVar, int i) {
        this.f23313a = intent;
        this.f23314b = eVar;
    }

    /* renamed from: a */
    public final void mo17383a() {
        Intent intent = this.f23313a;
        if (intent != null) {
            this.f23314b.startActivityForResult(intent, 2);
        }
    }
}
