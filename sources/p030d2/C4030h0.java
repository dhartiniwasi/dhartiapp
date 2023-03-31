package p030d2;

import java.util.UUID;
import p021c2.C1841b;
import p161w3.C5953m0;

/* renamed from: d2.h0 */
/* compiled from: FrameworkCryptoConfig */
public final class C4030h0 implements C1841b {

    /* renamed from: d */
    public static final boolean f23095d;

    /* renamed from: a */
    public final UUID f23096a;

    /* renamed from: b */
    public final byte[] f23097b;

    /* renamed from: c */
    public final boolean f23098c;

    static {
        boolean z;
        if ("Amazon".equals(C5953m0.f29112c)) {
            String str = C5953m0.f29113d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f23095d = z;
            }
        }
        z = false;
        f23095d = z;
    }

    public C4030h0(UUID uuid, byte[] bArr, boolean z) {
        this.f23096a = uuid;
        this.f23097b = bArr;
        this.f23098c = z;
    }
}
