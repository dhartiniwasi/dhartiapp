package p120q2;

import android.media.MediaCodec;
import p120q2.C5376l;

/* renamed from: q2.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12189w implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ C5394x f45273a;

    /* renamed from: b */
    public final /* synthetic */ C5376l.C5379c f45274b;

    public /* synthetic */ C12189w(C5394x xVar, C5376l.C5379c cVar) {
        this.f45273a = xVar;
        this.f45274b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        this.f45273a.m33116q(this.f45274b, mediaCodec, j, j2);
    }
}
