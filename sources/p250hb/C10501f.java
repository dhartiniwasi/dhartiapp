package p250hb;

import android.app.Activity;
import kotlin.jvm.internal.C11669k;
import p250hb.C10492a;

/* renamed from: hb.f */
/* compiled from: Wakelock.kt */
public final class C10501f {

    /* renamed from: a */
    private Activity f41547a;

    /* renamed from: a */
    private final boolean m52893a() {
        Activity activity = this.f41547a;
        C11669k.m56784b(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    /* renamed from: b */
    public final C10492a.C10493a mo33634b() {
        if (this.f41547a != null) {
            C10492a.C10493a aVar = new C10492a.C10493a();
            aVar.mo33628b(Boolean.valueOf(m52893a()));
            return aVar;
        }
        throw new C10500e();
    }

    /* renamed from: c */
    public final void mo33635c(Activity activity) {
        this.f41547a = activity;
    }

    /* renamed from: d */
    public final void mo33636d(C10492a.C10494b bVar) {
        C11669k.m56787e(bVar, "message");
        Activity activity = this.f41547a;
        if (activity != null) {
            C11669k.m56784b(activity);
            boolean a = m52893a();
            Boolean b = bVar.mo33630b();
            C11669k.m56784b(b);
            if (b.booleanValue()) {
                if (!a) {
                    activity.getWindow().addFlags(128);
                }
            } else if (a) {
                activity.getWindow().clearFlags(128);
            }
        } else {
            throw new C10500e();
        }
    }
}
