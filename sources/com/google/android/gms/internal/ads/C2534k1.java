package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.k1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2534k1 {

    /* renamed from: a */
    private final ByteArrayOutputStream f11861a;

    /* renamed from: b */
    private final DataOutputStream f11862b;

    public C2534k1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f11861a = byteArrayOutputStream;
        this.f11862b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m15150b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] mo11553a(C2497j1 j1Var) {
        this.f11861a.reset();
        try {
            m15150b(this.f11862b, j1Var.f11164a);
            String str = j1Var.f11165b;
            if (str == null) {
                str = "";
            }
            m15150b(this.f11862b, str);
            this.f11862b.writeLong(j1Var.f11166c);
            this.f11862b.writeLong(j1Var.f11167d);
            this.f11862b.write(j1Var.f11168e);
            this.f11862b.flush();
            return this.f11861a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
