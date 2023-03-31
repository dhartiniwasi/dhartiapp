package android.support.p009v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p009v4.media.MediaMetadataCompat;
import android.support.p009v4.media.session.C0223a;
import android.support.p009v4.media.session.C0226b;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.C0632f;
import androidx.media.AudioAttributesCompat;
import androidx.media.C1305i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p152v0.C5754a;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0188b f411a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f412b;

    /* renamed from: c */
    private final ConcurrentHashMap<C0184a, Boolean> f413c = new ConcurrentHashMap<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0188b {

        /* renamed from: a */
        protected final MediaController f414a;

        /* renamed from: b */
        final Object f415b = new Object();

        /* renamed from: c */
        private final List<C0184a> f416c = new ArrayList();

        /* renamed from: d */
        private HashMap<C0184a, C0183a> f417d = new HashMap<>();

        /* renamed from: e */
        final MediaSessionCompat.Token f418e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f419a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f419a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f419a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f415b) {
                        mediaControllerImplApi21.f418e.mo500g(C0226b.C0227a.m1199p(C0632f.m2960a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f418e.mo501h(C5754a.m34337b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.mo421e();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0183a extends C0184a.C0187c {
            C0183a(C0184a aVar) {
                super(aVar);
            }

            /* renamed from: F6 */
            public void mo424F6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: N3 */
            public void mo425N3(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b2 */
            public void mo426b2(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b4 */
            public void mo427b4() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: g4 */
            public void mo428g4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: p2 */
            public void mo429p2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f418e = token;
            this.f414a = new MediaController(context, (MediaSession.Token) token.mo499f());
            if (token.mo495d() == null) {
                m760f();
            }
        }

        /* renamed from: f */
        private void m760f() {
            mo422g("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* renamed from: h */
        static void m761h(Activity activity, MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.mo413c().mo499f()) : null);
        }

        /* renamed from: a */
        public final void mo417a(C0184a aVar) {
            this.f414a.unregisterCallback(aVar.f420a);
            synchronized (this.f415b) {
                if (this.f418e.mo495d() != null) {
                    try {
                        C0183a remove = this.f417d.remove(aVar);
                        if (remove != null) {
                            aVar.f422c = null;
                            this.f418e.mo495d().mo598G2(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.f416c.remove(aVar);
                }
            }
        }

        /* renamed from: b */
        public boolean mo418b(KeyEvent keyEvent) {
            return this.f414a.dispatchMediaButtonEvent(keyEvent);
        }

        /* renamed from: c */
        public PendingIntent mo419c() {
            return this.f414a.getSessionActivity();
        }

        /* renamed from: d */
        public final void mo420d(C0184a aVar, Handler handler) {
            this.f414a.registerCallback(aVar.f420a, handler);
            synchronized (this.f415b) {
                if (this.f418e.mo495d() != null) {
                    C0183a aVar2 = new C0183a(aVar);
                    this.f417d.put(aVar, aVar2);
                    aVar.f422c = aVar2;
                    try {
                        this.f418e.mo495d().mo624e1(aVar2);
                        aVar.mo443m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.f422c = null;
                    this.f416c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo421e() {
            if (this.f418e.mo495d() != null) {
                for (C0184a next : this.f416c) {
                    C0183a aVar = new C0183a(next);
                    this.f417d.put(next, aVar);
                    next.f422c = aVar;
                    try {
                        this.f418e.mo495d().mo624e1(aVar);
                        next.mo443m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f416c.clear();
            }
        }

        /* renamed from: g */
        public void mo422g(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f414a.sendCommand(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0184a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final MediaController.Callback f420a;

        /* renamed from: b */
        C0186b f421b;

        /* renamed from: c */
        C0223a f422c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private static class C0185a extends MediaController.Callback {

            /* renamed from: a */
            private final WeakReference<C0184a> f423a;

            C0185a(C0184a aVar) {
                this.f423a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null) {
                    aVar.mo430a(new C0191e(playbackInfo.getPlaybackType(), AudioAttributesCompat.m5513f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m809a(bundle);
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null) {
                    aVar.mo433c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null) {
                    aVar.mo434d(MediaMetadataCompat.m709b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null && aVar.f422c == null) {
                    aVar.mo435e(PlaybackStateCompat.m1082a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null) {
                    aVar.mo436f(MediaSessionCompat.QueueItem.m831b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null) {
                    aVar.mo437g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar != null) {
                    aVar.mo439i();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m809a(bundle);
                C0184a aVar = (C0184a) this.f423a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f422c == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.mo440j(str, bundle);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private class C0186b extends Handler {

            /* renamed from: a */
            boolean f424a = false;

            C0186b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f424a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m809a(data);
                            C0184a.this.mo440j((String) message.obj, data);
                            return;
                        case 2:
                            C0184a.this.mo435e((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C0184a.this.mo434d((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C0184a.this.mo430a((C0191e) message.obj);
                            return;
                        case 5:
                            C0184a.this.mo436f((List) message.obj);
                            return;
                        case 6:
                            C0184a.this.mo437g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m809a(bundle);
                            C0184a.this.mo433c(bundle);
                            return;
                        case 8:
                            C0184a.this.mo439i();
                            return;
                        case 9:
                            C0184a.this.mo438h(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C0184a.this.mo431b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C0184a.this.mo442l(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C0184a.this.mo441k();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0187c extends C0223a.C0224a {

            /* renamed from: a */
            private final WeakReference<C0184a> f426a;

            C0187c(C0184a aVar) {
                this.f426a = new WeakReference<>(aVar);
            }

            /* renamed from: F6 */
            public void mo424F6(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(4, parcelableVolumeInfo != null ? new C0191e(parcelableVolumeInfo.f512a, parcelableVolumeInfo.f513b, parcelableVolumeInfo.f514c, parcelableVolumeInfo.f515d, parcelableVolumeInfo.f516e) : null, (Bundle) null);
                }
            }

            /* renamed from: K3 */
            public void mo454K3(boolean z) throws RemoteException {
            }

            /* renamed from: N3 */
            public void mo425N3(CharSequence charSequence) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(6, charSequence, (Bundle) null);
                }
            }

            /* renamed from: S4 */
            public void mo455S4(int i) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            /* renamed from: a2 */
            public void mo456a2() throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(13, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: b2 */
            public void mo426b2(Bundle bundle) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(7, bundle, (Bundle) null);
                }
            }

            /* renamed from: b4 */
            public void mo427b4() throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(8, (Object) null, (Bundle) null);
                }
            }

            /* renamed from: g4 */
            public void mo428g4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            /* renamed from: h3 */
            public void mo457h3(boolean z) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            /* renamed from: p2 */
            public void mo429p2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(5, list, (Bundle) null);
                }
            }

            /* renamed from: v6 */
            public void mo458v6(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(2, playbackStateCompat, (Bundle) null);
                }
            }

            /* renamed from: w6 */
            public void mo459w6(String str, Bundle bundle) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(1, str, bundle);
                }
            }

            /* renamed from: y0 */
            public void mo460y0(int i) throws RemoteException {
                C0184a aVar = (C0184a) this.f426a.get();
                if (aVar != null) {
                    aVar.mo443m(9, Integer.valueOf(i), (Bundle) null);
                }
            }
        }

        public C0184a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f420a = new C0185a(this);
                return;
            }
            this.f420a = null;
            this.f422c = new C0187c(this);
        }

        /* renamed from: a */
        public void mo430a(C0191e eVar) {
        }

        /* renamed from: b */
        public void mo431b(boolean z) {
        }

        public void binderDied() {
            mo443m(8, (Object) null, (Bundle) null);
        }

        /* renamed from: c */
        public void mo433c(Bundle bundle) {
        }

        /* renamed from: d */
        public void mo434d(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: e */
        public void mo435e(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: f */
        public void mo436f(List<MediaSessionCompat.QueueItem> list) {
        }

        /* renamed from: g */
        public void mo437g(CharSequence charSequence) {
        }

        /* renamed from: h */
        public void mo438h(int i) {
        }

        /* renamed from: i */
        public void mo439i() {
        }

        /* renamed from: j */
        public void mo440j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo441k() {
        }

        /* renamed from: l */
        public void mo442l(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo443m(int i, Object obj, Bundle bundle) {
            C0186b bVar = this.f421b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo444n(Handler handler) {
            if (handler == null) {
                C0186b bVar = this.f421b;
                if (bVar != null) {
                    bVar.f424a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.f421b = null;
                    return;
                }
                return;
            }
            C0186b bVar2 = new C0186b(handler.getLooper());
            this.f421b = bVar2;
            bVar2.f424a = true;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0188b {
        /* renamed from: a */
        void mo417a(C0184a aVar);

        /* renamed from: b */
        boolean mo418b(KeyEvent keyEvent);

        /* renamed from: c */
        PendingIntent mo419c();

        /* renamed from: d */
        void mo420d(C0184a aVar, Handler handler);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0189c extends MediaControllerImplApi21 {
        C0189c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0190d implements C0188b {

        /* renamed from: a */
        private C0226b f427a;

        C0190d(MediaSessionCompat.Token token) {
            this.f427a = C0226b.C0227a.m1199p((IBinder) token.mo499f());
        }

        /* renamed from: a */
        public void mo417a(C0184a aVar) {
            if (aVar != null) {
                try {
                    this.f427a.mo598G2(aVar.f422c);
                    this.f427a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        /* renamed from: b */
        public boolean mo418b(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f427a.mo599G3(keyEvent);
                    return false;
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        /* renamed from: c */
        public PendingIntent mo419c() {
            try {
                return this.f427a.mo608M1();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        /* renamed from: d */
        public void mo420d(C0184a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f427a.asBinder().linkToDeath(aVar, 0);
                    this.f427a.mo624e1(aVar.f422c);
                    aVar.mo443m(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    aVar.mo443m(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    public static final class C0191e {

        /* renamed from: a */
        private final int f428a;

        /* renamed from: b */
        private final AudioAttributesCompat f429b;

        /* renamed from: c */
        private final int f430c;

        /* renamed from: d */
        private final int f431d;

        /* renamed from: e */
        private final int f432e;

        C0191e(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.C1247a().mo4473d(i2).mo4470a(), i3, i4, i5);
        }

        C0191e(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.f428a = i;
            this.f429b = audioAttributesCompat;
            this.f430c = i2;
            this.f431d = i3;
            this.f432e = i4;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token c = mediaSessionCompat.mo462c();
            this.f412b = c;
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f411a = new C0189c(context, c);
            } else if (i >= 21) {
                this.f411a = new MediaControllerImplApi21(context, c);
            } else {
                this.f411a = new C0190d(c);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    /* renamed from: f */
    public static void m753f(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(C1305i.media_controller_compat_view_tag, mediaControllerCompat);
        if (Build.VERSION.SDK_INT >= 21) {
            MediaControllerImplApi21.m761h(activity, mediaControllerCompat);
        }
    }

    /* renamed from: a */
    public boolean mo411a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f411a.mo418b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public PendingIntent mo412b() {
        return this.f411a.mo419c();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token mo413c() {
        return this.f412b;
    }

    /* renamed from: d */
    public void mo414d(C0184a aVar) {
        mo415e(aVar, (Handler) null);
    }

    /* renamed from: e */
    public void mo415e(C0184a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f413c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.mo444n(handler);
            this.f411a.mo420d(aVar, handler);
        }
    }

    /* renamed from: g */
    public void mo416g(C0184a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f413c.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.f411a.mo417a(aVar);
            } finally {
                aVar.mo444n((Handler) null);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f412b = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f411a = new MediaControllerImplApi21(context, token);
            } else {
                this.f411a = new C0190d(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
