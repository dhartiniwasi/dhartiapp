package p033d5;

import android.os.Bundle;
import p180z4.C6362b;

/* renamed from: d5.v0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class C4154v0 extends C4104f1 {

    /* renamed from: d */
    public final int f23416d;

    /* renamed from: e */
    public final Bundle f23417e;

    /* renamed from: f */
    final /* synthetic */ C4087c f23418f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C4154v0(C4087c cVar, int i, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f23418f = cVar;
        this.f23416d = i;
        this.f23417e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17387a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f23416d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo17408g()
            if (r3 != 0) goto L_0x001b
            d5.c r3 = r2.f23418f
            r3.m28044m0(r0, (android.os.IInterface) null)
            z4.b r3 = new z4.b
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo17407f(r3)
        L_0x001b:
            return
        L_0x001c:
            d5.c r3 = r2.f23418f
            r3.m28044m0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f23417e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            z4.b r3 = new z4.b
            int r0 = r2.f23416d
            r3.<init>(r0, r1)
            r2.mo17407f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033d5.C4154v0.mo17387a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17388b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo17407f(C6362b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo17408g();
}
