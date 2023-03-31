package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ro0 {

    /* renamed from: a */
    protected static final AtomicInteger f17032a = new AtomicInteger(0);

    /* renamed from: b */
    protected static final AtomicInteger f17033b = new AtomicInteger(0);

    /* renamed from: Z */
    public static int m19945Z() {
        return f17032a.get();
    }

    /* renamed from: b0 */
    public static int m19946b0() {
        return f17033b.get();
    }

    /* renamed from: G */
    public abstract long mo11194G();

    /* renamed from: H */
    public abstract long mo11195H();

    /* renamed from: I */
    public abstract void mo11196I(Uri[] uriArr, String str);

    /* renamed from: J */
    public abstract void mo11197J(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    /* renamed from: K */
    public abstract void mo11198K();

    /* renamed from: L */
    public abstract void mo11199L(long j);

    /* renamed from: M */
    public abstract void mo11200M(int i);

    /* renamed from: N */
    public abstract void mo11201N(int i);

    /* renamed from: O */
    public abstract void mo11202O(qo0 qo0);

    /* renamed from: P */
    public abstract void mo11203P(int i);

    /* renamed from: Q */
    public abstract void mo11204Q(int i);

    /* renamed from: R */
    public abstract void mo11205R(boolean z);

    /* renamed from: S */
    public abstract void mo11206S(boolean z);

    /* renamed from: T */
    public abstract void mo11207T(int i);

    /* renamed from: U */
    public abstract void mo11208U(Surface surface, boolean z) throws IOException;

    /* renamed from: V */
    public abstract void mo11209V(float f, boolean z) throws IOException;

    /* renamed from: W */
    public abstract void mo11210W();

    /* renamed from: X */
    public abstract boolean mo11211X();

    /* renamed from: Y */
    public abstract int mo11212Y();

    /* renamed from: a0 */
    public abstract int mo11213a0();

    /* renamed from: c0 */
    public abstract long mo11215c0();

    /* renamed from: d0 */
    public abstract long mo11217d0();

    /* renamed from: e0 */
    public abstract long mo11219e0();

    /* renamed from: f0 */
    public abstract long mo11220f0();

    /* renamed from: g0 */
    public abstract long mo11222g0();
}
