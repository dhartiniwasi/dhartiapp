package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;
import p017b5.C1787b;
import p033d5.C4141r;
import p124r.C5413a;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C2062b extends Exception {

    /* renamed from: a */
    private final C5413a<C1787b<?>, C6362b> f6050a;

    public C2062b(C5413a<C1787b<?>, C6362b> aVar) {
        this.f6050a = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1787b next : this.f6050a.keySet()) {
            C6362b bVar = (C6362b) C4141r.m28221k(this.f6050a.get(next));
            z &= !bVar.mo21755M1();
            String b = next.mo6915b();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
