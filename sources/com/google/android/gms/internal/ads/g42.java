package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g42 {

    /* renamed from: a */
    private final C2971vu f9690a;

    /* renamed from: b */
    private final Context f9691b;

    /* renamed from: c */
    private final j32 f9692c;

    /* renamed from: d */
    private final vm0 f9693d;

    /* renamed from: e */
    private final String f9694e;

    /* renamed from: f */
    private final ux2 f9695f;

    /* renamed from: g */
    private final C4800p1 f9696g = C4409t.m29325q().mo15117h();

    public g42(Context context, vm0 vm0, C2971vu vuVar, j32 j32, String str, ux2 ux2) {
        this.f9691b = context;
        this.f9693d = vm0;
        this.f9690a = vuVar;
        this.f9692c = j32;
        this.f9694e = str;
        this.f9695f = ux2;
    }

    /* renamed from: c */
    private static final void m13034c(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C2417gx gxVar = (C2417gx) arrayList.get(i);
            if (gxVar.mo10673e0() == 2 && gxVar.mo10666M() > j) {
                j = gxVar.mo10666M();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo10390a(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        String str2;
        if (z) {
            this.f9691b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14685s7)).booleanValue()) {
            tx2 b = tx2.m21328b("oa_upload");
            b.mo14409a("oa_failed_reqs", String.valueOf(y32.m23743a(sQLiteDatabase, 0)));
            b.mo14409a("oa_total_reqs", String.valueOf(y32.m23743a(sQLiteDatabase, 1)));
            b.mo14409a("oa_upload_time", String.valueOf(C4409t.m29310b().mo18370a()));
            b.mo14409a("oa_last_successful_time", String.valueOf(y32.m23744b(sQLiteDatabase, 2)));
            if (this.f9696g.mo18501f0()) {
                str = "";
            } else {
                str = this.f9694e;
            }
            b.mo14409a("oa_session_id", str);
            this.f9695f.mo8622a(b);
            ArrayList c = y32.m23745c(sQLiteDatabase);
            m13034c(sQLiteDatabase, c);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2417gx gxVar = (C2417gx) c.get(i2);
                tx2 b2 = tx2.m21328b("oa_signals");
                if (this.f9696g.mo18501f0()) {
                    str2 = "";
                } else {
                    str2 = this.f9694e;
                }
                b2.mo14409a("oa_session_id", str2);
                C2231bx N = gxVar.mo10667N();
                String valueOf = N.mo8961K() ? String.valueOf(N.mo8963M() - 1) : "-1";
                String obj = jb3.m14813b(gxVar.mo10669S(), f42.f9112a).toString();
                b2.mo14409a("oa_sig_ts", String.valueOf(gxVar.mo10666M()));
                b2.mo14409a("oa_sig_status", String.valueOf(gxVar.mo10673e0() - 1));
                b2.mo14409a("oa_sig_resp_lat", String.valueOf(gxVar.mo10665L()));
                b2.mo14409a("oa_sig_render_lat", String.valueOf(gxVar.mo10664K()));
                b2.mo14409a("oa_sig_formats", obj);
                b2.mo14409a("oa_sig_nw_type", valueOf);
                b2.mo14409a("oa_sig_wifi", String.valueOf(gxVar.mo10674f0() - 1));
                b2.mo14409a("oa_sig_airplane", String.valueOf(gxVar.mo10670b0() - 1));
                b2.mo14409a("oa_sig_data", String.valueOf(gxVar.mo10671c0() - 1));
                b2.mo14409a("oa_sig_nw_resp", String.valueOf(gxVar.mo10663J()));
                b2.mo14409a("oa_sig_offline", String.valueOf(gxVar.mo10672d0() - 1));
                b2.mo14409a("oa_sig_nw_state", String.valueOf(gxVar.mo10668R().zza()));
                if (N.mo8960J() && N.mo8961K() && N.mo8963M() == 2) {
                    b2.mo14409a("oa_sig_cell_type", String.valueOf(N.mo8962L() - 1));
                }
                this.f9695f.mo8622a(b2);
            }
        } else {
            ArrayList c2 = y32.m23745c(sQLiteDatabase);
            C2454hx G = C2640mx.m16789G();
            G.mo10961r(this.f9691b.getPackageName());
            G.mo10963u(Build.MODEL);
            G.mo10964v(y32.m23743a(sQLiteDatabase, 0));
            G.mo10960p(c2);
            G.mo10966y(y32.m23743a(sQLiteDatabase, 1));
            G.mo10962s(y32.m23743a(sQLiteDatabase, 3));
            G.mo10967z(C4409t.m29310b().mo18370a());
            G.mo10965x(y32.m23744b(sQLiteDatabase, 2));
            m13034c(sQLiteDatabase, c2);
            this.f9690a.mo14819b(new d42((C2640mx) G.mo13423m()));
            C3048xx G2 = C3085yx.m24221G();
            G2.mo15257p(this.f9693d.f19151b);
            G2.mo15259s(this.f9693d.f19152c);
            if (true == this.f9693d.f19153d) {
                i = 0;
            }
            G2.mo15258r(i);
            this.f9690a.mo14819b(new e42((C3085yx) G2.mo13423m()));
            this.f9690a.mo14820c(10004);
        }
        y32.m23748f(sQLiteDatabase);
        return null;
    }

    /* renamed from: b */
    public final void mo10391b(boolean z) {
        try {
            this.f9692c.mo11310a(new c42(this, z));
        } catch (Exception e) {
            pm0.m18664d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
