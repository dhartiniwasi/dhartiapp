package p407ya;

import android.content.Context;
import com.unity3d.scar.adapter.common.C9697d;
import com.unity3d.scar.adapter.common.C9700g;
import com.unity3d.scar.adapter.common.C9701h;
import com.unity3d.scar.adapter.common.C9703j;
import com.unity3d.scar.adapter.common.C9705k;
import p185ab.C6528c;
import p185ab.C6530d;
import p389wa.C12938b;
import p389wa.C12939c;
import p416za.C13485b;
import p416za.C13488d;

/* renamed from: ya.a */
/* compiled from: ScarAdapter */
public class C13242a extends C9703j {

    /* renamed from: e */
    private C6530d f47526e;

    /* renamed from: ya.a$a */
    /* compiled from: ScarAdapter */
    class C13243a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C13485b f47527a;

        /* renamed from: b */
        final /* synthetic */ C12939c f47528b;

        /* renamed from: ya.a$a$a */
        /* compiled from: ScarAdapter */
        class C13244a implements C12938b {
            C13244a() {
            }

            public void onAdLoaded() {
                C13242a.this.f39609b.put(C13243a.this.f47528b.mo37980c(), C13243a.this.f47527a);
            }
        }

        C13243a(C13485b bVar, C12939c cVar) {
            this.f47527a = bVar;
            this.f47528b = cVar;
        }

        public void run() {
            this.f47527a.mo38614b(new C13244a());
        }
    }

    /* renamed from: ya.a$b */
    /* compiled from: ScarAdapter */
    class C13245b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C13488d f47531a;

        /* renamed from: b */
        final /* synthetic */ C12939c f47532b;

        /* renamed from: ya.a$b$a */
        /* compiled from: ScarAdapter */
        class C13246a implements C12938b {
            C13246a() {
            }

            public void onAdLoaded() {
                C13242a.this.f39609b.put(C13245b.this.f47532b.mo37980c(), C13245b.this.f47531a);
            }
        }

        C13245b(C13488d dVar, C12939c cVar) {
            this.f47531a = dVar;
            this.f47532b = cVar;
        }

        public void run() {
            this.f47531a.mo38614b(new C13246a());
        }
    }

    public C13242a(C9697d dVar) {
        super(dVar);
        C6530d dVar2 = new C6530d();
        this.f47526e = dVar2;
        this.f39608a = new C6528c(dVar2);
    }

    /* renamed from: b */
    public void mo22647b(Context context, C12939c cVar, C9700g gVar) {
        C9705k.m50625a(new C13243a(new C13485b(context, this.f47526e.mo22125b(cVar.mo37980c()), cVar, this.f39611d, gVar), cVar));
    }

    /* renamed from: d */
    public void mo22648d(Context context, C12939c cVar, C9701h hVar) {
        C9705k.m50625a(new C13245b(new C13488d(context, this.f47526e.mo22125b(cVar.mo37980c()), cVar, this.f39611d, hVar), cVar));
    }
}
