package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p033d5.C4087c;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class o23 implements C4087c.C4088a, C4087c.C4089b {

    /* renamed from: a */
    protected final m33 f14808a;

    /* renamed from: b */
    private final String f14809b;

    /* renamed from: c */
    private final String f14810c;

    /* renamed from: d */
    private final LinkedBlockingQueue f14811d;

    /* renamed from: e */
    private final HandlerThread f14812e;

    /* renamed from: f */
    private final e23 f14813f;

    /* renamed from: g */
    private final long f14814g = System.currentTimeMillis();

    /* renamed from: h */
    private final int f14815h;

    public o23(Context context, int i, int i2, String str, String str2, String str3, e23 e23) {
        this.f14809b = str;
        this.f14815h = i2;
        this.f14810c = str2;
        this.f14813f = e23;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f14812e = handlerThread;
        handlerThread.start();
        m33 m33 = new m33(context, handlerThread.getLooper(), this, this, 19621000);
        this.f14808a = m33;
        this.f14811d = new LinkedBlockingQueue();
        m33.mo17355u();
    }

    /* renamed from: a */
    static y33 m17428a() {
        return new y33((byte[]) null, 1);
    }

    /* renamed from: e */
    private final void m17429e(int i, long j, Exception exc) {
        this.f14813f.mo9788c(i, System.currentTimeMillis() - j, exc);
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
        try {
            m17429e(4012, this.f14814g, (Exception) null);
            this.f14811d.put(m17428a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: P0 */
    public final void mo8531P0(Bundle bundle) {
        r33 d = mo12800d();
        if (d != null) {
            try {
                y33 T5 = d.mo13660T5(new w33(1, this.f14815h, this.f14809b, this.f14810c));
                m17429e(5011, this.f14814g, (Exception) null);
                this.f14811d.put(T5);
            } catch (Throwable th) {
                mo12799c();
                this.f14812e.quit();
                throw th;
            }
            mo12799c();
            this.f14812e.quit();
        }
    }

    /* renamed from: b */
    public final y33 mo12798b(int i) {
        y33 y33;
        try {
            y33 = (y33) this.f14811d.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            m17429e(AdError.INTERSTITIAL_AD_TIMEOUT, this.f14814g, e);
            y33 = null;
        }
        m17429e(3004, this.f14814g, (Exception) null);
        if (y33 != null) {
            if (y33.f20461c == 7) {
                e23.m11883g(3);
            } else {
                e23.m11883g(2);
            }
        }
        return y33 == null ? m17428a() : y33;
    }

    /* renamed from: c */
    public final void mo12799c() {
        m33 m33 = this.f14808a;
        if (m33 == null) {
            return;
        }
        if (m33.mo17338a() || this.f14808a.mo17344f()) {
            this.f14808a.mo17343e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final r33 mo12800d() {
        try {
            return this.f14808a.mo12269n0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
        try {
            m17429e(4011, this.f14814g, (Exception) null);
            this.f14811d.put(m17428a());
        } catch (InterruptedException unused) {
        }
    }
}
