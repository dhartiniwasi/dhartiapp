package p180z4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import p033d5.C4152u1;
import p067i5.C4695i;
import p081k5.C4888c;
import p137s5.C5488d;

/* renamed from: z4.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6370f {

    /* renamed from: a */
    public static final int f30608a = C6378j.f30617a;

    /* renamed from: b */
    private static final C6370f f30609b = new C6370f();

    C6370f() {
    }

    /* renamed from: h */
    public static C6370f m37437h() {
        return f30609b;
    }

    /* renamed from: a */
    public void mo21795a(Context context) {
        C6378j.m37452a(context);
    }

    /* renamed from: b */
    public int mo21796b(Context context) {
        return C6378j.m37454c(context);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo21797c(int i) {
        return mo21773d((Context) null, i, (String) null);
    }

    /* renamed from: d */
    public Intent mo21773d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C4695i.m30398g(context)) {
                return C4152u1.m28247a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f30608a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C4888c.m31075a(context).mo18673f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C4152u1.m28248b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C4152u1.m28249c("com.google.android.gms");
        }
    }

    /* renamed from: e */
    public PendingIntent mo21774e(Context context, int i, int i2) {
        return mo21798f(context, i, i2, (String) null);
    }

    /* renamed from: f */
    public PendingIntent mo21798f(Context context, int i, int i2, String str) {
        Intent d = mo21773d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, C5488d.f27838a | 134217728);
    }

    /* renamed from: g */
    public String mo21775g(int i) {
        return C6378j.m37455d(i);
    }

    /* renamed from: i */
    public int mo21776i(Context context) {
        return mo21777j(context, f30608a);
    }

    /* renamed from: j */
    public int mo21777j(Context context, int i) {
        int h = C6378j.m37459h(context, i);
        if (C6378j.m37460i(context, h)) {
            return 18;
        }
        return h;
    }

    /* renamed from: k */
    public boolean mo21799k(Context context, int i) {
        return C6378j.m37460i(context, i);
    }

    /* renamed from: l */
    public boolean mo21800l(Context context, String str) {
        return C6378j.m37464m(context, str);
    }

    /* renamed from: m */
    public boolean mo21778m(int i) {
        return C6378j.m37462k(i);
    }

    /* renamed from: n */
    public void mo21801n(Context context, int i) throws C6374h, C6372g {
        C6378j.m37453b(context, i);
    }
}
