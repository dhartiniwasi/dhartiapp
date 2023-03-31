package p260ib;

import android.content.Context;
import android.hardware.Camera;
import kotlin.jvm.internal.C11669k;
import p226ee.C10118e;
import p235fe.C10202a;

/* renamed from: ib.k */
/* compiled from: ZXingAutofocusScannerView.kt */
public final class C10591k extends C10202a {

    /* renamed from: G */
    private boolean f41647G;

    /* renamed from: H */
    private boolean f41648H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10591k(Context context) {
        super(context);
        C11669k.m56787e(context, "context");
    }

    public void setAutoFocus(boolean z) {
        if (this.f41648H) {
            super.setAutoFocus(this.f41647G);
        }
    }

    public void setupCameraPreview(C10118e eVar) {
        Camera camera;
        Camera.Parameters parameters;
        if (!(eVar == null || (camera = eVar.f40210a) == null || (parameters = camera.getParameters()) == null)) {
            try {
                this.f41648H = parameters.getSupportedFocusModes().contains("auto");
                parameters.setFocusMode("continuous-picture");
                eVar.f40210a.setParameters(parameters);
            } catch (Exception unused) {
                this.f41647G = true;
            }
        }
        super.setupCameraPreview(eVar);
    }
}
