package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ip2 {
    /* renamed from: a */
    public static void m14473a(AtomicReference atomicReference, hp2 hp2) {
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                hp2.mo8302b(obj);
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                pm0.m18668h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
