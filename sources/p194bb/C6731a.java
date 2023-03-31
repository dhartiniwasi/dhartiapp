package p194bb;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9700g;
import com.unity3d.scar.adapter.common.C9701h;
import com.unity3d.scar.adapter.common.C9703j;
import com.unity3d.scar.adapter.common.C9705k;
import p202cb.C6844b;
import p202cb.C6847d;
import p214db.C9929c;
import p214db.C9931d;
import p389wa.C12938b;
import p389wa.C12939c;

/* renamed from: bb.a */
/* compiled from: ScarAdapter */
public class C6731a extends C9703j {

    /* renamed from: e */
    private C9931d f31231e;

    /* renamed from: bb.a$a */
    /* compiled from: ScarAdapter */
    class C6732a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6844b f31232a;

        /* renamed from: b */
        final /* synthetic */ C12939c f31233b;

        /* renamed from: bb.a$a$a */
        /* compiled from: ScarAdapter */
        class C6733a implements C12938b {
            C6733a() {
            }

            public void onAdLoaded() {
                C6731a.this.f39609b.put(C6732a.this.f31233b.mo37980c(), C6732a.this.f31232a);
            }
        }

        C6732a(C6844b bVar, C12939c cVar) {
            this.f31232a = bVar;
            this.f31233b = cVar;
        }

        public void run() {
            this.f31232a.mo22950b(new C6733a());
        }
    }

    /* renamed from: bb.a$b */
    /* compiled from: ScarAdapter */
    class C6734b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6847d f31236a;

        /* renamed from: b */
        final /* synthetic */ C12939c f31237b;

        /* renamed from: bb.a$b$a */
        /* compiled from: ScarAdapter */
        class C6735a implements C12938b {
            C6735a() {
            }

            public void onAdLoaded() {
                C6731a.this.f39609b.put(C6734b.this.f31237b.mo37980c(), C6734b.this.f31236a);
            }
        }

        C6734b(C6847d dVar, C12939c cVar) {
            this.f31236a = dVar;
            this.f31237b = cVar;
        }

        public void run() {
            this.f31236a.mo22950b(new C6735a());
        }
    }

    public C6731a(C9697d dVar) {
        super(dVar);
        C9931d dVar2 = new C9931d();
        this.f31231e = dVar2;
        this.f39608a = new C9929c(dVar2);
    }

    /* renamed from: b */
    public void mo22647b(Context context, C12939c cVar, C9700g gVar) {
        C9705k.m50625a(new C6732a(new C6844b(context, this.f31231e.mo32494b(cVar.mo37980c()), cVar, this.f39611d, gVar), cVar));
    }

    /* renamed from: d */
    public void mo22648d(Context context, C12939c cVar, C9701h hVar) {
        C9705k.m50625a(new C6734b(new C6847d(context, this.f31231e.mo32494b(cVar.mo37980c()), cVar, this.f39611d, hVar), cVar));
    }
}
