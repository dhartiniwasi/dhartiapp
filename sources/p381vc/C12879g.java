package p381vc;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p336qe.C12231c;
import p336qe.C12233d;
import p336qe.C12234e;
import p336qe.C12235f;
import p336qe.C12252t;
import p336qe.C12253u;
import p381vc.C12871b;
import p381vc.C12876f;

/* renamed from: vc.g */
/* compiled from: Http2 */
public final class C12879g implements C12887j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f47040a = Logger.getLogger(C12881b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C12235f f47041b = C12235f.m58766o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: vc.g$a */
    /* compiled from: Http2 */
    static final class C12880a implements C12252t {

        /* renamed from: a */
        private final C12234e f47042a;

        /* renamed from: b */
        int f47043b;

        /* renamed from: c */
        byte f47044c;

        /* renamed from: d */
        int f47045d;

        /* renamed from: e */
        int f47046e;

        /* renamed from: f */
        short f47047f;

        public C12880a(C12234e eVar) {
            this.f47042a = eVar;
        }

        /* renamed from: a */
        private void m60926a() throws IOException {
            int i = this.f47045d;
            int f = C12879g.m60922m(this.f47042a);
            this.f47046e = f;
            this.f47043b = f;
            byte readByte = (byte) (this.f47042a.readByte() & 255);
            this.f47044c = (byte) (this.f47042a.readByte() & 255);
            if (C12879g.f47040a.isLoggable(Level.FINE)) {
                C12879g.f47040a.fine(C12881b.m60930b(true, this.f47045d, this.f47043b, readByte, this.f47044c));
            }
            int readInt = this.f47042a.readInt() & Integer.MAX_VALUE;
            this.f47045d = readInt;
            if (readByte != 9) {
                throw C12879g.m60920k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C12879g.m60920k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return this.f47042a.mo33809o();
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            while (true) {
                int i = this.f47046e;
                if (i == 0) {
                    this.f47042a.skip((long) this.f47047f);
                    this.f47047f = 0;
                    if ((this.f47044c & 4) != 0) {
                        return -1;
                    }
                    m60926a();
                } else {
                    long z = this.f47042a.mo33810z(cVar, Math.min(j, (long) i));
                    if (z == -1) {
                        return -1;
                    }
                    this.f47046e -= (int) z;
                    return z;
                }
            }
        }
    }

    /* renamed from: vc.g$b */
    /* compiled from: Http2 */
    static final class C12881b {

        /* renamed from: a */
        private static final String[] f47048a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f47049b = new String[64];

        /* renamed from: c */
        private static final String[] f47050c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f47050c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f47049b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f47049b;
                strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
            }
            String[] strArr4 = f47049b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = f47049b;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f47049b;
                if (i < strArr6.length) {
                    if (strArr6[i] == null) {
                        strArr6[i] = f47050c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        C12881b() {
        }

        /* renamed from: a */
        static String m60929a(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        return "ACK";
                    }
                    return f47050c[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr = f47049b;
                    String str = b2 < strArr.length ? strArr[b2] : f47050c[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f47050c[b2];
        }

        /* renamed from: b */
        static String m60930b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f47048a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String a = m60929a(b, b2);
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = a;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: vc.g$c */
    /* compiled from: Http2 */
    static final class C12882c implements C12871b {

        /* renamed from: a */
        private final C12234e f47051a;

        /* renamed from: b */
        private final C12880a f47052b;

        /* renamed from: c */
        private final boolean f47053c;

        /* renamed from: d */
        final C12876f.C12877a f47054d;

        C12882c(C12234e eVar, int i, boolean z) {
            this.f47051a = eVar;
            this.f47053c = z;
            C12880a aVar = new C12880a(eVar);
            this.f47052b = aVar;
            this.f47054d = new C12876f.C12877a(i, aVar);
        }

        /* renamed from: a */
        private void m60931a(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            boolean z = true;
            short s = 0;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f47051a.readByte() & 255);
                }
                aVar.mo37494k(z2, i2, this.f47051a, C12879g.m60921l(i, b, s));
                this.f47051a.skip((long) s);
                return;
            }
            throw C12879g.m60920k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        /* renamed from: b */
        private void m60932b(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw C12879g.m60920k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f47051a.readInt();
                int readInt2 = this.f47051a.readInt();
                int i3 = i - 8;
                C12870a a = C12870a.m60860a(readInt2);
                if (a != null) {
                    C12235f fVar = C12235f.f45381e;
                    if (i3 > 0) {
                        fVar = this.f47051a.mo36762B((long) i3);
                    }
                    aVar.mo37500t(readInt, a, fVar);
                    return;
                }
                throw C12879g.m60920k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw C12879g.m60920k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        /* renamed from: f */
        private List<C12874d> m60933f(int i, short s, byte b, int i2) throws IOException {
            C12880a aVar = this.f47052b;
            aVar.f47046e = i;
            aVar.f47043b = i;
            aVar.f47047f = s;
            aVar.f47044c = b;
            aVar.f47045d = i2;
            this.f47054d.mo37894l();
            return this.f47054d.mo37891e();
        }

        /* renamed from: g */
        private void m60934g(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                if ((b & 8) != 0) {
                    s = (short) (this.f47051a.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    m60936m(aVar, i2);
                    i -= 5;
                }
                aVar.mo37501u(false, z, i2, -1, m60933f(C12879g.m60921l(i, b, s), s, b, i2), C12875e.HTTP_20_HEADERS);
                return;
            }
            throw C12879g.m60920k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        /* renamed from: h */
        private void m60935h(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            boolean z = false;
            if (i != 8) {
                throw C12879g.m60920k("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f47051a.readInt();
                int readInt2 = this.f47051a.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                aVar.mo37492i(z, readInt, readInt2);
            } else {
                throw C12879g.m60920k("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        /* renamed from: m */
        private void m60936m(C12871b.C12872a aVar, int i) throws IOException {
            int readInt = this.f47051a.readInt();
            aVar.mo37495l(i, readInt & Integer.MAX_VALUE, (this.f47051a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: n */
        private void m60937n(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw C12879g.m60920k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 != 0) {
                m60936m(aVar, i2);
            } else {
                throw C12879g.m60920k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        /* renamed from: p */
        private void m60938p(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.f47051a.readByte() & 255);
                }
                aVar.mo37496m(i2, this.f47051a.readInt() & Integer.MAX_VALUE, m60933f(C12879g.m60921l(i - 4, b, s), s, b, i2));
                return;
            }
            throw C12879g.m60920k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        /* renamed from: q */
        private void m60939q(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw C12879g.m60920k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 != 0) {
                int readInt = this.f47051a.readInt();
                C12870a a = C12870a.m60860a(readInt);
                if (a != null) {
                    aVar.mo37497r(i2, a);
                } else {
                    throw C12879g.m60920k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw C12879g.m60920k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        /* renamed from: t */
        private void m60940t(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw C12879g.m60920k("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    aVar.mo37493j();
                    return;
                }
                throw C12879g.m60920k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i % 6 == 0) {
                C12886i iVar = new C12886i();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f47051a.readShort();
                    int readInt = this.f47051a.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw C12879g.m60920k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt < 0) {
                                throw C12879g.m60920k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw C12879g.m60920k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                    }
                    iVar.mo37913e(readShort, 0, readInt);
                }
                aVar.mo37499s(false, iVar);
                if (iVar.mo37910b() >= 0) {
                    this.f47054d.mo37892g(iVar.mo37910b());
                }
            } else {
                throw C12879g.m60920k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: w */
        private void m60941w(C12871b.C12872a aVar, int i, byte b, int i2) throws IOException {
            if (i == 4) {
                long readInt = ((long) this.f47051a.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.mo37491c(i2, readInt);
                    return;
                }
                throw C12879g.m60920k("windowSizeIncrement was 0", new Object[0]);
            }
            throw C12879g.m60920k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }

        public void close() throws IOException {
            this.f47051a.close();
        }

        /* renamed from: q0 */
        public boolean mo37887q0(C12871b.C12872a aVar) throws IOException {
            try {
                this.f47051a.mo36825y1(9);
                int f = C12879g.m60922m(this.f47051a);
                if (f < 0 || f > 16384) {
                    throw C12879g.m60920k("FRAME_SIZE_ERROR: %s", Integer.valueOf(f));
                }
                byte readByte = (byte) (this.f47051a.readByte() & 255);
                byte readByte2 = (byte) (this.f47051a.readByte() & 255);
                int readInt = this.f47051a.readInt() & Integer.MAX_VALUE;
                if (C12879g.f47040a.isLoggable(Level.FINE)) {
                    C12879g.f47040a.fine(C12881b.m60930b(true, readInt, f, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m60931a(aVar, f, readByte2, readInt);
                        break;
                    case 1:
                        m60934g(aVar, f, readByte2, readInt);
                        break;
                    case 2:
                        m60937n(aVar, f, readByte2, readInt);
                        break;
                    case 3:
                        m60939q(aVar, f, readByte2, readInt);
                        break;
                    case 4:
                        m60940t(aVar, f, readByte2, readInt);
                        break;
                    case 5:
                        m60938p(aVar, f, readByte2, readInt);
                        break;
                    case 6:
                        m60935h(aVar, f, readByte2, readInt);
                        break;
                    case 7:
                        m60932b(aVar, f, readByte2, readInt);
                        break;
                    case 8:
                        m60941w(aVar, f, readByte2, readInt);
                        break;
                    default:
                        this.f47051a.skip((long) f);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: vc.g$d */
    /* compiled from: Http2 */
    static final class C12883d implements C12873c {

        /* renamed from: a */
        private final C12233d f47055a;

        /* renamed from: b */
        private final boolean f47056b;

        /* renamed from: c */
        private final C12231c f47057c;

        /* renamed from: d */
        private final C12876f.C12878b f47058d;

        /* renamed from: e */
        private int f47059e = 16384;

        /* renamed from: f */
        private boolean f47060f;

        C12883d(C12233d dVar, boolean z) {
            this.f47055a = dVar;
            this.f47056b = z;
            C12231c cVar = new C12231c();
            this.f47057c = cVar;
            this.f47058d = new C12876f.C12878b(cVar);
        }

        /* renamed from: g */
        private void m60943g(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min((long) this.f47059e, j);
                long j2 = (long) min;
                j -= j2;
                mo37903b(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.f47055a.mo35694k1(this.f47057c, j2);
            }
        }

        /* renamed from: L0 */
        public synchronized void mo37443L0(boolean z, int i, C12231c cVar, int i2) throws IOException {
            if (!this.f47060f) {
                byte b = 0;
                if (z) {
                    b = (byte) 1;
                }
                mo37902a(i, b, cVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: O0 */
        public synchronized void mo37444O0(int i, C12870a aVar, byte[] bArr) throws IOException {
            if (this.f47060f) {
                throw new IOException("closed");
            } else if (aVar.f47001a != -1) {
                mo37903b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f47055a.mo36775O(i);
                this.f47055a.mo36775O(aVar.f47001a);
                if (bArr.length > 0) {
                    this.f47055a.mo36792e1(bArr);
                }
                this.f47055a.flush();
            } else {
                throw C12879g.m60919j("errorCode.httpCode == -1", new Object[0]);
            }
        }

        /* renamed from: S0 */
        public synchronized void mo37445S0(C12886i iVar) throws IOException {
            if (!this.f47060f) {
                int i = 0;
                mo37903b(0, iVar.mo37914f() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (iVar.mo37912d(i)) {
                        this.f47055a.mo36772J(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f47055a.mo36775O(iVar.mo37909a(i));
                    }
                    i++;
                }
                this.f47055a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37902a(int i, byte b, C12231c cVar, int i2) throws IOException {
            mo37903b(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f47055a.mo35694k1(cVar, (long) i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37903b(int i, int i2, byte b, byte b2) throws IOException {
            if (C12879g.f47040a.isLoggable(Level.FINE)) {
                C12879g.f47040a.fine(C12881b.m60930b(false, i, i2, b, b2));
            }
            int i3 = this.f47059e;
            if (i2 > i3) {
                throw C12879g.m60919j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C12879g.m60923n(this.f47055a, i2);
                this.f47055a.mo36787a0(b & 255);
                this.f47055a.mo36787a0(b2 & 255);
                this.f47055a.mo36775O(i & Integer.MAX_VALUE);
            } else {
                throw C12879g.m60919j("reserved bit set: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: b0 */
        public synchronized void mo37446b0() throws IOException {
            if (this.f47060f) {
                throw new IOException("closed");
            } else if (this.f47056b) {
                if (C12879g.f47040a.isLoggable(Level.FINE)) {
                    C12879g.f47040a.fine(String.format(">> CONNECTION %s", new Object[]{C12879g.f47041b.mo36840q()}));
                }
                this.f47055a.mo36792e1(C12879g.f47041b.mo36831A());
                this.f47055a.flush();
            }
        }

        /* renamed from: b1 */
        public synchronized void mo37439b1(C12886i iVar) throws IOException {
            if (!this.f47060f) {
                this.f47059e = iVar.mo37911c(this.f47059e);
                mo37903b(0, 0, (byte) 4, (byte) 1);
                this.f47055a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: c */
        public synchronized void mo37447c(int i, long j) throws IOException {
            if (this.f47060f) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw C12879g.m60919j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            } else {
                mo37903b(i, 4, (byte) 8, (byte) 0);
                this.f47055a.mo36775O((int) j);
                this.f47055a.flush();
            }
        }

        public synchronized void close() throws IOException {
            this.f47060f = true;
            this.f47055a.close();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo37905f(boolean z, int i, List<C12874d> list) throws IOException {
            if (!this.f47060f) {
                this.f47058d.mo37897e(list);
                long I = this.f47057c.mo36771I();
                int min = (int) Math.min((long) this.f47059e, I);
                long j = (long) min;
                int i2 = (I > j ? 1 : (I == j ? 0 : -1));
                byte b = i2 == 0 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                mo37903b(i, min, (byte) 1, b);
                this.f47055a.mo35694k1(this.f47057c, j);
                if (i2 > 0) {
                    m60943g(i, I - j);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public synchronized void flush() throws IOException {
            if (!this.f47060f) {
                this.f47055a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: i */
        public synchronized void mo37440i(boolean z, int i, int i2) throws IOException {
            if (!this.f47060f) {
                mo37903b(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f47055a.mo36775O(i);
                this.f47055a.mo36775O(i2);
                this.f47055a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: r */
        public synchronized void mo37441r(int i, C12870a aVar) throws IOException {
            if (this.f47060f) {
                throw new IOException("closed");
            } else if (aVar.f47001a != -1) {
                mo37903b(i, 4, (byte) 3, (byte) 0);
                this.f47055a.mo36775O(aVar.f47001a);
                this.f47055a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: t1 */
        public int mo37450t1() {
            return this.f47059e;
        }

        /* renamed from: w1 */
        public synchronized void mo37451w1(boolean z, boolean z2, int i, int i2, List<C12874d> list) throws IOException {
            if (!z2) {
                try {
                    if (!this.f47060f) {
                        mo37905f(z, i, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static IllegalArgumentException m60919j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static IOException m60920k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m60921l(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw m60920k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m60922m(C12234e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m60923n(C12233d dVar, int i) throws IOException {
        dVar.mo36787a0((i >>> 16) & 255);
        dVar.mo36787a0((i >>> 8) & 255);
        dVar.mo36787a0(i & 255);
    }

    /* renamed from: a */
    public C12873c mo37899a(C12233d dVar, boolean z) {
        return new C12883d(dVar, z);
    }

    /* renamed from: b */
    public C12871b mo37900b(C12234e eVar, boolean z) {
        return new C12882c(eVar, 4096, z);
    }
}
