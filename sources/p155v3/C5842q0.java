package p155v3;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p161w3.C5917a;

/* renamed from: v3.q0 */
/* compiled from: UdpDataSource */
public final class C5842q0 extends C5803g {

    /* renamed from: e */
    private final int f28909e;

    /* renamed from: f */
    private final byte[] f28910f;

    /* renamed from: g */
    private final DatagramPacket f28911g;

    /* renamed from: h */
    private Uri f28912h;

    /* renamed from: i */
    private DatagramSocket f28913i;

    /* renamed from: j */
    private MulticastSocket f28914j;

    /* renamed from: k */
    private InetAddress f28915k;

    /* renamed from: l */
    private boolean f28916l;

    /* renamed from: m */
    private int f28917m;

    /* renamed from: v3.q0$a */
    /* compiled from: UdpDataSource */
    public static final class C5843a extends C5830m {
        public C5843a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C5842q0() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public void close() {
        this.f28912h = null;
        MulticastSocket multicastSocket = this.f28914j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C5917a.m34872e(this.f28915k));
            } catch (IOException unused) {
            }
            this.f28914j = null;
        }
        DatagramSocket datagramSocket = this.f28913i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f28913i = null;
        }
        this.f28915k = null;
        this.f28917m = 0;
        if (this.f28916l) {
            this.f28916l = false;
            mo20326r();
        }
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f28912h;
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws C5843a {
        Uri uri = pVar.f28881a;
        this.f28912h = uri;
        String str = (String) C5917a.m34872e(uri.getHost());
        int port = this.f28912h.getPort();
        mo20327s(pVar);
        try {
            this.f28915k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f28915k, port);
            if (this.f28915k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f28914j = multicastSocket;
                multicastSocket.joinGroup(this.f28915k);
                this.f28913i = this.f28914j;
            } else {
                this.f28913i = new DatagramSocket(inetSocketAddress);
            }
            this.f28913i.setSoTimeout(this.f28909e);
            this.f28916l = true;
            mo20328t(pVar);
            return -1;
        } catch (SecurityException e) {
            throw new C5843a(e, AdError.INTERNAL_ERROR_2006);
        } catch (IOException e2) {
            throw new C5843a(e2, AdError.INTERNAL_ERROR_CODE);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C5843a {
        if (i2 == 0) {
            return 0;
        }
        if (this.f28917m == 0) {
            try {
                ((DatagramSocket) C5917a.m34872e(this.f28913i)).receive(this.f28911g);
                int length = this.f28911g.getLength();
                this.f28917m = length;
                mo20325q(length);
            } catch (SocketTimeoutException e) {
                throw new C5843a(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new C5843a(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f28911g.getLength();
        int i3 = this.f28917m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f28910f, length2 - i3, bArr, i, min);
        this.f28917m -= min;
        return min;
    }

    public C5842q0(int i) {
        this(i, 8000);
    }

    public C5842q0(int i, int i2) {
        super(true);
        this.f28909e = i2;
        byte[] bArr = new byte[i];
        this.f28910f = bArr;
        this.f28911g = new DatagramPacket(bArr, 0, i);
    }
}
