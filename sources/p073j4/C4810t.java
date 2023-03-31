package p073j4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.ay1;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.ey1;
import com.google.android.gms.internal.ads.mf3;
import com.google.android.gms.internal.ads.pm0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p053g4.C4409t;
import p060h4.C4596v;

/* renamed from: j4.t */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4810t {

    /* renamed from: a */
    private final Context f25525a;

    /* renamed from: b */
    private final ey1 f25526b;

    /* renamed from: c */
    private String f25527c;

    /* renamed from: d */
    private String f25528d;

    /* renamed from: e */
    private String f25529e;

    /* renamed from: f */
    private String f25530f;

    /* renamed from: g */
    private int f25531g;

    /* renamed from: h */
    private int f25532h;

    /* renamed from: i */
    private PointF f25533i;

    /* renamed from: j */
    private PointF f25534j;

    /* renamed from: k */
    private Handler f25535k;

    /* renamed from: l */
    private Runnable f25536l;

    public C4810t(Context context) {
        this.f25531g = 0;
        this.f25536l = new C4807s(this);
        this.f25525a = context;
        this.f25532h = ViewConfiguration.get(context).getScaledTouchSlop();
        C4409t.m29330v().mo18569b();
        this.f25535k = C4409t.m29330v().mo18568a();
        this.f25526b = C4409t.m29329u().mo18554a();
    }

    /* renamed from: s */
    private final void m30788s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u = m30790u(arrayList, "None", true);
        int u2 = m30790u(arrayList, "Shake", true);
        int u3 = m30790u(arrayList, "Flick", true);
        ay1 ay1 = ay1.NONE;
        int ordinal = this.f25526b.mo10030a().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? u : u3 : u2;
        C4409t.m29326r();
        AlertDialog.Builder g = C4751b2.m30612g(context);
        AtomicInteger atomicInteger = new AtomicInteger(i);
        g.setTitle("Setup gesture");
        g.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new C4783k(atomicInteger));
        g.setNegativeButton("Dismiss", new C4786l(this));
        g.setPositiveButton("Save", new C4789m(this, atomicInteger, i, u2, u3));
        g.setOnCancelListener(new C4792n(this));
        g.create().show();
    }

    /* renamed from: t */
    private final boolean m30789t(float f, float f2, float f3, float f4) {
        return Math.abs(this.f25533i.x - f) < ((float) this.f25532h) && Math.abs(this.f25533i.y - f2) < ((float) this.f25532h) && Math.abs(this.f25534j.x - f3) < ((float) this.f25532h) && Math.abs(this.f25534j.y - f4) < ((float) this.f25532h);
    }

    /* renamed from: u */
    private static final int m30790u(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo18531a() {
        m30788s(this.f25525a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo18532b() {
        m30788s(this.f25525a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo18533c(mf3 mf3) {
        if (!C4409t.m29329u().mo18563j(this.f25525a, this.f25528d, this.f25529e)) {
            C4409t.m29329u().mo18557d(this.f25525a, this.f25528d, this.f25529e);
        } else {
            mf3.execute(new C4768g(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo18534d(mf3 mf3) {
        if (!C4409t.m29329u().mo18563j(this.f25525a, this.f25528d, this.f25529e)) {
            C4409t.m29329u().mo18557d(this.f25525a, this.f25528d, this.f25529e);
        } else {
            mf3.execute(new C4804r(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo18535e() {
        C4409t.m29329u().mo18556c(this.f25525a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo18536f() {
        C4409t.m29329u().mo18556c(this.f25525a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo18537g() {
        this.f25531g = 4;
        mo18548r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo18538h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.f25526b.mo10040k(ay1.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.f25526b.mo10040k(ay1.FLICK);
            } else {
                this.f25526b.mo10040k(ay1.NONE);
            }
        }
        mo18548r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo18539i(String str, DialogInterface dialogInterface, int i) {
        C4409t.m29326r();
        C4751b2.m30615j(this.f25525a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo18540j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.f25525a instanceof Activity)) {
                pm0.m18666f("Can not create dialog without Activity Context");
                return;
            }
            String str = this.f25527c;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                C4409t.m29326r();
                Map l = C4751b2.m30617l(build);
                for (String str3 : l.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) l.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            C4409t.m29326r();
            AlertDialog.Builder g = C4751b2.m30612g(this.f25525a);
            g.setMessage(str2);
            g.setTitle("Ad Information");
            g.setPositiveButton("Share", new C4760e(this, str2));
            g.setNegativeButton("Close", C4764f.f25424a);
            g.create().show();
        } else if (i6 == i2) {
            pm0.m18662b("Debug mode [Creative Preview] selected.");
            dn0.f8325a.execute(new C4756d(this));
        } else if (i6 == i3) {
            pm0.m18662b("Debug mode [Troubleshooting] selected.");
            dn0.f8325a.execute(new C4772h(this));
        } else if (i6 == i4) {
            mf3 mf3 = dn0.f8329e;
            mf3 mf32 = dn0.f8325a;
            if (this.f25526b.mo10043n()) {
                mf3.execute(new C4795o(this));
            } else {
                mf32.execute(new C4798p(this, mf3));
            }
        } else if (i6 == i5) {
            mf3 mf33 = dn0.f8329e;
            mf3 mf34 = dn0.f8325a;
            if (this.f25526b.mo10043n()) {
                mf33.execute(new C4776i(this));
            } else {
                mf34.execute(new C4780j(this, mf33));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo18541k() {
        C4822x u = C4409t.m29329u();
        Context context = this.f25525a;
        String str = this.f25528d;
        String str2 = this.f25529e;
        String str3 = this.f25530f;
        boolean m = u.mo18566m();
        u.mo18561h(u.mo18563j(context, str, str2));
        if (u.mo18566m()) {
            if (!m && !TextUtils.isEmpty(str3)) {
                u.mo18558e(context, str2, str3, str);
            }
            pm0.m18662b("Device is linked for debug signals.");
            u.mo18562i(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        u.mo18557d(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo18542l() {
        C4822x u = C4409t.m29329u();
        Context context = this.f25525a;
        String str = this.f25528d;
        String str2 = this.f25529e;
        if (!u.mo18564k(context, str, str2)) {
            u.mo18562i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(u.f25558f)) {
            pm0.m18662b("Creative is not pushed for this device.");
            u.mo18562i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(u.f25558f)) {
            pm0.m18662b("The app is not linked for creative preview.");
            u.mo18557d(context, str, str2);
        } else if ("0".equals(u.f25558f)) {
            pm0.m18662b("Device is linked for in app preview.");
            u.mo18562i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: m */
    public final void mo18543m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f25531g = 0;
            this.f25533i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f25531g;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.f25531g = 5;
                    this.f25534j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.f25535k.postDelayed(this.f25536l, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14386O3)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !m30789t(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (m30789t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f25531g = -1;
                this.f25535k.removeCallbacks(this.f25536l);
            }
        }
    }

    /* renamed from: n */
    public final void mo18544n(String str) {
        this.f25528d = str;
    }

    /* renamed from: o */
    public final void mo18545o(String str) {
        this.f25529e = str;
    }

    /* renamed from: p */
    public final void mo18546p(String str) {
        this.f25527c = str;
    }

    /* renamed from: q */
    public final void mo18547q(String str) {
        this.f25530f = str;
    }

    /* renamed from: r */
    public final void mo18548r() {
        try {
            if (!(this.f25525a instanceof Activity)) {
                pm0.m18666f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(C4409t.m29329u().mo18555b())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != C4409t.m29329u().mo18566m()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int u = m30790u(arrayList, "Ad information", true);
            int u2 = m30790u(arrayList, str, true);
            int u3 = m30790u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue();
            int u4 = m30790u(arrayList, "Open ad inspector", booleanValue);
            int u5 = m30790u(arrayList, "Ad inspector settings", booleanValue);
            C4409t.m29326r();
            AlertDialog.Builder g = C4751b2.m30612g(this.f25525a);
            g.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C4801q(this, u, u2, u3, u4, u5));
            g.create().show();
        } catch (WindowManager.BadTokenException e) {
            C4794n1.m30694l("", e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f25527c);
        sb.append(",DebugSignal: ");
        sb.append(this.f25530f);
        sb.append(",AFMA Version: ");
        sb.append(this.f25529e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f25528d);
        sb.append("}");
        return sb.toString();
    }

    public C4810t(Context context, String str) {
        this(context);
        this.f25527c = str;
    }
}
