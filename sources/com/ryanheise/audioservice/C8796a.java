package com.ryanheise.audioservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p009v4.media.MediaBrowserCompat;
import android.support.p009v4.media.MediaDescriptionCompat;
import android.support.p009v4.media.MediaMetadataCompat;
import android.support.p009v4.media.RatingCompat;
import android.support.p009v4.media.session.MediaControllerCompat;
import android.support.p009v4.media.session.MediaSessionCompat;
import androidx.media.C1262d;
import com.ryanheise.audioservice.AudioService;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6564n;
import p264io.flutter.embedding.android.C10628d;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.embedding.engine.C10688b;
import p315ob.C12051a;
import p341ra.C12263a;
import p341ra.C12266d;
import p341ra.C12267e;
import p341ra.C12268f;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: com.ryanheise.audioservice.a */
/* compiled from: AudioServicePlugin */
public class C8796a implements C12502a, C12588a {

    /* renamed from: g */
    private static String f36316g = "audio_service_engine";

    /* renamed from: h */
    private static final Set<C8803d> f36317h = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static C8803d f36318i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static C8799c f36319r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final long f36320s = (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static C6556k.C6561d f36321t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static boolean f36322u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static MediaBrowserCompat f36323v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static MediaControllerCompat f36324w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final MediaControllerCompat.C0184a f36325x = new C8797a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f36326a;

    /* renamed from: b */
    private C12502a.C12504b f36327b;

    /* renamed from: c */
    private C12590c f36328c;

    /* renamed from: d */
    private C6564n f36329d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8803d f36330e;

    /* renamed from: f */
    private final MediaBrowserCompat.C0156c f36331f = new C8798b();

    /* renamed from: com.ryanheise.audioservice.a$a */
    /* compiled from: AudioServicePlugin */
    class C8797a extends MediaControllerCompat.C0184a {
        C8797a() {
        }
    }

    /* renamed from: com.ryanheise.audioservice.a$b */
    /* compiled from: AudioServicePlugin */
    class C8798b extends MediaBrowserCompat.C0156c {
        C8798b() {
        }

        /* renamed from: a */
        public void mo309a() {
            try {
                MediaControllerCompat unused = C8796a.f36324w = new MediaControllerCompat(C8796a.this.f36326a, C8796a.f36323v.mo298c());
                Activity a = C8796a.f36318i != null ? C8796a.f36318i.f36345b : null;
                if (a != null) {
                    MediaControllerCompat.m753f(a, C8796a.f36324w);
                }
                C8796a.f36324w.mo414d(C8796a.f36325x);
                if (C8796a.f36321t != null) {
                    C8796a.f36321t.success(C8796a.m48126F(new Object[0]));
                    C6556k.C6561d unused2 = C8796a.f36321t = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public void mo310b() {
            if (C8796a.f36321t != null) {
                C8796a.f36321t.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", (String) null, (Object) null);
            } else {
                C8796a.this.f36330e.mo29043f(true);
            }
        }

        /* renamed from: c */
        public void mo311c() {
            System.out.println("### UNHANDLED: onConnectionSuspended");
        }
    }

    /* renamed from: com.ryanheise.audioservice.a$c */
    /* compiled from: AudioServicePlugin */
    private static class C8799c implements C6556k.C6560c, AudioService.C8795e {

        /* renamed from: a */
        public C6539c f36333a;

        /* renamed from: b */
        public C6556k f36334b;

        /* renamed from: c */
        private AudioTrack f36335c;

        /* renamed from: d */
        private final Handler f36336d = new Handler(Looper.getMainLooper());

        /* renamed from: e */
        private List<C8804e> f36337e = new LinkedList();

        /* renamed from: com.ryanheise.audioservice.a$c$a */
        /* compiled from: AudioServicePlugin */
        class C8800a implements C6556k.C6561d {

            /* renamed from: a */
            final /* synthetic */ C1262d.C1286m f36338a;

            C8800a(C1262d.C1286m mVar) {
                this.f36338a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f36338a.mo4583f(new Bundle());
            }

            public void notImplemented() {
                this.f36338a.mo4583f(new Bundle());
            }

            public void success(Object obj) {
                ArrayList arrayList = new ArrayList();
                for (Map g : (List) ((Map) obj).get("children")) {
                    arrayList.add(C8796a.m48133M(g));
                }
                this.f36338a.mo4584g(arrayList);
            }
        }

        /* renamed from: com.ryanheise.audioservice.a$c$b */
        /* compiled from: AudioServicePlugin */
        class C8801b implements C6556k.C6561d {

            /* renamed from: a */
            final /* synthetic */ C1262d.C1286m f36340a;

            C8801b(C1262d.C1286m mVar) {
                this.f36340a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f36340a.mo4583f(new Bundle());
            }

            public void notImplemented() {
                this.f36340a.mo4583f(new Bundle());
            }

            public void success(Object obj) {
                Map map = (Map) ((Map) obj).get("mediaItem");
                if (map != null) {
                    this.f36340a.mo4584g(C8796a.m48133M(map));
                    return;
                }
                this.f36340a.mo4584g(null);
            }
        }

        /* renamed from: com.ryanheise.audioservice.a$c$c */
        /* compiled from: AudioServicePlugin */
        class C8802c implements C6556k.C6561d {

            /* renamed from: a */
            final /* synthetic */ C1262d.C1286m f36342a;

            C8802c(C1262d.C1286m mVar) {
                this.f36342a = mVar;
            }

            public void error(String str, String str2, Object obj) {
                this.f36342a.mo4583f(new Bundle());
            }

            public void notImplemented() {
                this.f36342a.mo4583f(new Bundle());
            }

            public void success(Object obj) {
                ArrayList arrayList = new ArrayList();
                for (Map g : (List) ((Map) obj).get("mediaItems")) {
                    arrayList.add(C8796a.m48133M(g));
                }
                this.f36342a.mo4584g(arrayList);
            }
        }

        public C8799c(C6539c cVar) {
            this.f36333a = cVar;
            C6556k kVar = new C6556k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f36334b = kVar;
            kVar.mo22161e(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: M */
        public void m48172M() {
            AudioTrack audioTrack = this.f36335c;
            if (audioTrack != null) {
                audioTrack.release();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: S */
        public /* synthetic */ void m48175S(Map map, C6556k.C6561d dVar) {
            try {
                AudioService.f36288J.mo28992V(C8796a.m48160y((Map) map.get("mediaItem")));
                this.f36336d.post(new C8806c(dVar));
            } catch (Exception e) {
                this.f36336d.post(new C8807d(dVar, e));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: V */
        public /* synthetic */ void m48178V(Map map, C6556k.C6561d dVar) {
            try {
                AudioService.f36288J.mo28994X(C8796a.m48131K((List) map.get("queue")));
                this.f36336d.post(new C8805b(dVar));
            } catch (Exception e) {
                this.f36336d.post(new C8808e(dVar, e));
            }
        }

        /* renamed from: A */
        public void mo29004A(long j) {
            mo29039N("seek", C8796a.m48126F("position", Long.valueOf(j * 1000)));
        }

        /* renamed from: B */
        public void mo29005B(String str, Bundle bundle) {
            mo29039N("customAction", C8796a.m48126F(MediationMetaData.KEY_NAME, str, "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: C */
        public void mo29006C(String str, Bundle bundle) {
            mo29039N("prepareFromSearch", C8796a.m48126F("query", str, "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: D */
        public void mo29007D(int i) {
            mo29039N("androidAdjustRemoteVolume", C8796a.m48126F("direction", Integer.valueOf(i)));
        }

        /* renamed from: E */
        public void mo29008E(Uri uri, Bundle bundle) {
            mo29039N("playFromUri", C8796a.m48126F("uri", uri.toString(), "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: N */
        public void mo29039N(String str, Object obj) {
            mo29040O(str, obj, (C6556k.C6561d) null);
        }

        /* renamed from: O */
        public void mo29040O(String str, Object obj, C6556k.C6561d dVar) {
            if (C8796a.f36322u) {
                this.f36334b.mo22160d(str, obj, dVar);
            } else {
                this.f36337e.add(new C8804e(str, obj, dVar));
            }
        }

        /* renamed from: P */
        public void mo29041P() {
            for (C8804e next : this.f36337e) {
                this.f36334b.mo22160d(next.f36350a, next.f36351b, next.f36352c);
            }
            this.f36337e.clear();
        }

        /* renamed from: W */
        public void mo29042W(C6539c cVar) {
            this.f36334b.mo22161e((C6556k.C6560c) null);
            this.f36333a = cVar;
            C6556k kVar = new C6556k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f36334b = kVar;
            kVar.mo22161e(this);
        }

        /* renamed from: a */
        public void mo29009a(int i) {
            mo29039N("setRepeatMode", C8796a.m48126F("repeatMode", Integer.valueOf(i)));
        }

        /* renamed from: b */
        public void mo29010b(int i) {
            mo29039N("setShuffleMode", C8796a.m48126F("shuffleMode", Integer.valueOf(i)));
        }

        /* renamed from: c */
        public void mo29011c(String str, Bundle bundle, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar) {
            if (C8796a.f36319r != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("query", str);
                hashMap.put("extras", C8796a.m48158w(bundle));
                C8796a.f36319r.mo29040O("search", hashMap, new C8802c(mVar));
            }
            mVar.mo4567a();
        }

        /* renamed from: d */
        public void mo29012d(String str, C1262d.C1286m<MediaBrowserCompat.MediaItem> mVar) {
            if (C8796a.f36319r != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("mediaId", str);
                C8796a.f36319r.mo29040O("getMediaItem", hashMap, new C8801b(mVar));
            }
            mVar.mo4567a();
        }

        /* renamed from: e */
        public void mo29013e(String str, C1262d.C1286m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
            if (C8796a.f36319r != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("parentMediaId", str);
                hashMap.put("options", C8796a.m48158w(bundle));
                C8796a.f36319r.mo29040O("getChildren", hashMap, new C8800a(mVar));
            }
            mVar.mo4567a();
        }

        /* renamed from: f */
        public void mo29014f() {
            mo29039N("skipToNext", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: g */
        public void mo29015g(float f) {
            mo29039N("setSpeed", C8796a.m48126F("speed", Float.valueOf(f)));
        }

        /* renamed from: h */
        public void mo29016h() {
            mo29039N("rewind", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: i */
        public void mo29017i(int i) {
            mo29039N("androidSetRemoteVolume", C8796a.m48126F("volumeIndex", Integer.valueOf(i)));
        }

        /* renamed from: j */
        public void mo29018j() {
            mo29039N("onTaskRemoved", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: k */
        public void mo29019k(MediaMetadataCompat mediaMetadataCompat) {
            mo29039N("addQueueItem", C8796a.m48126F("mediaItem", C8796a.m48128H(mediaMetadataCompat)));
        }

        /* renamed from: l */
        public void mo29020l(long j) {
            mo29039N("skipToQueueItem", C8796a.m48126F("index", Long.valueOf(j)));
        }

        /* renamed from: m */
        public void mo29021m(RatingCompat ratingCompat, Bundle bundle) {
            mo29039N("setRating", C8796a.m48126F("rating", C8796a.m48130J(ratingCompat), "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: n */
        public void mo29022n() {
            mo29039N("play", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: o */
        public void mo29023o(boolean z) {
            mo29039N("setCaptioningEnabled", C8796a.m48126F("enabled", Boolean.valueOf(z)));
        }

        public void onClose() {
            mo29039N("onNotificationDeleted", C8796a.m48126F(new Object[0]));
        }

        public void onDestroy() {
            C8796a.m48121A();
        }

        public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
            int[] iArr;
            C6555j jVar2 = jVar;
            C6556k.C6561d dVar2 = dVar;
            Map map = (Map) jVar2.f31000b;
            String str = jVar2.f30999a;
            str.hashCode();
            int i = 1;
            char c = 65535;
            switch (str.hashCode()) {
                case -615448875:
                    if (str.equals("setMediaItem")) {
                        c = 0;
                        break;
                    }
                    break;
                case -3300612:
                    if (str.equals("androidForceEnableMediaButtons")) {
                        c = 1;
                        break;
                    }
                    break;
                case 534585782:
                    if (str.equals("setAndroidPlaybackInfo")) {
                        c = 2;
                        break;
                    }
                    break;
                case 699379795:
                    if (str.equals("stopService")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1402657231:
                    if (str.equals("setQueue")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1404470607:
                    if (str.equals("setState")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1742026028:
                    if (str.equals("notifyChildrenChanged")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Executors.newSingleThreadExecutor().execute(new C8809f(this, map, dVar2));
                    return;
                case 1:
                    if (this.f36335c == null) {
                        AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, 2048, 0);
                        this.f36335c = audioTrack;
                        audioTrack.write(new byte[2048], 0, 2048);
                    }
                    this.f36335c.reloadStaticData();
                    this.f36335c.play();
                    dVar2.success((Object) null);
                    return;
                case 2:
                    Map map2 = (Map) map.get("playbackInfo");
                    AudioService.f36288J.mo28993W(((Integer) map2.get("playbackType")).intValue(), (Integer) map2.get("volumeControlType"), (Integer) map2.get("maxVolume"), (Integer) map2.get("volume"));
                    return;
                case 3:
                    AudioService audioService = AudioService.f36288J;
                    if (audioService != null) {
                        audioService.mo28996Z();
                    }
                    dVar2.success((Object) null);
                    return;
                case 4:
                    Executors.newSingleThreadExecutor().execute(new C8810g(this, map, dVar2));
                    return;
                case 5:
                    Map map3 = (Map) map.get(AdOperationMetric.INIT_STATE);
                    C12263a aVar = C12263a.values()[((Integer) map3.get("processingState")).intValue()];
                    boolean booleanValue = ((Boolean) map3.get("playing")).booleanValue();
                    List<Map> list = (List) map3.get("controls");
                    List list2 = (List) map3.get("androidCompactActionIndices");
                    List<Integer> list3 = (List) map3.get("systemActions");
                    long longValue = C8796a.m48124D(map3.get("updatePosition")).longValue();
                    long longValue2 = C8796a.m48124D(map3.get("bufferedPosition")).longValue();
                    float doubleValue = (float) ((Double) map3.get("speed")).doubleValue();
                    long currentTimeMillis = map3.get("updateTime") == null ? System.currentTimeMillis() : C8796a.m48124D(map3.get("updateTime")).longValue();
                    Integer num = (Integer) map3.get("errorCode");
                    String str2 = (String) map3.get("errorMessage");
                    int intValue = ((Integer) map3.get("repeatMode")).intValue();
                    int intValue2 = ((Integer) map3.get("shuffleMode")).intValue();
                    Long D = C8796a.m48124D(map3.get("queueIndex"));
                    boolean booleanValue2 = ((Boolean) map3.get("captioningEnabled")).booleanValue();
                    long j = currentTimeMillis - C8796a.f36320s;
                    ArrayList arrayList = new ArrayList();
                    long j2 = 0;
                    for (Map map4 : list) {
                        long intValue3 = (long) (i << ((Integer) map4.get("action")).intValue());
                        j2 |= intValue3;
                        arrayList.add(new C12268f((String) map4.get("androidIcon"), (String) map4.get("label"), intValue3));
                        i = 1;
                    }
                    for (Integer intValue4 : list3) {
                        j2 |= (long) (1 << intValue4.intValue());
                    }
                    if (list2 != null) {
                        int min = Math.min(3, list2.size());
                        iArr = new int[min];
                        for (int i2 = 0; i2 < min; i2++) {
                            iArr[i2] = ((Integer) list2.get(i2)).intValue();
                        }
                    } else {
                        iArr = null;
                    }
                    AudioService.f36288J.mo28995Y(arrayList, j2, iArr, aVar, booleanValue, longValue, longValue2, doubleValue, j, num, str2, intValue, intValue2, booleanValue2, D);
                    dVar2.success((Object) null);
                    return;
                case 6:
                    AudioService.f36288J.mo4528d((String) map.get("parentMediaId"), C8796a.m48127G((Map) map.get("options")));
                    dVar2.success((Object) null);
                    return;
                default:
                    return;
            }
        }

        public void onPause() {
            mo29039N("pause", C8796a.m48126F(new Object[0]));
        }

        public void onStop() {
            mo29039N("stop", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: p */
        public void mo29028p(C12267e eVar) {
            mo29039N("click", C8796a.m48126F("button", Integer.valueOf(eVar.ordinal())));
        }

        /* renamed from: q */
        public void mo29029q(String str, Bundle bundle) {
            mo29039N("prepareFromMediaId", C8796a.m48126F("mediaId", str, "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: r */
        public void mo29030r() {
            mo29039N("skipToPrevious", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: s */
        public void mo29031s(MediaMetadataCompat mediaMetadataCompat) {
            mo29039N("removeQueueItem", C8796a.m48126F("mediaItem", C8796a.m48128H(mediaMetadataCompat)));
        }

        /* renamed from: t */
        public void mo29032t() {
            mo29039N("prepare", C8796a.m48126F(new Object[0]));
        }

        /* renamed from: u */
        public void mo29033u(Uri uri, Bundle bundle) {
            mo29039N("prepareFromUri", C8796a.m48126F("uri", uri.toString(), "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: v */
        public void mo29034v(RatingCompat ratingCompat) {
            mo29039N("setRating", C8796a.m48126F("rating", C8796a.m48130J(ratingCompat), "extras", null));
        }

        /* renamed from: w */
        public void mo29035w(String str, Bundle bundle) {
            mo29039N("playFromSearch", C8796a.m48126F("query", str, "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: x */
        public void mo29036x(MediaMetadataCompat mediaMetadataCompat, int i) {
            mo29039N("insertQueueItem", C8796a.m48126F("mediaItem", C8796a.m48128H(mediaMetadataCompat), "index", Integer.valueOf(i)));
        }

        /* renamed from: y */
        public void mo29037y(String str, Bundle bundle) {
            mo29039N("playFromMediaId", C8796a.m48126F("mediaId", str, "extras", C8796a.m48158w(bundle)));
        }

        /* renamed from: z */
        public void mo29038z() {
            mo29039N("fastForward", C8796a.m48126F(new Object[0]));
        }
    }

    /* renamed from: com.ryanheise.audioservice.a$d */
    /* compiled from: AudioServicePlugin */
    private static class C8803d implements C6556k.C6560c {

        /* renamed from: a */
        private Context f36344a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Activity f36345b;

        /* renamed from: c */
        public final C6539c f36346c;

        /* renamed from: d */
        private final C6556k f36347d;

        /* renamed from: e */
        private boolean f36348e;

        /* renamed from: f */
        private boolean f36349f;

        public C8803d(C6539c cVar) {
            this.f36346c = cVar;
            C6556k kVar = new C6556k(cVar, "com.ryanheise.audio_service.client.methods");
            this.f36347d = kVar;
            kVar.mo22161e(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m48217d(Activity activity) {
            this.f36345b = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m48218e(Context context) {
            this.f36344a = context;
        }

        /* renamed from: f */
        public void mo29043f(boolean z) {
            this.f36349f = z;
        }

        /* renamed from: g */
        public void mo29044g(boolean z) {
            this.f36348e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public boolean mo29045h() {
            return (this.f36345b.getIntent().getFlags() & 1048576) == 1048576;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[Catch:{ Exception -> 0x016c }] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x016c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(p186ac.C6555j r9, p186ac.C6556k.C6561d r10) {
            /*
                r8 = this;
                java.lang.String r0 = "artDownscaleHeight"
                java.lang.String r1 = "artDownscaleWidth"
                java.lang.String r2 = "notificationColor"
                boolean r3 = r8.f36348e     // Catch:{ Exception -> 0x016c }
                if (r3 != 0) goto L_0x0164
                java.lang.String r3 = r9.f30999a     // Catch:{ Exception -> 0x016c }
                int r4 = r3.hashCode()     // Catch:{ Exception -> 0x016c }
                r5 = -804429082(0xffffffffd00d62e6, float:-9.4882755E9)
                r6 = 0
                r7 = -1
                if (r4 == r5) goto L_0x0018
                goto L_0x0022
            L_0x0018:
                java.lang.String r4 = "configure"
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x016c }
                if (r3 == 0) goto L_0x0022
                r3 = 0
                goto L_0x0023
            L_0x0022:
                r3 = -1
            L_0x0023:
                if (r3 == 0) goto L_0x0027
                goto L_0x0178
            L_0x0027:
                boolean r3 = r8.f36349f     // Catch:{ Exception -> 0x016c }
                if (r3 != 0) goto L_0x015c
                r3 = 1
                boolean unused = com.ryanheise.audioservice.C8796a.f36322u = r3     // Catch:{ Exception -> 0x016c }
                java.lang.Object r9 = r9.f31000b     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x016c }
                java.lang.String r3 = "config"
                java.lang.Object r9 = r9.get(r3)     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x016c }
                ra.c r3 = new ra.c     // Catch:{ Exception -> 0x016c }
                android.content.Context r4 = r8.f36344a     // Catch:{ Exception -> 0x016c }
                android.content.Context r4 = r4.getApplicationContext()     // Catch:{ Exception -> 0x016c }
                r3.<init>(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationClickStartsActivity"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x016c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f45464i = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationOngoing"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x016c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f45465j = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidResumeOnClick"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x016c }
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f45457b = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationChannelId"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x016c }
                r3.f45458c = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationChannelName"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x016c }
                r3.f45459d = r4     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = "androidNotificationChannelDescription"
                java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x016c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x016c }
                r3.f45460e = r4     // Catch:{ Exception -> 0x016c }
                java.lang.Object r4 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                if (r4 != 0) goto L_0x0096
                r2 = -1
                goto L_0x00a2
            L_0x0096:
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.Integer r2 = com.ryanheise.audioservice.C8796a.m48123C(r2)     // Catch:{ Exception -> 0x016c }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x016c }
            L_0x00a2:
                r3.f45461f = r2     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = "androidNotificationIcon"
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x016c }
                r3.f45462g = r2     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = "androidShowNotificationBadge"
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016c }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f45463h = r2     // Catch:{ Exception -> 0x016c }
                java.lang.String r2 = "androidStopForegroundOnPause"
                java.lang.Object r2 = r9.get(r2)     // Catch:{ Exception -> 0x016c }
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016c }
                boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016c }
                r3.f45466k = r2     // Catch:{ Exception -> 0x016c }
                java.lang.Object r2 = r9.get(r1)     // Catch:{ Exception -> 0x016c }
                if (r2 == 0) goto L_0x00db
                java.lang.Object r1 = r9.get(r1)     // Catch:{ Exception -> 0x016c }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x016c }
                int r1 = r1.intValue()     // Catch:{ Exception -> 0x016c }
                goto L_0x00dc
            L_0x00db:
                r1 = -1
            L_0x00dc:
                r3.f45467l = r1     // Catch:{ Exception -> 0x016c }
                java.lang.Object r1 = r9.get(r0)     // Catch:{ Exception -> 0x016c }
                if (r1 == 0) goto L_0x00ee
                java.lang.Object r0 = r9.get(r0)     // Catch:{ Exception -> 0x016c }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x016c }
                int r7 = r0.intValue()     // Catch:{ Exception -> 0x016c }
            L_0x00ee:
                r3.f45468m = r7     // Catch:{ Exception -> 0x016c }
                java.lang.String r0 = "androidBrowsableRootExtras"
                java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = (java.util.Map) r9     // Catch:{ Exception -> 0x016c }
                r3.mo36904c(r9)     // Catch:{ Exception -> 0x016c }
                android.app.Activity r9 = r8.f36345b     // Catch:{ Exception -> 0x016c }
                if (r9 == 0) goto L_0x0109
                java.lang.Class r9 = r9.getClass()     // Catch:{ Exception -> 0x016c }
                java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x016c }
                r3.f45469n = r9     // Catch:{ Exception -> 0x016c }
            L_0x0109:
                r3.mo36903b()     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.AudioService r9 = com.ryanheise.audioservice.AudioService.f36288J     // Catch:{ Exception -> 0x016c }
                if (r9 == 0) goto L_0x0113
                r9.mo28985A(r3)     // Catch:{ Exception -> 0x016c }
            L_0x0113:
                com.ryanheise.audioservice.C8796a.C8803d unused = com.ryanheise.audioservice.C8796a.f36318i = r8     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.C8796a.f36319r     // Catch:{ Exception -> 0x016c }
                if (r9 != 0) goto L_0x012e
                com.ryanheise.audioservice.a$c r9 = new com.ryanheise.audioservice.a$c     // Catch:{ Exception -> 0x016c }
                ac.c r0 = r8.f36346c     // Catch:{ Exception -> 0x016c }
                r9.<init>(r0)     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.C8796a.C8799c unused = com.ryanheise.audioservice.C8796a.f36319r = r9     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.C8796a.f36319r     // Catch:{ Exception -> 0x016c }
                com.ryanheise.audioservice.AudioService.m48026O(r9)     // Catch:{ Exception -> 0x016c }
                goto L_0x0148
            L_0x012e:
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.C8796a.f36319r     // Catch:{ Exception -> 0x016c }
                ac.c r9 = r9.f36333a     // Catch:{ Exception -> 0x016c }
                ac.c r0 = r8.f36346c     // Catch:{ Exception -> 0x016c }
                if (r9 == r0) goto L_0x0141
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.C8796a.f36319r     // Catch:{ Exception -> 0x016c }
                ac.c r0 = r8.f36346c     // Catch:{ Exception -> 0x016c }
                r9.mo29042W(r0)     // Catch:{ Exception -> 0x016c }
            L_0x0141:
                com.ryanheise.audioservice.a$c r9 = com.ryanheise.audioservice.C8796a.f36319r     // Catch:{ Exception -> 0x016c }
                r9.mo29041P()     // Catch:{ Exception -> 0x016c }
            L_0x0148:
                android.support.v4.media.session.MediaControllerCompat r9 = com.ryanheise.audioservice.C8796a.f36324w     // Catch:{ Exception -> 0x016c }
                if (r9 == 0) goto L_0x0158
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x016c }
                java.util.Map r9 = com.ryanheise.audioservice.C8796a.m48126F(r9)     // Catch:{ Exception -> 0x016c }
                r10.success(r9)     // Catch:{ Exception -> 0x016c }
                goto L_0x0178
            L_0x0158:
                p186ac.C6556k.C6561d unused = com.ryanheise.audioservice.C8796a.f36321t = r10     // Catch:{ Exception -> 0x016c }
                goto L_0x0178
            L_0x015c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x016c }
                java.lang.String r0 = "Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README."
                r9.<init>(r0)     // Catch:{ Exception -> 0x016c }
                throw r9     // Catch:{ Exception -> 0x016c }
            L_0x0164:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x016c }
                java.lang.String r0 = "The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions."
                r9.<init>(r0)     // Catch:{ Exception -> 0x016c }
                throw r9     // Catch:{ Exception -> 0x016c }
            L_0x016c:
                r9 = move-exception
                r9.printStackTrace()
                java.lang.String r9 = r9.getMessage()
                r0 = 0
                r10.error(r9, r0, r0)
            L_0x0178:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.C8796a.C8803d.onMethodCall(ac.j, ac.k$d):void");
        }
    }

    /* renamed from: com.ryanheise.audioservice.a$e */
    /* compiled from: AudioServicePlugin */
    static class C8804e {

        /* renamed from: a */
        public final String f36350a;

        /* renamed from: b */
        public final Object f36351b;

        /* renamed from: c */
        public final C6556k.C6561d f36352c;

        public C8804e(String str, Object obj, C6556k.C6561d dVar) {
            this.f36350a = str;
            this.f36351b = obj;
            this.f36352c = dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m48121A() {
        /*
            java.lang.Class<com.ryanheise.audioservice.a> r0 = com.ryanheise.audioservice.C8796a.class
            monitor-enter(r0)
            java.util.Set<com.ryanheise.audioservice.a$d> r1 = f36317h     // Catch:{ all -> 0x0037 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0037 }
            com.ryanheise.audioservice.a$d r2 = (com.ryanheise.audioservice.C8796a.C8803d) r2     // Catch:{ all -> 0x0037 }
            android.app.Activity r2 = r2.f36345b     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x001d:
            io.flutter.embedding.engine.b r1 = p264io.flutter.embedding.engine.C10688b.m53506b()     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = f36316g     // Catch:{ all -> 0x0037 }
            io.flutter.embedding.engine.a r1 = r1.mo34088a(r2)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0035
            r1.mo34069f()     // Catch:{ all -> 0x0037 }
            io.flutter.embedding.engine.b r1 = p264io.flutter.embedding.engine.C10688b.m53506b()     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = f36316g     // Catch:{ all -> 0x0037 }
            r1.mo34090d(r2)     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r0)
            return
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.C8796a.m48121A():void");
    }

    /* renamed from: B */
    public static synchronized C10685a m48122B(Context context) {
        C10685a a;
        C10628d dVar;
        Uri data;
        synchronized (C8796a.class) {
            a = C10688b.m53506b().mo34088a(f36316g);
            if (a == null) {
                a = new C10685a(context.getApplicationContext());
                String str = null;
                if ((context instanceof C10628d) && (str = dVar.mo33867n()) == null && (dVar = (C10628d) context).mo33865j() && (data = dVar.getIntent().getData()) != null) {
                    str = data.getPath();
                    if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                        str = str + "?" + data.getQuery();
                    }
                }
                if (str == null) {
                    str = "/";
                }
                a.mo34076m().mo38638c(str);
                a.mo34072i().mo36420k(C12051a.C12054c.m58024a());
                C10688b.m53506b().mo34089c(f36316g, a);
            }
        }
        return a;
    }

    /* renamed from: C */
    public static Integer m48123C(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf((int) ((Long) obj).longValue());
    }

    /* renamed from: D */
    public static Long m48124D(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf((long) ((Integer) obj).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ boolean m48125E(Intent intent) {
        this.f36330e.f36345b.setIntent(intent);
        m48135O();
        return true;
    }

    /* renamed from: F */
    static Map<String, Object> m48126F(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            hashMap.put(objArr[i], objArr[i + 1]);
        }
        return hashMap;
    }

    /* renamed from: G */
    static Bundle m48127G(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static Map<?, ?> m48128H(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat e = mediaMetadataCompat.mo381e();
        HashMap hashMap = new HashMap();
        hashMap.put("id", e.mo358g());
        hashMap.put("title", m48129I(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", m48129I(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        if (e.mo356e() != null) {
            hashMap.put("artUri", e.mo356e().toString());
        }
        hashMap.put("artist", m48129I(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", m48129I(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.mo377a("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(mediaMetadataCompat.mo382f("android.media.metadata.DURATION")));
        }
        hashMap.put("playable", Boolean.valueOf(mediaMetadataCompat.mo382f("playable_long") != 0));
        hashMap.put("displayTitle", m48129I(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", m48129I(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", m48129I(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.mo377a("android.media.metadata.RATING")) {
            hashMap.put("rating", m48130J(mediaMetadataCompat.mo384h("android.media.metadata.RATING")));
        }
        Map<String, Object> w = m48158w(mediaMetadataCompat.mo379d());
        if (w.size() > 0) {
            hashMap.put("extras", w);
        }
        return hashMap;
    }

    /* renamed from: I */
    private static String m48129I(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence j = mediaMetadataCompat.mo386j(str);
        if (j != null) {
            return j.toString();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static HashMap<String, Object> m48130J(RatingCompat ratingCompat) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("type", Integer.valueOf(ratingCompat.mo399d()));
        if (ratingCompat.mo403g()) {
            switch (ratingCompat.mo399d()) {
                case 0:
                    hashMap.put("value", (Object) null);
                    break;
                case 1:
                    hashMap.put("value", Boolean.valueOf(ratingCompat.mo402f()));
                    break;
                case 2:
                    hashMap.put("value", Boolean.valueOf(ratingCompat.mo404h()));
                    break;
                case 3:
                case 4:
                case 5:
                    hashMap.put("value", Float.valueOf(ratingCompat.mo401e()));
                    break;
                case 6:
                    hashMap.put("value", Float.valueOf(ratingCompat.mo397b()));
                    break;
            }
        } else {
            hashMap.put("value", (Object) null);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static List<MediaSessionCompat.QueueItem> m48131K(List<Map<?, ?>> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Map next : list) {
            arrayList.add(new MediaSessionCompat.QueueItem(m48157v(m48160y(next).mo381e(), (Map) next.get("extras")), (long) i));
            i++;
        }
        return arrayList;
    }

    /* renamed from: L */
    private static RatingCompat m48132L(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Integer num = (Integer) map.get("type");
        Object obj = map.get("value");
        if (obj == null) {
            return RatingCompat.m732m(num.intValue());
        }
        switch (num.intValue()) {
            case 1:
                return RatingCompat.m728i(((Boolean) obj).booleanValue());
            case 2:
                return RatingCompat.m731l(((Boolean) obj).booleanValue());
            case 3:
            case 4:
            case 5:
                return RatingCompat.m730k(num.intValue(), (float) ((Integer) obj).intValue());
            case 6:
                return RatingCompat.m729j(((Double) obj).floatValue());
            default:
                return RatingCompat.m732m(num.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static MediaBrowserCompat.MediaItem m48133M(Map<?, ?> map) {
        return new MediaBrowserCompat.MediaItem(m48157v(m48160y(map).mo381e(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    /* renamed from: N */
    private void m48134N() {
        C12590c cVar = this.f36328c;
        C12266d dVar = new C12266d(this);
        this.f36329d = dVar;
        cVar.mo34114d(dVar);
    }

    /* renamed from: O */
    private void m48135O() {
        Activity a = this.f36330e.f36345b;
        if (a.getIntent().getAction() != null) {
            boolean equals = a.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f36319r.mo29039N("onNotificationClicked", m48126F("clicked", Boolean.valueOf(equals)));
        }
    }

    /* renamed from: v */
    private static MediaDescriptionCompat m48157v(MediaDescriptionCompat mediaDescriptionCompat, Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        if (mediaDescriptionCompat.mo353c() != null) {
            bundle.putAll(mediaDescriptionCompat.mo353c());
        }
        bundle.putAll(m48127G(map));
        return new MediaDescriptionCompat.C0178d().mo376i(mediaDescriptionCompat.mo361j()).mo375h(mediaDescriptionCompat.mo360i()).mo369b(mediaDescriptionCompat.mo352b()).mo371d(mediaDescriptionCompat.mo354d()).mo372e(mediaDescriptionCompat.mo356e()).mo373f(mediaDescriptionCompat.mo358g()).mo374g(mediaDescriptionCompat.mo359h()).mo370c(bundle).mo368a();
    }

    /* renamed from: w */
    static Map<String, Object> m48158w(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }

    /* renamed from: x */
    private void m48159x() {
        if (f36323v == null) {
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f36326a, new ComponentName(this.f36326a, AudioService.class), this.f36331f, (Bundle) null);
            f36323v = mediaBrowserCompat;
            mediaBrowserCompat.mo296a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static MediaMetadataCompat m48160y(Map<?, ?> map) {
        return AudioService.f36288J.mo28987D((String) map.get("id"), (String) map.get("title"), (String) map.get("album"), (String) map.get("artist"), (String) map.get("genre"), m48124D(map.get("duration")), (String) map.get("artUri"), (Boolean) map.get("playable"), (String) map.get("displayTitle"), (String) map.get("displaySubtitle"), (String) map.get("displayDescription"), m48132L((Map) map.get("rating")), (Map) map.get("extras"));
    }

    /* renamed from: z */
    private void m48161z() {
        C8803d dVar = f36318i;
        Activity a = dVar != null ? dVar.f36345b : null;
        if (a != null) {
            a.setIntent(new Intent("android.intent.action.MAIN"));
        }
        MediaControllerCompat mediaControllerCompat = f36324w;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.mo416g(f36325x);
            f36324w = null;
        }
        MediaBrowserCompat mediaBrowserCompat = f36323v;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.mo297b();
            f36323v = null;
        }
    }

    public void onAttachedToActivity(C12590c cVar) {
        this.f36328c = cVar;
        this.f36330e.m48217d(cVar.getActivity());
        this.f36330e.m48218e(cVar.getActivity());
        this.f36330e.mo29044g(this.f36327b.mo37293b() != m48122B(cVar.getActivity()).mo34072i());
        f36318i = this.f36330e;
        m48134N();
        if (f36324w != null) {
            MediaControllerCompat.m753f(f36318i.f36345b, f36324w);
        }
        if (f36323v == null) {
            m48159x();
        }
        Activity a = f36318i.f36345b;
        if (this.f36330e.mo29045h()) {
            a.setIntent(new Intent("android.intent.action.MAIN"));
        }
        m48135O();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        this.f36327b = bVar;
        C8803d dVar = new C8803d(bVar.mo37293b());
        this.f36330e = dVar;
        dVar.m48218e(this.f36327b.mo37292a());
        f36317h.add(this.f36330e);
        if (this.f36326a == null) {
            this.f36326a = this.f36327b.mo37292a();
        }
        if (f36319r == null) {
            C8799c cVar = new C8799c(this.f36327b.mo37293b());
            f36319r = cVar;
            AudioService.m48026O(cVar);
        }
        if (f36323v == null) {
            m48159x();
        }
    }

    public void onDetachedFromActivity() {
        this.f36328c.mo34115e(this.f36329d);
        this.f36328c = null;
        this.f36329d = null;
        this.f36330e.m48217d((Activity) null);
        this.f36330e.m48218e(this.f36327b.mo37292a());
        if (f36317h.size() == 1) {
            m48161z();
        }
        if (this.f36330e == f36318i) {
            f36318i = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f36328c.mo34115e(this.f36329d);
        this.f36328c = null;
        this.f36330e.m48217d((Activity) null);
        this.f36330e.m48218e(this.f36327b.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        Set<C8803d> set = f36317h;
        if (set.size() == 1) {
            m48161z();
        }
        set.remove(this.f36330e);
        this.f36330e.m48218e((Context) null);
        this.f36330e = null;
        this.f36326a = null;
        C8799c cVar = f36319r;
        if (cVar != null && cVar.f36333a == this.f36327b.mo37293b()) {
            System.out.println("### destroying audio handler interface");
            f36319r.m48172M();
            f36319r = null;
        }
        this.f36327b = null;
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        this.f36328c = cVar;
        this.f36330e.m48217d(cVar.getActivity());
        this.f36330e.m48218e(cVar.getActivity());
        m48134N();
    }
}
