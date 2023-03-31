package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3892x9 implements C3510ll {

    /* renamed from: a */
    private final String f22907a;

    /* renamed from: b */
    private final int f22908b;

    /* renamed from: c */
    private C3406ig f22909c;

    /* renamed from: d */
    private C3438jf f22910d;

    /* renamed from: e */
    private int f22911e;

    /* renamed from: f */
    private C3835vg f22912f;

    C3892x9(C3607oj ojVar) throws GeneralSecurityException {
        String E = ojVar.mo16512E();
        this.f22907a = E;
        if (E.equals(C3397i7.f22141b)) {
            try {
                C3505lg C = C3505lg.m26107C(ojVar.mo16511D(), C3852w1.m27266a());
                this.f22909c = (C3406ig) C3265e7.m25473d(ojVar);
                this.f22908b = C.mo16335z();
            } catch (C3689r2 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (E.equals(C3397i7.f22140a)) {
            try {
                C3537mf B = C3537mf.m26193B(ojVar.mo16511D(), C3852w1.m27266a());
                this.f22910d = (C3438jf) C3265e7.m25473d(ojVar);
                this.f22911e = B.mo16393C().mo16810z();
                this.f22908b = this.f22911e + B.mo16394D().mo16397z();
            } catch (C3689r2 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (E.equals(C3399i9.f22145a)) {
            try {
                C3931yg C2 = C3931yg.m27447C(ojVar.mo16511D(), C3852w1.m27266a());
                this.f22912f = (C3835vg) C3265e7.m25473d(ojVar);
                this.f22908b = C2.mo17075z();
            } catch (C3689r2 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(E)));
        }
    }

    /* renamed from: b */
    public final C3763ta mo16341b(byte[] bArr) throws GeneralSecurityException {
        Class<C3758t5> cls = C3758t5.class;
        if (bArr.length != this.f22908b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f22907a.equals(C3397i7.f22141b)) {
            C3373hg A = C3406ig.m25803A();
            A.mo16061d(this.f22909c);
            A.mo16096j(C3325g1.m25614v(bArr, 0, this.f22908b));
            return new C3763ta((C3758t5) C3265e7.m25478i(this.f22907a, (C3406ig) A.mo16062e(), cls));
        } else if (this.f22907a.equals(C3397i7.f22140a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f22911e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f22911e, this.f22908b);
            C3636pf A2 = C3669qf.m26560A();
            A2.mo16061d(this.f22910d.mo16217D());
            A2.mo16547j(C3325g1.m25613u(copyOfRange));
            C3408ii A3 = C3441ji.m25914A();
            A3.mo16061d(this.f22910d.mo16218E());
            A3.mo16180j(C3325g1.m25613u(copyOfRange2));
            C3405if A4 = C3438jf.m25898A();
            A4.mo16176l(this.f22910d.mo16219z());
            A4.mo16174j((C3669qf) A2.mo16062e());
            A4.mo16175k((C3441ji) A3.mo16062e());
            return new C3763ta((C3758t5) C3265e7.m25478i(this.f22907a, (C3438jf) A4.mo16062e(), cls));
        } else if (this.f22907a.equals(C3399i9.f22145a)) {
            C3802ug A5 = C3835vg.m27217A();
            A5.mo16061d(this.f22912f);
            A5.mo16876j(C3325g1.m25614v(bArr, 0, this.f22908b));
            return new C3763ta((C3888x5) C3265e7.m25478i(this.f22907a, (C3835vg) A5.mo16062e(), C3888x5.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f22908b;
    }
}
