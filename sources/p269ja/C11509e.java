package p269ja;

import com.onesignal.C8547p1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C11669k;
import p249ha.C10487a;
import p278ka.C11603b;
import p278ka.C11604c;

/* renamed from: ja.e */
/* compiled from: OSOutcomeEventsRepository.kt */
public abstract class C11509e implements C11604c {

    /* renamed from: a */
    private final C8547p1 f43941a;

    /* renamed from: b */
    private final C11506b f43942b;

    /* renamed from: c */
    private final C11516l f43943c;

    public C11509e(C8547p1 p1Var, C11506b bVar, C11516l lVar) {
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(bVar, "outcomeEventsCache");
        C11669k.m56787e(lVar, "outcomeEventsService");
        this.f43941a = p1Var;
        this.f43942b = bVar;
        this.f43943c = lVar;
    }

    /* renamed from: a */
    public List<C10487a> mo35524a(String str, List<C10487a> list) {
        C11669k.m56787e(str, MediationMetaData.KEY_NAME);
        C11669k.m56787e(list, "influences");
        List<C10487a> g = this.f43942b.mo35516g(str, list);
        C8547p1 p1Var = this.f43941a;
        p1Var.mo28016d("OneSignal getNotCachedUniqueOutcome influences: " + g);
        return g;
    }

    /* renamed from: b */
    public List<C11603b> mo35525b() {
        return this.f43942b.mo35515e();
    }

    /* renamed from: c */
    public void mo35526c(Set<String> set) {
        C11669k.m56787e(set, "unattributedUniqueOutcomeEvents");
        C8547p1 p1Var = this.f43941a;
        p1Var.mo28016d("OneSignal save unattributedUniqueOutcomeEvents: " + set);
        this.f43942b.mo35520l(set);
    }

    /* renamed from: d */
    public void mo35527d(C11603b bVar) {
        C11669k.m56787e(bVar, "event");
        this.f43942b.mo35519k(bVar);
    }

    /* renamed from: f */
    public void mo35528f(String str, String str2) {
        C11669k.m56787e(str, "notificationTableName");
        C11669k.m56787e(str2, "notificationIdColumnName");
        this.f43942b.mo35513c(str, str2);
    }

    /* renamed from: g */
    public void mo35529g(C11603b bVar) {
        C11669k.m56787e(bVar, "eventParams");
        this.f43942b.mo35521m(bVar);
    }

    /* renamed from: h */
    public void mo35530h(C11603b bVar) {
        C11669k.m56787e(bVar, "outcomeEvent");
        this.f43942b.mo35514d(bVar);
    }

    /* renamed from: i */
    public Set<String> mo35531i() {
        Set<String> i = this.f43942b.mo35517i();
        C8547p1 p1Var = this.f43941a;
        p1Var.mo28016d("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + i);
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C8547p1 mo35532j() {
        return this.f43941a;
    }

    /* renamed from: k */
    public final C11516l mo35533k() {
        return this.f43943c;
    }
}
