package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class em0 {

    /* renamed from: a */
    public static final ThreadPoolExecutor f8845a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new dm0("ClientDefault"));

    /* renamed from: b */
    public static final ExecutorService f8846b = Executors.newSingleThreadExecutor(new dm0("ClientSingle"));
}
