package com.onesignal;

import com.onesignal.C8338d3;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p240ga.C10301a;
import p240ga.C10306f;
import p249ha.C10487a;
import p249ha.C10490c;

/* renamed from: com.onesignal.m2 */
/* compiled from: OSSessionManager */
public class C8497m2 {

    /* renamed from: a */
    protected C10306f f35726a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8499b f35727b;

    /* renamed from: c */
    private C8547p1 f35728c;

    /* renamed from: com.onesignal.m2$a */
    /* compiled from: OSSessionManager */
    class C8498a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f35729a;

        C8498a(List list) {
            this.f35729a = list;
        }

        public void run() {
            Thread.currentThread().setPriority(10);
            C8497m2.this.f35727b.mo27727a(this.f35729a);
        }
    }

    /* renamed from: com.onesignal.m2$b */
    /* compiled from: OSSessionManager */
    public interface C8499b {
        /* renamed from: a */
        void mo27727a(List<C10487a> list);
    }

    public C8497m2(C8499b bVar, C10306f fVar, C8547p1 p1Var) {
        this.f35727b = bVar;
        this.f35726a = fVar;
        this.f35728c = p1Var;
    }

    /* renamed from: d */
    private void m47086d(C8338d3.C8364i0 i0Var, String str) {
        boolean z;
        C10487a aVar;
        this.f35728c.mo28016d("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + i0Var);
        C10301a b = this.f35726a.mo33144b(i0Var);
        List<C10301a> d = this.f35726a.mo33146d(i0Var);
        ArrayList arrayList = new ArrayList();
        if (b != null) {
            aVar = b.mo33104e();
            C10490c cVar = C10490c.DIRECT;
            if (str == null) {
                str = b.mo33107g();
            }
            z = m47088o(b, cVar, str, (JSONArray) null);
        } else {
            z = false;
            aVar = null;
        }
        if (z) {
            this.f35728c.mo28016d("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + d);
            arrayList.add(aVar);
            for (C10301a next : d) {
                if (next.mo33112k().mo33623b()) {
                    arrayList.add(next.mo33104e());
                    next.mo33118t();
                }
            }
        }
        this.f35728c.mo28016d("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (C10301a next2 : d) {
            if (next2.mo33112k().mo33626k()) {
                JSONArray n = next2.mo33115n();
                if (n.length() > 0 && !i0Var.mo27724a()) {
                    C10487a e = next2.mo33104e();
                    if (m47088o(next2, C10490c.INDIRECT, (String) null, n)) {
                        arrayList.add(e);
                    }
                }
            }
        }
        C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Trackers after update attempt: " + this.f35726a.mo33145c().toString());
        m47087n(arrayList);
    }

    /* renamed from: n */
    private void m47087n(List<C10487a> list) {
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new C8498a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    /* renamed from: o */
    private boolean m47088o(C10301a aVar, C10490c cVar, String str, JSONArray jSONArray) {
        if (!m47089p(aVar, cVar, str, jSONArray)) {
            return false;
        }
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "OSChannelTracker changed: " + aVar.mo33108h() + "\nfrom:\ninfluenceType: " + aVar.mo33112k() + ", directNotificationId: " + aVar.mo33107g() + ", indirectNotificationIds: " + aVar.mo33111j() + "\nto:\ninfluenceType: " + cVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray);
        aVar.mo33124y(cVar);
        aVar.mo33122w(str);
        aVar.mo33123x(jSONArray);
        aVar.mo33101b();
        StringBuilder sb = new StringBuilder();
        sb.append("Trackers changed to: ");
        sb.append(this.f35726a.mo33145c().toString());
        C8338d3.m46492a(r0Var, sb.toString());
        return true;
    }

    /* renamed from: p */
    private boolean m47089p(C10301a aVar, C10490c cVar, String str, JSONArray jSONArray) {
        if (!cVar.equals(aVar.mo33112k())) {
            return true;
        }
        C10490c k = aVar.mo33112k();
        if (k.mo33623b() && aVar.mo33107g() != null && !aVar.mo33107g().equals(str)) {
            return true;
        }
        if (!k.mo33625j() || aVar.mo33111j() == null || aVar.mo33111j().length() <= 0 || C8293a0.m46255a(aVar.mo33111j(), jSONArray)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27955b(JSONObject jSONObject, List<C10487a> list) {
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager addSessionData with influences: " + list.toString());
        this.f35726a.mo33143a(jSONObject, list);
        C8547p1 p1Var2 = this.f35728c;
        p1Var2.mo28016d("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27956c(C8338d3.C8364i0 i0Var) {
        m47086d(i0Var, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C10487a> mo27957e() {
        return this.f35726a.mo33148f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public List<C10487a> mo27958f() {
        return this.f35726a.mo33150h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo27959g() {
        this.f35726a.mo33151i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27960h(String str) {
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        m47088o(this.f35726a.mo33147e(), C10490c.DIRECT, str, (JSONArray) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo27961i() {
        this.f35728c.mo28016d("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.f35726a.mo33147e().mo33118t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo27962j(C8338d3.C8364i0 i0Var, String str) {
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            m47086d(i0Var, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo27963k(String str) {
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        C10301a e = this.f35726a.mo33147e();
        e.mo33121v(str);
        e.mo33118t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo27964l(String str) {
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str != null && !str.isEmpty()) {
            this.f35726a.mo33149g().mo33121v(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo27965m(C8338d3.C8364i0 i0Var) {
        boolean z;
        List<C10301a> d = this.f35726a.mo33146d(i0Var);
        ArrayList arrayList = new ArrayList();
        C8547p1 p1Var = this.f35728c;
        p1Var.mo28016d("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + i0Var + "\n channelTrackers: " + d.toString());
        for (C10301a next : d) {
            JSONArray n = next.mo33115n();
            C8547p1 p1Var2 = this.f35728c;
            p1Var2.mo28016d("OneSignal SessionManager restartSessionIfNeeded lastIds: " + n);
            C10487a e = next.mo33104e();
            if (n.length() > 0) {
                z = m47088o(next, C10490c.INDIRECT, (String) null, n);
            } else {
                z = m47088o(next, C10490c.UNATTRIBUTED, (String) null, (JSONArray) null);
            }
            if (z) {
                arrayList.add(e);
            }
        }
        m47087n(arrayList);
    }
}
