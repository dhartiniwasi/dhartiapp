package p092m2;

import java.nio.ByteBuffer;
import java.util.UUID;
import p161w3.C5918a0;
import p161w3.C5961r;

/* renamed from: m2.l */
/* compiled from: PsshAtomUtil */
public final class C5023l {

    /* renamed from: m2.l$a */
    /* compiled from: PsshAtomUtil */
    private static class C5024a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final UUID f26327a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f26328b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final byte[] f26329c;

        public C5024a(UUID uuid, int i, byte[] bArr) {
            this.f26327a = uuid;
            this.f26328b = i;
            this.f26329c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m31708a(UUID uuid, byte[] bArr) {
        return m31709b(uuid, (UUID[]) null, bArr);
    }

    /* renamed from: b */
    public static byte[] m31709b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m31710c(byte[] bArr) {
        return m31711d(bArr) != null;
    }

    /* renamed from: d */
    private static C5024a m31711d(byte[] bArr) {
        C5918a0 a0Var = new C5918a0(bArr);
        if (a0Var.mo20553f() < 32) {
            return null;
        }
        a0Var.mo20546O(0);
        if (a0Var.mo20560m() != a0Var.mo20548a() + 4 || a0Var.mo20560m() != 1886614376) {
            return null;
        }
        int c = C5002a.m31555c(a0Var.mo20560m());
        if (c > 1) {
            C5961r.m35215i("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(a0Var.mo20569v(), a0Var.mo20569v());
        if (c == 1) {
            a0Var.mo20547P(a0Var.mo20538G() * 16);
        }
        int G = a0Var.mo20538G();
        if (G != a0Var.mo20548a()) {
            return null;
        }
        byte[] bArr2 = new byte[G];
        a0Var.mo20557j(bArr2, 0, G);
        return new C5024a(uuid, c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m31712e(byte[] bArr, UUID uuid) {
        C5024a d = m31711d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.f26327a)) {
            return d.f26329c;
        }
        C5961r.m35215i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.f26327a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m31713f(byte[] bArr) {
        C5024a d = m31711d(bArr);
        if (d == null) {
            return null;
        }
        return d.f26327a;
    }

    /* renamed from: g */
    public static int m31714g(byte[] bArr) {
        C5024a d = m31711d(bArr);
        if (d == null) {
            return -1;
        }
        return d.f26328b;
    }
}
