package p120q2;

import android.media.MediaCodec;
import p120q2.C5376l;

/* renamed from: q2.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12180a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C5365b f45263a;

    /* renamed from: b */
    public final /* synthetic */ C5376l.C5379c f45264b;

    public /* synthetic */ C12180a(C5365b bVar, C5376l.C5379c cVar) {
        this.f45263a = bVar;
        this.f45264b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f45263a.m32836x(this.f45264b, mediaCodec, j, j2);
    }
}
