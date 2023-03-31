package com.startapp;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import p201ca.C6841a;

/* renamed from: com.startapp.pe */
/* compiled from: Sta */
public final class C9229pe extends ContentObserver {

    /* renamed from: a */
    public final Context f38088a;

    /* renamed from: b */
    public final AudioManager f38089b;

    /* renamed from: c */
    public final C9666yd f38090c;

    /* renamed from: d */
    public final C9122le f38091d;

    /* renamed from: e */
    public float f38092e;

    public C9229pe(Handler handler, Context context, C9666yd ydVar, C9122le leVar) {
        super(handler);
        this.f38088a = context;
        this.f38089b = (AudioManager) context.getSystemService("audio");
        this.f38090c = ydVar;
        this.f38091d = leVar;
    }

    /* renamed from: a */
    public final float mo29839a() {
        int streamVolume = this.f38089b.getStreamVolume(3);
        int streamMaxVolume = this.f38089b.getStreamMaxVolume(3);
        this.f38090c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: b */
    public final void mo29840b() {
        C9122le leVar = this.f38091d;
        float f = this.f38092e;
        C9647xe xeVar = (C9647xe) leVar;
        xeVar.f39412a = f;
        if (xeVar.f39416e == null) {
            xeVar.f39416e = C9228pd.f38085c;
        }
        for (T t : Collections.unmodifiableCollection(xeVar.f39416e.f38087b)) {
            C6841a aVar = t.f38168e;
            C9268re.f38174a.mo29889a(aVar.mo22948c(), "setDeviceVolume", Float.valueOf(f));
        }
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float a = mo29839a();
        if (a != this.f38092e) {
            this.f38092e = a;
            mo29840b();
        }
    }
}
