package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.p009v4.media.MediaBrowserCompat;
import android.support.p009v4.media.session.C0226b;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0632f;
import androidx.core.util.C0827d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p027d.C3982b;
import p124r.C5413a;

/* renamed from: androidx.media.d */
/* compiled from: MediaBrowserServiceCompat */
public abstract class C1262d extends Service {

    /* renamed from: h */
    static final boolean f3417h = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a */
    private C1270g f3418a;

    /* renamed from: b */
    final C1268f f3419b = new C1268f("android.media.session.MediaController", -1, -1, (Bundle) null, (C1298p) null);

    /* renamed from: c */
    final ArrayList<C1268f> f3420c = new ArrayList<>();

    /* renamed from: d */
    final C5413a<IBinder, C1268f> f3421d = new C5413a<>();

    /* renamed from: e */
    C1268f f3422e;

    /* renamed from: f */
    final C1300r f3423f = new C1300r();

    /* renamed from: g */
    MediaSessionCompat.Token f3424g;

    /* renamed from: androidx.media.d$a */
    /* compiled from: MediaBrowserServiceCompat */
    class C1263a extends C1286m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ C1268f f3425f;

        /* renamed from: g */
        final /* synthetic */ String f3426g;

        /* renamed from: h */
        final /* synthetic */ Bundle f3427h;

        /* renamed from: i */
        final /* synthetic */ Bundle f3428i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1263a(Object obj, C1268f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f3425f = fVar;
            this.f3426g = str;
            this.f3427h = bundle;
            this.f3428i = bundle2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4546e(List<MediaBrowserCompat.MediaItem> list) {
            if (C1262d.this.f3421d.get(this.f3425f.f3443f.asBinder()) == this.f3425f) {
                if ((mo4581b() & 1) != 0) {
                    list = C1262d.this.mo4526b(list, this.f3427h);
                }
                try {
                    this.f3425f.f3443f.mo4607a(this.f3426g, list, this.f3427h, this.f3428i);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f3426g + " package=" + this.f3425f.f3438a);
                }
            } else if (C1262d.f3417h) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f3425f.f3438a + " id=" + this.f3426g);
            }
        }
    }

    /* renamed from: androidx.media.d$b */
    /* compiled from: MediaBrowserServiceCompat */
    class C1264b extends C1286m<MediaBrowserCompat.MediaItem> {

        /* renamed from: f */
        final /* synthetic */ C3982b f3430f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1264b(Object obj, C3982b bVar) {
            super(obj);
            this.f3430f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4546e(MediaBrowserCompat.MediaItem mediaItem) {
            if ((mo4581b() & 2) != 0) {
                this.f3430f.mo17140b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f3430f.mo17140b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$c */
    /* compiled from: MediaBrowserServiceCompat */
    class C1265c extends C1286m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f */
        final /* synthetic */ C3982b f3432f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1265c(Object obj, C3982b bVar) {
            super(obj);
            this.f3432f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4546e(List<MediaBrowserCompat.MediaItem> list) {
            if ((mo4581b() & 4) != 0 || list == null) {
                this.f3432f.mo17140b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f3432f.mo17140b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$d */
    /* compiled from: MediaBrowserServiceCompat */
    class C1266d extends C1286m<Bundle> {

        /* renamed from: f */
        final /* synthetic */ C3982b f3434f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1266d(Object obj, C3982b bVar) {
            super(obj);
            this.f3434f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4550d(Bundle bundle) {
            this.f3434f.mo17140b(-1, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4546e(Bundle bundle) {
            this.f3434f.mo17140b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$e */
    /* compiled from: MediaBrowserServiceCompat */
    public static final class C1267e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f3436a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Bundle f3437b;

        public C1267e(String str, Bundle bundle) {
            if (str != null) {
                this.f3436a = str;
                this.f3437b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        /* renamed from: c */
        public Bundle mo4552c() {
            return this.f3437b;
        }

        /* renamed from: d */
        public String mo4553d() {
            return this.f3436a;
        }
    }

    /* renamed from: androidx.media.d$f */
    /* compiled from: MediaBrowserServiceCompat */
    private class C1268f implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f3438a;

        /* renamed from: b */
        public final int f3439b;

        /* renamed from: c */
        public final int f3440c;

        /* renamed from: d */
        public final C1301e f3441d;

        /* renamed from: e */
        public final Bundle f3442e;

        /* renamed from: f */
        public final C1298p f3443f;

        /* renamed from: g */
        public final HashMap<String, List<C0827d<IBinder, Bundle>>> f3444g = new HashMap<>();

        /* renamed from: h */
        public C1267e f3445h;

        /* renamed from: androidx.media.d$f$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1269a implements Runnable {
            C1269a() {
            }

            public void run() {
                C1268f fVar = C1268f.this;
                C1262d.this.f3421d.remove(fVar.f3443f.asBinder());
            }
        }

        C1268f(String str, int i, int i2, Bundle bundle, C1298p pVar) {
            this.f3438a = str;
            this.f3439b = i;
            this.f3440c = i2;
            this.f3441d = new C1301e(str, i, i2);
            this.f3442e = bundle;
            this.f3443f = pVar;
        }

        public void binderDied() {
            C1262d.this.f3423f.post(new C1269a());
        }
    }

    /* renamed from: androidx.media.d$g */
    /* compiled from: MediaBrowserServiceCompat */
    interface C1270g {
        /* renamed from: a */
        void mo4556a();

        /* renamed from: b */
        IBinder mo4557b(Intent intent);

        /* renamed from: c */
        void mo4558c(String str, Bundle bundle);

        /* renamed from: d */
        void mo4559d(MediaSessionCompat.Token token);
    }

    /* renamed from: androidx.media.d$h */
    /* compiled from: MediaBrowserServiceCompat */
    class C1271h implements C1270g {

        /* renamed from: a */
        final List<Bundle> f3448a = new ArrayList();

        /* renamed from: b */
        MediaBrowserService f3449b;

        /* renamed from: c */
        Messenger f3450c;

        /* renamed from: androidx.media.d$h$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1272a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MediaSessionCompat.Token f3452a;

            C1272a(MediaSessionCompat.Token token) {
                this.f3452a = token;
            }

            public void run() {
                C1271h.this.mo4565j(this.f3452a);
            }
        }

        /* renamed from: androidx.media.d$h$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1273b extends C1286m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C1287n f3454f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1273b(Object obj, C1287n nVar) {
                super(obj);
                this.f3454f = nVar;
            }

            /* renamed from: a */
            public void mo4567a() {
                this.f3454f.mo4586a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void mo4546e(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f3454f.mo4588c(arrayList);
            }
        }

        /* renamed from: androidx.media.d$h$c */
        /* compiled from: MediaBrowserServiceCompat */
        class C1274c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f3456a;

            /* renamed from: b */
            final /* synthetic */ Bundle f3457b;

            C1274c(String str, Bundle bundle) {
                this.f3456a = str;
                this.f3457b = bundle;
            }

            public void run() {
                for (IBinder iBinder : C1262d.this.f3421d.keySet()) {
                    C5413a<IBinder, C1268f> aVar = C1262d.this.f3421d;
                    C1271h.this.mo4561f(aVar.get(iBinder), this.f3456a, this.f3457b);
                }
            }
        }

        /* renamed from: androidx.media.d$h$d */
        /* compiled from: MediaBrowserServiceCompat */
        class C1275d extends MediaBrowserService {
            C1275d(Context context) {
                attachBaseContext(context);
            }

            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.m809a(bundle);
                C1271h hVar = C1271h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                C1267e h = hVar.mo4563h(str, i, bundle2);
                if (h == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(h.f3436a, h.f3437b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                C1271h.this.mo4564i(str, new C1287n(result));
            }
        }

        C1271h() {
        }

        /* renamed from: a */
        public void mo4556a() {
            C1275d dVar = new C1275d(C1262d.this);
            this.f3449b = dVar;
            dVar.onCreate();
        }

        /* renamed from: b */
        public IBinder mo4557b(Intent intent) {
            return this.f3449b.onBind(intent);
        }

        /* renamed from: c */
        public void mo4558c(String str, Bundle bundle) {
            mo4562g(str, bundle);
            mo4560e(str, bundle);
        }

        /* renamed from: d */
        public void mo4559d(MediaSessionCompat.Token token) {
            C1262d.this.f3423f.mo4611a(new C1272a(token));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4560e(String str, Bundle bundle) {
            C1262d.this.f3423f.post(new C1274c(str, bundle));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4561f(C1268f fVar, String str, Bundle bundle) {
            List<C0827d> list = fVar.f3444g.get(str);
            if (list != null) {
                for (C0827d dVar : list) {
                    if (C1261c.m5593b(bundle, (Bundle) dVar.f2439b)) {
                        C1262d.this.mo4539n(str, fVar, (Bundle) dVar.f2439b, bundle);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4562g(String str, Bundle bundle) {
            this.f3449b.notifyChildrenChanged(str);
        }

        /* renamed from: h */
        public C1267e mo4563h(String str, int i, Bundle bundle) {
            int i2;
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i2 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.f3450c = new Messenger(C1262d.this.f3423f);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                C0632f.m2961b(bundle2, "extra_messenger", this.f3450c.getBinder());
                MediaSessionCompat.Token token = C1262d.this.f3424g;
                if (token != null) {
                    C0226b d = token.mo495d();
                    if (d == null) {
                        iBinder = null;
                    } else {
                        iBinder = d.asBinder();
                    }
                    C0632f.m2961b(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.f3448a.add(bundle2);
                }
                int i3 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i2 = i3;
            }
            C1268f fVar = new C1268f(str, i2, i, bundle, (C1298p) null);
            C1262d dVar = C1262d.this;
            dVar.f3422e = fVar;
            C1267e f = dVar.mo4531f(str, i, bundle);
            C1262d dVar2 = C1262d.this;
            dVar2.f3422e = null;
            if (f == null) {
                return null;
            }
            if (this.f3450c != null) {
                dVar2.f3420c.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = f.mo4552c();
            } else if (f.mo4552c() != null) {
                bundle2.putAll(f.mo4552c());
            }
            return new C1267e(f.mo4553d(), bundle2);
        }

        /* renamed from: i */
        public void mo4564i(String str, C1287n<List<Parcel>> nVar) {
            C1273b bVar = new C1273b(str, nVar);
            C1262d dVar = C1262d.this;
            dVar.f3422e = dVar.f3419b;
            dVar.mo4532g(str, bVar);
            C1262d.this.f3422e = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4565j(MediaSessionCompat.Token token) {
            if (!this.f3448a.isEmpty()) {
                C0226b d = token.mo495d();
                if (d != null) {
                    for (Bundle b : this.f3448a) {
                        C0632f.m2961b(b, "extra_session_binder", d.asBinder());
                    }
                }
                this.f3448a.clear();
            }
            this.f3449b.setSessionToken((MediaSession.Token) token.mo499f());
        }
    }

    /* renamed from: androidx.media.d$i */
    /* compiled from: MediaBrowserServiceCompat */
    class C1276i extends C1271h {

        /* renamed from: androidx.media.d$i$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1277a extends C1286m<MediaBrowserCompat.MediaItem> {

            /* renamed from: f */
            final /* synthetic */ C1287n f3461f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1277a(Object obj, C1287n nVar) {
                super(obj);
                this.f3461f = nVar;
            }

            /* renamed from: a */
            public void mo4567a() {
                this.f3461f.mo4586a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void mo4546e(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f3461f.mo4588c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f3461f.mo4588c(obtain);
            }
        }

        /* renamed from: androidx.media.d$i$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1278b extends C1271h.C1275d {
            C1278b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                C1276i.this.mo4572k(str, new C1287n(result));
            }
        }

        C1276i() {
            super();
        }

        /* renamed from: a */
        public void mo4556a() {
            C1278b bVar = new C1278b(C1262d.this);
            this.f3449b = bVar;
            bVar.onCreate();
        }

        /* renamed from: k */
        public void mo4572k(String str, C1287n<Parcel> nVar) {
            C1277a aVar = new C1277a(str, nVar);
            C1262d dVar = C1262d.this;
            dVar.f3422e = dVar.f3419b;
            dVar.mo4534i(str, aVar);
            C1262d.this.f3422e = null;
        }
    }

    /* renamed from: androidx.media.d$j */
    /* compiled from: MediaBrowserServiceCompat */
    class C1279j extends C1276i {

        /* renamed from: androidx.media.d$j$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1280a extends C1286m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f */
            final /* synthetic */ C1287n f3465f;

            /* renamed from: g */
            final /* synthetic */ Bundle f3466g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1280a(Object obj, C1287n nVar, Bundle bundle) {
                super(obj);
                this.f3465f = nVar;
                this.f3466g = bundle;
            }

            /* renamed from: a */
            public void mo4567a() {
                this.f3465f.mo4586a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void mo4546e(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f3465f.mo4588c(null);
                    return;
                }
                if ((mo4581b() & 1) != 0) {
                    list = C1262d.this.mo4526b(list, this.f3466g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                    Parcel obtain = Parcel.obtain();
                    writeToParcel.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f3465f.mo4588c(arrayList);
            }
        }

        /* renamed from: androidx.media.d$j$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1281b extends C1276i.C1278b {
            C1281b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.m809a(bundle);
                C1279j jVar = C1279j.this;
                C1262d dVar = C1262d.this;
                dVar.f3422e = dVar.f3419b;
                jVar.mo4575l(str, new C1287n(result), bundle);
                C1262d.this.f3422e = null;
            }
        }

        C1279j() {
            super();
        }

        /* renamed from: a */
        public void mo4556a() {
            C1281b bVar = new C1281b(C1262d.this);
            this.f3449b = bVar;
            bVar.onCreate();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4562g(String str, Bundle bundle) {
            if (bundle != null) {
                this.f3449b.notifyChildrenChanged(str, bundle);
            } else {
                super.mo4562g(str, bundle);
            }
        }

        /* renamed from: l */
        public void mo4575l(String str, C1287n<List<Parcel>> nVar, Bundle bundle) {
            C1280a aVar = new C1280a(str, nVar, bundle);
            C1262d dVar = C1262d.this;
            dVar.f3422e = dVar.f3419b;
            dVar.mo4533h(str, aVar, bundle);
            C1262d.this.f3422e = null;
        }
    }

    /* renamed from: androidx.media.d$k */
    /* compiled from: MediaBrowserServiceCompat */
    class C1282k extends C1279j {
        C1282k() {
            super();
        }
    }

    /* renamed from: androidx.media.d$l */
    /* compiled from: MediaBrowserServiceCompat */
    class C1283l implements C1270g {

        /* renamed from: a */
        private Messenger f3470a;

        /* renamed from: androidx.media.d$l$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1284a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MediaSessionCompat.Token f3472a;

            C1284a(MediaSessionCompat.Token token) {
                this.f3472a = token;
            }

            public void run() {
                Iterator<C1268f> it = C1262d.this.f3421d.values().iterator();
                while (it.hasNext()) {
                    C1268f next = it.next();
                    try {
                        next.f3443f.mo4610c(next.f3445h.mo4553d(), this.f3472a, next.f3445h.mo4552c());
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Connection for " + next.f3438a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: androidx.media.d$l$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1285b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f3474a;

            /* renamed from: b */
            final /* synthetic */ Bundle f3475b;

            C1285b(String str, Bundle bundle) {
                this.f3474a = str;
                this.f3475b = bundle;
            }

            public void run() {
                for (IBinder iBinder : C1262d.this.f3421d.keySet()) {
                    C5413a<IBinder, C1268f> aVar = C1262d.this.f3421d;
                    C1283l.this.mo4578e(aVar.get(iBinder), this.f3474a, this.f3475b);
                }
            }
        }

        C1283l() {
        }

        /* renamed from: a */
        public void mo4556a() {
            this.f3470a = new Messenger(C1262d.this.f3423f);
        }

        /* renamed from: b */
        public IBinder mo4557b(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f3470a.getBinder();
            }
            return null;
        }

        /* renamed from: c */
        public void mo4558c(String str, Bundle bundle) {
            C1262d.this.f3423f.post(new C1285b(str, bundle));
        }

        /* renamed from: d */
        public void mo4559d(MediaSessionCompat.Token token) {
            C1262d.this.f3423f.post(new C1284a(token));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4578e(C1268f fVar, String str, Bundle bundle) {
            List<C0827d> list = fVar.f3444g.get(str);
            if (list != null) {
                for (C0827d dVar : list) {
                    if (C1261c.m5593b(bundle, (Bundle) dVar.f2439b)) {
                        C1262d.this.mo4539n(str, fVar, (Bundle) dVar.f2439b, bundle);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.media.d$m */
    /* compiled from: MediaBrowserServiceCompat */
    public static class C1286m<T> {

        /* renamed from: a */
        private final Object f3477a;

        /* renamed from: b */
        private boolean f3478b;

        /* renamed from: c */
        private boolean f3479c;

        /* renamed from: d */
        private boolean f3480d;

        /* renamed from: e */
        private int f3481e;

        C1286m(Object obj) {
            this.f3477a = obj;
        }

        /* renamed from: a */
        public void mo4567a() {
            if (this.f3478b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f3477a);
            } else if (this.f3479c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f3477a);
            } else if (!this.f3480d) {
                this.f3478b = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f3477a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4581b() {
            return this.f3481e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4582c() {
            return this.f3478b || this.f3479c || this.f3480d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4550d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f3477a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4546e(T t) {
            throw null;
        }

        /* renamed from: f */
        public void mo4583f(Bundle bundle) {
            if (this.f3479c || this.f3480d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f3477a);
            }
            this.f3480d = true;
            mo4550d(bundle);
        }

        /* renamed from: g */
        public void mo4584g(T t) {
            if (this.f3479c || this.f3480d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f3477a);
            }
            this.f3479c = true;
            mo4546e(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4585h(int i) {
            this.f3481e = i;
        }
    }

    /* renamed from: androidx.media.d$n */
    /* compiled from: MediaBrowserServiceCompat */
    static class C1287n<T> {

        /* renamed from: a */
        MediaBrowserService.Result f3482a;

        C1287n(MediaBrowserService.Result result) {
            this.f3482a = result;
        }

        /* renamed from: a */
        public void mo4586a() {
            this.f3482a.detach();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<MediaBrowser.MediaItem> mo4587b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: c */
        public void mo4588c(T t) {
            if (t instanceof List) {
                this.f3482a.sendResult(mo4587b((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f3482a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f3482a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: androidx.media.d$o */
    /* compiled from: MediaBrowserServiceCompat */
    private class C1288o {

        /* renamed from: androidx.media.d$o$a */
        /* compiled from: MediaBrowserServiceCompat */
        class C1289a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3484a;

            /* renamed from: b */
            final /* synthetic */ String f3485b;

            /* renamed from: c */
            final /* synthetic */ int f3486c;

            /* renamed from: d */
            final /* synthetic */ int f3487d;

            /* renamed from: e */
            final /* synthetic */ Bundle f3488e;

            C1289a(C1298p pVar, String str, int i, int i2, Bundle bundle) {
                this.f3484a = pVar;
                this.f3485b = str;
                this.f3486c = i;
                this.f3487d = i2;
                this.f3488e = bundle;
            }

            public void run() {
                IBinder asBinder = this.f3484a.asBinder();
                C1262d.this.f3421d.remove(asBinder);
                C1268f fVar = new C1268f(this.f3485b, this.f3486c, this.f3487d, this.f3488e, this.f3484a);
                C1262d dVar = C1262d.this;
                dVar.f3422e = fVar;
                C1267e f = dVar.mo4531f(this.f3485b, this.f3487d, this.f3488e);
                fVar.f3445h = f;
                C1262d dVar2 = C1262d.this;
                dVar2.f3422e = null;
                if (f == null) {
                    Log.i("MBServiceCompat", "No root for client " + this.f3485b + " from service " + getClass().getName());
                    try {
                        this.f3484a.mo4609b();
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f3485b);
                    }
                } else {
                    try {
                        dVar2.f3421d.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (C1262d.this.f3424g != null) {
                            this.f3484a.mo4610c(fVar.f3445h.mo4553d(), C1262d.this.f3424g, fVar.f3445h.mo4552c());
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f3485b);
                        C1262d.this.f3421d.remove(asBinder);
                    }
                }
            }
        }

        /* renamed from: androidx.media.d$o$b */
        /* compiled from: MediaBrowserServiceCompat */
        class C1290b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3490a;

            C1290b(C1298p pVar) {
                this.f3490a = pVar;
            }

            public void run() {
                C1268f remove = C1262d.this.f3421d.remove(this.f3490a.asBinder());
                if (remove != null) {
                    remove.f3443f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.d$o$c */
        /* compiled from: MediaBrowserServiceCompat */
        class C1291c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3492a;

            /* renamed from: b */
            final /* synthetic */ String f3493b;

            /* renamed from: c */
            final /* synthetic */ IBinder f3494c;

            /* renamed from: d */
            final /* synthetic */ Bundle f3495d;

            C1291c(C1298p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.f3492a = pVar;
                this.f3493b = str;
                this.f3494c = iBinder;
                this.f3495d = bundle;
            }

            public void run() {
                C1268f fVar = C1262d.this.f3421d.get(this.f3492a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f3493b);
                    return;
                }
                C1262d.this.mo4525a(this.f3493b, fVar, this.f3494c, this.f3495d);
            }
        }

        /* renamed from: androidx.media.d$o$d */
        /* compiled from: MediaBrowserServiceCompat */
        class C1292d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3497a;

            /* renamed from: b */
            final /* synthetic */ String f3498b;

            /* renamed from: c */
            final /* synthetic */ IBinder f3499c;

            C1292d(C1298p pVar, String str, IBinder iBinder) {
                this.f3497a = pVar;
                this.f3498b = str;
                this.f3499c = iBinder;
            }

            public void run() {
                C1268f fVar = C1262d.this.f3421d.get(this.f3497a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f3498b);
                } else if (!C1262d.this.mo4544q(this.f3498b, fVar, this.f3499c)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f3498b + " which is not subscribed");
                }
            }
        }

        /* renamed from: androidx.media.d$o$e */
        /* compiled from: MediaBrowserServiceCompat */
        class C1293e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3501a;

            /* renamed from: b */
            final /* synthetic */ String f3502b;

            /* renamed from: c */
            final /* synthetic */ C3982b f3503c;

            C1293e(C1298p pVar, String str, C3982b bVar) {
                this.f3501a = pVar;
                this.f3502b = str;
                this.f3503c = bVar;
            }

            public void run() {
                C1268f fVar = C1262d.this.f3421d.get(this.f3501a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f3502b);
                    return;
                }
                C1262d.this.mo4540o(this.f3502b, fVar, this.f3503c);
            }
        }

        /* renamed from: androidx.media.d$o$f */
        /* compiled from: MediaBrowserServiceCompat */
        class C1294f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3505a;

            /* renamed from: b */
            final /* synthetic */ int f3506b;

            /* renamed from: c */
            final /* synthetic */ String f3507c;

            /* renamed from: d */
            final /* synthetic */ int f3508d;

            /* renamed from: e */
            final /* synthetic */ Bundle f3509e;

            C1294f(C1298p pVar, int i, String str, int i2, Bundle bundle) {
                this.f3505a = pVar;
                this.f3506b = i;
                this.f3507c = str;
                this.f3508d = i2;
                this.f3509e = bundle;
            }

            public void run() {
                C1268f fVar;
                IBinder asBinder = this.f3505a.asBinder();
                C1262d.this.f3421d.remove(asBinder);
                Iterator<C1268f> it = C1262d.this.f3420c.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C1268f next = it.next();
                    if (next.f3440c == this.f3506b) {
                        if (TextUtils.isEmpty(this.f3507c) || this.f3508d <= 0) {
                            fVar = new C1268f(next.f3438a, next.f3439b, next.f3440c, this.f3509e, this.f3505a);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new C1268f(this.f3507c, this.f3508d, this.f3506b, this.f3509e, this.f3505a);
                }
                C1262d.this.f3421d.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* renamed from: androidx.media.d$o$g */
        /* compiled from: MediaBrowserServiceCompat */
        class C1295g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3511a;

            C1295g(C1298p pVar) {
                this.f3511a = pVar;
            }

            public void run() {
                IBinder asBinder = this.f3511a.asBinder();
                C1268f remove = C1262d.this.f3421d.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: androidx.media.d$o$h */
        /* compiled from: MediaBrowserServiceCompat */
        class C1296h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3513a;

            /* renamed from: b */
            final /* synthetic */ String f3514b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3515c;

            /* renamed from: d */
            final /* synthetic */ C3982b f3516d;

            C1296h(C1298p pVar, String str, Bundle bundle, C3982b bVar) {
                this.f3513a = pVar;
                this.f3514b = str;
                this.f3515c = bundle;
                this.f3516d = bVar;
            }

            public void run() {
                C1268f fVar = C1262d.this.f3421d.get(this.f3513a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f3514b);
                    return;
                }
                C1262d.this.mo4543p(this.f3514b, this.f3515c, fVar, this.f3516d);
            }
        }

        /* renamed from: androidx.media.d$o$i */
        /* compiled from: MediaBrowserServiceCompat */
        class C1297i implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1298p f3518a;

            /* renamed from: b */
            final /* synthetic */ String f3519b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3520c;

            /* renamed from: d */
            final /* synthetic */ C3982b f3521d;

            C1297i(C1298p pVar, String str, Bundle bundle, C3982b bVar) {
                this.f3518a = pVar;
                this.f3519b = str;
                this.f3520c = bundle;
                this.f3521d = bVar;
            }

            public void run() {
                C1268f fVar = C1262d.this.f3421d.get(this.f3518a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f3519b + ", extras=" + this.f3520c);
                    return;
                }
                C1262d.this.mo4538m(this.f3519b, this.f3520c, fVar, this.f3521d);
            }
        }

        C1288o() {
        }

        /* renamed from: a */
        public void mo4589a(String str, IBinder iBinder, Bundle bundle, C1298p pVar) {
            C1262d.this.f3423f.mo4611a(new C1291c(pVar, str, iBinder, bundle));
        }

        /* renamed from: b */
        public void mo4590b(String str, int i, int i2, Bundle bundle, C1298p pVar) {
            if (C1262d.this.mo4527c(str, i2)) {
                C1262d.this.f3423f.mo4611a(new C1289a(pVar, str, i, i2, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + str);
        }

        /* renamed from: c */
        public void mo4591c(C1298p pVar) {
            C1262d.this.f3423f.mo4611a(new C1290b(pVar));
        }

        /* renamed from: d */
        public void mo4592d(String str, C3982b bVar, C1298p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                C1262d.this.f3423f.mo4611a(new C1293e(pVar, str, bVar));
            }
        }

        /* renamed from: e */
        public void mo4593e(C1298p pVar, String str, int i, int i2, Bundle bundle) {
            C1262d.this.f3423f.mo4611a(new C1294f(pVar, i2, str, i, bundle));
        }

        /* renamed from: f */
        public void mo4594f(String str, IBinder iBinder, C1298p pVar) {
            C1262d.this.f3423f.mo4611a(new C1292d(pVar, str, iBinder));
        }

        /* renamed from: g */
        public void mo4595g(String str, Bundle bundle, C3982b bVar, C1298p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                C1262d.this.f3423f.mo4611a(new C1296h(pVar, str, bundle, bVar));
            }
        }

        /* renamed from: h */
        public void mo4596h(String str, Bundle bundle, C3982b bVar, C1298p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                C1262d.this.f3423f.mo4611a(new C1297i(pVar, str, bundle, bVar));
            }
        }

        /* renamed from: i */
        public void mo4597i(C1298p pVar) {
            C1262d.this.f3423f.mo4611a(new C1295g(pVar));
        }
    }

    /* renamed from: androidx.media.d$p */
    /* compiled from: MediaBrowserServiceCompat */
    private interface C1298p {
        /* renamed from: a */
        void mo4607a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo4609b() throws RemoteException;

        /* renamed from: c */
        void mo4610c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* renamed from: androidx.media.d$q */
    /* compiled from: MediaBrowserServiceCompat */
    private static class C1299q implements C1298p {

        /* renamed from: a */
        final Messenger f3523a;

        C1299q(Messenger messenger) {
            this.f3523a = messenger;
        }

        /* renamed from: d */
        private void m5681d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f3523a.send(obtain);
        }

        /* renamed from: a */
        public void mo4607a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m5681d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f3523a.getBinder();
        }

        /* renamed from: b */
        public void mo4609b() throws RemoteException {
            m5681d(2, (Bundle) null);
        }

        /* renamed from: c */
        public void mo4610c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m5681d(1, bundle2);
        }
    }

    /* renamed from: androidx.media.d$r */
    /* compiled from: MediaBrowserServiceCompat */
    private final class C1300r extends Handler {

        /* renamed from: a */
        private final C1288o f3524a;

        C1300r() {
            this.f3524a = new C1288o();
        }

        /* renamed from: a */
        public void mo4611a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m809a(bundle);
                    this.f3524a.mo4590b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new C1299q(message.replyTo));
                    return;
                case 2:
                    this.f3524a.mo4591c(new C1299q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m809a(bundle2);
                    this.f3524a.mo4589a(data.getString("data_media_item_id"), C0632f.m2960a(data, "data_callback_token"), bundle2, new C1299q(message.replyTo));
                    return;
                case 4:
                    this.f3524a.mo4594f(data.getString("data_media_item_id"), C0632f.m2960a(data, "data_callback_token"), new C1299q(message.replyTo));
                    return;
                case 5:
                    this.f3524a.mo4592d(data.getString("data_media_item_id"), (C3982b) data.getParcelable("data_result_receiver"), new C1299q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m809a(bundle3);
                    C1288o oVar = this.f3524a;
                    C1299q qVar = new C1299q(message.replyTo);
                    oVar.mo4593e(qVar, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f3524a.mo4597i(new C1299q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m809a(bundle4);
                    this.f3524a.mo4595g(data.getString("data_search_query"), bundle4, (C3982b) data.getParcelable("data_result_receiver"), new C1299q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m809a(bundle5);
                    this.f3524a.mo4596h(data.getString("data_custom_action"), bundle5, (C3982b) data.getParcelable("data_result_receiver"), new C1299q(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4525a(String str, C1268f fVar, IBinder iBinder, Bundle bundle) {
        List<C0827d> list = fVar.f3444g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0827d dVar : list) {
            if (iBinder == dVar.f2438a && C1261c.m5592a(bundle, (Bundle) dVar.f2439b)) {
                return;
            }
        }
        list.add(new C0827d(iBinder, bundle));
        fVar.f3444g.put(str, list);
        mo4539n(str, fVar, bundle, (Bundle) null);
        this.f3422e = fVar;
        mo4536k(str, bundle);
        this.f3422e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<MediaBrowserCompat.MediaItem> mo4526b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4527c(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo4528d(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f3418a.mo4558c(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public void mo4530e(String str, Bundle bundle, C1286m<Bundle> mVar) {
        mVar.mo4583f((Bundle) null);
    }

    /* renamed from: f */
    public abstract C1267e mo4531f(String str, int i, Bundle bundle);

    /* renamed from: g */
    public abstract void mo4532g(String str, C1286m<List<MediaBrowserCompat.MediaItem>> mVar);

    /* renamed from: h */
    public void mo4533h(String str, C1286m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.mo4585h(1);
        mo4532g(str, mVar);
    }

    /* renamed from: i */
    public void mo4534i(String str, C1286m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.mo4585h(2);
        mVar.mo4584g(null);
    }

    /* renamed from: j */
    public void mo4535j(String str, Bundle bundle, C1286m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.mo4585h(4);
        mVar.mo4584g(null);
    }

    /* renamed from: k */
    public void mo4536k(String str, Bundle bundle) {
    }

    /* renamed from: l */
    public void mo4537l(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4538m(String str, Bundle bundle, C1268f fVar, C3982b bVar) {
        C1266d dVar = new C1266d(str, bVar);
        this.f3422e = fVar;
        mo4530e(str, bundle, dVar);
        this.f3422e = null;
        if (!dVar.mo4582c()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4539n(String str, C1268f fVar, Bundle bundle, Bundle bundle2) {
        C1263a aVar = new C1263a(str, fVar, str, bundle, bundle2);
        this.f3422e = fVar;
        if (bundle == null) {
            mo4532g(str, aVar);
        } else {
            mo4533h(str, aVar, bundle);
        }
        this.f3422e = null;
        if (!aVar.mo4582c()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f3438a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4540o(String str, C1268f fVar, C3982b bVar) {
        C1264b bVar2 = new C1264b(str, bVar);
        this.f3422e = fVar;
        mo4534i(str, bVar2);
        this.f3422e = null;
        if (!bVar2.mo4582c()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f3418a.mo4557b(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f3418a = new C1282k();
        } else if (i >= 26) {
            this.f3418a = new C1279j();
        } else if (i >= 23) {
            this.f3418a = new C1276i();
        } else if (i >= 21) {
            this.f3418a = new C1271h();
        } else {
            this.f3418a = new C1283l();
        }
        this.f3418a.mo4556a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4543p(String str, Bundle bundle, C1268f fVar, C3982b bVar) {
        C1265c cVar = new C1265c(str, bVar);
        this.f3422e = fVar;
        mo4535j(str, bundle, cVar);
        this.f3422e = null;
        if (!cVar.mo4582c()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4544q(String str, C1268f fVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (fVar.f3444g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f3422e = fVar;
                mo4537l(str);
                this.f3422e = null;
            }
        } else {
            List list = fVar.f3444g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0827d) it.next()).f2438a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f3444g.remove(str);
                }
            }
            this.f3422e = fVar;
            mo4537l(str);
            this.f3422e = null;
            return z2;
        }
    }

    /* renamed from: r */
    public void mo4545r(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.f3424g == null) {
            this.f3424g = token;
            this.f3418a.mo4559d(token);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }
}
