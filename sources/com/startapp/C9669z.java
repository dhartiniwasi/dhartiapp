package com.startapp;

import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructPollfd;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.startapp.z */
/* compiled from: Sta */
public class C9669z {

    /* renamed from: p */
    private static final String f39458p = "z";

    /* renamed from: q */
    private static final boolean f39459q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final short f39460r;

    /* renamed from: s */
    private static final int f39461s = 7;

    /* renamed from: t */
    private static final int f39462t = 16;

    /* renamed from: u */
    private static final int f39463u = 64;

    /* renamed from: v */
    private static final short f39464v = 30583;

    /* renamed from: a */
    private InetAddress f39465a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8951f8 f39466b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f39467c;

    /* renamed from: d */
    private int f39468d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f39469e;

    /* renamed from: f */
    private C8843b4 f39470f;

    /* renamed from: g */
    private short f39471g = 1;

    /* renamed from: h */
    private short f39472h = f39464v;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f39473i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f39474j = false;

    /* renamed from: k */
    private int f39475k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f39476l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f39477m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f39478n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public SparseArray<Long> f39479o;

    /* renamed from: com.startapp.z$a */
    /* compiled from: Sta */
    public class C9670a extends Thread {

        /* renamed from: a */
        private StructPollfd[] f39480a;

        public C9670a(StructPollfd[] structPollfdArr) {
            this.f39480a = structPollfdArr;
        }

        public void run() {
            StructPollfd structPollfd = this.f39480a[0];
            FileDescriptor fileDescriptor = structPollfd.fd;
            int a = C9669z.this.f39476l;
            byte[] bArr = new byte[a];
            int i = 0;
            while (C9669z.this.f39474j && !C9669z.this.f39473i && C9669z.this.f39477m < C9669z.this.f39469e) {
                try {
                    int poll = Os.poll(this.f39480a, C9669z.this.f39467c);
                    if (!C9669z.this.f39473i) {
                        if (poll >= 0 && structPollfd.revents == C9669z.f39460r) {
                            structPollfd.revents = C9669z.f39460r;
                            Os.recvfrom(fileDescriptor, bArr, 0, a, 64, (InetSocketAddress) null);
                            int hashCode = Arrays.hashCode(C9669z.m50565b(bArr));
                            Long l = (Long) C9669z.this.f39479o.get(hashCode);
                            if (l != null) {
                                C9669z.this.f39479o.remove(hashCode);
                                long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                                int i2 = i + 1;
                                try {
                                    C9669z.this.f39466b.mo29364a(i, SystemClock.elapsedRealtime() - C9669z.this.f39478n, elapsedRealtime);
                                    C9669z.m50569f(C9669z.this);
                                    i = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    i = i2;
                                    C9632x2.m50510a(th);
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C9632x2.m50510a(th);
                }
            }
        }
    }

    static {
        int i = OsConstants.POLLIN;
        if (i == 0) {
            i = 1;
        }
        f39460r = (short) i;
    }

    public C9669z(InetAddress inetAddress, int i, int i2, int i3, int i4) {
        this.f39465a = inetAddress;
        this.f39467c = i3;
        this.f39469e = i;
        this.f39468d = i2;
        this.f39470f = new C8843b4(inetAddress instanceof Inet6Address ? C8843b4.f36445d : 8);
        this.f39475k = i4;
        this.f39476l = i4 + 8;
        this.f39479o = new SparseArray<>();
    }

    /* renamed from: f */
    public static /* synthetic */ int m50569f(C9669z zVar) {
        int i = zVar.f39477m;
        zVar.f39477m = i + 1;
        return i;
    }

    /* renamed from: b */
    public void mo31501b() {
        this.f39473i = true;
    }

    /* renamed from: c */
    public void mo31502c() {
        int i;
        int i2;
        int i3;
        this.f39473i = false;
        if (this.f39465a instanceof Inet6Address) {
            i2 = OsConstants.AF_INET6;
            i = OsConstants.IPPROTO_ICMPV6;
        } else {
            i2 = OsConstants.AF_INET;
            i = OsConstants.IPPROTO_ICMP;
        }
        this.f39478n = SystemClock.elapsedRealtime();
        try {
            FileDescriptor socket = Os.socket(i2, OsConstants.SOCK_DGRAM, i);
            if (socket.valid()) {
                try {
                    m50562a(socket);
                    StructPollfd structPollfd = new StructPollfd();
                    structPollfd.fd = socket;
                    structPollfd.events = f39460r;
                    C9670a aVar = new C9670a(new StructPollfd[]{structPollfd});
                    this.f39474j = true;
                    this.f39478n = SystemClock.elapsedRealtime();
                    aVar.start();
                    i3 = 0;
                    while (true) {
                        if (i3 >= this.f39469e) {
                            break;
                        } else if (this.f39473i) {
                            break;
                        } else {
                            byte[] a = C8843b4.m48314a(this.f39475k);
                            C8843b4 b4Var = this.f39470f;
                            short s = this.f39471g;
                            this.f39471g = (short) (s + 1);
                            ByteBuffer a2 = b4Var.mo29130a(s, this.f39472h, a);
                            this.f39479o.put(Arrays.hashCode(a), Long.valueOf(SystemClock.elapsedRealtime()));
                            if (Os.sendto(socket, a2, 0, this.f39465a, 7) < 0) {
                                break;
                            }
                            if (i3 < this.f39469e - 1) {
                                try {
                                    Thread.sleep((long) this.f39468d);
                                } catch (Throwable th) {
                                    C9632x2.m50510a(th);
                                }
                            }
                            i3++;
                        }
                    }
                    this.f39474j = false;
                    if (aVar.isAlive()) {
                        aVar.join();
                    }
                    Os.close(socket);
                    this.f39474j = false;
                } catch (Throwable th2) {
                    Os.close(socket);
                    this.f39474j = false;
                    throw th2;
                }
            }
            if (!this.f39473i) {
                for (int i4 = this.f39477m; i4 < this.f39469e; i4++) {
                    this.f39466b.mo29364a(i4, SystemClock.elapsedRealtime() - this.f39478n, -1);
                }
            }
        } catch (Throwable th3) {
            C9632x2.m50510a(th3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m50565b(byte[] bArr) {
        return Arrays.copyOfRange(bArr, 8, bArr.length);
    }

    /* renamed from: a */
    public void mo31500a(short s) {
        this.f39472h = s;
    }

    /* renamed from: a */
    public void mo31499a(C8951f8 f8Var) {
        this.f39466b = f8Var;
    }

    /* renamed from: a */
    private void m50562a(FileDescriptor fileDescriptor) throws ErrnoException {
        if (Build.VERSION.SDK_INT >= 26) {
            Os.setsockoptInt(fileDescriptor, OsConstants.IPPROTO_IP, OsConstants.IP_TOS, 16);
            return;
        }
        Class<Os> cls = Os.class;
        try {
            Class cls2 = Integer.TYPE;
            cls.getMethod("setsockoptInt", new Class[]{FileDescriptor.class, cls2, cls2, cls2}).invoke((Object) null, new Object[]{fileDescriptor, Integer.valueOf(OsConstants.IPPROTO_IP), Integer.valueOf(OsConstants.IP_TOS), 16});
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
    }
}
