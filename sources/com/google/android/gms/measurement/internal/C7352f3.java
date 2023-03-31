package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.f3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7352f3 extends C7332d5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f32463c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f32464d = -1;

    /* renamed from: e */
    private String f32465e;

    /* renamed from: f */
    private final C7330d3 f32466f = new C7330d3(this, 6, false, false);

    /* renamed from: g */
    private final C7330d3 f32467g = new C7330d3(this, 6, true, false);

    /* renamed from: h */
    private final C7330d3 f32468h = new C7330d3(this, 6, false, true);

    /* renamed from: i */
    private final C7330d3 f32469i = new C7330d3(this, 5, false, false);

    /* renamed from: j */
    private final C7330d3 f32470j = new C7330d3(this, 5, true, false);

    /* renamed from: k */
    private final C7330d3 f32471k = new C7330d3(this, 5, false, true);

    /* renamed from: l */
    private final C7330d3 f32472l = new C7330d3(this, 4, false, false);

    /* renamed from: m */
    private final C7330d3 f32473m = new C7330d3(this, 3, false, false);

    /* renamed from: n */
    private final C7330d3 f32474n = new C7330d3(this, 2, false, false);

    C7352f3(C7397j4 j4Var) {
        super(j4Var);
    }

    /* renamed from: A */
    static String m41468A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = m41469B(z, obj);
        String B2 = m41469B(z, obj2);
        String B3 = m41469B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    static String m41469B(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String G = m41472G(C7397j4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m41472G(className).equals(G)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb.toString();
            } else if (obj instanceof C7341e3) {
                return ((C7341e3) obj).f32448a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: G */
    private static String m41472G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    protected static Object m41475z(String str) {
        if (str == null) {
            return null;
        }
        return new C7341e3(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final String mo24253C() {
        String str;
        synchronized (this) {
            if (this.f32465e == null) {
                if (this.f32389a.mo24426Q() != null) {
                    this.f32465e = this.f32389a.mo24426Q();
                } else {
                    this.f32465e = this.f32389a.mo24443z().mo24298w();
                }
            }
            C4141r.m28221k(this.f32465e);
            str = this.f32465e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo24254F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo24253C(), i)) {
            Log.println(i, mo24253C(), m41468A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C4141r.m28221k(str);
            C7375h4 G = this.f32389a.mo24417G();
            if (G == null) {
                Log.println(6, mo24253C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo24239m()) {
                Log.println(6, mo24253C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                G.mo24309z(new C7319c3(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo24235h() {
        return false;
    }

    /* renamed from: p */
    public final C7330d3 mo24255p() {
        return this.f32473m;
    }

    /* renamed from: q */
    public final C7330d3 mo24256q() {
        return this.f32466f;
    }

    /* renamed from: r */
    public final C7330d3 mo24257r() {
        return this.f32468h;
    }

    /* renamed from: t */
    public final C7330d3 mo24258t() {
        return this.f32467g;
    }

    /* renamed from: u */
    public final C7330d3 mo24259u() {
        return this.f32472l;
    }

    /* renamed from: v */
    public final C7330d3 mo24260v() {
        return this.f32474n;
    }

    /* renamed from: w */
    public final C7330d3 mo24261w() {
        return this.f32469i;
    }

    /* renamed from: x */
    public final C7330d3 mo24262x() {
        return this.f32471k;
    }

    /* renamed from: y */
    public final C7330d3 mo24263y() {
        return this.f32470j;
    }
}
