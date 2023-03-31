package p264io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import java.io.IOException;
import p351sb.C12502a;

/* renamed from: io.flutter.plugins.webviewflutter.h */
/* compiled from: FlutterAssetManager */
abstract class C10923h {

    /* renamed from: a */
    final AssetManager f42484a;

    /* renamed from: io.flutter.plugins.webviewflutter.h$a */
    /* compiled from: FlutterAssetManager */
    static class C10924a extends C10923h {

        /* renamed from: b */
        final C12502a.C12503a f42485b;

        C10924a(AssetManager assetManager, C12502a.C12503a aVar) {
            super(assetManager);
            this.f42485b = aVar;
        }

        /* renamed from: a */
        public String mo34662a(String str) {
            return this.f42485b.mo34110a(str);
        }
    }

    public C10923h(AssetManager assetManager) {
        this.f42484a = assetManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo34662a(String str);

    /* renamed from: b */
    public String[] mo34663b(String str) throws IOException {
        return this.f42484a.list(str);
    }
}
