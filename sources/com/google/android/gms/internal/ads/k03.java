package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class k03 extends ContentObserver {

    /* renamed from: a */
    private final Context f11856a;

    /* renamed from: b */
    private final AudioManager f11857b;

    /* renamed from: c */
    private final i03 f11858c;

    /* renamed from: d */
    private float f11859d;

    /* renamed from: e */
    private final s03 f11860e;

    public k03(Handler handler, Context context, i03 i03, s03 s03, byte[] bArr) {
        super(handler);
        this.f11856a = context;
        this.f11857b = (AudioManager) context.getSystemService("audio");
        this.f11858c = i03;
        this.f11860e = s03;
    }

    /* renamed from: c */
    private final float m15144c() {
        int streamVolume = this.f11857b.getStreamVolume(3);
        int streamMaxVolume = this.f11857b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: d */
    private final void m15145d() {
        this.f11860e.mo13919d(this.f11859d);
    }

    /* renamed from: a */
    public final void mo11547a() {
        this.f11859d = m15144c();
        m15145d();
        this.f11856a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo11548b() {
        this.f11856a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m15144c();
        if (c != this.f11859d) {
            this.f11859d = c;
            m15145d();
        }
    }
}
