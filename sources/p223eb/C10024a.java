package p223eb;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9700g;
import com.unity3d.scar.adapter.common.C9701h;
import com.unity3d.scar.adapter.common.C9703j;
import com.unity3d.scar.adapter.common.C9705k;
import p232fb.C10167c;
import p232fb.C10171e;
import p241gb.C10309c;
import p241gb.C10311d;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: eb.a */
/* compiled from: ScarAdapter */
public class C10024a extends C9703j {

    /* renamed from: e */
    private C10311d f39988e;

    /* renamed from: eb.a$a */
    /* compiled from: ScarAdapter */
    class C10025a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10167c f39989a;

        /* renamed from: b */
        final /* synthetic */ C12939c f39990b;

        /* renamed from: eb.a$a$a */
        /* compiled from: ScarAdapter */
        class C10026a implements C12938b {
            C10026a() {
            }

            public void onAdLoaded() {
                C10024a.this.f39609b.put(C10025a.this.f39990b.mo37980c(), C10025a.this.f39989a);
            }
        }

        C10025a(C10167c cVar, C12939c cVar2) {
            this.f39989a = cVar;
            this.f39990b = cVar2;
        }

        public void run() {
            this.f39989a.mo32840b(new C10026a());
        }
    }

    /* renamed from: eb.a$b */
    /* compiled from: ScarAdapter */
    class C10027b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10171e f39993a;

        /* renamed from: b */
        final /* synthetic */ C12939c f39994b;

        /* renamed from: eb.a$b$a */
        /* compiled from: ScarAdapter */
        class C10028a implements C12938b {
            C10028a() {
            }

            public void onAdLoaded() {
                C10024a.this.f39609b.put(C10027b.this.f39994b.mo37980c(), C10027b.this.f39993a);
            }
        }

        C10027b(C10171e eVar, C12939c cVar) {
            this.f39993a = eVar;
            this.f39994b = cVar;
        }

        public void run() {
            this.f39993a.mo32840b(new C10028a());
        }
    }

    public C10024a(C9697d dVar) {
        super(dVar);
        C10311d dVar2 = new C10311d();
        this.f39988e = dVar2;
        this.f39608a = new C10309c(dVar2);
    }

    /* renamed from: b */
    public void mo22647b(Context context, C12939c cVar, C9700g gVar) {
        C9705k.m50625a(new C10025a(new C10167c(context, this.f39988e.mo33161b(cVar.mo37980c()), cVar, this.f39611d, gVar), cVar));
    }

    /* renamed from: d */
    public void mo22648d(Context context, C12939c cVar, C9701h hVar) {
        C9705k.m50625a(new C10027b(new C10171e(context, this.f39988e.mo33161b(cVar.mo37980c()), cVar, this.f39611d, hVar), cVar));
    }
}
