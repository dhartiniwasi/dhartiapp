package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.px3;
import com.google.android.gms.internal.ads.sx3;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class px3<MessageType extends sx3<MessageType, BuilderType>, BuilderType extends px3<MessageType, BuilderType>> extends rv3<MessageType, BuilderType> {

    /* renamed from: a */
    private final sx3 f16075a;

    /* renamed from: b */
    protected sx3 f16076b;

    /* renamed from: c */
    protected boolean f16077c = false;

    protected px3(MessageType messagetype) {
        this.f16075a = messagetype;
        this.f16076b = (sx3) messagetype.mo8196E(4, (Object) null, (Object) null);
    }

    /* renamed from: h */
    private static final void m18944h(sx3 sx3, sx3 sx32) {
        kz3.m15715a().mo11837b(sx3.getClass()).mo10364f(sx3, sx32);
    }

    /* renamed from: c */
    public final /* synthetic */ cz3 mo9745c() {
        return this.f16075a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ rv3 mo13419g(sv3 sv3) {
        mo13421j((sx3) sv3);
        return this;
    }

    /* renamed from: i */
    public final px3 clone() {
        px3 px3 = (px3) this.f16075a.mo8196E(5, (Object) null, (Object) null);
        px3.mo13421j(mo8995t0());
        return px3;
    }

    /* renamed from: j */
    public final px3 mo13421j(sx3 sx3) {
        if (this.f16077c) {
            mo13425o();
            this.f16077c = false;
        }
        m18944h(this.f16076b, sx3);
        return this;
    }

    /* renamed from: k */
    public final px3 mo13422k(byte[] bArr, int i, int i2, ex3 ex3) throws ey3 {
        if (this.f16077c) {
            mo13425o();
            this.f16077c = false;
        }
        try {
            kz3.m15715a().mo11837b(this.f16076b.getClass()).mo10368j(this.f16076b, bArr, 0, i2, new vv3(ex3));
            return this;
        } catch (ey3 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw ey3.m12345j();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: m */
    public final MessageType mo13423m() {
        MessageType n = mo8995t0();
        if (n.mo14159C()) {
            return n;
        }
        throw new m04(n);
    }

    /* renamed from: n */
    public MessageType mo8995t0() {
        if (this.f16077c) {
            return this.f16076b;
        }
        sx3 sx3 = this.f16076b;
        kz3.m15715a().mo11837b(sx3.getClass()).mo10363e(sx3);
        this.f16077c = true;
        return this.f16076b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo13425o() {
        sx3 sx3 = (sx3) this.f16076b.mo8196E(4, (Object) null, (Object) null);
        m18944h(sx3, this.f16076b);
        this.f16076b = sx3;
    }
}
