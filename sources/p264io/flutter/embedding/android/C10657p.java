package p264io.flutter.embedding.android;

import android.view.KeyEvent;
import p264io.flutter.embedding.android.C10669t;

/* renamed from: io.flutter.embedding.android.p */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10657p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C10659r f41829a;

    /* renamed from: b */
    public final /* synthetic */ C10669t.C10672c f41830b;

    /* renamed from: c */
    public final /* synthetic */ long f41831c;

    /* renamed from: d */
    public final /* synthetic */ KeyEvent f41832d;

    public /* synthetic */ C10657p(C10659r rVar, C10669t.C10672c cVar, long j, KeyEvent keyEvent) {
        this.f41829a = rVar;
        this.f41830b = cVar;
        this.f41831c = j;
        this.f41832d = keyEvent;
    }

    public final void run() {
        this.f41829a.m53439k(this.f41830b, this.f41831c, this.f41832d);
    }
}
