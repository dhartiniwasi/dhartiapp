package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p081k5.C4888c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mx1 {

    /* renamed from: a */
    private final Context f13705a;

    /* renamed from: b */
    private final ApplicationInfo f13706b;

    /* renamed from: c */
    private final int f13707c;

    /* renamed from: d */
    private final int f13708d;

    /* renamed from: e */
    private String f13709e = "";

    public mx1(Context context) {
        this.f13705a = context;
        this.f13706b = context.getApplicationInfo();
        this.f13707c = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14420R7)).intValue();
        this.f13708d = ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14430S7)).intValue();
    }

    /* renamed from: a */
    public final JSONObject mo12462a() throws JSONException {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, C4888c.m31075a(this.f13705a).mo18671d(this.f13706b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f13706b.packageName);
        C4409t.m29326r();
        jSONObject.put("adMobAppId", C4751b2.m30594L(this.f13705a));
        if (this.f13709e.isEmpty()) {
            try {
                drawable = (Drawable) C4888c.m31075a(this.f13705a).mo18672e(this.f13706b.packageName).f2439b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = "";
            } else {
                drawable.setBounds(0, 0, this.f13707c, this.f13708d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f13707c, this.f13708d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f13709e = str;
        }
        if (!this.f13709e.isEmpty()) {
            jSONObject.put("icon", this.f13709e);
            jSONObject.put("iconWidthPx", this.f13707c);
            jSONObject.put("iconHeightPx", this.f13708d);
        }
        return jSONObject;
    }
}
