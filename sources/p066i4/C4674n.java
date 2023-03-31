package p066i4;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.vs0;

/* renamed from: i4.n */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4674n {

    /* renamed from: a */
    public final int f25213a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f25214b;

    /* renamed from: c */
    public final ViewGroup f25215c;

    /* renamed from: d */
    public final Context f25216d;

    public C4674n(vs0 vs0) throws C4672l {
        this.f25214b = vs0.getLayoutParams();
        ViewParent parent = vs0.getParent();
        this.f25216d = vs0.mo12126o();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C4672l("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f25215c = viewGroup;
        this.f25213a = viewGroup.indexOfChild(vs0.mo10647w());
        viewGroup.removeView(vs0.mo10647w());
        vs0.mo12119l1(true);
    }
}
