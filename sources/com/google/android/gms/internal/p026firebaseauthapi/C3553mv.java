package com.google.android.gms.internal.p026firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.auth.C7840p1;
import java.util.ArrayList;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3553mv extends C4240a {
    public static final Parcelable.Creator<C3553mv> CREATOR = new C3586nv();

    /* renamed from: a */
    private String f22386a;

    /* renamed from: b */
    private String f22387b;

    /* renamed from: c */
    private boolean f22388c;

    /* renamed from: d */
    private String f22389d;

    /* renamed from: e */
    private String f22390e;

    /* renamed from: f */
    private C3389i f22391f;

    /* renamed from: g */
    private String f22392g;

    /* renamed from: h */
    private String f22393h;

    /* renamed from: i */
    private long f22394i;

    /* renamed from: r */
    private long f22395r;

    /* renamed from: s */
    private boolean f22396s;

    /* renamed from: t */
    private C7840p1 f22397t;

    /* renamed from: u */
    private List f22398u;

    public C3553mv() {
        this.f22391f = new C3389i();
    }

    /* renamed from: I1 */
    public final long mo16405I1() {
        return this.f22394i;
    }

    /* renamed from: J1 */
    public final Uri mo16406J1() {
        if (!TextUtils.isEmpty(this.f22390e)) {
            return Uri.parse(this.f22390e);
        }
        return null;
    }

    /* renamed from: K1 */
    public final C7840p1 mo16407K1() {
        return this.f22397t;
    }

    /* renamed from: L1 */
    public final C3553mv mo16408L1(C7840p1 p1Var) {
        this.f22397t = p1Var;
        return this;
    }

    /* renamed from: M1 */
    public final C3553mv mo16409M1(String str) {
        this.f22389d = str;
        return this;
    }

    /* renamed from: N1 */
    public final C3553mv mo16410N1(String str) {
        this.f22387b = str;
        return this;
    }

    /* renamed from: O1 */
    public final C3553mv mo16411O1(boolean z) {
        this.f22396s = z;
        return this;
    }

    /* renamed from: P1 */
    public final C3553mv mo16412P1(String str) {
        C4141r.m28217g(str);
        this.f22392g = str;
        return this;
    }

    /* renamed from: Q1 */
    public final C3553mv mo16413Q1(String str) {
        this.f22390e = str;
        return this;
    }

    /* renamed from: R1 */
    public final C3553mv mo16414R1(List list) {
        C4141r.m28221k(list);
        C3389i iVar = new C3389i();
        this.f22391f = iVar;
        iVar.mo16115K1().addAll(list);
        return this;
    }

    /* renamed from: S1 */
    public final C3389i mo16415S1() {
        return this.f22391f;
    }

    /* renamed from: T1 */
    public final String mo16416T1() {
        return this.f22389d;
    }

    /* renamed from: U1 */
    public final String mo16417U1() {
        return this.f22387b;
    }

    /* renamed from: V1 */
    public final String mo16418V1() {
        return this.f22386a;
    }

    /* renamed from: W1 */
    public final String mo16419W1() {
        return this.f22393h;
    }

    /* renamed from: X1 */
    public final List mo16420X1() {
        return this.f22398u;
    }

    /* renamed from: Y1 */
    public final List mo16421Y1() {
        return this.f22391f.mo16115K1();
    }

    /* renamed from: Z1 */
    public final boolean mo16422Z1() {
        return this.f22388c;
    }

    /* renamed from: a2 */
    public final boolean mo16423a2() {
        return this.f22396s;
    }

    /* renamed from: d */
    public final long mo16424d() {
        return this.f22395r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f22386a, false);
        C4243c.m28620q(parcel, 3, this.f22387b, false);
        C4243c.m28606c(parcel, 4, this.f22388c);
        C4243c.m28620q(parcel, 5, this.f22389d, false);
        C4243c.m28620q(parcel, 6, this.f22390e, false);
        C4243c.m28619p(parcel, 7, this.f22391f, i, false);
        C4243c.m28620q(parcel, 8, this.f22392g, false);
        C4243c.m28620q(parcel, 9, this.f22393h, false);
        C4243c.m28617n(parcel, 10, this.f22394i);
        C4243c.m28617n(parcel, 11, this.f22395r);
        C4243c.m28606c(parcel, 12, this.f22396s);
        C4243c.m28619p(parcel, 13, this.f22397t, i, false);
        C4243c.m28624u(parcel, 14, this.f22398u, false);
        C4243c.m28605b(parcel, a);
    }

    public C3553mv(String str, String str2, boolean z, String str3, String str4, C3389i iVar, String str5, String str6, long j, long j2, boolean z2, C7840p1 p1Var, List list) {
        C3389i iVar2;
        this.f22386a = str;
        this.f22387b = str2;
        this.f22388c = z;
        this.f22389d = str3;
        this.f22390e = str4;
        if (iVar == null) {
            iVar2 = new C3389i();
        } else {
            iVar2 = C3389i.m25731J1(iVar);
        }
        this.f22391f = iVar2;
        this.f22392g = str5;
        this.f22393h = str6;
        this.f22394i = j;
        this.f22395r = j2;
        this.f22396s = z2;
        this.f22397t = p1Var;
        this.f22398u = list == null ? new ArrayList() : list;
    }
}
