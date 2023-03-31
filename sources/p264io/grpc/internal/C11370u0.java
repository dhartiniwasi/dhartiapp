package p264io.grpc.internal;

import java.nio.charset.Charset;
import p182a7.C6415d;
import p182a7.C6431n;
import p264io.grpc.internal.C11100a;
import p343rc.C12335j1;
import p343rc.C12354m0;
import p343rc.C12365o0;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.u0 */
/* compiled from: Http2ClientStreamTransportState */
public abstract class C11370u0 extends C11100a.C11103c {

    /* renamed from: w */
    private static final C12354m0.C12355a<Integer> f43628w;

    /* renamed from: x */
    private static final C12411y0.C12418g<Integer> f43629x;

    /* renamed from: s */
    private C12335j1 f43630s;

    /* renamed from: t */
    private C12411y0 f43631t;

    /* renamed from: u */
    private Charset f43632u = C6415d.f30664c;

    /* renamed from: v */
    private boolean f43633v;

    /* renamed from: io.grpc.internal.u0$a */
    /* compiled from: Http2ClientStreamTransportState */
    class C11371a implements C12354m0.C12355a<Integer> {
        C11371a() {
        }

        /* renamed from: c */
        public Integer mo35306b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, C12354m0.f45672a));
        }

        /* renamed from: d */
        public byte[] mo35305a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C11371a aVar = new C11371a();
        f43628w = aVar;
        f43629x = C12354m0.m59157b(":status", aVar);
    }

    protected C11370u0(int i, C11255i2 i2Var, C11310o2 o2Var) {
        super(i, i2Var, o2Var);
    }

    /* renamed from: O */
    private static Charset m55925O(C12411y0 y0Var) {
        String str = (String) y0Var.mo37166g(C11335r0.f43536j);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return C6415d.f30664c;
    }

    /* renamed from: Q */
    private C12335j1 m55926Q(C12411y0 y0Var) {
        C12335j1 j1Var;
        C12335j1 j1Var2 = (C12335j1) y0Var.mo37166g(C12365o0.f45692b);
        if (j1Var2 != null) {
            return j1Var2.mo37030q((String) y0Var.mo37166g(C12365o0.f45691a));
        }
        if (this.f43633v) {
            return C12335j1.f45608h.mo37030q("missing GRPC status in response");
        }
        Integer num = (Integer) y0Var.mo37166g(f43629x);
        if (num != null) {
            j1Var = C11335r0.m55805l(num.intValue());
        } else {
            j1Var = C12335j1.f45620t.mo37030q("missing HTTP status code");
        }
        return j1Var.mo37022e("missing GRPC status, inferred error from HTTP status code");
    }

    /* renamed from: R */
    private static void m55927R(C12411y0 y0Var) {
        y0Var.mo37165e(f43629x);
        y0Var.mo37165e(C12365o0.f45692b);
        y0Var.mo37165e(C12365o0.f45691a);
    }

    /* renamed from: V */
    private C12335j1 m55928V(C12411y0 y0Var) {
        Integer num = (Integer) y0Var.mo37166g(f43629x);
        if (num == null) {
            return C12335j1.f45620t.mo37030q("Missing HTTP status code");
        }
        String str = (String) y0Var.mo37166g(C11335r0.f43536j);
        if (C11335r0.m55806m(str)) {
            return null;
        }
        C12335j1 l = C11335r0.m55805l(num.intValue());
        return l.mo37022e("invalid content-type: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract void mo35357P(C12335j1 j1Var, boolean z, C12411y0 y0Var);

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo35358S(C11380v1 v1Var, boolean z) {
        C12335j1 j1Var = this.f43630s;
        if (j1Var != null) {
            this.f43630s = j1Var.mo37022e("DATA-----------------------------\n" + C11384w1.m55972e(v1Var, this.f43632u));
            v1Var.close();
            if (this.f43630s.mo37027n().length() > 1000 || z) {
                mo35357P(this.f43630s, false, this.f43631t);
            }
        } else if (!this.f43633v) {
            mo35357P(C12335j1.f45620t.mo37030q("headers not received before payload"), false, new C12411y0());
        } else {
            int k = v1Var.mo35271k();
            mo34921D(v1Var);
            if (z) {
                if (k > 0) {
                    this.f43630s = C12335j1.f45620t.mo37030q("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f43630s = C12335j1.f45620t.mo37030q("Received unexpected EOS on empty DATA frame from server");
                }
                C12411y0 y0Var = new C12411y0();
                this.f43631t = y0Var;
                mo34928N(this.f43630s, false, y0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo35359T(C12411y0 y0Var) {
        C6431n.m37562o(y0Var, "headers");
        C12335j1 j1Var = this.f43630s;
        if (j1Var != null) {
            this.f43630s = j1Var.mo37022e("headers: " + y0Var);
            return;
        }
        try {
            if (this.f43633v) {
                C12335j1 q = C12335j1.f45620t.mo37030q("Received headers twice");
                this.f43630s = q;
                if (q != null) {
                    this.f43630s = q.mo37022e("headers: " + y0Var);
                    this.f43631t = y0Var;
                    this.f43632u = m55925O(y0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) y0Var.mo37166g(f43629x);
            if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                this.f43633v = true;
                C12335j1 V = m55928V(y0Var);
                this.f43630s = V;
                if (V == null) {
                    m55927R(y0Var);
                    mo34922E(y0Var);
                    C12335j1 j1Var2 = this.f43630s;
                    if (j1Var2 != null) {
                        this.f43630s = j1Var2.mo37022e("headers: " + y0Var);
                        this.f43631t = y0Var;
                        this.f43632u = m55925O(y0Var);
                    }
                } else if (V != null) {
                    this.f43630s = V.mo37022e("headers: " + y0Var);
                    this.f43631t = y0Var;
                    this.f43632u = m55925O(y0Var);
                }
            }
        } finally {
            C12335j1 j1Var3 = this.f43630s;
            if (j1Var3 != null) {
                this.f43630s = j1Var3.mo37022e("headers: " + y0Var);
                this.f43631t = y0Var;
                this.f43632u = m55925O(y0Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo35360U(C12411y0 y0Var) {
        C6431n.m37562o(y0Var, "trailers");
        if (this.f43630s == null && !this.f43633v) {
            C12335j1 V = m55928V(y0Var);
            this.f43630s = V;
            if (V != null) {
                this.f43631t = y0Var;
            }
        }
        C12335j1 j1Var = this.f43630s;
        if (j1Var != null) {
            C12335j1 e = j1Var.mo37022e("trailers: " + y0Var);
            this.f43630s = e;
            mo35357P(e, false, this.f43631t);
            return;
        }
        C12335j1 Q = m55926Q(y0Var);
        m55927R(y0Var);
        mo34923F(y0Var, Q);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo34929c(boolean z) {
        super.mo34929c(z);
    }
}
