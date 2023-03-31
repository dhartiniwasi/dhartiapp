package p066i4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.pm0;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* renamed from: i4.a */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4656a {
    /* renamed from: a */
    public static final boolean m30282a(Context context, Intent intent, C4665e0 e0Var, C4661c0 c0Var, boolean z) {
        if (z) {
            return m30284c(context, intent.getData(), e0Var, c0Var);
        }
        try {
            String uri = intent.toURI();
            C4794n1.m30693k("Launching an intent: " + uri);
            C4409t.m29326r();
            C4751b2.m30615j(context, intent);
            if (e0Var != null) {
                e0Var.mo9271c();
            }
            if (c0Var != null) {
                c0Var.mo12531b(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            pm0.m18667g(e.getMessage());
            if (c0Var != null) {
                c0Var.mo12531b(false);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m30283b(Context context, C4669i iVar, C4665e0 e0Var, C4661c0 c0Var) {
        int i = 0;
        if (iVar == null) {
            pm0.m18667g("No intent data for launcher overlay.");
            return false;
        }
        C2679nz.m17343c(context);
        Intent intent = iVar.f25206h;
        if (intent != null) {
            return m30282a(context, intent, e0Var, c0Var, iVar.f25208r);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(iVar.f25200b)) {
            pm0.m18667g("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(iVar.f25201c)) {
            intent2.setDataAndType(Uri.parse(iVar.f25200b), iVar.f25201c);
        } else {
            intent2.setData(Uri.parse(iVar.f25200b));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(iVar.f25202d)) {
            intent2.setPackage(iVar.f25202d);
        }
        if (!TextUtils.isEmpty(iVar.f25203e)) {
            String[] split = iVar.f25203e.split("/", 2);
            if (split.length < 2) {
                pm0.m18667g("Could not parse component name from open GMSG: ".concat(String.valueOf(iVar.f25203e)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = iVar.f25204f;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                pm0.m18667g("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14306G3)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14296F3)).booleanValue()) {
                C4409t.m29326r();
                C4751b2.m30592J(context, intent2);
            }
        }
        return m30282a(context, intent2, e0Var, c0Var, iVar.f25208r);
    }

    /* renamed from: c */
    private static final boolean m30284c(Context context, Uri uri, C4665e0 e0Var, C4661c0 c0Var) {
        int i;
        try {
            i = C4409t.m29326r().mo18436H(context, uri);
            if (e0Var != null) {
                e0Var.mo9271c();
            }
        } catch (ActivityNotFoundException e) {
            pm0.m18667g(e.getMessage());
            i = 6;
        }
        if (c0Var != null) {
            c0Var.mo12532s(i);
        }
        return i == 5;
    }
}
