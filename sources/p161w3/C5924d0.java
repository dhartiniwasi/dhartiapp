package p161w3;

import android.os.SystemClock;
import com.startapp.C8843b4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p155v3.C5810h0;

/* renamed from: w3.d0 */
/* compiled from: SntpClient */
public final class C5924d0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f29059a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f29060b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f29061c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f29062d = 0;

    /* renamed from: e */
    private static String f29063e = "time.android.com";

    /* renamed from: w3.d0$b */
    /* compiled from: SntpClient */
    public interface C5926b {
        /* renamed from: a */
        void mo7732a(IOException iOException);

        /* renamed from: b */
        void mo7733b();
    }

    /* renamed from: w3.d0$c */
    /* compiled from: SntpClient */
    private static final class C5927c implements C5810h0.C5812b<C5810h0.C5815e> {

        /* renamed from: a */
        private final C5926b f29064a;

        public C5927c(C5926b bVar) {
            this.f29064a = bVar;
        }

        /* renamed from: j */
        public void mo6780j(C5810h0.C5815e eVar, long j, long j2) {
            if (this.f29064a == null) {
                return;
            }
            if (!C5924d0.m34952k()) {
                this.f29064a.mo7732a(new IOException(new ConcurrentModificationException()));
            } else {
                this.f29064a.mo7733b();
            }
        }

        /* renamed from: o */
        public C5810h0.C5813c mo6783o(C5810h0.C5815e eVar, long j, long j2, IOException iOException, int i) {
            C5926b bVar = this.f29064a;
            if (bVar != null) {
                bVar.mo7732a(iOException);
            }
            return C5810h0.f28823f;
        }

        /* renamed from: q */
        public void mo6784q(C5810h0.C5815e eVar, long j, long j2, boolean z) {
        }
    }

    /* renamed from: w3.d0$d */
    /* compiled from: SntpClient */
    private static final class C5928d implements C5810h0.C5815e {
        private C5928d() {
        }

        /* renamed from: b */
        public void mo6786b() throws IOException {
            synchronized (C5924d0.f29059a) {
                synchronized (C5924d0.f29060b) {
                    if (!C5924d0.f29061c) {
                        long e = C5924d0.m34953l();
                        synchronized (C5924d0.f29060b) {
                            long unused = C5924d0.f29062d = e;
                            boolean unused2 = C5924d0.f29061c = true;
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo6787c() {
        }
    }

    /* renamed from: g */
    private static void m34948g(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + b2);
        } else if (i == 0 || i > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: h */
    public static long m34949h() {
        long j;
        synchronized (f29060b) {
            j = f29061c ? f29062d : -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: i */
    public static String m34950i() {
        String str;
        synchronized (f29060b) {
            str = f29063e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m34951j(C5810h0 h0Var, C5926b bVar) {
        if (!m34952k()) {
            if (h0Var == null) {
                h0Var = new C5810h0("SntpClient");
            }
            h0Var.mo20341n(new C5928d(), new C5927c(bVar), 1);
        } else if (bVar != null) {
            bVar.mo7733b();
        }
    }

    /* renamed from: k */
    public static boolean m34952k() {
        boolean z;
        synchronized (f29060b) {
            z = f29061c;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static long m34953l() throws IOException {
        InetAddress byName = InetAddress.getByName(m34950i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m34956o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            long n = m34955n(bArr, 24);
            long n2 = m34955n(bArr, 32);
            long n3 = m34955n(bArr, 40);
            m34948g((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), bArr[1] & 255, n3);
            long j2 = (j + (((n2 - n) + (n3 - j)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: m */
    private static long m34954m(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + C8843b4.f36445d;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* renamed from: n */
    private static long m34955n(byte[] bArr, int i) {
        long m = m34954m(bArr, i);
        long m2 = m34954m(bArr, i + 4);
        if (m == 0 && m2 == 0) {
            return 0;
        }
        return ((m - 2208988800L) * 1000) + ((m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    private static void m34956o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j4 >> 24));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j4 >> 16));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j4 >> 8));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j4 >> 0));
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j5 >> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j5 >> 16));
        bArr[i7] = (byte) ((int) (j5 >> 8));
        bArr[i7 + 1] = (byte) ((int) (Math.random() * 255.0d));
    }
}
