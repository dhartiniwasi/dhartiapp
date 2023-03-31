package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4794n1;

/* renamed from: com.google.android.gms.internal.ads.vu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2971vu {

    /* renamed from: a */
    private final C2229bv f19237a;

    /* renamed from: b */
    private final C2639mw f19238b;

    /* renamed from: c */
    private final boolean f19239c;

    private C2971vu() {
        this.f19238b = C2676nw.m17296I();
        this.f19239c = false;
        this.f19237a = new C2229bv();
    }

    /* renamed from: a */
    public static C2971vu m22435a() {
        return new C2971vu();
    }

    /* renamed from: d */
    private final synchronized String m22436d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f19238b.mo12451C(), Long.valueOf(C4409t.m29310b().mo18371b()), Integer.valueOf(i - 1), Base64.encodeToString(((C2676nw) this.f19238b.mo13423m()).mo9400b(), 3)});
    }

    /* renamed from: e */
    private final synchronized void m22437e(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m22436d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C4794n1.m30693k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C4794n1.m30693k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C4794n1.m30693k("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C4794n1.m30693k("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C4794n1.m30693k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    private final synchronized void m22438f(int i) {
        C2639mw mwVar = this.f19238b;
        mwVar.mo12455u();
        List<String> b = C2679nz.m17342b();
        ArrayList arrayList = new ArrayList();
        for (String split : b) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    C4794n1.m30693k("Experiment ID is not a number");
                }
            }
        }
        mwVar.mo12454s(arrayList);
        C2192av avVar = new C2192av(this.f19237a, ((C2676nw) this.f19238b.mo13423m()).mo9400b(), (C3119zu) null);
        int i2 = i - 1;
        avVar.mo8564a(i2);
        avVar.mo8565c();
        C4794n1.m30693k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    /* renamed from: b */
    public final synchronized void mo14819b(C2934uu uuVar) {
        if (this.f19239c) {
            try {
                uuVar.mo9431a(this.f19238b);
            } catch (NullPointerException e) {
                C4409t.m29325q().mo15126t(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo14820c(int i) {
        if (this.f19239c) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14512b4)).booleanValue()) {
                m22437e(i);
            } else {
                m22438f(i);
            }
        }
    }

    public C2971vu(C2229bv bvVar) {
        this.f19238b = C2676nw.m17296I();
        this.f19237a = bvVar;
        this.f19239c = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14502a4)).booleanValue();
    }
}
