package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p033d5.C4141r;
import p402y5.C13029g;
import p402y5.C13039q;
import p402y5.C13040r;
import p402y5.C13041s;

/* renamed from: com.google.android.gms.measurement.internal.a3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7297a3 {

    /* renamed from: b */
    protected static final AtomicReference f32311b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f32312c = new AtomicReference();

    /* renamed from: d */
    protected static final AtomicReference f32313d = new AtomicReference();

    /* renamed from: a */
    private final C13029g f32314a;

    public C7297a3(C13029g gVar) {
        this.f32314a = gVar;
    }

    /* renamed from: g */
    private static final String m41260g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C4141r.m28221k(strArr);
        C4141r.m28221k(strArr2);
        C4141r.m28221k(atomicReference);
        C4141r.m28211a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo24092a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo24093b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo24093b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f32314a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo24096e(str2));
            sb.append("=");
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = mo24092a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo24092a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo24092a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo24094c(C7524v vVar) {
        String str;
        if (!this.f32314a.zza()) {
            return vVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(vVar.f33103c);
        sb.append(",name=");
        sb.append(mo24095d(vVar.f33101a));
        sb.append(",params=");
        C7502t tVar = vVar.f33102b;
        if (tVar == null) {
            str = null;
        } else if (!this.f32314a.zza()) {
            str = tVar.toString();
        } else {
            str = mo24093b(tVar.mo24661K1());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo24095d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f32314a.zza()) {
            return str;
        }
        return m41260g(str, C13039q.f47288c, C13039q.f47286a, f32311b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo24096e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f32314a.zza()) {
            return str;
        }
        return m41260g(str, C13040r.f47291b, C13040r.f47290a, f32312c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo24097f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f32314a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m41260g(str, C13041s.f47295b, C13041s.f47294a, f32313d);
        }
        return "experiment_id(" + str + ")";
    }
}
