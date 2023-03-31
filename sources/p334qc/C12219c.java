package p334qc;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import kotlin.jvm.internal.C11669k;
import p186ac.C6555j;
import p186ac.C6556k;

/* renamed from: qc.c */
/* compiled from: MethodCallHandlerImpl.kt */
public final class C12219c implements C6556k.C6560c {

    /* renamed from: a */
    private Context f45360a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Toast f45361b;

    /* renamed from: qc.c$a */
    /* compiled from: MethodCallHandlerImpl.kt */
    public static final class C12220a extends Toast.Callback {

        /* renamed from: a */
        final /* synthetic */ C12219c f45362a;

        C12220a(C12219c cVar) {
            this.f45362a = cVar;
        }

        public void onToastHidden() {
            C12219c.super.onToastHidden();
            this.f45362a.f45361b = null;
        }
    }

    public C12219c(Context context) {
        C11669k.m56787e(context, "context");
        this.f45360a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m58664c(C12219c cVar) {
        C11669k.m56787e(cVar, "this$0");
        Toast toast = cVar.f45361b;
        if (toast != null) {
            toast.show();
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        int i;
        Toast toast;
        int i2;
        Drawable drawable;
        C11669k.m56787e(jVar, "call");
        C11669k.m56787e(dVar, "result");
        String str = jVar.f30999a;
        View view = null;
        if (C11669k.m56783a(str, "showToast")) {
            String valueOf = String.valueOf(jVar.mo22156a("msg"));
            String valueOf2 = String.valueOf(jVar.mo22156a("length"));
            String valueOf3 = String.valueOf(jVar.mo22156a("gravity"));
            Number number = (Number) jVar.mo22156a("bgcolor");
            Number number2 = (Number) jVar.mo22156a("textcolor");
            Number number3 = (Number) jVar.mo22156a("fontSize");
            if (C11669k.m56783a(valueOf3, "top")) {
                i = 48;
            } else {
                i = C11669k.m56783a(valueOf3, "center") ? 17 : 80;
            }
            boolean a = C11669k.m56783a(valueOf2, "long");
            if (number == null || (i2 = Build.VERSION.SDK_INT) > 31) {
                Toast makeText = Toast.makeText(this.f45360a, valueOf, a ? 1 : 0);
                this.f45361b = makeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (makeText != null) {
                        try {
                            view = makeText.getView();
                        } catch (Exception unused) {
                        }
                    }
                    C11669k.m56784b(view);
                    View findViewById = view.findViewById(16908299);
                    C11669k.m56786d(findViewById, "mToast?.view!!.findViewById(android.R.id.message)");
                    TextView textView = (TextView) findViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f45360a.getSystemService("layout_inflater");
                C11669k.m56785c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(C12223f.toast_custom, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(C12222e.f45363a);
                textView2.setText(valueOf);
                if (i2 >= 21) {
                    drawable = this.f45360a.getDrawable(C12221d.corner);
                    C11669k.m56784b(drawable);
                    C11669k.m56786d(drawable, "{\n                      …)!!\n                    }");
                } else {
                    drawable = this.f45360a.getResources().getDrawable(C12221d.corner);
                    C11669k.m56786d(drawable, "{\n                      …er)\n                    }");
                }
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f45360a);
                this.f45361b = toast2;
                toast2.setDuration(a);
                Toast toast3 = this.f45361b;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 31) {
                if (i == 17) {
                    Toast toast4 = this.f45361b;
                    if (toast4 != null) {
                        toast4.setGravity(i, 0, 0);
                    }
                } else if (i != 48) {
                    Toast toast5 = this.f45361b;
                    if (toast5 != null) {
                        toast5.setGravity(i, 0, 100);
                    }
                } else {
                    Toast toast6 = this.f45361b;
                    if (toast6 != null) {
                        toast6.setGravity(i, 0, 100);
                    }
                }
            }
            Context context = this.f45360a;
            if (context instanceof Activity) {
                C11669k.m56785c(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new C12218b(this));
            } else {
                Toast toast7 = this.f45361b;
                if (toast7 != null) {
                    toast7.show();
                }
            }
            if (i3 >= 30 && (toast = this.f45361b) != null) {
                toast.addCallback(new C12220a(this));
            }
            dVar.success(Boolean.TRUE);
        } else if (C11669k.m56783a(str, "cancel")) {
            Toast toast8 = this.f45361b;
            if (toast8 != null) {
                if (toast8 != null) {
                    toast8.cancel();
                }
                this.f45361b = null;
            }
            dVar.success(Boolean.TRUE);
        } else {
            dVar.notImplemented();
        }
    }
}
