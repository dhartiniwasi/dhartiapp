package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.f0 */
/* compiled from: Sta */
public class C8939f0 {

    /* renamed from: a */
    public final Context f36746a;

    /* renamed from: b */
    public final List<AppPresenceDetails> f36747b;

    /* renamed from: c */
    public final Runnable f36748c = new C8940a();

    /* renamed from: com.startapp.f0$a */
    /* compiled from: Sta */
    public class C8940a implements Runnable {
        public C8940a() {
        }

        public void run() {
            C8939f0 f0Var = C8939f0.this;
            f0Var.getClass();
            try {
                C8997h4.m48658a(f0Var.f36746a, f0Var.mo29344a(f0Var.f36747b), new TrackingParams().mo30721a("APP_PRESENCE"));
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    public C8939f0(Context context, List<AppPresenceDetails> list) {
        this.f36747b = list;
        this.f36746a = context;
    }

    /* renamed from: a */
    public void mo29345a() {
        ComponentLocator.m50248a(this.f36746a).mo31181q().execute(this.f36748c);
    }

    /* renamed from: a */
    public final List<String> mo29344a(List<AppPresenceDetails> list) {
        String c;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (AppPresenceDetails next : list) {
            if (!next.mo30655e() && (c = next.mo30653c()) != null) {
                try {
                    str = Uri.parse(c).getQueryParameter("d");
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                    str = null;
                }
                if (str != null) {
                    if (next.mo30654d()) {
                        arrayList2.add("d=" + str);
                    } else {
                        arrayList3.add("d=" + str);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(C9396a.m49776a((List<String>) arrayList2, "false", "true"));
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(C9396a.m49776a((List<String>) arrayList3, "false", "false"));
        }
        return arrayList;
    }
}
