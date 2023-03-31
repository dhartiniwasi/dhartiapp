package p264io.flutter.embedding.android;

import android.view.KeyEvent;
import p264io.flutter.embedding.android.C10669t;

/* renamed from: io.flutter.embedding.android.q */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10658q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10659r f41833a;

    /* renamed from: b */
    public final /* synthetic */ C10669t.C10672c f41834b;

    /* renamed from: c */
    public final /* synthetic */ KeyEvent f41835c;

    public /* synthetic */ C10658q(C10659r rVar, C10669t.C10672c cVar, KeyEvent keyEvent) {
        this.f41833a = rVar;
        this.f41834b = cVar;
        this.f41835c = keyEvent;
    }

    public final void run() {
        this.f41833a.m53440l(this.f41834b, this.f41835c);
    }
}
