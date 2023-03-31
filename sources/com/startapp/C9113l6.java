package com.startapp;

import android.content.Context;
import android.hardware.SensorEvent;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.startapp.l6 */
/* compiled from: Sta */
public class C9113l6 extends Thread {

    /* renamed from: a */
    public final BlockingDeque<SensorEvent> f37273a;

    /* renamed from: b */
    public final C8986gb f37274b;

    /* renamed from: c */
    public final AtomicLong f37275c = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: d */
    public final AtomicLong f37276d = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    /* renamed from: e */
    public final AtomicLong f37277e = new AtomicLong(0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9113l6(String str, Context context, MotionMetadata motionMetadata, int i, double d, long j) {
        super(str);
        C8986gb gbVar = new C8986gb(motionMetadata.mo31063f(), motionMetadata.mo31064g(), motionMetadata.mo31065h(), motionMetadata.mo31067i(), motionMetadata.mo31077s(), motionMetadata.mo31078t(), motionMetadata.mo31060d(), motionMetadata.mo31061e(), motionMetadata.mo31058b(), motionMetadata.mo31057a(), motionMetadata.mo31059c(), motionMetadata.mo31073o(), motionMetadata.mo31074p(), motionMetadata.mo31071m(), motionMetadata.mo31070l(), motionMetadata.mo31072n());
        this.f37274b = gbVar;
        gbVar.mo29436a(d, j);
        this.f37273a = new LinkedBlockingDeque(i);
    }

    public void run() {
        while (true) {
            try {
                SensorEvent take = this.f37273a.take();
                if (take != null) {
                    C8986gb gbVar = this.f37274b;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = take.timestamp;
                    float[] fArr = take.values;
                    gbVar.mo29437a(currentTimeMillis, j, (double) fArr[0], (double) fArr[1], (double) fArr[2]);
                    this.f37275c.set(Double.doubleToRawLongBits(this.f37274b.f36870k.f39350i));
                    this.f37276d.set(Double.doubleToRawLongBits(this.f37274b.f36870k.f39348g));
                    this.f37277e.set(this.f37274b.f36870k.f39349h);
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                return;
            }
        }
    }
}
