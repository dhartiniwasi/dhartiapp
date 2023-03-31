package android.support.p009v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p009v4.media.session.C0226b;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0632f;
import androidx.media.C1261c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p027d.C3982b;
import p124r.C5413a;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f333b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final C0159d f334a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends C3982b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo299a(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends C3982b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo299a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m811u(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends C3982b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo299a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m811u(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0154a {
        /* renamed from: a */
        static MediaDescription m620a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        /* renamed from: b */
        static int m621b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    private static class C0155b extends Handler {

        /* renamed from: a */
        private final WeakReference<C0169i> f337a;

        /* renamed from: b */
        private WeakReference<Messenger> f338b;

        C0155b(C0169i iVar) {
            this.f337a = new WeakReference<>(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo307a(Messenger messenger) {
            this.f338b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f338b;
            if (weakReference != null && weakReference.get() != null && this.f337a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m809a(data);
                C0169i iVar = (C0169i) this.f337a.get();
                Messenger messenger = (Messenger) this.f338b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.m809a(bundle);
                        iVar.mo322a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        iVar.mo324g(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.m809a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.m809a(bundle3);
                        iVar.mo323b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        iVar.mo324g(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0156c {

        /* renamed from: a */
        final MediaBrowser.ConnectionCallback f339a;

        /* renamed from: b */
        C0158b f340b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        private class C0157a extends MediaBrowser.ConnectionCallback {
            C0157a() {
            }

            public void onConnected() {
                C0158b bVar = C0156c.this.f340b;
                if (bVar != null) {
                    bVar.onConnected();
                }
                C0156c.this.mo309a();
            }

            public void onConnectionFailed() {
                C0158b bVar = C0156c.this.f340b;
                if (bVar != null) {
                    bVar.mo317h();
                }
                C0156c.this.mo310b();
            }

            public void onConnectionSuspended() {
                C0158b bVar = C0156c.this.f340b;
                if (bVar != null) {
                    bVar.mo316c();
                }
                C0156c.this.mo311c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        interface C0158b {
            /* renamed from: c */
            void mo316c();

            /* renamed from: h */
            void mo317h();

            void onConnected();
        }

        public C0156c() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f339a = new C0157a();
            } else {
                this.f339a = null;
            }
        }

        /* renamed from: a */
        public void mo309a() {
            throw null;
        }

        /* renamed from: b */
        public void mo310b() {
            throw null;
        }

        /* renamed from: c */
        public void mo311c() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo312d(C0158b bVar) {
            this.f340b = bVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    interface C0159d {
        /* renamed from: d */
        MediaSessionCompat.Token mo319d();

        /* renamed from: e */
        void mo320e();

        /* renamed from: f */
        void mo321f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0160e implements C0159d, C0169i, C0156c.C0158b {

        /* renamed from: a */
        final Context f342a;

        /* renamed from: b */
        protected final MediaBrowser f343b;

        /* renamed from: c */
        protected final Bundle f344c;

        /* renamed from: d */
        protected final C0155b f345d = new C0155b(this);

        /* renamed from: e */
        private final C5413a<String, C0171k> f346e = new C5413a<>();

        /* renamed from: f */
        protected int f347f;

        /* renamed from: g */
        protected C0170j f348g;

        /* renamed from: h */
        protected Messenger f349h;

        /* renamed from: i */
        private MediaSessionCompat.Token f350i;

        /* renamed from: j */
        private Bundle f351j;

        C0160e(Context context, ComponentName componentName, C0156c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f342a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f344c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.mo312d(this);
            this.f343b = new MediaBrowser(context, componentName, cVar.f339a, bundle2);
        }

        /* renamed from: a */
        public void mo322a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo323b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f349h == messenger) {
                C0171k kVar = this.f346e.get(str);
                if (kVar != null) {
                    C0172l a = kVar.mo340a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo345c(str);
                            return;
                        }
                        this.f351j = bundle2;
                        a.mo343a(str, list);
                        this.f351j = null;
                    } else if (list == null) {
                        a.mo346d(str, bundle);
                    } else {
                        this.f351j = bundle2;
                        a.mo344b(str, list, bundle);
                        this.f351j = null;
                    }
                } else if (MediaBrowserCompat.f333b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: c */
        public void mo316c() {
            this.f348g = null;
            this.f349h = null;
            this.f350i = null;
            this.f345d.mo307a((Messenger) null);
        }

        /* renamed from: d */
        public MediaSessionCompat.Token mo319d() {
            if (this.f350i == null) {
                this.f350i = MediaSessionCompat.Token.m843b(this.f343b.getSessionToken());
            }
            return this.f350i;
        }

        /* renamed from: e */
        public void mo320e() {
            Messenger messenger;
            C0170j jVar = this.f348g;
            if (!(jVar == null || (messenger = this.f349h) == null)) {
                try {
                    jVar.mo339f(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f343b.disconnect();
        }

        /* renamed from: f */
        public void mo321f() {
            this.f343b.connect();
        }

        /* renamed from: g */
        public void mo324g(Messenger messenger) {
        }

        /* renamed from: h */
        public void mo317h() {
        }

        public void onConnected() {
            try {
                Bundle extras = this.f343b.getExtras();
                if (extras != null) {
                    this.f347f = extras.getInt("extra_service_version", 0);
                    IBinder a = C0632f.m2960a(extras, "extra_messenger");
                    if (a != null) {
                        this.f348g = new C0170j(a, this.f344c);
                        Messenger messenger = new Messenger(this.f345d);
                        this.f349h = messenger;
                        this.f345d.mo307a(messenger);
                        try {
                            this.f348g.mo338d(this.f342a, this.f349h);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    C0226b p = C0226b.C0227a.m1199p(C0632f.m2960a(extras, "extra_session_binder"));
                    if (p != null) {
                        this.f350i = MediaSessionCompat.Token.m844c(this.f343b.getSessionToken(), p);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0161f extends C0160e {
        C0161f(Context context, ComponentName componentName, C0156c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0162g extends C0161f {
        C0162g(Context context, ComponentName componentName, C0156c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0163h implements C0159d, C0169i {

        /* renamed from: a */
        final Context f352a;

        /* renamed from: b */
        final ComponentName f353b;

        /* renamed from: c */
        final C0156c f354c;

        /* renamed from: d */
        final Bundle f355d;

        /* renamed from: e */
        final C0155b f356e = new C0155b(this);

        /* renamed from: f */
        private final C5413a<String, C0171k> f357f = new C5413a<>();

        /* renamed from: g */
        int f358g = 1;

        /* renamed from: h */
        C0166c f359h;

        /* renamed from: i */
        C0170j f360i;

        /* renamed from: j */
        Messenger f361j;

        /* renamed from: k */
        private String f362k;

        /* renamed from: l */
        private MediaSessionCompat.Token f363l;

        /* renamed from: m */
        private Bundle f364m;

        /* renamed from: n */
        private Bundle f365n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$h$a */
        class C0164a implements Runnable {
            C0164a() {
            }

            public void run() {
                C0163h hVar = C0163h.this;
                if (hVar.f358g != 0) {
                    hVar.f358g = 2;
                    if (MediaBrowserCompat.f333b && hVar.f359h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + C0163h.this.f359h);
                    } else if (hVar.f360i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + C0163h.this.f360i);
                    } else if (hVar.f361j == null) {
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(C0163h.this.f353b);
                        C0163h hVar2 = C0163h.this;
                        hVar2.f359h = new C0166c();
                        boolean z = false;
                        try {
                            C0163h hVar3 = C0163h.this;
                            z = hVar3.f352a.bindService(intent, hVar3.f359h, 1);
                        } catch (Exception unused) {
                            Log.e("MediaBrowserCompat", "Failed binding to service " + C0163h.this.f353b);
                        }
                        if (!z) {
                            C0163h.this.mo326h();
                            C0163h.this.f354c.mo310b();
                        }
                        if (MediaBrowserCompat.f333b) {
                            Log.d("MediaBrowserCompat", "connect...");
                            C0163h.this.mo325c();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + C0163h.this.f361j);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$h$b */
        class C0165b implements Runnable {
            C0165b() {
            }

            public void run() {
                C0163h hVar = C0163h.this;
                Messenger messenger = hVar.f361j;
                if (messenger != null) {
                    try {
                        hVar.f360i.mo337c(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0163h.this.f353b);
                    }
                }
                C0163h hVar2 = C0163h.this;
                int i = hVar2.f358g;
                hVar2.mo326h();
                if (i != 0) {
                    C0163h.this.f358g = i;
                }
                if (MediaBrowserCompat.f333b) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    C0163h.this.mo325c();
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$h$c */
        private class C0166c implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$h$c$a */
            class C0167a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ ComponentName f369a;

                /* renamed from: b */
                final /* synthetic */ IBinder f370b;

                C0167a(ComponentName componentName, IBinder iBinder) {
                    this.f369a = componentName;
                    this.f370b = iBinder;
                }

                public void run() {
                    boolean z = MediaBrowserCompat.f333b;
                    if (z) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.f369a + " binder=" + this.f370b);
                        C0163h.this.mo325c();
                    }
                    if (C0166c.this.mo330a("onServiceConnected")) {
                        C0163h hVar = C0163h.this;
                        hVar.f360i = new C0170j(this.f370b, hVar.f355d);
                        C0163h.this.f361j = new Messenger(C0163h.this.f356e);
                        C0163h hVar2 = C0163h.this;
                        hVar2.f356e.mo307a(hVar2.f361j);
                        C0163h.this.f358g = 2;
                        if (z) {
                            try {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                C0163h.this.mo325c();
                            } catch (RemoteException unused) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + C0163h.this.f353b);
                                if (MediaBrowserCompat.f333b) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0163h.this.mo325c();
                                    return;
                                }
                                return;
                            }
                        }
                        C0163h hVar3 = C0163h.this;
                        hVar3.f360i.mo336b(hVar3.f352a, hVar3.f361j);
                    }
                }
            }

            /* renamed from: android.support.v4.media.MediaBrowserCompat$h$c$b */
            class C0168b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ ComponentName f372a;

                C0168b(ComponentName componentName) {
                    this.f372a = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f333b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.f372a + " this=" + this + " mServiceConnection=" + C0163h.this.f359h);
                        C0163h.this.mo325c();
                    }
                    if (C0166c.this.mo330a("onServiceDisconnected")) {
                        C0163h hVar = C0163h.this;
                        hVar.f360i = null;
                        hVar.f361j = null;
                        hVar.f356e.mo307a((Messenger) null);
                        C0163h hVar2 = C0163h.this;
                        hVar2.f358g = 4;
                        hVar2.f354c.mo311c();
                    }
                }
            }

            C0166c() {
            }

            /* renamed from: b */
            private void m651b(Runnable runnable) {
                if (Thread.currentThread() == C0163h.this.f356e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0163h.this.f356e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo330a(String str) {
                int i;
                C0163h hVar = C0163h.this;
                if (hVar.f359h == this && (i = hVar.f358g) != 0 && i != 1) {
                    return true;
                }
                int i2 = hVar.f358g;
                if (i2 == 0 || i2 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + C0163h.this.f353b + " with mServiceConnection=" + C0163h.this.f359h + " this=" + this);
                return false;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                m651b(new C0167a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                m651b(new C0168b(componentName));
            }
        }

        public C0163h(Context context, ComponentName componentName, C0156c cVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (cVar != null) {
                this.f352a = context;
                this.f353b = componentName;
                this.f354c = cVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f355d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: i */
        private static String m640i(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i;
        }

        /* renamed from: k */
        private boolean m641k(Messenger messenger, String str) {
            int i;
            if (this.f361j == messenger && (i = this.f358g) != 0 && i != 1) {
                return true;
            }
            int i2 = this.f358g;
            if (i2 == 0 || i2 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.f353b + " with mCallbacksMessenger=" + this.f361j + " this=" + this);
            return false;
        }

        /* renamed from: a */
        public void mo322a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m641k(messenger, "onConnect")) {
                if (this.f358g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m640i(this.f358g) + "... ignoring");
                    return;
                }
                this.f362k = str;
                this.f363l = token;
                this.f364m = bundle;
                this.f358g = 3;
                if (MediaBrowserCompat.f333b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    mo325c();
                }
                this.f354c.mo309a();
                try {
                    for (Map.Entry next : this.f357f.entrySet()) {
                        String str2 = (String) next.getKey();
                        C0171k kVar = (C0171k) next.getValue();
                        List<C0172l> b = kVar.mo341b();
                        List<Bundle> c = kVar.mo342c();
                        for (int i = 0; i < b.size(); i++) {
                            this.f360i.mo335a(str2, b.get(i).f379b, c.get(i), this.f361j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        /* renamed from: b */
        public void mo323b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (m641k(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f333b;
                if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f353b + " id=" + str);
                }
                C0171k kVar = this.f357f.get(str);
                if (kVar != null) {
                    C0172l a = kVar.mo340a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo345c(str);
                            return;
                        }
                        this.f365n = bundle2;
                        a.mo343a(str, list);
                        this.f365n = null;
                    } else if (list == null) {
                        a.mo346d(str, bundle);
                    } else {
                        this.f365n = bundle2;
                        a.mo344b(str, list, bundle);
                        this.f365n = null;
                    }
                } else if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo325c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f353b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f354c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f355d);
            Log.d("MediaBrowserCompat", "  mState=" + m640i(this.f358g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f359h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f360i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f361j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f362k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f363l);
        }

        /* renamed from: d */
        public MediaSessionCompat.Token mo319d() {
            if (mo327j()) {
                return this.f363l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f358g + ")");
        }

        /* renamed from: e */
        public void mo320e() {
            this.f358g = 0;
            this.f356e.post(new C0165b());
        }

        /* renamed from: f */
        public void mo321f() {
            int i = this.f358g;
            if (i == 0 || i == 1) {
                this.f358g = 2;
                this.f356e.post(new C0164a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + m640i(this.f358g) + ")");
        }

        /* renamed from: g */
        public void mo324g(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f353b);
            if (m641k(messenger, "onConnectFailed")) {
                if (this.f358g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + m640i(this.f358g) + "... ignoring");
                    return;
                }
                mo326h();
                this.f354c.mo310b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo326h() {
            C0166c cVar = this.f359h;
            if (cVar != null) {
                this.f352a.unbindService(cVar);
            }
            this.f358g = 1;
            this.f359h = null;
            this.f360i = null;
            this.f361j = null;
            this.f356e.mo307a((Messenger) null);
            this.f362k = null;
            this.f363l = null;
        }

        /* renamed from: j */
        public boolean mo327j() {
            return this.f358g == 3;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    interface C0169i {
        /* renamed from: a */
        void mo322a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: b */
        void mo323b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: g */
        void mo324g(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    private static class C0170j {

        /* renamed from: a */
        private Messenger f374a;

        /* renamed from: b */
        private Bundle f375b;

        public C0170j(IBinder iBinder, Bundle bundle) {
            this.f374a = new Messenger(iBinder);
            this.f375b = bundle;
        }

        /* renamed from: e */
        private void m656e(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f374a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo335a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0632f.m2961b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m656e(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo336b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f375b);
            m656e(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo337c(Messenger messenger) throws RemoteException {
            m656e(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo338d(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f375b);
            m656e(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo339f(Messenger messenger) throws RemoteException {
            m656e(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    private static class C0171k {

        /* renamed from: a */
        private final List<C0172l> f376a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f377b = new ArrayList();

        /* renamed from: a */
        public C0172l mo340a(Bundle bundle) {
            for (int i = 0; i < this.f377b.size(); i++) {
                if (C1261c.m5592a(this.f377b.get(i), bundle)) {
                    return this.f376a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0172l> mo341b() {
            return this.f376a;
        }

        /* renamed from: c */
        public List<Bundle> mo342c() {
            return this.f377b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static abstract class C0172l {

        /* renamed from: a */
        final MediaBrowser.SubscriptionCallback f378a;

        /* renamed from: b */
        final IBinder f379b = new Binder();

        /* renamed from: c */
        WeakReference<C0171k> f380c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$a */
        private class C0173a extends MediaBrowser.SubscriptionCallback {
            C0173a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<MediaItem> mo347a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<C0171k> weakReference = C0172l.this.f380c;
                C0171k kVar = weakReference == null ? null : (C0171k) weakReference.get();
                if (kVar == null) {
                    C0172l.this.mo343a(str, MediaItem.m616b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m616b(list);
                List<C0172l> b2 = kVar.mo341b();
                List<Bundle> c = kVar.mo342c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0172l.this.mo343a(str, b);
                    } else {
                        C0172l.this.mo344b(str, mo347a(b, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                C0172l.this.mo345c(str);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$b */
        private class C0174b extends C0173a {
            C0174b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.m809a(bundle);
                C0172l.this.mo344b(str, MediaItem.m616b(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.m809a(bundle);
                C0172l.this.mo346d(str, bundle);
            }
        }

        public C0172l() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                this.f378a = new C0174b();
            } else if (i >= 21) {
                this.f378a = new C0173a();
            } else {
                this.f378a = null;
            }
        }

        /* renamed from: a */
        public void mo343a(String str, List<MediaItem> list) {
        }

        /* renamed from: b */
        public void mo344b(String str, List<MediaItem> list, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo345c(String str) {
        }

        /* renamed from: d */
        public void mo346d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0156c cVar, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f334a = new C0162g(context, componentName, cVar, bundle);
        } else if (i >= 23) {
            this.f334a = new C0161f(context, componentName, cVar, bundle);
        } else if (i >= 21) {
            this.f334a = new C0160e(context, componentName, cVar, bundle);
        } else {
            this.f334a = new C0163h(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo296a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f334a.mo321f();
    }

    /* renamed from: b */
    public void mo297b() {
        this.f334a.mo320e();
    }

    /* renamed from: c */
    public MediaSessionCompat.Token mo298c() {
        return this.f334a.mo319d();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0153a();

        /* renamed from: a */
        private final int f335a;

        /* renamed from: b */
        private final MediaDescriptionCompat f336b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        class C0153a implements Parcelable.Creator<MediaItem> {
            C0153a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo358g())) {
                this.f335a = i;
                this.f336b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m615a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m670a(C0154a.m620a(mediaItem)), C0154a.m621b(mediaItem));
        }

        /* renamed from: b */
        public static List<MediaItem> m616b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m615a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f335a + ", mDescription=" + this.f336b + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f335a);
            this.f336b.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.f335a = parcel.readInt();
            this.f336b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
