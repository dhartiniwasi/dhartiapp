package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import com.startapp.C9023i4;
import com.startapp.C9572u;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.common.advertisingid.a */
/* compiled from: Sta */
public class C9453a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdvertisingIdResolver f39019a;

    public C9453a(AdvertisingIdResolver advertisingIdResolver) {
        this.f39019a = advertisingIdResolver;
    }

    public void run() {
        AdvertisingIdResolver advertisingIdResolver;
        AdvertisingIdResolver advertisingIdResolver2;
        AtomicReference<C9572u> atomicReference;
        Context context;
        C9572u uVar;
        try {
            this.f39019a.f39012d.lock();
            try {
                advertisingIdResolver2 = this.f39019a;
                atomicReference = advertisingIdResolver2.f39014f;
                context = advertisingIdResolver2.f39009a;
                uVar = AdvertisingIdResolver.m50241a(context);
            } catch (AdvertisingIdResolver.InternalException e) {
                advertisingIdResolver2.mo31160b(e.infoEventFlags);
            } catch (Throwable th) {
                try {
                    if (this.f39019a.mo31159a(64)) {
                        C9023i4.m48681a(th);
                    }
                    advertisingIdResolver = this.f39019a;
                } catch (Throwable th2) {
                    this.f39019a.f39016h = 2;
                    this.f39019a.f39013e.signalAll();
                    this.f39019a.f39012d.unlock();
                    throw th2;
                }
            }
            atomicReference.set(uVar);
            advertisingIdResolver = this.f39019a;
            advertisingIdResolver.f39016h = 2;
            this.f39019a.f39013e.signalAll();
            this.f39019a.f39012d.unlock();
            try {
                uVar = AdvertisingIdResolver.m50242b(context);
            } catch (AdvertisingIdResolver.InternalException e2) {
                advertisingIdResolver2.mo31160b(e2.infoEventFlags);
                uVar = C9572u.f39227d;
                atomicReference.set(uVar);
                advertisingIdResolver = this.f39019a;
                advertisingIdResolver.f39016h = 2;
                this.f39019a.f39013e.signalAll();
                this.f39019a.f39012d.unlock();
            } catch (Throwable th3) {
                if (advertisingIdResolver2.mo31159a(256)) {
                    C9023i4.m48681a(th3);
                }
                uVar = C9572u.f39227d;
                atomicReference.set(uVar);
                advertisingIdResolver = this.f39019a;
                advertisingIdResolver.f39016h = 2;
                this.f39019a.f39013e.signalAll();
                this.f39019a.f39012d.unlock();
            }
            atomicReference.set(uVar);
            advertisingIdResolver = this.f39019a;
            advertisingIdResolver.f39016h = 2;
            this.f39019a.f39013e.signalAll();
            this.f39019a.f39012d.unlock();
        } catch (Throwable th4) {
            this.f39019a.f39016h = 2;
            if (this.f39019a.mo31159a(16384)) {
                C9023i4.m48681a(th4);
            }
        }
    }
}
