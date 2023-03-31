package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;
import p039e4.C4239b;
import p053g4.C4409t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ce0 extends le0 {

    /* renamed from: c */
    private final Map f7694c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f7695d;

    /* renamed from: e */
    private final String f7696e = m10895l("description");

    /* renamed from: f */
    private final long f7697f = m10894k("start_ticks");

    /* renamed from: g */
    private final long f7698g = m10894k("end_ticks");

    /* renamed from: h */
    private final String f7699h = m10895l("summary");

    /* renamed from: i */
    private final String f7700i = m10895l("location");

    public ce0(vs0 vs0, Map map) {
        super(vs0, "createCalendarEvent");
        this.f7694c = map;
        this.f7695d = vs0.mo8461X();
    }

    /* renamed from: k */
    private final long m10894k(String str) {
        String str2 = (String) this.f7694c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private final String m10895l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f7694c.get(str)) ? "" : (String) this.f7694c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Intent mo9161i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f7696e);
        data.putExtra("eventLocation", this.f7700i);
        data.putExtra("description", this.f7699h);
        long j = this.f7697f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f7698g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void mo9162j() {
        if (this.f7695d == null) {
            mo11984c("Activity context is not available.");
            return;
        }
        C4409t.m29326r();
        if (!new C3012wy(this.f7695d).mo15000b()) {
            mo11984c("This feature is not available on the device.");
            return;
        }
        C4409t.m29326r();
        AlertDialog.Builder g = C4751b2.m30612g(this.f7695d);
        Resources d = C4409t.m29325q().mo15114d();
        g.setTitle(d != null ? d.getString(C4239b.f23609l) : "Create calendar event");
        g.setMessage(d != null ? d.getString(C4239b.f23610m) : "Allow Ad to create a calendar event?");
        g.setPositiveButton(d != null ? d.getString(C4239b.f23607j) : "Accept", new ae0(this));
        g.setNegativeButton(d != null ? d.getString(C4239b.f23608k) : "Decline", new be0(this));
        g.create().show();
    }
}
