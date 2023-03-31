package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p184aa.C6521a;
import p184aa.C6522b;
import p184aa.C6524d;
import p184aa.C6525e;

/* renamed from: com.startapp.r */
/* compiled from: Sta */
public class C9252r {
    /* renamed from: a */
    public static boolean m49204a(Context context) {
        try {
            if (C9582u7.f39250a.f38131a) {
                return true;
            }
            C9582u7.m50395a(context);
            return true;
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static C9180o m49207b(WebView webView) {
        try {
            return m49202a(webView);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return null;
        }
    }

    /* renamed from: b */
    public static C9180o m49206b(Context context, List<VerificationDetails> list, boolean z) {
        try {
            return m49201a(context, list, z);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static C9180o m49202a(WebView webView) {
        if (!m49204a(webView.getContext())) {
            return null;
        }
        C9542se.m50339a("Startio", "Name is null or empty");
        C9542se.m50339a("4.10.8", "Version is null or empty");
        return m49203a(new C9230q(new C9679z7("Startio", "4.10.8"), webView, (String) null, (List<C8987gc>) null, (String) null, "", C6521a.HTML), false, false);
    }

    /* renamed from: b */
    public static C8999h6 m49205b(C9180o oVar) {
        if (oVar == null) {
            return null;
        }
        try {
            return C8999h6.m48661a(oVar);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static C9180o m49201a(Context context, List<VerificationDetails> list, boolean z) {
        URL url;
        if (!m49204a(context)) {
            return null;
        }
        String a = C9600v7.m50421a();
        ArrayList arrayList = new ArrayList(list.size());
        for (VerificationDetails next : list) {
            try {
                url = new URL(next.mo31234c());
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                url = null;
            }
            if (url != null) {
                String a2 = next.mo31232a();
                String b = next.mo31233b();
                C9542se.m50339a(a2, "VendorKey is null or empty");
                C9542se.m50339a(b, "VerificationParameters is null or empty");
                arrayList.add(new C8987gc(a2, url, b));
            }
        }
        C9542se.m50339a("Startio", "Name is null or empty");
        C9542se.m50339a("4.10.8", "Version is null or empty");
        C9679z7 z7Var = new C9679z7("Startio", "4.10.8");
        C9542se.m50338a((Object) a, "OM SDK JS script content is null");
        return m49203a(new C9230q(z7Var, (WebView) null, a, arrayList, (String) null, "", C6521a.NATIVE), z, true);
    }

    /* renamed from: a */
    public static C9180o m49203a(C9230q qVar, boolean z, boolean z2) {
        C6525e eVar;
        C6522b bVar = z ? C6522b.VIDEO : z2 ? C6522b.NATIVE_DISPLAY : C6522b.HTML_DISPLAY;
        C6524d dVar = C6524d.VIEWABLE;
        C6525e eVar2 = C6525e.NATIVE;
        if (z) {
            eVar = eVar2;
        } else {
            eVar = C6525e.NONE;
        }
        if (bVar != C6522b.DEFINED_BY_JAVASCRIPT) {
            C9205p pVar = new C9205p(bVar, dVar, eVar2, eVar, false);
            if (C9582u7.f39250a.f38131a) {
                return new C9267rd(pVar, qVar);
            }
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    /* renamed from: a */
    public static C9101l m49200a(C9180o oVar) {
        if (oVar == null) {
            return null;
        }
        try {
            return C9101l.m48896a(oVar);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return null;
        }
    }
}
