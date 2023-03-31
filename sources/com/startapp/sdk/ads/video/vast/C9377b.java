package com.startapp.sdk.ads.video.vast;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.C8842b3;
import com.startapp.C9023i4;
import com.startapp.C9605vb;
import com.startapp.C9654y3;
import com.startapp.C9671z0;
import com.startapp.sdk.ads.video.vast.C9378c;
import com.startapp.sdk.components.ComponentLocator;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.sdk.ads.video.vast.b */
/* compiled from: Sta */
public class C9377b implements C9378c.C9380b {

    /* renamed from: a */
    public final Context f38596a;

    /* renamed from: b */
    public final String f38597b;

    /* renamed from: c */
    public final JSONArray f38598c = new JSONArray();

    /* renamed from: d */
    public final String f38599d;

    /* renamed from: e */
    public final String f38600e;

    /* renamed from: f */
    public boolean f38601f;

    public C9377b(Context context, String str, String str2, String str3, boolean z) {
        this.f38596a = context;
        this.f38597b = str;
        this.f38599d = str2;
        this.f38600e = str3;
        this.f38601f = z;
    }

    /* renamed from: a */
    public void mo30406a(VASTErrorCodes vASTErrorCodes) {
        C9654y3 l;
        if (this.f38598c.length() != 0) {
            if (!this.f38601f || vASTErrorCodes == VASTErrorCodes.ErrorNone) {
                try {
                    String b = mo30407b(vASTErrorCodes);
                    if (!TextUtils.isEmpty(b)) {
                        l = ComponentLocator.m50248a(this.f38596a).mo31176l();
                        String str = this.f38597b;
                        byte[] bytes = b.getBytes();
                        Map<Activity, Integer> map = C9605vb.f39316a;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        gZIPOutputStream.write(bytes);
                        gZIPOutputStream.flush();
                        gZIPOutputStream.close();
                        l.mo31384a(str, (C9671z0) null, byteArrayOutputStream.toByteArray(), true, (C8842b3<Throwable, Void>) null);
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo30407b(VASTErrorCodes vASTErrorCodes) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("vastDocs", this.f38598c);
        String str = this.f38599d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        jSONObject.put("partnerResponse", str);
        String str3 = this.f38600e;
        if (str3 != null) {
            str2 = str3;
        }
        jSONObject.put("partnerName", str2);
        jSONObject.put("error", vASTErrorCodes.mo30398a());
        return jSONObject.toString();
    }
}
