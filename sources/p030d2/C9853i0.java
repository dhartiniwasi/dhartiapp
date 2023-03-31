package p030d2;

import android.media.MediaDrm;
import p030d2.C4016g0;

/* renamed from: d2.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C9853i0 implements MediaDrm.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ C4031k0 f39634a;

    /* renamed from: b */
    public final /* synthetic */ C4016g0.C4018b f39635b;

    public /* synthetic */ C9853i0(C4031k0 k0Var, C4016g0.C4018b bVar) {
        this.f39634a = k0Var;
        this.f39635b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f39634a.m27798z(this.f39635b, mediaDrm, bArr, i, i2, bArr2);
    }
}
