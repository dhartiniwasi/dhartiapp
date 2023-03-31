package p144t5;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t5.o0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5581o0 implements C5591r1 {

    /* renamed from: a */
    private final Application f28169a;

    /* renamed from: b */
    private final C5568k0 f28170b;

    /* renamed from: c */
    private final Handler f28171c;

    /* renamed from: d */
    private final Executor f28172d;

    /* renamed from: e */
    private final C5594s1 f28173e;

    /* renamed from: f */
    private final C5571l f28174f;

    /* renamed from: g */
    private final C5613z f28175g;

    /* renamed from: h */
    private final C5577n f28176h;

    C5581o0(Application application, C5568k0 k0Var, Handler handler, Executor executor, C5594s1 s1Var, C5571l lVar, C5613z zVar, C5577n nVar) {
        this.f28169a = application;
        this.f28170b = k0Var;
        this.f28171c = handler;
        this.f28172d = executor;
        this.f28173e = s1Var;
        this.f28174f = lVar;
        this.f28175g = zVar;
        this.f28176h = nVar;
    }

    /* renamed from: e */
    private final void m33660e(JSONObject jSONObject) {
        String str;
        String str2;
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            String valueOf = String.valueOf(optString);
            if (valueOf.length() != 0) {
                str2 = "Action[browser]: empty scheme: ".concat(valueOf);
            } else {
                str2 = new String("Action[browser]: empty scheme: ");
            }
            Log.d("UserMessagingPlatform", str2);
        }
        try {
            this.f28170b.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            String valueOf2 = String.valueOf(optString);
            if (valueOf2.length() != 0) {
                str = "Action[browser]: can not open url: ".concat(valueOf2);
            } else {
                str = new String("Action[browser]: can not open url: ");
            }
            Log.d("UserMessagingPlatform", str, e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19875a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L_0x002b;
                case -278739366: goto L_0x0021;
                case 150940456: goto L_0x0017;
                case 1671672458: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r0 = "dismiss"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0017:
            java.lang.String r0 = "browser"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 2
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "configure_app_assets"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 3
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "load_complete"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            if (r7 == 0) goto L_0x00ab
            if (r7 == r5) goto L_0x004e
            if (r7 == r3) goto L_0x004a
            if (r7 == r4) goto L_0x003f
            return r2
        L_0x003f:
            java.util.concurrent.Executor r7 = r6.f28172d
            t5.m0 r8 = new t5.m0
            r8.<init>(r6)
            r7.execute(r8)
            return r5
        L_0x004a:
            r6.m33660e(r8)
            return r5
        L_0x004e:
            java.lang.String r7 = "status"
            java.lang.String r7 = r8.optString(r7)
            int r8 = r7.hashCode()
            r0 = 4
            switch(r8) {
                case -954325659: goto L_0x0085;
                case -258041904: goto L_0x007b;
                case 429411856: goto L_0x0071;
                case 467888915: goto L_0x0067;
                case 1666911234: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x008e
        L_0x005d:
            java.lang.String r8 = "non_personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 2
            goto L_0x008e
        L_0x0067:
            java.lang.String r8 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 1
            goto L_0x008e
        L_0x0071:
            java.lang.String r8 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 4
            goto L_0x008e
        L_0x007b:
            java.lang.String r8 = "personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 0
            goto L_0x008e
        L_0x0085:
            java.lang.String r8 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 3
        L_0x008e:
            if (r1 == 0) goto L_0x00a5
            if (r1 == r5) goto L_0x00a5
            if (r1 == r3) goto L_0x00a5
            if (r1 == r4) goto L_0x00a5
            if (r1 == r0) goto L_0x00a5
            t5.z r7 = r6.f28175g
            t5.u1 r8 = new t5.u1
            java.lang.String r0 = "We are getting something wrong with the webview."
            r8.<init>(r5, r0)
            r7.mo19915e(r8)
            goto L_0x00aa
        L_0x00a5:
            t5.z r7 = r6.f28175g
            r7.mo19914d(r4)
        L_0x00aa:
            return r5
        L_0x00ab:
            t5.z r7 = r6.f28175g
            r7.mo19916f()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p144t5.C5581o0.mo19875a(java.lang.String, org.json.JSONObject):boolean");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo19887b() {
        String str;
        Application application = this.f28169a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                str = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                str = valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", str);
            jSONObject.put("stored_infos_map", this.f28176h.mo19880b());
        } catch (JSONException unused) {
        }
        this.f28175g.mo19912b().mo19866b("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo19888c(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Receive consent action: ".concat(valueOf);
        } else {
            str2 = new String("Receive consent action: ");
        }
        Log.d("UserMessagingPlatform", str2);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("action");
        String queryParameter2 = parse.getQueryParameter("args");
        this.f28173e.mo19894b(queryParameter, queryParameter2, this, this.f28174f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo19889d(int i, String str, String str2) {
        this.f28175g.mo19917g(new C5600u1(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", new Object[]{Integer.valueOf(i), str2, str})));
    }

    public final Executor zza() {
        return new C5578n0(this.f28171c);
    }
}
