package p264io.flutter.plugin.platform;

import android.content.Context;
import p186ac.C6554i;

/* renamed from: io.flutter.plugin.platform.g */
/* compiled from: PlatformViewFactory */
public abstract class C10732g {
    private final C6554i<Object> createArgsCodec;

    public C10732g(C6554i<Object> iVar) {
        this.createArgsCodec = iVar;
    }

    public abstract C10731f create(Context context, int i, Object obj);

    public final C6554i<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
