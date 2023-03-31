package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import p039e4.C4239b;
import p053g4.C4409t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ie0 extends le0 {

    /* renamed from: c */
    private final Map f10752c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f10753d;

    public ie0(vs0 vs0, Map map) {
        super(vs0, "storePicture");
        this.f10752c = map;
        this.f10753d = vs0.mo8461X();
    }

    /* renamed from: i */
    public final void mo11098i() {
        if (this.f10753d == null) {
            mo11984c("Activity context is not available");
            return;
        }
        C4409t.m29326r();
        if (!new C3012wy(this.f10753d).mo15001c()) {
            mo11984c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f10752c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo11984c("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C4409t.m29326r();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources d = C4409t.m29325q().mo15114d();
                C4409t.m29326r();
                AlertDialog.Builder g = C4751b2.m30612g(this.f10753d);
                g.setTitle(d != null ? d.getString(C4239b.f23605h) : "Save image");
                g.setMessage(d != null ? d.getString(C4239b.f23606i) : "Allow Ad to store image in Picture gallery?");
                g.setPositiveButton(d != null ? d.getString(C4239b.f23607j) : "Accept", new ge0(this, str, lastPathSegment));
                g.setNegativeButton(d != null ? d.getString(C4239b.f23608k) : "Decline", new he0(this));
                g.create().show();
                return;
            }
            mo11984c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            mo11984c("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
