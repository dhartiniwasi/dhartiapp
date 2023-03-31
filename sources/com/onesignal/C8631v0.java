package com.onesignal;

import com.onesignal.C8540p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p249ha.C10487a;

/* renamed from: com.onesignal.v0 */
/* compiled from: OSFocusTimeProcessorFactory */
class C8631v0 {

    /* renamed from: a */
    private final HashMap<String, C8540p.C8543c> f36076a;

    public C8631v0() {
        HashMap<String, C8540p.C8543c> hashMap = new HashMap<>();
        this.f36076a = hashMap;
        hashMap.put(C8540p.C8545d.class.getName(), new C8540p.C8545d());
        hashMap.put(C8540p.C8542b.class.getName(), new C8540p.C8542b());
    }

    /* renamed from: a */
    private C8540p.C8543c m47762a() {
        return this.f36076a.get(C8540p.C8542b.class.getName());
    }

    /* renamed from: d */
    private C8540p.C8543c m47763d() {
        return this.f36076a.get(C8540p.C8545d.class.getName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8540p.C8543c mo28245b() {
        C8540p.C8543c a = m47762a();
        for (C10487a d : a.mo28055j()) {
            if (d.mo33612d().mo33622a()) {
                return a;
            }
        }
        return m47763d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8540p.C8543c mo28246c(List<C10487a> list) {
        boolean z;
        Iterator<C10487a> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo33612d().mo33622a()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return m47762a();
        }
        return m47763d();
    }
}
