package p264io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* renamed from: io.flutter.plugins.googlemobileads.r */
/* compiled from: FlutterAdListener */
class C10868r extends C10834f {

    /* renamed from: c */
    final WeakReference<C10836g> f42394c;

    C10868r(int i, C10813a aVar, C10836g gVar) {
        super(i, aVar);
        this.f42394c = new WeakReference<>(gVar);
    }

    /* renamed from: j */
    public void mo7700j() {
        if (this.f42394c.get() != null) {
            ((C10836g) this.f42394c.get()).onAdLoaded();
        }
    }
}
