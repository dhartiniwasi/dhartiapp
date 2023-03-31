package com.ryanheise.audioservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.support.p009v4.media.MediaBrowserCompat;
import android.support.p009v4.media.MediaDescriptionCompat;
import android.support.p009v4.media.MediaMetadataCompat;
import android.support.p009v4.media.RatingCompat;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.support.p009v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.view.KeyEvent;
import androidx.core.app.C0651l;
import androidx.core.content.C0681a;
import androidx.media.C1262d;
import androidx.media.C1308l;
import androidx.media.app.C1258c;
import com.facebook.ads.AdError;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p069j0.C4713a;
import p264io.flutter.embedding.engine.C10685a;
import p341ra.C12263a;
import p341ra.C12264b;
import p341ra.C12265c;
import p341ra.C12267e;
import p341ra.C12268f;

public class AudioService extends C1262d {

    /* renamed from: J */
    static AudioService f36288J;

    /* renamed from: K */
    private static PendingIntent f36289K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static C8795e f36290L;

    /* renamed from: M */
    private static List<MediaSessionCompat.QueueItem> f36291M = new ArrayList();

    /* renamed from: N */
    private static final Map<String, MediaMetadataCompat> f36292N = new HashMap();

    /* renamed from: A */
    private String f36293A;

    /* renamed from: B */
    private LruCache<String, Bitmap> f36294B;

    /* renamed from: C */
    private boolean f36295C = false;

    /* renamed from: D */
    private C12263a f36296D = C12263a.idle;

    /* renamed from: E */
    private int f36297E;

    /* renamed from: F */
    private int f36298F;

    /* renamed from: G */
    private boolean f36299G;

    /* renamed from: H */
    private final Handler f36300H = new Handler(Looper.getMainLooper());

    /* renamed from: I */
    private C1308l f36301I;

    /* renamed from: i */
    private C10685a f36302i;

    /* renamed from: r */
    private C12265c f36303r;

    /* renamed from: s */
    private PowerManager.WakeLock f36304s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public MediaSessionCompat f36305t;

    /* renamed from: u */
    private C8794d f36306u;

    /* renamed from: v */
    private List<C12268f> f36307v = new ArrayList();

    /* renamed from: w */
    private List<C0651l.C0652a> f36308w = new ArrayList();

    /* renamed from: x */
    private int[] f36309x;

    /* renamed from: y */
    private MediaMetadataCompat f36310y;

    /* renamed from: z */
    private Bitmap f36311z;

    /* renamed from: com.ryanheise.audioservice.AudioService$a */
    class C8791a extends LruCache<String, Bitmap> {
        C8791a(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    /* renamed from: com.ryanheise.audioservice.AudioService$b */
    class C8792b extends C1308l {
        C8792b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        /* renamed from: e */
        public void mo4622e(int i) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29007D(i);
            }
        }

        /* renamed from: f */
        public void mo4623f(int i) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29017i(i);
            }
        }
    }

    /* renamed from: com.ryanheise.audioservice.AudioService$c */
    static /* synthetic */ class C8793c {

        /* renamed from: a */
        static final /* synthetic */ int[] f36314a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ra.a[] r0 = p341ra.C12263a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36314a = r0
                ra.a r1 = p341ra.C12263a.idle     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36314a     // Catch:{ NoSuchFieldError -> 0x001d }
                ra.a r1 = p341ra.C12263a.loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36314a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ra.a r1 = p341ra.C12263a.buffering     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36314a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ra.a r1 = p341ra.C12263a.ready     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36314a     // Catch:{ NoSuchFieldError -> 0x003e }
                ra.a r1 = p341ra.C12263a.completed     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36314a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ra.a r1 = p341ra.C12263a.error     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.C8793c.<clinit>():void");
        }
    }

    /* renamed from: com.ryanheise.audioservice.AudioService$d */
    public class C8794d extends MediaSessionCompat.C0197b {
        public C8794d() {
        }

        /* renamed from: E */
        private C12267e m48062E(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                return C12267e.media;
            }
            if (keyCode == 87) {
                return C12267e.next;
            }
            if (keyCode != 88) {
                return C12267e.media;
            }
            return C12267e.previous;
        }

        /* renamed from: A */
        public void mo509A() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29030r();
            }
        }

        /* renamed from: B */
        public void mo510B(long j) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29020l(j);
            }
        }

        /* renamed from: C */
        public void mo511C() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.onStop();
            }
        }

        /* renamed from: b */
        public void mo514b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29019k(AudioService.m48023I(mediaDescriptionCompat.mo358g()));
            }
        }

        /* renamed from: c */
        public void mo515c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29036x(AudioService.m48023I(mediaDescriptionCompat.mo358g()), i);
            }
        }

        /* renamed from: e */
        public void mo517e(String str, Bundle bundle) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29005B(str, bundle);
            }
        }

        /* renamed from: f */
        public void mo518f() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29038z();
            }
        }

        /* renamed from: g */
        public boolean mo519g(Intent intent) {
            if (AudioService.f36290L == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    mo520h();
                    return true;
                } else if (!(keyCode == 126 || keyCode == 127)) {
                    switch (keyCode) {
                        case C8710R.styleable.AppCompatTheme_listPreferredItemPaddingStart:
                        case C8710R.styleable.AppCompatTheme_panelMenuListTheme:
                        case C8710R.styleable.AppCompatTheme_panelMenuListWidth:
                            break;
                        case 86:
                            mo511C();
                            return true;
                        case C8710R.styleable.AppCompatTheme_popupMenuStyle:
                            mo530r();
                            return true;
                        case C8710R.styleable.AppCompatTheme_popupWindowStyle:
                            mo518f();
                            return true;
                        case C8710R.styleable.AppCompatTheme_radioButtonStyle:
                            mo521i();
                            return true;
                        default:
                            return true;
                    }
                }
            }
            AudioService.f36290L.mo29028p(m48062E(keyEvent));
            return true;
        }

        /* renamed from: h */
        public void mo520h() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.onPause();
            }
        }

        /* renamed from: i */
        public void mo521i() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29022n();
            }
        }

        /* renamed from: j */
        public void mo522j(String str, Bundle bundle) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29037y(str, bundle);
            }
        }

        /* renamed from: k */
        public void mo523k(String str, Bundle bundle) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29035w(str, bundle);
            }
        }

        /* renamed from: l */
        public void mo524l(Uri uri, Bundle bundle) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29008E(uri, bundle);
            }
        }

        /* renamed from: m */
        public void mo525m() {
            if (AudioService.f36290L != null) {
                if (!AudioService.this.f36305t.mo463e()) {
                    AudioService.this.f36305t.mo465g(true);
                }
                AudioService.f36290L.mo29032t();
            }
        }

        /* renamed from: n */
        public void mo526n(String str, Bundle bundle) {
            if (AudioService.f36290L != null) {
                if (!AudioService.this.f36305t.mo463e()) {
                    AudioService.this.f36305t.mo465g(true);
                }
                AudioService.f36290L.mo29029q(str, bundle);
            }
        }

        /* renamed from: o */
        public void mo527o(String str, Bundle bundle) {
            if (AudioService.f36290L != null) {
                if (!AudioService.this.f36305t.mo463e()) {
                    AudioService.this.f36305t.mo465g(true);
                }
                AudioService.f36290L.mo29006C(str, bundle);
            }
        }

        /* renamed from: p */
        public void mo528p(Uri uri, Bundle bundle) {
            if (AudioService.f36290L != null) {
                if (!AudioService.this.f36305t.mo463e()) {
                    AudioService.this.f36305t.mo465g(true);
                }
                AudioService.f36290L.mo29033u(uri, bundle);
            }
        }

        /* renamed from: q */
        public void mo529q(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29031s(AudioService.m48023I(mediaDescriptionCompat.mo358g()));
            }
        }

        /* renamed from: r */
        public void mo530r() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29016h();
            }
        }

        /* renamed from: s */
        public void mo531s(long j) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29004A(j);
            }
        }

        /* renamed from: t */
        public void mo532t(boolean z) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29023o(z);
            }
        }

        /* renamed from: u */
        public void mo533u(float f) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29015g(f);
            }
        }

        /* renamed from: v */
        public void mo534v(RatingCompat ratingCompat) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29034v(ratingCompat);
            }
        }

        /* renamed from: w */
        public void mo535w(RatingCompat ratingCompat, Bundle bundle) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29021m(ratingCompat, bundle);
            }
        }

        /* renamed from: x */
        public void mo536x(int i) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29009a(i);
            }
        }

        /* renamed from: y */
        public void mo537y(int i) {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29010b(i);
            }
        }

        /* renamed from: z */
        public void mo538z() {
            if (AudioService.f36290L != null) {
                AudioService.f36290L.mo29014f();
            }
        }
    }

    /* renamed from: com.ryanheise.audioservice.AudioService$e */
    public interface C8795e {
        /* renamed from: A */
        void mo29004A(long j);

        /* renamed from: B */
        void mo29005B(String str, Bundle bundle);

        /* renamed from: C */
        void mo29006C(String str, Bundle bundle);

        /* renamed from: D */
        void mo29007D(int i);

        /* renamed from: E */
        void mo29008E(Uri uri, Bundle bundle);

        /* renamed from: a */
        void mo29009a(int i);

        /* renamed from: b */
        void mo29010b(int i);

        /* renamed from: c */
        void mo29011c(String str, Bundle bundle, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar);

        /* renamed from: d */
        void mo29012d(String str, C1262d.C1286m<MediaBrowserCompat.MediaItem> mVar);

        /* renamed from: e */
        void mo29013e(String str, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle);

        /* renamed from: f */
        void mo29014f();

        /* renamed from: g */
        void mo29015g(float f);

        /* renamed from: h */
        void mo29016h();

        /* renamed from: i */
        void mo29017i(int i);

        /* renamed from: j */
        void mo29018j();

        /* renamed from: k */
        void mo29019k(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: l */
        void mo29020l(long j);

        /* renamed from: m */
        void mo29021m(RatingCompat ratingCompat, Bundle bundle);

        /* renamed from: n */
        void mo29022n();

        /* renamed from: o */
        void mo29023o(boolean z);

        void onClose();

        void onDestroy();

        void onPause();

        void onStop();

        /* renamed from: p */
        void mo29028p(C12267e eVar);

        /* renamed from: q */
        void mo29029q(String str, Bundle bundle);

        /* renamed from: r */
        void mo29030r();

        /* renamed from: s */
        void mo29031s(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: t */
        void mo29032t();

        /* renamed from: u */
        void mo29033u(Uri uri, Bundle bundle);

        /* renamed from: v */
        void mo29034v(RatingCompat ratingCompat);

        /* renamed from: w */
        void mo29035w(String str, Bundle bundle);

        /* renamed from: x */
        void mo29036x(MediaMetadataCompat mediaMetadataCompat, int i);

        /* renamed from: y */
        void mo29037y(String str, Bundle bundle);

        /* renamed from: z */
        void mo29038z();
    }

    /* renamed from: C */
    private void m48018C() {
        NotificationManager K = m48025K();
        if (K.getNotificationChannel(this.f36293A) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(this.f36293A, this.f36303r.f45459d, 2);
            notificationChannel.setShowBadge(this.f36303r.f45463h);
            String str = this.f36303r.f45460e;
            if (str != null) {
                notificationChannel.setDescription(str);
            }
            K.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: E */
    private void m48019E() {
        if (this.f36305t.mo463e()) {
            this.f36305t.mo465g(false);
        }
        m48025K().cancel(1124);
    }

    /* renamed from: F */
    private void m48020F() {
        C0681a.m3158n(this, new Intent(this, AudioService.class));
        if (!this.f36305t.mo463e()) {
            this.f36305t.mo465g(true);
        }
        m48037v();
        this.f36305t.mo477s(f36289K);
        m48027P();
    }

    /* renamed from: G */
    private void m48021G() {
        m48028Q(false);
        m48031U();
    }

    /* renamed from: H */
    private void m48022H() {
        if (this.f36303r.f45466k) {
            m48021G();
        }
    }

    /* renamed from: I */
    static MediaMetadataCompat m48023I(String str) {
        return f36292N.get(str);
    }

    /* renamed from: J */
    private C0651l.C0659e m48024J() {
        if (Build.VERSION.SDK_INT >= 26) {
            m48018C();
        }
        C0651l.C0659e s = new C0651l.C0659e(this, this.f36293A).mo2928M(1).mo2921F(false).mo2946s(mo29000w());
        s.mo2922G(mo28989M(this.f36303r.f45462g));
        return s;
    }

    /* renamed from: K */
    private NotificationManager m48025K() {
        return (NotificationManager) getSystemService("notification");
    }

    /* renamed from: O */
    public static void m48026O(C8795e eVar) {
        f36290L = eVar;
    }

    /* renamed from: P */
    private void m48027P() {
        startForeground(1124, m48038y());
        this.f36299G = true;
    }

    /* renamed from: Q */
    private void m48028Q(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(z ? 1 : 0);
        } else {
            stopForeground(z);
        }
    }

    /* renamed from: S */
    private MediaMetadataCompat m48029S(MediaMetadataCompat mediaMetadataCompat) {
        return new MediaMetadataCompat.C0180b(mediaMetadataCompat).mo393b("android.media.metadata.ALBUM_ART", this.f36311z).mo393b("android.media.metadata.DISPLAY_ICON", this.f36311z).mo392a();
    }

    /* renamed from: T */
    private void m48030T() {
        if (this.f36305t != null) {
            m48019E();
            this.f36305t.mo464f();
            this.f36305t = null;
        }
    }

    /* renamed from: U */
    private void m48031U() {
        if (this.f36304s.isHeld()) {
            this.f36304s.release();
        }
    }

    /* renamed from: a0 */
    public static int m48032a0(long j) {
        if (j == 4) {
            return 91;
        }
        if (j == 2) {
            return 130;
        }
        return PlaybackStateCompat.m1083h(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m48033b0() {
        if (this.f36299G) {
            m48025K().notify(1124, m48038y());
        }
    }

    /* renamed from: v */
    private void m48037v() {
        if (!this.f36304s.isHeld()) {
            this.f36304s.acquire();
        }
    }

    /* renamed from: y */
    private Notification m48038y() {
        int[] iArr = this.f36309x;
        if (iArr == null) {
            int min = Math.min(3, this.f36307v.size());
            int[] iArr2 = new int[min];
            for (int i = 0; i < min; i++) {
                iArr2[i] = i;
            }
            iArr = iArr2;
        }
        C0651l.C0659e J = m48024J();
        MediaMetadataCompat mediaMetadataCompat = this.f36310y;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat e = mediaMetadataCompat.mo381e();
            if (e.mo361j() != null) {
                J.mo2944q(e.mo361j());
            }
            if (e.mo360i() != null) {
                J.mo2943p(e.mo360i());
            }
            if (e.mo352b() != null) {
                J.mo2925J(e.mo352b());
            }
            synchronized (this) {
                Bitmap bitmap = this.f36311z;
                if (bitmap != null) {
                    J.mo2950x(bitmap);
                }
            }
        }
        if (this.f36303r.f45464i) {
            J.mo2942o(this.f36305t.mo461b().mo412b());
        }
        int i2 = this.f36303r.f45461f;
        if (i2 != -1) {
            J.mo2940m(i2);
        }
        for (C0651l.C0652a b : this.f36308w) {
            J.mo2931b(b);
        }
        C1258c t = new C1258c().mo4522s(this.f36305t.mo462c()).mo4523t(iArr);
        if (this.f36303r.f45465j) {
            t.mo4524u(true);
            t.mo4521r(mo29001x(1));
            J.mo2917B(true);
        }
        J.mo2924I(t);
        return J.mo2932c();
    }

    /* renamed from: z */
    private static int m48039z(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: A */
    public void mo28985A(C12265c cVar) {
        this.f36303r = cVar;
        String str = cVar.f45458c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f36293A = str;
        if (cVar.f45469n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, cVar.f45469n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            int i = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 201326592;
            }
            f36289K = PendingIntent.getActivity(applicationContext, AdError.NETWORK_ERROR_CODE, intent, i);
        } else {
            f36289K = null;
        }
        if (!cVar.f45457b) {
            this.f36305t.mo470l((PendingIntent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public C0651l.C0652a mo28986B(String str, String str2, long j) {
        return new C0651l.C0652a(mo28989M(str), (CharSequence) str2, mo29001x(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public MediaMetadataCompat mo28987D(String str, String str2, String str3, String str4, String str5, Long l, String str6, Boolean bool, String str7, String str8, String str9, RatingCompat ratingCompat, Map<?, ?> map) {
        MediaMetadataCompat.C0180b e = new MediaMetadataCompat.C0180b().mo396e("android.media.metadata.MEDIA_ID", str).mo396e("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            e.mo396e("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            e.mo396e("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            e.mo396e("android.media.metadata.GENRE", str5);
        }
        if (l != null) {
            e.mo394c("android.media.metadata.DURATION", l.longValue());
        }
        if (str6 != null) {
            e.mo396e("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            e.mo394c("playable_long", bool.booleanValue() ? 1 : 0);
        }
        if (str7 != null) {
            e.mo396e("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            e.mo396e("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            e.mo396e("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        if (ratingCompat != null) {
            e.mo395d("android.media.metadata.RATING", ratingCompat);
        }
        if (map != null) {
            Iterator<?> it = map.keySet().iterator();
            while (it.hasNext()) {
                String str10 = (String) it.next();
                Object obj = map.get(str10);
                if (obj instanceof Long) {
                    e.mo394c(str10, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    e.mo394c(str10, (long) ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    e.mo396e(str10, (String) obj);
                } else if (obj instanceof Boolean) {
                    e.mo394c(str10, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else if (obj instanceof Double) {
                    e.mo396e(str10, obj.toString());
                }
            }
        }
        MediaMetadataCompat a = e.mo392a();
        f36292N.put(str, a);
        return a;
    }

    /* renamed from: L */
    public int mo28988L() {
        int i = C8793c.f36314a[this.f36296D.ordinal()];
        if (i == 2) {
            return 8;
        }
        if (i == 3) {
            return 6;
        }
        if (i != 4) {
            if (i != 5) {
                return i != 6 ? 0 : 7;
            }
            if (this.f36295C) {
                return 3;
            }
            return 2;
        } else if (this.f36295C) {
            return 3;
        } else {
            return 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo28989M(String str) {
        String[] split = str.split("/");
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    /* renamed from: N */
    public void mo28990N() {
        C8795e eVar = f36290L;
        if (eVar != null) {
            eVar.onClose();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[Catch:{ Exception -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4 A[Catch:{ Exception -> 0x00b9 }] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo28991R(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r8.f36294B
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r3 = "content"
            java.lang.String r4 = r2.getScheme()     // Catch:{ Exception -> 0x00b9 }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00b9 }
            r4 = -1
            if (r3 == 0) goto L_0x0064
            if (r10 == 0) goto L_0x0052
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            r5 = 29
            if (r10 < r5) goto L_0x0052
            android.util.Size r10 = new android.util.Size     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            r0 = 192(0xc0, float:2.69E-43)
            r10.<init>(r0, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            android.util.Size r5 = new android.util.Size     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            ra.c r6 = r8.f36303r     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            int r6 = r6.f45467l     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r6 != r4) goto L_0x003c
            int r6 = r10.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
        L_0x003c:
            ra.c r7 = r8.f36303r     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            int r7 = r7.f45468m     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r7 != r4) goto L_0x0046
            int r7 = r10.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
        L_0x0046:
            r5.<init>(r6, r7)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            android.graphics.Bitmap r10 = r0.loadThumbnail(r2, r5, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r10 != 0) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r10
            goto L_0x0064
        L_0x0052:
            android.content.ContentResolver r10 = r8.getContentResolver()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r2, r5)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r10 == 0) goto L_0x0063
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            return r1
        L_0x0064:
            r10 = r1
        L_0x0065:
            if (r3 == 0) goto L_0x0069
            if (r10 == 0) goto L_0x00b3
        L_0x0069:
            ra.c r0 = r8.f36303r     // Catch:{ Exception -> 0x00b9 }
            int r0 = r0.f45467l     // Catch:{ Exception -> 0x00b9 }
            if (r0 == r4) goto L_0x00a4
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x00b9 }
            r0.<init>()     // Catch:{ Exception -> 0x00b9 }
            r3 = 1
            r0.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x00b9 }
            if (r10 == 0) goto L_0x007d
            android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r0)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0084
        L_0x007d:
            java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch:{ Exception -> 0x00b9 }
        L_0x0084:
            ra.c r3 = r8.f36303r     // Catch:{ Exception -> 0x00b9 }
            int r4 = r3.f45467l     // Catch:{ Exception -> 0x00b9 }
            int r3 = r3.f45468m     // Catch:{ Exception -> 0x00b9 }
            int r3 = m48039z(r0, r4, r3)     // Catch:{ Exception -> 0x00b9 }
            r0.inSampleSize = r3     // Catch:{ Exception -> 0x00b9 }
            r3 = 0
            r0.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x00b9 }
            if (r10 == 0) goto L_0x009b
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r0)     // Catch:{ Exception -> 0x00b9 }
        L_0x0099:
            r0 = r10
            goto L_0x00b3
        L_0x009b:
            java.lang.String r10 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFile(r10, r0)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0099
        L_0x00a4:
            if (r10 == 0) goto L_0x00ab
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r10)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00b3
        L_0x00ab:
            java.lang.String r10 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r10)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b3:
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r10 = r8.f36294B     // Catch:{ Exception -> 0x00b9 }
            r10.put(r9, r0)     // Catch:{ Exception -> 0x00b9 }
            return r0
        L_0x00b9:
            r9 = move-exception
            r9.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.mo28991R(java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public synchronized void mo28992V(MediaMetadataCompat mediaMetadataCompat) {
        String i = mediaMetadataCompat.mo385i("artCacheFile");
        if (i != null) {
            this.f36311z = mo28991R(i, (String) null);
            mediaMetadataCompat = m48029S(mediaMetadataCompat);
        } else {
            String i2 = mediaMetadataCompat.mo385i("android.media.metadata.DISPLAY_ICON_URI");
            if (i2 == null || !i2.startsWith("content:")) {
                this.f36311z = null;
            } else {
                this.f36311z = mo28991R(i2, mediaMetadataCompat.mo385i("loadThumbnailUri"));
                mediaMetadataCompat = m48029S(mediaMetadataCompat);
            }
        }
        this.f36310y = mediaMetadataCompat;
        this.f36305t.mo471m(mediaMetadataCompat);
        this.f36300H.removeCallbacksAndMessages((Object) null);
        this.f36300H.post(new C12264b(this));
    }

    /* renamed from: W */
    public void mo28993W(int i, Integer num, Integer num2, Integer num3) {
        if (i == 1) {
            this.f36305t.mo473o(3);
            this.f36301I = null;
        } else if (i == 2) {
            if (this.f36301I != null && num.intValue() == this.f36301I.mo4620c() && num2.intValue() == this.f36301I.mo4619b()) {
                this.f36301I.mo4625h(num3.intValue());
            } else {
                this.f36301I = new C8792b(num.intValue(), num2.intValue(), num3.intValue());
            }
            this.f36305t.mo474p(this.f36301I);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public synchronized void mo28994X(List<MediaSessionCompat.QueueItem> list) {
        f36291M = list;
        this.f36305t.mo475q(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo28995Y(List<C12268f> list, long j, int[] iArr, C12263a aVar, boolean z, long j2, long j3, float f, long j4, Integer num, String str, int i, int i2, boolean z2, Long l) {
        List<C12268f> list2 = list;
        int[] iArr2 = iArr;
        C12263a aVar2 = aVar;
        boolean z3 = z;
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        boolean z4 = true;
        boolean z5 = !Arrays.equals(iArr2, this.f36309x);
        if (list2.equals(this.f36307v)) {
            z4 = z5;
        }
        this.f36307v = list2;
        this.f36308w.clear();
        for (C12268f next : list) {
            this.f36308w.add(mo28986B(next.f45476a, next.f45477b, next.f45478c));
        }
        this.f36309x = iArr2;
        boolean z6 = this.f36295C;
        C12263a aVar3 = this.f36296D;
        this.f36296D = aVar2;
        this.f36295C = z3;
        this.f36297E = i3;
        this.f36298F = i4;
        PlaybackStateCompat.C0222d d = new PlaybackStateCompat.C0222d().mo684b(j | 3669711).mo689g(mo28988L(), j2, f, j4).mo686d(j3);
        if (l != null) {
            d.mo685c(l.longValue());
        }
        if (num != null && str2 != null) {
            d.mo687e(num.intValue(), str2);
        } else if (str2 != null) {
            d.mo687e(-987654, str2);
        }
        if (this.f36310y != null) {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f36310y.mo381e().mo358g());
            d.mo688f(bundle);
        }
        this.f36305t.mo472n(d.mo683a());
        this.f36305t.mo476r(i3);
        this.f36305t.mo478t(i4);
        this.f36305t.mo468j(z2);
        if (!z6 && z3) {
            m48020F();
        } else if (z6 && !z3) {
            m48022H();
        }
        C12263a aVar4 = C12263a.idle;
        if (aVar3 != aVar4 && aVar2 == aVar4) {
            mo28996Z();
        } else if (aVar2 != aVar4 && z4) {
            m48033b0();
        }
    }

    /* renamed from: Z */
    public void mo28996Z() {
        m48019E();
        stopSelf();
    }

    /* renamed from: f */
    public C1262d.C1267e mo4531f(String str, int i, Bundle bundle) {
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        return new C1262d.C1267e(valueOf.booleanValue() ? "recent" : "root", this.f36303r.mo36902a());
    }

    /* renamed from: g */
    public void mo4532g(String str, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mo4533h(str, mVar, (Bundle) null);
    }

    /* renamed from: h */
    public void mo4533h(String str, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        C8795e eVar = f36290L;
        if (eVar == null) {
            mVar.mo4584g(new ArrayList());
        } else {
            eVar.mo29013e(str, mVar, bundle);
        }
    }

    /* renamed from: i */
    public void mo4534i(String str, C1262d.C1286m<MediaBrowserCompat.MediaItem> mVar) {
        C8795e eVar = f36290L;
        if (eVar == null) {
            mVar.mo4584g(null);
        } else {
            eVar.mo29012d(str, mVar);
        }
    }

    /* renamed from: j */
    public void mo4535j(String str, Bundle bundle, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar) {
        C8795e eVar = f36290L;
        if (eVar == null) {
            mVar.mo4584g(new ArrayList());
        } else {
            eVar.mo29011c(str, bundle, mVar);
        }
    }

    public void onCreate() {
        super.onCreate();
        f36288J = this;
        this.f36297E = 0;
        this.f36298F = 0;
        this.f36299G = false;
        this.f36295C = false;
        this.f36296D = C12263a.idle;
        this.f36305t = new MediaSessionCompat(this, "media-session");
        mo28985A(new C12265c(getApplicationContext()));
        this.f36305t.mo469k(4);
        this.f36305t.mo472n(new PlaybackStateCompat.C0222d().mo684b(3669711).mo683a());
        MediaSessionCompat mediaSessionCompat = this.f36305t;
        C8794d dVar = new C8794d();
        this.f36306u = dVar;
        mediaSessionCompat.mo466h(dVar);
        mo4545r(this.f36305t.mo462c());
        this.f36305t.mo475q(f36291M);
        this.f36304s = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f36294B = new C8791a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        this.f36302i = C8796a.m48122B(this);
        System.out.println("flutterEngine warmed up");
    }

    public void onDestroy() {
        super.onDestroy();
        C8795e eVar = f36290L;
        if (eVar != null) {
            eVar.onDestroy();
            f36290L = null;
        }
        this.f36310y = null;
        this.f36311z = null;
        f36291M.clear();
        f36292N.clear();
        this.f36307v.clear();
        this.f36294B.evictAll();
        this.f36309x = null;
        m48030T();
        m48028Q(!this.f36303r.f45457b);
        m48031U();
        f36288J = null;
        this.f36299G = false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C4713a.m30441c(this.f36305t, intent);
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        C8795e eVar = f36290L;
        if (eVar != null) {
            eVar.mo29018j();
        }
        super.onTaskRemoved(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public PendingIntent mo29000w() {
        Intent intent = new Intent(this, MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast(this, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public PendingIntent mo29001x(long j) {
        int a0 = m48032a0(j);
        if (a0 == 0) {
            return null;
        }
        Intent intent = new Intent(this, MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        int i = 0;
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, a0));
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        }
        return PendingIntent.getBroadcast(this, a0, intent, i);
    }
}
