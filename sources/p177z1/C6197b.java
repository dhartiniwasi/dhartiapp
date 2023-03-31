package p177z1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: z1.b */
/* compiled from: AudioBecomingNoisyManager */
final class C6197b {

    /* renamed from: a */
    private final Context f29755a;

    /* renamed from: b */
    private final C6198a f29756b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f29757c;

    /* renamed from: z1.b$a */
    /* compiled from: AudioBecomingNoisyManager */
    private final class C6198a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        private final C6199b f29758a;

        /* renamed from: b */
        private final Handler f29759b;

        public C6198a(Handler handler, C6199b bVar) {
            this.f29759b = handler;
            this.f29758a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f29759b.post(this);
            }
        }

        public void run() {
            if (C6197b.this.f29757c) {
                this.f29758a.mo21153g();
            }
        }
    }

    /* renamed from: z1.b$b */
    /* compiled from: AudioBecomingNoisyManager */
    public interface C6199b {
        /* renamed from: g */
        void mo21153g();
    }

    public C6197b(Context context, Handler handler, C6199b bVar) {
        this.f29755a = context.getApplicationContext();
        this.f29756b = new C6198a(handler, bVar);
    }

    /* renamed from: b */
    public void mo21150b(boolean z) {
        if (z && !this.f29757c) {
            this.f29755a.registerReceiver(this.f29756b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f29757c = true;
        } else if (!z && this.f29757c) {
            this.f29755a.unregisterReceiver(this.f29756b);
            this.f29757c = false;
        }
    }
}
