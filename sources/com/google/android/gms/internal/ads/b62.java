package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class b62 implements ej1 {

    /* renamed from: a */
    private Message f7107a;

    /* renamed from: b */
    private c72 f7108b;

    private b62() {
    }

    /* synthetic */ b62(a52 a52) {
    }

    /* renamed from: c */
    private final void m10202c() {
        this.f7107a = null;
        this.f7108b = null;
        c72.m10728a(this);
    }

    /* renamed from: a */
    public final b62 mo8681a(Message message, c72 c72) {
        this.f7107a = message;
        this.f7108b = c72;
        return this;
    }

    /* renamed from: b */
    public final boolean mo8682b(Handler handler) {
        Message message = this.f7107a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m10202c();
        return sendMessageAtFrontOfQueue;
    }

    public final void zza() {
        Message message = this.f7107a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        m10202c();
    }
}
