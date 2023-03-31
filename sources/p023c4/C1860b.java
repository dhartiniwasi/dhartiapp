package p023c4;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p179z3.C6345o;

@Deprecated
/* renamed from: c4.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C1860b extends FrameLayout {

    /* renamed from: a */
    private C6345o f5480a;

    /* renamed from: b */
    private ImageView.ScaleType f5481b;

    public C1860b(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f5481b = scaleType;
    }

    public void setMediaContent(C6345o oVar) {
        this.f5480a = oVar;
    }
}
