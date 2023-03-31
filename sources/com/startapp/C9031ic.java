package com.startapp;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.ic */
/* compiled from: Sta */
public class C9031ic {

    /* renamed from: a */
    public final Map<BloomVersion, C9013hc> f36970a;

    public C9031ic() {
        HashMap hashMap = new HashMap();
        this.f36970a = hashMap;
        hashMap.put(BloomVersion.ZERO, new C9138mc());
        hashMap.put(BloomVersion.THREE, new C9119lc());
        hashMap.put(BloomVersion.FOUR, new C9093kc());
        hashMap.put(BloomVersion.FIVE, new C9052jc());
    }
}
