package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p180z4.C6370f;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class az2 implements Runnable {

    /* renamed from: r */
    public static Boolean f7017r;

    /* renamed from: a */
    private final Context f7018a;

    /* renamed from: b */
    private final vm0 f7019b;

    /* renamed from: c */
    private final gz2 f7020c = jz2.m15135H();

    /* renamed from: d */
    private String f7021d;

    /* renamed from: e */
    private int f7022e;

    /* renamed from: f */
    private final ws1 f7023f;

    /* renamed from: g */
    private boolean f7024g = false;

    /* renamed from: h */
    private final n22 f7025h;

    /* renamed from: i */
    private final kh0 f7026i;

    public az2(Context context, vm0 vm0, ws1 ws1, n22 n22, kh0 kh0, byte[] bArr) {
        this.f7018a = context;
        this.f7019b = vm0;
        this.f7023f = ws1;
        this.f7025h = n22;
        this.f7026i = kh0;
    }

    /* renamed from: a */
    public static synchronized boolean m10140a() {
        boolean booleanValue;
        synchronized (az2.class) {
            if (f7017r == null) {
                if (!((Boolean) x00.f19922b.mo13438e()).booleanValue()) {
                    f7017r = Boolean.FALSE;
                } else {
                    f7017r = Boolean.valueOf(Math.random() < ((Double) x00.f19921a.mo13438e()).doubleValue());
                }
            }
            booleanValue = f7017r.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    private final synchronized void m10141c() {
        if (!this.f7024g) {
            this.f7024g = true;
            if (m10140a()) {
                C4409t.m29326r();
                this.f7021d = C4751b2.m30594L(this.f7018a);
                this.f7022e = C6370f.m37437h().mo21796b(this.f7018a);
                long intValue = (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14735x7)).intValue();
                dn0.f8328d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: d */
    private final synchronized void m10142d() {
        try {
            new m22(this.f7018a, this.f7019b.f19150a, this.f7026i, Binder.getCallingUid(), (byte[]) null).mo9017b(new k22((String) C4596v.m30088c().mo12227b(C2679nz.f14725w7), 60000, new HashMap(), ((jz2) this.f7020c.mo13423m()).mo9400b(), "application/x-protobuf"));
            this.f7020c.mo10705s();
        } catch (Exception e) {
            if (!(e instanceof cz1) || ((cz1) e).mo9381a() != 3) {
                C4409t.m29325q().mo15125s(e, "CuiMonitor.sendCuiPing");
            } else {
                this.f7020c.mo10705s();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo8629b(ry2 ry2) {
        if (!this.f7024g) {
            m10141c();
        }
        if (m10140a()) {
            if (ry2 != null) {
                if (this.f7020c.mo10703p() < ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14745y7)).intValue()) {
                    gz2 gz2 = this.f7020c;
                    hz2 G = iz2.m14599G();
                    cz2 G2 = dz2.m11770G();
                    G2.mo9388G(ry2.mo13894h());
                    G2.mo9385D(ry2.mo13893g());
                    G2.mo9395v(ry2.mo13888b());
                    G2.mo9390I(3);
                    G2.mo9384C(this.f7019b.f19150a);
                    G2.mo9391p(this.f7021d);
                    G2.mo9382A(Build.VERSION.RELEASE);
                    G2.mo9386E(Build.VERSION.SDK_INT);
                    G2.mo9389H(ry2.mo13896j());
                    G2.mo9398z(ry2.mo13887a());
                    G2.mo9393s((long) this.f7022e);
                    G2.mo9387F(ry2.mo13895i());
                    G2.mo9392r(ry2.mo13889c());
                    G2.mo9394u(ry2.mo13890d());
                    G2.mo9396x(ry2.mo13891e());
                    G2.mo9397y(this.f7023f.mo14986c(ry2.mo13891e()));
                    G2.mo9383B(ry2.mo13892f());
                    G.mo10975p(G2);
                    gz2.mo10704r(G);
                }
            }
        }
    }

    public final synchronized void run() {
        if (m10140a()) {
            if (this.f7020c.mo10703p() != 0) {
                m10142d();
            }
        }
    }
}
