package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rv3;
import com.google.android.gms.internal.ads.sv3;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class sv3<MessageType extends sv3<MessageType, BuilderType>, BuilderType extends rv3<MessageType, BuilderType>> implements cz3 {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m20652h(java.lang.Iterable r3, java.util.List r4) {
        /*
            com.google.android.gms.internal.ads.cy3.m11233e(r3)
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0016
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            int r2 = r3.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L_0x0016:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0057
            int r3 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x0049:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0051
            r4.remove(r1)
            goto L_0x0049
        L_0x0051:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0057:
            r4.add(r1)
            goto L_0x001e
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sv3.m20652h(java.lang.Iterable, java.util.List):void");
    }

    /* renamed from: b */
    public final byte[] mo9400b() {
        try {
            byte[] bArr = new byte[mo9404l()];
            zw3 h = zw3.m24871h(bArr);
            mo9403f(h);
            h.mo15670j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: e */
    public final jw3 mo9402e() {
        try {
            int l = mo9404l();
            jw3 jw3 = jw3.f11808b;
            byte[] bArr = new byte[l];
            zw3 h = zw3.m24871h(bArr);
            mo9403f(h);
            h.mo15670j();
            return new fw3(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo14147g() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14148i(int i) {
        throw null;
    }

    /* renamed from: j */
    public final void mo14149j(OutputStream outputStream) throws IOException {
        zw3 i = zw3.m24872i(outputStream, zw3.m24866c(mo9404l()));
        mo9403f(i);
        i.mo14834m();
    }
}
