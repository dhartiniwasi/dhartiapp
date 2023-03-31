package p264io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

/* renamed from: io.flutter.embedding.engine.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10696d implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ long f41923a;

    public /* synthetic */ C10696d(long j) {
        this.f41923a = j;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f41923a, imageDecoder, imageInfo, source);
    }
}
