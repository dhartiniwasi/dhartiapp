package p264io.flutter.embedding.android;

import android.view.KeyEvent;
import p264io.flutter.embedding.android.C10661s;
import p417zb.C13498d;

/* renamed from: io.flutter.embedding.android.m */
/* compiled from: KeyChannelResponder */
public class C10653m implements C10661s.C10666d {

    /* renamed from: a */
    private final C13498d f41815a;

    /* renamed from: b */
    private final C10661s.C10663b f41816b = new C10661s.C10663b();

    public C10653m(C13498d dVar) {
        this.f41815a = dVar;
    }

    /* renamed from: a */
    public void mo33981a(KeyEvent keyEvent, C10661s.C10666d.C10667a aVar) {
        int action = keyEvent.getAction();
        boolean z = false;
        if (action == 0 || action == 1) {
            C13498d.C13500b bVar = new C13498d.C13500b(keyEvent, this.f41816b.mo33991a(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z = true;
            }
            this.f41815a.mo38628e(bVar, z, new C10652l(aVar));
            return;
        }
        aVar.mo33993a(false);
    }
}
