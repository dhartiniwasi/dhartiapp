package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yg3 extends kf2 {

    /* renamed from: e */
    private final byte[] f20607e;

    /* renamed from: f */
    private final DatagramPacket f20608f;

    /* renamed from: g */
    private Uri f20609g;

    /* renamed from: h */
    private DatagramSocket f20610h;

    /* renamed from: i */
    private MulticastSocket f20611i;

    /* renamed from: j */
    private InetAddress f20612j;

    /* renamed from: k */
    private boolean f20613k;

    /* renamed from: l */
    private int f20614l;

    public yg3(int i) {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f20607e = bArr;
        this.f20608f = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }

    /* renamed from: b */
    public final void mo8791b() {
        this.f20609g = null;
        MulticastSocket multicastSocket = this.f20611i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f20612j;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f20611i = null;
        }
        DatagramSocket datagramSocket = this.f20610h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20610h = null;
        }
        this.f20612j = null;
        this.f20614l = 0;
        if (this.f20613k) {
            this.f20613k = false;
            mo11673m();
        }
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws xf3 {
        if (i2 == 0) {
            return 0;
        }
        if (this.f20614l == 0) {
            try {
                DatagramSocket datagramSocket = this.f20610h;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f20608f);
                int length = this.f20608f.getLength();
                this.f20614l = length;
                mo11672f0(length);
            } catch (SocketTimeoutException e) {
                throw new xf3(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new xf3(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f20608f.getLength();
        int i3 = this.f20614l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f20607e, length2 - i3, bArr, i, min);
        this.f20614l -= min;
        return min;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f20609g;
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws xf3 {
        Uri uri = wq2.f19753a;
        this.f20609g = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f20609g.getPort();
        mo11674n(wq2);
        try {
            this.f20612j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f20612j, port);
            if (this.f20612j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f20611i = multicastSocket;
                multicastSocket.joinGroup(this.f20612j);
                this.f20610h = this.f20611i;
            } else {
                this.f20610h = new DatagramSocket(inetSocketAddress);
            }
            this.f20610h.setSoTimeout(8000);
            this.f20613k = true;
            mo11675o(wq2);
            return -1;
        } catch (SecurityException e) {
            throw new xf3(e, AdError.INTERNAL_ERROR_2006);
        } catch (IOException e2) {
            throw new xf3(e2, AdError.INTERNAL_ERROR_CODE);
        }
    }
}
