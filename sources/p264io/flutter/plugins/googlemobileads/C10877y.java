package p264io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.C2043a;
import java.lang.ref.WeakReference;

/* renamed from: io.flutter.plugins.googlemobileads.y */
/* compiled from: FlutterAdListener */
class C10877y implements C2043a.C2046c {

    /* renamed from: a */
    private final WeakReference<C10874w> f42422a;

    C10877y(C10874w wVar) {
        this.f42422a = new WeakReference<>(wVar);
    }

    /* renamed from: a */
    public void mo7918a(C2043a aVar) {
        if (this.f42422a.get() != null) {
            ((C10874w) this.f42422a.get()).mo34614d(aVar);
        }
    }
}
