package p350sa;

import android.content.Context;
import p186ac.C6539c;
import p186ac.C6556k;
import p264io.flutter.embedding.engine.C10685a;
import p351sb.C12502a;

/* renamed from: sa.f */
/* compiled from: JustAudioPlugin */
public class C12499f implements C12502a {

    /* renamed from: a */
    private C6556k f45950a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12501g f45951b;

    /* renamed from: sa.f$a */
    /* compiled from: JustAudioPlugin */
    class C12500a implements C10685a.C10687b {
        C12500a() {
        }

        /* renamed from: a */
        public void mo34086a() {
        }

        /* renamed from: b */
        public void mo34087b() {
            C12499f.this.f45951b.mo37291a();
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        Context a = bVar.mo37292a();
        C6539c b = bVar.mo37293b();
        this.f45951b = new C12501g(a, b);
        C6556k kVar = new C6556k(b, "com.ryanheise.just_audio.methods");
        this.f45950a = kVar;
        kVar.mo22161e(this.f45951b);
        bVar.mo37295d().mo34068d(new C12500a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f45951b.mo37291a();
        this.f45951b = null;
        this.f45950a.mo22161e((C6556k.C6560c) null);
    }
}
