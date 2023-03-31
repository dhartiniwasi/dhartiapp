package p033d5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p033d5.C4114j;
import p040e5.C4240a;
import p180z4.C6366d;

/* renamed from: d5.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4102f extends C4240a {
    public static final Parcelable.Creator<C4102f> CREATOR = new C4129n1();

    /* renamed from: w */
    static final Scope[] f23297w = new Scope[0];

    /* renamed from: x */
    static final C6366d[] f23298x = new C6366d[0];

    /* renamed from: a */
    final int f23299a;

    /* renamed from: b */
    final int f23300b;

    /* renamed from: c */
    int f23301c;

    /* renamed from: d */
    String f23302d;

    /* renamed from: e */
    IBinder f23303e;

    /* renamed from: f */
    Scope[] f23304f;

    /* renamed from: g */
    Bundle f23305g;

    /* renamed from: h */
    Account f23306h;

    /* renamed from: i */
    C6366d[] f23307i;

    /* renamed from: r */
    C6366d[] f23308r;

    /* renamed from: s */
    boolean f23309s;

    /* renamed from: t */
    int f23310t;

    /* renamed from: u */
    boolean f23311u;

    /* renamed from: v */
    private String f23312v;

    C4102f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C6366d[] dVarArr, C6366d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f23297w : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f23298x : dVarArr;
        dVarArr2 = dVarArr2 == null ? f23298x : dVarArr2;
        this.f23299a = i;
        this.f23300b = i2;
        this.f23301c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f23302d = "com.google.android.gms";
        } else {
            this.f23302d = str;
        }
        if (i < 2) {
            this.f23306h = iBinder != null ? C4081a.m28023P0(C4114j.C4115a.m28166B0(iBinder)) : null;
        } else {
            this.f23303e = iBinder;
            this.f23306h = account;
        }
        this.f23304f = scopeArr;
        this.f23305g = bundle;
        this.f23307i = dVarArr;
        this.f23308r = dVarArr2;
        this.f23309s = z;
        this.f23310t = i4;
        this.f23311u = z2;
        this.f23312v = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C4129n1.m28187a(this, parcel, i);
    }

    public final String zza() {
        return this.f23312v;
    }
}
