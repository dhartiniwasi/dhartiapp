package com.startapp.sdk.components;

import com.startapp.C8908d3;
import com.startapp.sdk.components.ComponentLocator;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.startapp.sdk.components.k */
/* compiled from: Sta */
public class C9508k implements C8908d3<Integer> {

    /* renamed from: a */
    public final /* synthetic */ ThreadPoolExecutor f39110a;

    public C9508k(ComponentLocator.C9479m mVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f39110a = threadPoolExecutor;
    }

    public Object call() {
        return Integer.valueOf(this.f39110a.getMaximumPoolSize() - this.f39110a.getActiveCount());
    }
}
