package p066i4;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import p053g4.C4399j;
import p053g4.C4409t;
import p073j4.C4749b0;
import p073j4.C4751b2;

/* renamed from: i4.q */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4677q extends C4749b0 {

    /* renamed from: c */
    final /* synthetic */ C4678r f25219c;

    /* synthetic */ C4677q(C4678r rVar, C4676p pVar) {
        this.f25219c = rVar;
    }

    /* renamed from: a */
    public final void mo14322a() {
        BitmapDrawable bitmapDrawable;
        Bitmap a = C4409t.m29331w().mo18570a(Integer.valueOf(this.f25219c.f25224b.f5972w.f24522f));
        if (a != null) {
            C4409t.m29326r();
            C4678r rVar = this.f25219c;
            Activity activity = rVar.f25223a;
            C4399j jVar = rVar.f25224b.f5972w;
            boolean z = jVar.f24520d;
            float f = jVar.f24521e;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, a.getWidth(), a.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), a);
                }
            }
            C4751b2.f25403i.post(new C4675o(this, bitmapDrawable));
        }
    }
}
