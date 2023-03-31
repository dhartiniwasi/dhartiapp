package p066i4;

import android.graphics.drawable.Drawable;

/* renamed from: i4.o */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C4675o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4677q f25217a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f25218b;

    public /* synthetic */ C4675o(C4677q qVar, Drawable drawable) {
        this.f25217a = qVar;
        this.f25218b = drawable;
    }

    public final void run() {
        C4677q qVar = this.f25217a;
        qVar.f25219c.f25223a.getWindow().setBackgroundDrawable(this.f25218b);
    }
}
