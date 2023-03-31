package p180z4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0651l;
import androidx.fragment.app.C1093e;
import com.google.android.gms.common.api.GoogleApiActivity;
import p017b5.C1793e;
import p017b5.C1822t;
import p017b5.C1823u;
import p033d5.C4097d0;
import p033d5.C4106g0;
import p033d5.C4141r;
import p067i5.C4695i;
import p067i5.C4699m;
import p081k5.C4886a;
import p123q5.C5407e;
import p168x4.C6077a;
import p168x4.C6078b;

/* renamed from: z4.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C6368e extends C6370f {

    /* renamed from: d */
    public static final int f30600d = C6370f.f30608a;

    /* renamed from: e */
    private static final Object f30601e = new Object();

    /* renamed from: f */
    private static final C6368e f30602f = new C6368e();

    /* renamed from: c */
    private String f30603c;

    /* renamed from: q */
    public static C6368e m37415q() {
        return f30602f;
    }

    /* renamed from: A */
    public final boolean mo21772A(Context context, C6362b bVar, int i) {
        PendingIntent p;
        if (C4886a.m31066a(context) || (p = mo21780p(context, bVar)) == null) {
            return false;
        }
        mo21787x(context, bVar.mo21751I1(), (String) null, C5407e.m33158a(context, 0, GoogleApiActivity.m9047a(context, p, i, true), C5407e.f27632a | 134217728));
        return true;
    }

    /* renamed from: d */
    public Intent mo21773d(Context context, int i, String str) {
        return super.mo21773d(context, i, str);
    }

    /* renamed from: e */
    public PendingIntent mo21774e(Context context, int i, int i2) {
        return super.mo21774e(context, i, i2);
    }

    /* renamed from: g */
    public final String mo21775g(int i) {
        return super.mo21775g(i);
    }

    /* renamed from: i */
    public int mo21776i(Context context) {
        return super.mo21776i(context);
    }

    /* renamed from: j */
    public int mo21777j(Context context, int i) {
        return super.mo21777j(context, i);
    }

    /* renamed from: m */
    public final boolean mo21778m(int i) {
        return super.mo21778m(i);
    }

    /* renamed from: o */
    public Dialog mo21779o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo21783t(activity, i, C4106g0.m28142b(activity, mo21773d(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: p */
    public PendingIntent mo21780p(Context context, C6362b bVar) {
        if (bVar.mo21754L1()) {
            return bVar.mo21753K1();
        }
        return mo21774e(context, bVar.mo21751I1(), 0);
    }

    /* renamed from: r */
    public boolean mo21781r(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = mo21779o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        mo21786w(activity, o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: s */
    public void mo21782s(Context context, int i) {
        mo21787x(context, i, (String) null, mo21798f(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Dialog mo21783t(Context context, int i, C4106g0 g0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C4097d0.m28115d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C4097d0.m28114c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, g0Var);
        }
        String g = C4097d0.m28118g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: u */
    public final Dialog mo21784u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C4097d0.m28115d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo21786w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: v */
    public final C1823u mo21785v(Context context, C1822t tVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1823u uVar = new C1823u(tVar);
        context.registerReceiver(uVar, intentFilter);
        uVar.mo6994a(context);
        if (mo21800l(context, "com.google.android.gms")) {
            return uVar;
        }
        tVar.mo6993a();
        uVar.mo6995b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo21786w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C1093e) {
                C6384m.m37479U1(dialog, onCancelListener).mo3977T1(((C1093e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C6364c.m37412a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo21787x(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo21788y(context);
        } else if (pendingIntent != null) {
            String f = C4097d0.m28117f(context, i);
            String e = C4097d0.m28116e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C4141r.m28221k(context.getSystemService("notification"));
            C0651l.C0659e I = new C0651l.C0659e(context).mo2952z(true).mo2938k(true).mo2944q(f).mo2924I(new C0651l.C0657c().mo2915m(e));
            if (C4695i.m30397f(context)) {
                C4141r.m28224n(C4699m.m30414e());
                I.mo2922G(context.getApplicationInfo().icon).mo2919D(2);
                if (C4695i.m30398g(context)) {
                    I.mo2930a(C6077a.common_full_open_on_phone, resources.getString(C6078b.common_open_on_phone), pendingIntent);
                } else {
                    I.mo2942o(pendingIntent);
                }
            } else {
                I.mo2922G(17301642).mo2926K(resources.getString(C6078b.common_google_play_services_notification_ticker)).mo2929N(System.currentTimeMillis()).mo2942o(pendingIntent).mo2943p(e);
            }
            if (C4699m.m30418i()) {
                C4141r.m28224n(C4699m.m30418i());
                synchronized (f30601e) {
                    str2 = this.f30603c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = C4097d0.m28113b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                I.mo2939l(str2);
            }
            Notification c = I.mo2932c();
            if (i == 1 || i == 2 || i == 3) {
                C6378j.f30618b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, c);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo21788y(Context context) {
        new C6387o(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: z */
    public final boolean mo21789z(Activity activity, C1793e eVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog t = mo21783t(activity, i, C4106g0.m28143c(eVar, mo21773d(activity, i, "d"), 2), onCancelListener);
        if (t == null) {
            return false;
        }
        mo21786w(activity, t, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
