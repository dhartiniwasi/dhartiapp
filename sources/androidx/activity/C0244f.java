package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1220n;
import androidx.lifecycle.C1222o;
import kotlin.jvm.internal.C11669k;

/* renamed from: androidx.activity.f */
/* compiled from: ComponentDialog.kt */
public class C0244f extends Dialog implements C1220n, C0246h {

    /* renamed from: a */
    private C1222o f579a;

    /* renamed from: b */
    private final OnBackPressedDispatcher f580b = new OnBackPressedDispatcher(new C0243e(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0244f(Context context, int i) {
        super(context, i);
        C11669k.m56787e(context, "context");
    }

    /* renamed from: b */
    private final C1222o m1220b() {
        C1222o oVar = this.f579a;
        if (oVar != null) {
            return oVar;
        }
        C1222o oVar2 = new C1222o(this);
        this.f579a = oVar2;
        return oVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m1221c(C0244f fVar) {
        C11669k.m56787e(fVar, "this$0");
        super.onBackPressed();
    }

    public final C1208j getLifecycle() {
        return m1220b();
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f580b;
    }

    public void onBackPressed() {
        this.f580b.mo759c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1220b().mo4408h(C1208j.C1210b.ON_CREATE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m1220b().mo4408h(C1208j.C1210b.ON_RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m1220b().mo4408h(C1208j.C1210b.ON_DESTROY);
        this.f579a = null;
        super.onStop();
    }
}
