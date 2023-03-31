package p177z1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: z1.l3 */
/* compiled from: StreamVolumeManager */
final class C6244l3 {

    /* renamed from: a */
    private final Context f30065a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f30066b;

    /* renamed from: c */
    private final C6246b f30067c;

    /* renamed from: d */
    private final AudioManager f30068d;

    /* renamed from: e */
    private C6247c f30069e;

    /* renamed from: f */
    private int f30070f = 3;

    /* renamed from: g */
    private int f30071g;

    /* renamed from: h */
    private boolean f30072h;

    /* renamed from: z1.l3$b */
    /* compiled from: StreamVolumeManager */
    public interface C6246b {
        /* renamed from: D */
        void mo21201D(int i, boolean z);

        /* renamed from: a */
        void mo21203a(int i);
    }

    /* renamed from: z1.l3$c */
    /* compiled from: StreamVolumeManager */
    private final class C6247c extends BroadcastReceiver {
        private C6247c() {
        }

        public void onReceive(Context context, Intent intent) {
            C6244l3.this.f30066b.post(new C13407m3(C6244l3.this));
        }
    }

    public C6244l3(Context context, Handler handler, C6246b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f30065a = applicationContext;
        this.f30066b = handler;
        this.f30067c = bVar;
        AudioManager audioManager = (AudioManager) C5917a.m34875h((AudioManager) applicationContext.getSystemService("audio"));
        this.f30068d = audioManager;
        this.f30071g = m36641f(audioManager, 3);
        this.f30072h = m36640e(audioManager, this.f30070f);
        C6247c cVar = new C6247c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f30069e = cVar;
        } catch (RuntimeException e) {
            C5961r.m35216j("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: e */
    private static boolean m36640e(AudioManager audioManager, int i) {
        if (C5953m0.f29110a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m36641f(audioManager, i) == 0;
    }

    /* renamed from: f */
    private static int m36641f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C5961r.m35216j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m36642i() {
        int f = m36641f(this.f30068d, this.f30070f);
        boolean e = m36640e(this.f30068d, this.f30070f);
        if (this.f30071g != f || this.f30072h != e) {
            this.f30071g = f;
            this.f30072h = e;
            this.f30067c.mo21201D(f, e);
        }
    }

    /* renamed from: c */
    public int mo21396c() {
        return this.f30068d.getStreamMaxVolume(this.f30070f);
    }

    /* renamed from: d */
    public int mo21397d() {
        if (C5953m0.f29110a >= 28) {
            return this.f30068d.getStreamMinVolume(this.f30070f);
        }
        return 0;
    }

    /* renamed from: g */
    public void mo21398g() {
        C6247c cVar = this.f30069e;
        if (cVar != null) {
            try {
                this.f30065a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                C5961r.m35216j("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f30069e = null;
        }
    }

    /* renamed from: h */
    public void mo21399h(int i) {
        if (this.f30070f != i) {
            this.f30070f = i;
            m36642i();
            this.f30067c.mo21203a(i);
        }
    }
}
