package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p053g4.C4409t;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tp0 extends go0 implements TextureView.SurfaceTextureListener, qo0 {

    /* renamed from: A */
    private int f18182A;

    /* renamed from: B */
    private float f18183B;

    /* renamed from: d */
    private final ap0 f18184d;

    /* renamed from: e */
    private final bp0 f18185e;

    /* renamed from: f */
    private final zo0 f18186f;

    /* renamed from: g */
    private fo0 f18187g;

    /* renamed from: h */
    private Surface f18188h;

    /* renamed from: i */
    private ro0 f18189i;

    /* renamed from: r */
    private String f18190r;

    /* renamed from: s */
    private String[] f18191s;

    /* renamed from: t */
    private boolean f18192t;

    /* renamed from: u */
    private int f18193u = 1;

    /* renamed from: v */
    private yo0 f18194v;

    /* renamed from: w */
    private final boolean f18195w;

    /* renamed from: x */
    private boolean f18196x;

    /* renamed from: y */
    private boolean f18197y;

    /* renamed from: z */
    private int f18198z;

    public tp0(Context context, bp0 bp0, ap0 ap0, boolean z, boolean z2, zo0 zo0, Integer num) {
        super(context, num);
        this.f18184d = ap0;
        this.f18185e = bp0;
        this.f18195w = z;
        this.f18186f = zo0;
        setSurfaceTextureListener(this);
        bp0.mo8910a(this);
    }

    /* renamed from: Q */
    private static String m21103Q(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    /* renamed from: R */
    private final void m21104R() {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11206S(true);
        }
    }

    /* renamed from: S */
    private final void m21105S() {
        if (!this.f18196x) {
            this.f18196x = true;
            C4751b2.f25403i.post(new np0(this));
            mo9946a0();
            this.f18185e.mo8911b();
            if (this.f18197y) {
                mo9970r();
            }
        }
    }

    /* renamed from: T */
    private final void m21106T(boolean z) {
        ro0 ro0 = this.f18189i;
        if ((ro0 == null || z) && this.f18190r != null && this.f18188h != null) {
            if (z) {
                if (m21114c0()) {
                    ro0.mo11210W();
                    m21108V();
                } else {
                    pm0.m18667g("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.f18190r.startsWith("cache:")) {
                gr0 D = this.f18184d.mo8452D(this.f18190r);
                if (D instanceof pr0) {
                    ro0 w = ((pr0) D).mo13340w();
                    this.f18189i = w;
                    if (!w.mo11211X()) {
                        pm0.m18667g("Precached video player has been released.");
                        return;
                    }
                } else if (D instanceof mr0) {
                    mr0 mr0 = (mr0) D;
                    String C = mo14338C();
                    ByteBuffer x = mr0.mo12416x();
                    boolean y = mr0.mo12417y();
                    String w2 = mr0.mo12415w();
                    if (w2 == null) {
                        pm0.m18667g("Stream cache URL is null.");
                        return;
                    }
                    ro0 B = mo14337B();
                    this.f18189i = B;
                    B.mo11197J(new Uri[]{Uri.parse(w2)}, C, x, y);
                } else {
                    pm0.m18667g("Stream cache miss: ".concat(String.valueOf(this.f18190r)));
                    return;
                }
            } else {
                this.f18189i = mo14337B();
                String C2 = mo14338C();
                Uri[] uriArr = new Uri[this.f18191s.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.f18191s;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.f18189i.mo11196I(uriArr, C2);
            }
            this.f18189i.mo11202O(this);
            m21110X(this.f18188h, false);
            if (this.f18189i.mo11211X()) {
                int a0 = this.f18189i.mo11213a0();
                this.f18193u = a0;
                if (a0 == 3) {
                    m21105S();
                }
            }
        }
    }

    /* renamed from: U */
    private final void m21107U() {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11206S(false);
        }
    }

    /* renamed from: V */
    private final void m21108V() {
        if (this.f18189i != null) {
            m21110X((Surface) null, true);
            ro0 ro0 = this.f18189i;
            if (ro0 != null) {
                ro0.mo11202O((qo0) null);
                this.f18189i.mo11198K();
                this.f18189i = null;
            }
            this.f18193u = 1;
            this.f18192t = false;
            this.f18196x = false;
            this.f18197y = false;
        }
    }

    /* renamed from: W */
    private final void m21109W(float f, boolean z) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            try {
                ro0.mo11209V(f, false);
            } catch (IOException e) {
                pm0.m18668h("", e);
            }
        } else {
            pm0.m18667g("Trying to set volume before player is initialized.");
        }
    }

    /* renamed from: X */
    private final void m21110X(Surface surface, boolean z) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            try {
                ro0.mo11208U(surface, z);
            } catch (IOException e) {
                pm0.m18668h("", e);
            }
        } else {
            pm0.m18667g("Trying to set surface before player is initialized.");
        }
    }

    /* renamed from: Y */
    private final void m21111Y() {
        m21112Z(this.f18198z, this.f18182A);
    }

    /* renamed from: Z */
    private final void m21112Z(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f18183B != f) {
            this.f18183B = f;
            requestLayout();
        }
    }

    /* renamed from: b0 */
    private final boolean m21113b0() {
        return m21114c0() && this.f18193u != 1;
    }

    /* renamed from: c0 */
    private final boolean m21114c0() {
        ro0 ro0 = this.f18189i;
        return ro0 != null && ro0.mo11211X() && !this.f18192t;
    }

    /* renamed from: A */
    public final void mo10588A(int i) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11204Q(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final ro0 mo14337B() {
        if (this.f18186f.f21203m) {
            return new is0(this.f18184d.getContext(), this.f18186f, this.f18184d);
        }
        return new kq0(this.f18184d.getContext(), this.f18186f, this.f18184d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final String mo14338C() {
        return C4409t.m29326r().mo18438z(this.f18184d.getContext(), this.f18184d.mo8464b0().f19150a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void mo14339D(String str) {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10229k("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ void mo14340E() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.zza();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo14341F() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10222T();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo14342G(boolean z, long j) {
        this.f18184d.mo8473l0(z, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo14343H(String str) {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10220G0("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo14344I() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10228c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo14345J() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10223U();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo14346K() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10224V();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo14347L(int i, int i2) {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10221H0(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo14348M() {
        m21109W(this.f10012b.mo10239a(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo14349N(int i) {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo14350O() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10227b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo14351P() {
        fo0 fo0 = this.f18187g;
        if (fo0 != null) {
            fo0.mo10226a();
        }
    }

    /* renamed from: a */
    public final void mo10589a(int i) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11207T(i);
        }
    }

    /* renamed from: a0 */
    public final void mo9946a0() {
        if (this.f18186f.f21203m) {
            C4751b2.f25403i.post(new lp0(this));
        } else {
            m21109W(this.f10012b.mo10239a(), false);
        }
    }

    /* renamed from: b */
    public final void mo13334b(int i) {
        if (this.f18193u != i) {
            this.f18193u = i;
            if (i == 3) {
                m21105S();
            } else if (i == 4) {
                if (this.f18186f.f21191a) {
                    m21107U();
                }
                this.f18185e.mo8914e();
                this.f10012b.mo10241c();
                C4751b2.f25403i.post(new hp0(this));
            }
        }
    }

    /* renamed from: c */
    public final void mo13335c(String str, Exception exc) {
        String Q = m21103Q("onLoadException", exc);
        pm0.m18667g("ExoPlayerAdapter exception: ".concat(Q));
        C4409t.m29325q().mo15125s(exc, "AdExoPlayerView.onException");
        C4751b2.f25403i.post(new ip0(this, Q));
    }

    /* renamed from: d */
    public final void mo13336d(boolean z, long j) {
        if (this.f18184d != null) {
            dn0.f8329e.execute(new gp0(this, z, j));
        }
    }

    /* renamed from: e */
    public final void mo13337e(String str, Exception exc) {
        String Q = m21103Q(str, exc);
        pm0.m18667g("ExoPlayerAdapter error: ".concat(Q));
        this.f18192t = true;
        if (this.f18186f.f21191a) {
            m21107U();
        }
        C4751b2.f25403i.post(new jp0(this, Q));
        C4409t.m29325q().mo15125s(exc, "AdExoPlayerView.onError");
    }

    /* renamed from: f */
    public final void mo13338f(int i, int i2) {
        this.f18198z = i;
        this.f18182A = i2;
        m21111Y();
    }

    /* renamed from: g */
    public final void mo10590g(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.f18191s = new String[]{str};
            } else {
                this.f18191s = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.f18190r;
            if (!this.f18186f.f21204n || str2 == null || str.equals(str2) || this.f18193u != 4) {
                z = false;
            }
            this.f18190r = str;
            m21106T(z);
        }
    }

    /* renamed from: g0 */
    public final void mo13339g0() {
        C4751b2.f25403i.post(new kp0(this));
    }

    /* renamed from: h */
    public final int mo9948h() {
        if (m21113b0()) {
            return (int) this.f18189i.mo11220f0();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo9949i() {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            return ro0.mo11212Y();
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo9950j() {
        if (m21113b0()) {
            return (int) this.f18189i.mo11222g0();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo9951k() {
        return this.f18182A;
    }

    /* renamed from: l */
    public final int mo9952l() {
        return this.f18198z;
    }

    /* renamed from: m */
    public final long mo9953m() {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            return ro0.mo11219e0();
        }
        return -1;
    }

    /* renamed from: n */
    public final long mo9954n() {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            return ro0.mo11194G();
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo9955o() {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            return ro0.mo11195H();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f18183B;
        if (f != 0.0f && this.f18194v == null) {
            float f2 = (float) measuredWidth;
            float f3 = f2 / ((float) measuredHeight);
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (((float) measuredHeight) * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        yo0 yo0 = this.f18194v;
        if (yo0 != null) {
            yo0.mo15472b(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f18195w) {
            yo0 yo0 = new yo0(getContext());
            this.f18194v = yo0;
            yo0.mo15473c(surfaceTexture, i, i2);
            this.f18194v.start();
            SurfaceTexture a = this.f18194v.mo15471a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.f18194v.mo15474d();
                this.f18194v = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f18188h = surface;
        if (this.f18189i == null) {
            m21106T(false);
        } else {
            m21110X(surface, true);
            if (!this.f18186f.f21191a) {
                m21104R();
            }
        }
        if (this.f18198z == 0 || this.f18182A == 0) {
            m21112Z(i, i2);
        } else {
            m21111Y();
        }
        C4751b2.f25403i.post(new op0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo9969q();
        yo0 yo0 = this.f18194v;
        if (yo0 != null) {
            yo0.mo15474d();
            this.f18194v = null;
        }
        if (this.f18189i != null) {
            m21107U();
            Surface surface = this.f18188h;
            if (surface != null) {
                surface.release();
            }
            this.f18188h = null;
            m21110X((Surface) null, true);
        }
        C4751b2.f25403i.post(new rp0(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        yo0 yo0 = this.f18194v;
        if (yo0 != null) {
            yo0.mo15472b(i, i2);
        }
        C4751b2.f25403i.post(new qp0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f18185e.mo8915f(this);
        this.f10011a.mo14554a(surfaceTexture, this.f18187g);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        C4794n1.m30693k("AdExoPlayerView3 window visibility changed to " + i);
        C4751b2.f25403i.post(new pp0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final String mo9968p() {
        return "ExoPlayer/3".concat(true != this.f18195w ? "" : " spherical");
    }

    /* renamed from: q */
    public final void mo9969q() {
        if (m21113b0()) {
            if (this.f18186f.f21191a) {
                m21107U();
            }
            this.f18189i.mo11205R(false);
            this.f18185e.mo8914e();
            this.f10012b.mo10241c();
            C4751b2.f25403i.post(new mp0(this));
        }
    }

    /* renamed from: r */
    public final void mo9970r() {
        if (m21113b0()) {
            if (this.f18186f.f21191a) {
                m21104R();
            }
            this.f18189i.mo11205R(true);
            this.f18185e.mo8912c();
            this.f10012b.mo10240b();
            this.f10011a.mo14555b();
            C4751b2.f25403i.post(new sp0(this));
            return;
        }
        this.f18197y = true;
    }

    /* renamed from: s */
    public final void mo9971s(int i) {
        if (m21113b0()) {
            this.f18189i.mo11199L((long) i);
        }
    }

    /* renamed from: t */
    public final void mo9972t(fo0 fo0) {
        this.f18187g = fo0;
    }

    /* renamed from: u */
    public final void mo9974u(String str) {
        if (str != null) {
            mo10590g(str, (String[]) null);
        }
    }

    /* renamed from: v */
    public final void mo9975v() {
        if (m21114c0()) {
            this.f18189i.mo11210W();
            m21108V();
        }
        this.f18185e.mo8914e();
        this.f10012b.mo10241c();
        this.f18185e.mo8913d();
    }

    /* renamed from: w */
    public final void mo9976w(float f, float f2) {
        yo0 yo0 = this.f18194v;
        if (yo0 != null) {
            yo0.mo15475e(f, f2);
        }
    }

    /* renamed from: x */
    public final void mo10591x(int i) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11200M(i);
        }
    }

    /* renamed from: y */
    public final void mo10592y(int i) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11201N(i);
        }
    }

    /* renamed from: z */
    public final void mo10593z(int i) {
        ro0 ro0 = this.f18189i;
        if (ro0 != null) {
            ro0.mo11203P(i);
        }
    }
}
