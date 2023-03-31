package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ke0 extends le0 implements e60 {

    /* renamed from: c */
    private final vs0 f12046c;

    /* renamed from: d */
    private final Context f12047d;

    /* renamed from: e */
    private final WindowManager f12048e;

    /* renamed from: f */
    private final C3012wy f12049f;

    /* renamed from: g */
    DisplayMetrics f12050g;

    /* renamed from: h */
    private float f12051h;

    /* renamed from: i */
    int f12052i = -1;

    /* renamed from: j */
    int f12053j = -1;

    /* renamed from: k */
    private int f12054k;

    /* renamed from: l */
    int f12055l = -1;

    /* renamed from: m */
    int f12056m = -1;

    /* renamed from: n */
    int f12057n = -1;

    /* renamed from: o */
    int f12058o = -1;

    public ke0(vs0 vs0, Context context, C3012wy wyVar) {
        super(vs0, "");
        this.f12046c = vs0;
        this.f12047d = context;
        this.f12049f = wyVar;
        this.f12048e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8220a(Object obj, Map map) {
        JSONObject jSONObject;
        vs0 vs0 = (vs0) obj;
        this.f12050g = new DisplayMetrics();
        Display defaultDisplay = this.f12048e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f12050g);
        this.f12051h = this.f12050g.density;
        this.f12054k = defaultDisplay.getRotation();
        C4584t.m30036b();
        DisplayMetrics displayMetrics = this.f12050g;
        this.f12052i = im0.m14416w(displayMetrics, displayMetrics.widthPixels);
        C4584t.m30036b();
        DisplayMetrics displayMetrics2 = this.f12050g;
        this.f12053j = im0.m14416w(displayMetrics2, displayMetrics2.heightPixels);
        Activity X = this.f12046c.mo8461X();
        if (X == null || X.getWindow() == null) {
            this.f12055l = this.f12052i;
            this.f12056m = this.f12053j;
        } else {
            C4409t.m29326r();
            int[] n = C4751b2.m30619n(X);
            C4584t.m30036b();
            this.f12055l = im0.m14416w(this.f12050g, n[0]);
            C4584t.m30036b();
            this.f12056m = im0.m14416w(this.f12050g, n[1]);
        }
        if (this.f12046c.mo9698n().mo12442i()) {
            this.f12057n = this.f12052i;
            this.f12058o = this.f12053j;
        } else {
            this.f12046c.measure(0, 0);
        }
        mo11986e(this.f12052i, this.f12053j, this.f12055l, this.f12056m, this.f12051h, this.f12054k);
        je0 je0 = new je0();
        C3012wy wyVar = this.f12049f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        je0.mo11395e(wyVar.mo14999a(intent));
        C3012wy wyVar2 = this.f12049f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        je0.mo11393c(wyVar2.mo14999a(intent2));
        je0.mo11391a(this.f12049f.mo15000b());
        je0.mo11394d(this.f12049f.mo15001c());
        je0.mo11392b(true);
        boolean h = je0.f11520a;
        boolean j = je0.f11521b;
        boolean f = je0.f11522c;
        boolean i = je0.f11523d;
        boolean g = je0.f11524e;
        vs0 vs02 = this.f12046c;
        try {
            jSONObject = new JSONObject().put("sms", h).put("tel", j).put("calendar", f).put("storePicture", i).put("inlineVideo", g);
        } catch (JSONException e) {
            pm0.m18665e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        vs02.mo9084a("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f12046c.getLocationOnScreen(iArr);
        mo11662h(C4584t.m30036b().mo11157d(this.f12047d, iArr[0]), C4584t.m30036b().mo11157d(this.f12047d, iArr[1]));
        if (pm0.m18670j(2)) {
            pm0.m18666f("Dispatching Ready Event.");
        }
        mo11985d(this.f12046c.mo10299b0().f19150a);
    }

    /* renamed from: h */
    public final void mo11662h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.f12047d instanceof Activity) {
            C4409t.m29326r();
            i3 = C4751b2.m30620o((Activity) this.f12047d)[0];
        } else {
            i3 = 0;
        }
        if (this.f12046c.mo9698n() == null || !this.f12046c.mo9698n().mo12442i()) {
            int width = this.f12046c.getWidth();
            int height = this.f12046c.getHeight();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14392P)).booleanValue()) {
                if (width == 0) {
                    width = this.f12046c.mo9698n() != null ? this.f12046c.mo9698n().f13505c : 0;
                }
                if (height == 0) {
                    if (this.f12046c.mo9698n() != null) {
                        i4 = this.f12046c.mo9698n().f13504b;
                    }
                    this.f12057n = C4584t.m30036b().mo11157d(this.f12047d, width);
                    this.f12058o = C4584t.m30036b().mo11157d(this.f12047d, i4);
                }
            }
            i4 = height;
            this.f12057n = C4584t.m30036b().mo11157d(this.f12047d, width);
            this.f12058o = C4584t.m30036b().mo11157d(this.f12047d, i4);
        }
        mo11983b(i, i2 - i3, this.f12057n, this.f12058o);
        this.f12046c.mo12108f0().mo9281B(i, i2);
    }
}
