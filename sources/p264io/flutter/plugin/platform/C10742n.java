package p264io.flutter.plugin.platform;

import android.view.View;
import p264io.flutter.plugin.platform.C10745q;
import p417zb.C13524k;

/* renamed from: io.flutter.plugin.platform.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10742n implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10745q.C10746a f42056a;

    /* renamed from: b */
    public final /* synthetic */ C13524k.C13528d f42057b;

    public /* synthetic */ C10742n(C10745q.C10746a aVar, C13524k.C13528d dVar) {
        this.f42056a = aVar;
        this.f42057b = dVar;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f42056a.m53795s(this.f42057b, view, z);
    }
}
