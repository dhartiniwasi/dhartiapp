package com.onesignal;

import android.content.Context;
import com.onesignal.C8338d3;
import org.json.JSONObject;

/* renamed from: com.onesignal.s1 */
/* compiled from: OSNotificationController */
public class C8600s1 {

    /* renamed from: a */
    private final C8632v1 f36017a;

    /* renamed from: b */
    private boolean f36018b;

    /* renamed from: c */
    private boolean f36019c;

    C8600s1(C8632v1 v1Var, boolean z, boolean z2) {
        this.f36018b = z;
        this.f36019c = z2;
        this.f36017a = v1Var;
    }

    /* renamed from: a */
    private C8632v1 m47645a(Context context, C8575q1 q1Var, JSONObject jSONObject, Long l) {
        C8632v1 v1Var = new C8632v1(context);
        v1Var.mo28263q(jSONObject);
        v1Var.mo28273z(l);
        v1Var.mo28272y(this.f36018b);
        v1Var.mo28264r(q1Var);
        return v1Var;
    }

    /* renamed from: e */
    private void m47646e(C8575q1 q1Var) {
        this.f36017a.mo28264r(q1Var);
        if (this.f36018b) {
            C8411f0.m46664e(this.f36017a);
            return;
        }
        this.f36017a.mo28262p(false);
        C8411f0.m46673n(this.f36017a, true, false);
        C8338d3.m46481W0(this.f36017a);
    }

    /* renamed from: h */
    static void m47647h(Context context) {
        String f = OSUtils.m46196f(context, "com.onesignal.NotificationServiceExtension");
        if (f == null) {
            C8338d3.m46594z1(C8338d3.C8384r0.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.VERBOSE;
        C8338d3.m46594z1(r0Var, "Found class: " + f + ", attempting to call constructor");
        try {
            Object newInstance = Class.forName(f).newInstance();
            if ((newInstance instanceof C8338d3.C8341a1) && C8338d3.f35460q == null) {
                C8338d3.m46595z2((C8338d3.C8341a1) newInstance);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: b */
    public C8632v1 mo28194b() {
        return this.f36017a;
    }

    /* renamed from: c */
    public C8295a2 mo28195c() {
        return new C8295a2(this, this.f36017a.mo28252f());
    }

    /* renamed from: d */
    public boolean mo28196d() {
        if (!C8338d3.m46593z0().mo27854m()) {
            return true;
        }
        if (this.f36017a.mo28252f().mo28141w() + ((long) this.f36017a.mo28252f().mo28092D()) > C8338d3.m46448M0().mo28281b() / 1000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo28197f(C8575q1 q1Var, C8575q1 q1Var2) {
        if (q1Var2 != null) {
            boolean I = OSUtils.m46176I(q1Var2.mo28125i());
            boolean d = mo28196d();
            if (!I || !d) {
                m47646e(q1Var);
            } else {
                this.f36017a.mo28264r(q1Var2);
                C8411f0.m46670k(this, this.f36019c);
            }
            if (this.f36018b) {
                OSUtils.m46190W(100);
                return;
            }
            return;
        }
        m47646e(q1Var);
    }

    /* renamed from: g */
    public void mo28198g(boolean z) {
        this.f36019c = z;
    }

    public String toString() {
        return "OSNotificationController{notificationJob=" + this.f36017a + ", isRestoring=" + this.f36018b + ", isBackgroundLogic=" + this.f36019c + '}';
    }

    C8600s1(Context context, C8575q1 q1Var, JSONObject jSONObject, boolean z, boolean z2, Long l) {
        this.f36018b = z;
        this.f36019c = z2;
        this.f36017a = m47645a(context, q1Var, jSONObject, l);
    }
}
