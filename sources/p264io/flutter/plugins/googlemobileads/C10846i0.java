package p264io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import java.util.Locale;
import p186ac.C6568r;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugin.platform.C10732g;
import p297mb.C11881b;

/* renamed from: io.flutter.plugins.googlemobileads.i0 */
/* compiled from: GoogleMobileAdsViewFactory */
final class C10846i0 extends C10732g {

    /* renamed from: a */
    private final C10813a f42331a;

    /* renamed from: io.flutter.plugins.googlemobileads.i0$a */
    /* compiled from: GoogleMobileAdsViewFactory */
    class C10847a implements C10731f {

        /* renamed from: a */
        final /* synthetic */ Context f42332a;

        C10847a(Context context) {
            this.f42332a = context;
        }

        public void dispose() {
        }

        public View getView() {
            return new View(this.f42332a);
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            C10730e.m53693a(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            C10730e.m53694b(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            C10730e.m53695c(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            C10730e.m53696d(this);
        }
    }

    public C10846i0(C10813a aVar) {
        super(C6568r.f31011a);
        this.f42331a = aVar;
    }

    /* renamed from: a */
    private static C10731f m54171a(Context context, int i) {
        C11881b.m57384b(C10846i0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", new Object[]{Integer.valueOf(i)}));
        return new C10847a(context);
    }

    public C10731f create(Context context, int i, Object obj) {
        Integer num = (Integer) obj;
        C10826e b = this.f42331a.mo34448b(num.intValue());
        if (b == null || b.mo34478b() == null) {
            return m54171a(context, num.intValue());
        }
        return b.mo34478b();
    }
}
