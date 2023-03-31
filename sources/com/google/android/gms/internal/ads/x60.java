package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import p053g4.C4409t;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x60 implements e60 {

    /* renamed from: a */
    private final Context f20003a;

    public x60(Context context) {
        this.f20003a = context;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            C4794n1.m30693k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey("title")) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
            }
            try {
                C4409t.m29326r();
                C4751b2.m30615j(this.f20003a, intent);
            } catch (ActivityNotFoundException e) {
                C4409t.m29325q().mo15126t(e, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
