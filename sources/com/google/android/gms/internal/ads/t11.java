package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4752c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class t11 implements ia0 {

    /* renamed from: a */
    private final Context f17808a;

    /* renamed from: b */
    private final C2746pr f17809b;

    /* renamed from: c */
    private final PowerManager f17810c;

    public t11(Context context, C2746pr prVar) {
        this.f17808a = context;
        this.f17809b = prVar;
        this.f17810c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject mo10378c(w11 w11) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C2857sr srVar = w11.f19425f;
        if (srVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f17809b.mo13332d() != null) {
            boolean z2 = srVar.f17618a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f17809b.mo13330b()).put("activeViewJSON", this.f17809b.mo13332d()).put("timestamp", w11.f19423d).put("adFormat", this.f17809b.mo13329a()).put("hashCode", this.f17809b.mo13331c()).put("isMraid", false).put("isStopped", false).put("isPaused", w11.f19421b).put("isNative", this.f17809b.mo13333e());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.f17810c.isInteractive();
            } else {
                z = this.f17810c.isScreenOn();
            }
            put.put("isScreenOn", z).put("appMuted", C4409t.m29328t().mo18442e()).put("appVolume", (double) C4409t.m29328t().mo18439a()).put("deviceVolume", (double) C4752c.m30638b(this.f17808a.getApplicationContext()));
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14377N4)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f17808a.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f17808a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", srVar.f17619b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", srVar.f17620c.top).put("bottom", srVar.f17620c.bottom).put("left", srVar.f17620c.left).put("right", srVar.f17620c.right)).put("adBox", new JSONObject().put("top", srVar.f17621d.top).put("bottom", srVar.f17621d.bottom).put("left", srVar.f17621d.left).put("right", srVar.f17621d.right)).put("globalVisibleBox", new JSONObject().put("top", srVar.f17622e.top).put("bottom", srVar.f17622e.bottom).put("left", srVar.f17622e.left).put("right", srVar.f17622e.right)).put("globalVisibleBoxVisible", srVar.f17623f).put("localVisibleBox", new JSONObject().put("top", srVar.f17624g.top).put("bottom", srVar.f17624g.bottom).put("left", srVar.f17624g.left).put("right", srVar.f17624g.right)).put("localVisibleBoxVisible", srVar.f17625h).put("hitBox", new JSONObject().put("top", srVar.f17626i.top).put("bottom", srVar.f17626i.bottom).put("left", srVar.f17626i.left).put("right", srVar.f17626i.right)).put("screenDensity", (double) this.f17808a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", w11.f19420a);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14579i1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = srVar.f17628k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(w11.f19424e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
