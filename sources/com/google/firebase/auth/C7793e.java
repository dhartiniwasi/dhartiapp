package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.firebase.auth.e */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7793e extends C4240a {
    public static final Parcelable.Creator<C7793e> CREATOR = new C7831n1();

    /* renamed from: a */
    private final String f34108a;

    /* renamed from: b */
    private final String f34109b;

    /* renamed from: c */
    private final String f34110c;

    /* renamed from: d */
    private final String f34111d;

    /* renamed from: e */
    private final boolean f34112e;

    /* renamed from: f */
    private final String f34113f;

    /* renamed from: g */
    private final boolean f34114g;

    /* renamed from: h */
    private String f34115h;

    /* renamed from: i */
    private int f34116i;

    /* renamed from: r */
    private String f34117r;

    /* renamed from: com.google.firebase.auth.e$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C7794a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f34118a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f34119b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f34120c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f34121d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f34122e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f34123f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f34124g;

        /* synthetic */ C7794a(C7870z0 z0Var) {
        }

        /* renamed from: a */
        public C7793e mo26084a() {
            if (this.f34118a != null) {
                return new C7793e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        /* renamed from: b */
        public C7794a mo26085b(String str, boolean z, String str2) {
            this.f34120c = str;
            this.f34121d = z;
            this.f34122e = str2;
            return this;
        }

        /* renamed from: c */
        public C7794a mo26086c(String str) {
            this.f34124g = str;
            return this;
        }

        /* renamed from: d */
        public C7794a mo26087d(boolean z) {
            this.f34123f = z;
            return this;
        }

        /* renamed from: e */
        public C7794a mo26088e(String str) {
            this.f34119b = str;
            return this;
        }

        /* renamed from: f */
        public C7794a mo26089f(String str) {
            this.f34118a = str;
            return this;
        }
    }

    private C7793e(C7794a aVar) {
        this.f34108a = aVar.f34118a;
        this.f34109b = aVar.f34119b;
        this.f34110c = null;
        this.f34111d = aVar.f34120c;
        this.f34112e = aVar.f34121d;
        this.f34113f = aVar.f34122e;
        this.f34114g = aVar.f34123f;
        this.f34117r = aVar.f34124g;
    }

    /* renamed from: O1 */
    public static C7794a m43334O1() {
        return new C7794a((C7870z0) null);
    }

    /* renamed from: Q1 */
    public static C7793e m43335Q1() {
        return new C7793e(new C7794a((C7870z0) null));
    }

    /* renamed from: I1 */
    public boolean mo26071I1() {
        return this.f34114g;
    }

    /* renamed from: J1 */
    public boolean mo26072J1() {
        return this.f34112e;
    }

    /* renamed from: K1 */
    public String mo26073K1() {
        return this.f34113f;
    }

    /* renamed from: L1 */
    public String mo26074L1() {
        return this.f34111d;
    }

    /* renamed from: M1 */
    public String mo26075M1() {
        return this.f34109b;
    }

    /* renamed from: N1 */
    public String mo26076N1() {
        return this.f34108a;
    }

    /* renamed from: P1 */
    public final int mo26077P1() {
        return this.f34116i;
    }

    /* renamed from: R1 */
    public final String mo26078R1() {
        return this.f34117r;
    }

    /* renamed from: S1 */
    public final String mo26079S1() {
        return this.f34110c;
    }

    /* renamed from: T1 */
    public final String mo26080T1() {
        return this.f34115h;
    }

    /* renamed from: U1 */
    public final void mo26081U1(String str) {
        this.f34115h = str;
    }

    /* renamed from: V1 */
    public final void mo26082V1(int i) {
        this.f34116i = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, mo26076N1(), false);
        C4243c.m28620q(parcel, 2, mo26075M1(), false);
        C4243c.m28620q(parcel, 3, this.f34110c, false);
        C4243c.m28620q(parcel, 4, mo26074L1(), false);
        C4243c.m28606c(parcel, 5, mo26072J1());
        C4243c.m28620q(parcel, 6, mo26073K1(), false);
        C4243c.m28606c(parcel, 7, mo26071I1());
        C4243c.m28620q(parcel, 8, this.f34115h, false);
        C4243c.m28614k(parcel, 9, this.f34116i);
        C4243c.m28620q(parcel, 10, this.f34117r, false);
        C4243c.m28605b(parcel, a);
    }

    C7793e(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.f34108a = str;
        this.f34109b = str2;
        this.f34110c = str3;
        this.f34111d = str4;
        this.f34112e = z;
        this.f34113f = str5;
        this.f34114g = z2;
        this.f34115h = str6;
        this.f34116i = i;
        this.f34117r = str7;
    }
}
