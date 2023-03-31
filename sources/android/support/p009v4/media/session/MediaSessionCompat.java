package android.support.p009v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p009v4.media.MediaDescriptionCompat;
import android.support.p009v4.media.MediaMetadataCompat;
import android.support.p009v4.media.RatingCompat;
import android.support.p009v4.media.session.C0226b;
import android.support.p009v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.app.C0632f;
import androidx.media.C1301e;
import androidx.media.C1308l;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p069j0.C4713a;
import p152v0.C5754a;
import p152v0.C5755b;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: d */
    static int f433d;

    /* renamed from: a */
    private final C0200c f434a;

    /* renamed from: b */
    private final MediaControllerCompat f435b;

    /* renamed from: c */
    private final ArrayList<C0215k> f436c;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0192a();

        /* renamed from: a */
        private final MediaDescriptionCompat f437a;

        /* renamed from: b */
        private final long f438b;

        /* renamed from: c */
        private MediaSession.QueueItem f439c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        class C0192a implements Parcelable.Creator<QueueItem> {
            C0192a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        private static class C0193b {
            /* renamed from: a */
            static MediaSession.QueueItem m837a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            /* renamed from: b */
            static MediaDescription m838b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            /* renamed from: c */
            static long m839c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this((MediaSession.QueueItem) null, mediaDescriptionCompat, j);
        }

        /* renamed from: a */
        public static QueueItem m830a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m670a(C0193b.m838b(queueItem)), C0193b.m839c(queueItem));
        }

        /* renamed from: b */
        public static List<QueueItem> m831b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m830a(a));
            }
            return arrayList;
        }

        /* renamed from: c */
        public MediaDescriptionCompat mo479c() {
            return this.f437a;
        }

        /* renamed from: d */
        public long mo480d() {
            return this.f438b;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public Object mo482e() {
            MediaSession.QueueItem queueItem = this.f439c;
            if (queueItem != null || Build.VERSION.SDK_INT < 21) {
                return queueItem;
            }
            MediaSession.QueueItem a = C0193b.m837a((MediaDescription) this.f437a.mo357f(), this.f438b);
            this.f439c = a;
            return a;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f437a + ", Id=" + this.f438b + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f437a.writeToParcel(parcel, i);
            parcel.writeLong(this.f438b);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f437a = mediaDescriptionCompat;
                this.f438b = j;
                this.f439c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.f437a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f438b = parcel.readLong();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0194a();

        /* renamed from: a */
        ResultReceiver f440a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        class C0194a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0194a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f440a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f440a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0195a();

        /* renamed from: a */
        private final Object f441a;

        /* renamed from: b */
        private final Object f442b;

        /* renamed from: c */
        private C0226b f443c;

        /* renamed from: d */
        private C5755b f444d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        class C0195a implements Parcelable.Creator<Token> {
            C0195a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0226b) null, (C5755b) null);
        }

        /* renamed from: a */
        public static Token m842a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            C0226b p = C0226b.C0227a.m1199p(C0632f.m2960a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            C5755b b = C5754a.m34337b(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.f442b, p, b);
        }

        /* renamed from: b */
        public static Token m843b(Object obj) {
            return m844c(obj, (C0226b) null);
        }

        /* renamed from: c */
        public static Token m844c(Object obj, C0226b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        /* renamed from: d */
        public C0226b mo495d() {
            C0226b bVar;
            synchronized (this.f441a) {
                bVar = this.f443c;
            }
            return bVar;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public C5755b mo497e() {
            C5755b bVar;
            synchronized (this.f441a) {
                bVar = this.f444d;
            }
            return bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f442b;
            if (obj2 != null) {
                Object obj3 = token.f442b;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f442b == null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: f */
        public Object mo499f() {
            return this.f442b;
        }

        /* renamed from: g */
        public void mo500g(C0226b bVar) {
            synchronized (this.f441a) {
                this.f443c = bVar;
            }
        }

        /* renamed from: h */
        public void mo501h(C5755b bVar) {
            synchronized (this.f441a) {
                this.f444d = bVar;
            }
        }

        public int hashCode() {
            Object obj = this.f442b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: i */
        public Bundle mo503i() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f441a) {
                C0226b bVar = this.f443c;
                if (bVar != null) {
                    C0632f.m2961b(bundle, "android.support.v4.media.session.EXTRA_BINDER", bVar.asBinder());
                }
                C5755b bVar2 = this.f444d;
                if (bVar2 != null) {
                    C5754a.m34338c(bundle, "android.support.v4.media.session.SESSION_TOKEN2", bVar2);
                }
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f442b, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f442b);
            }
        }

        Token(Object obj, C0226b bVar) {
            this(obj, bVar, (C5755b) null);
        }

        Token(Object obj, C0226b bVar, C5755b bVar2) {
            this.f441a = new Object();
            this.f442b = obj;
            this.f443c = bVar;
            this.f444d = bVar2;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    class C0196a extends C0197b {
        C0196a() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public static abstract class C0197b {

        /* renamed from: a */
        final Object f446a = new Object();

        /* renamed from: b */
        final MediaSession.Callback f447b;

        /* renamed from: c */
        private boolean f448c;

        /* renamed from: d */
        WeakReference<C0200c> f449d;

        /* renamed from: e */
        C0198a f450e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$a */
        private class C0198a extends Handler {
            C0198a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                C0200c cVar;
                C0197b bVar;
                C0198a aVar;
                if (message.what == 1) {
                    synchronized (C0197b.this.f446a) {
                        cVar = (C0200c) C0197b.this.f449d.get();
                        bVar = C0197b.this;
                        aVar = bVar.f450e;
                    }
                    if (cVar != null && bVar == cVar.mo572i() && aVar != null) {
                        cVar.mo577n((C1301e) message.obj);
                        C0197b.this.mo513a(cVar, aVar);
                        cVar.mo577n((C1301e) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b */
        private class C0199b extends MediaSession.Callback {
            C0199b() {
            }

            /* renamed from: a */
            private void m883a(C0200c cVar) {
                cVar.mo577n((C1301e) null);
            }

            /* renamed from: b */
            private C0205f m884b() {
                C0205f fVar;
                synchronized (C0197b.this.f446a) {
                    fVar = (C0205f) C0197b.this.f449d.get();
                }
                if (fVar == null || C0197b.this != fVar.mo572i()) {
                    return null;
                }
                return fVar;
            }

            /* renamed from: c */
            private void m885c(C0200c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String e = cVar.mo568e();
                    if (TextUtils.isEmpty(e)) {
                        e = "android.media.session.MediaController";
                    }
                    cVar.mo577n(new C1301e(e, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$f r0 = r5.m884b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.p009v4.media.session.MediaSessionCompat.m809a(r7)
                    r5.m885c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.mo567d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.b r1 = r7.mo495d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    androidx.core.app.C0632f.m2961b(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    v0.b r7 = r7.mo497e()     // Catch:{ BadParcelableException -> 0x00b8 }
                    p152v0.C5754a.m34338c(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p009v4.media.session.MediaSessionCompat.C0197b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p009v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo514b(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p009v4.media.session.MediaSessionCompat.C0197b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p009v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo515c(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p009v4.media.session.MediaSessionCompat.C0197b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p009v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo529q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f463h     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f463h     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f463h     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.p009v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.p009v4.media.session.MediaSessionCompat.C0197b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.mo479c()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.mo529q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.p009v4.media.session.MediaSessionCompat.C0197b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.mo516d(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.m883a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.media.session.MediaSessionCompat.C0197b.C0199b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m809a(bundle2);
                            C0197b.this.mo524l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            C0197b.this.mo525m();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m809a(bundle3);
                            C0197b.this.mo526n(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m809a(bundle4);
                            C0197b.this.mo527o(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m809a(bundle5);
                            C0197b.this.mo528p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            C0197b.this.mo532t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            C0197b.this.mo536x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            C0197b.this.mo537y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.m809a(bundle6);
                            C0197b.this.mo535w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            C0197b.this.mo533u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            C0197b.this.mo517e(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    m883a(b);
                }
            }

            public void onFastForward() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo518f();
                    m883a(b);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                C0205f b = m884b();
                if (b == null) {
                    return false;
                }
                m885c(b);
                boolean g = C0197b.this.mo519g(intent);
                m883a(b);
                if (g || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo520h();
                    m883a(b);
                }
            }

            public void onPlay() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo521i();
                    m883a(b);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    C0197b.this.mo522j(str, bundle);
                    m883a(b);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    C0197b.this.mo523k(str, bundle);
                    m883a(b);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    C0197b.this.mo524l(uri, bundle);
                    m883a(b);
                }
            }

            public void onPrepare() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo525m();
                    m883a(b);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    C0197b.this.mo526n(str, bundle);
                    m883a(b);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    C0197b.this.mo527o(str, bundle);
                    m883a(b);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C0205f b = m884b();
                if (b != null) {
                    MediaSessionCompat.m809a(bundle);
                    m885c(b);
                    C0197b.this.mo528p(uri, bundle);
                    m883a(b);
                }
            }

            public void onRewind() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo530r();
                    m883a(b);
                }
            }

            public void onSeekTo(long j) {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo531s(j);
                    m883a(b);
                }
            }

            public void onSetPlaybackSpeed(float f) {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo533u(f);
                    m883a(b);
                }
            }

            public void onSetRating(Rating rating) {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo534v(RatingCompat.m727a(rating));
                    m883a(b);
                }
            }

            public void onSkipToNext() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo538z();
                    m883a(b);
                }
            }

            public void onSkipToPrevious() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo509A();
                    m883a(b);
                }
            }

            public void onSkipToQueueItem(long j) {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo510B(j);
                    m883a(b);
                }
            }

            public void onStop() {
                C0205f b = m884b();
                if (b != null) {
                    m885c(b);
                    C0197b.this.mo511C();
                    m883a(b);
                }
            }
        }

        public C0197b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f447b = new C0199b();
            } else {
                this.f447b = null;
            }
            this.f449d = new WeakReference<>((Object) null);
        }

        /* renamed from: A */
        public void mo509A() {
        }

        /* renamed from: B */
        public void mo510B(long j) {
        }

        /* renamed from: C */
        public void mo511C() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo512D(C0200c cVar, Handler handler) {
            synchronized (this.f446a) {
                this.f449d = new WeakReference<>(cVar);
                C0198a aVar = this.f450e;
                C0198a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages((Object) null);
                }
                if (cVar != null) {
                    if (handler != null) {
                        aVar2 = new C0198a(handler.getLooper());
                    }
                }
                this.f450e = aVar2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo513a(C0200c cVar, Handler handler) {
            long j;
            if (this.f448c) {
                boolean z = false;
                this.f448c = false;
                handler.removeMessages(1);
                PlaybackStateCompat N = cVar.mo561N();
                if (N == null) {
                    j = 0;
                } else {
                    j = N.mo662b();
                }
                boolean z2 = N != null && N.mo668g() == 3;
                boolean z3 = (516 & j) != 0;
                if ((j & 514) != 0) {
                    z = true;
                }
                if (z2 && z) {
                    mo520h();
                } else if (!z2 && z3) {
                    mo521i();
                }
            }
        }

        /* renamed from: b */
        public void mo514b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: c */
        public void mo515c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        /* renamed from: d */
        public void mo516d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: e */
        public void mo517e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo518f() {
        }

        /* renamed from: g */
        public boolean mo519g(Intent intent) {
            C0200c cVar;
            C0198a aVar;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f446a) {
                cVar = (C0200c) this.f449d.get();
                aVar = this.f450e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C1301e q = cVar.mo580q();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    mo513a(cVar, aVar);
                } else if (this.f448c) {
                    aVar.removeMessages(1);
                    this.f448c = false;
                    PlaybackStateCompat N = cVar.mo561N();
                    if (N == null) {
                        j = 0;
                    } else {
                        j = N.mo662b();
                    }
                    if ((j & 32) != 0) {
                        mo538z();
                    }
                } else {
                    this.f448c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, q), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo513a(cVar, aVar);
            return false;
        }

        /* renamed from: h */
        public void mo520h() {
        }

        /* renamed from: i */
        public void mo521i() {
        }

        /* renamed from: j */
        public void mo522j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo523k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo524l(Uri uri, Bundle bundle) {
        }

        /* renamed from: m */
        public void mo525m() {
        }

        /* renamed from: n */
        public void mo526n(String str, Bundle bundle) {
        }

        /* renamed from: o */
        public void mo527o(String str, Bundle bundle) {
        }

        /* renamed from: p */
        public void mo528p(Uri uri, Bundle bundle) {
        }

        /* renamed from: q */
        public void mo529q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: r */
        public void mo530r() {
        }

        /* renamed from: s */
        public void mo531s(long j) {
        }

        /* renamed from: t */
        public void mo532t(boolean z) {
        }

        /* renamed from: u */
        public void mo533u(float f) {
        }

        /* renamed from: v */
        public void mo534v(RatingCompat ratingCompat) {
        }

        /* renamed from: w */
        public void mo535w(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: x */
        public void mo536x(int i) {
        }

        /* renamed from: y */
        public void mo537y(int i) {
        }

        /* renamed from: z */
        public void mo538z() {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    interface C0200c {
        /* renamed from: N */
        PlaybackStateCompat mo561N();

        /* renamed from: N0 */
        void mo562N0(int i);

        /* renamed from: Q */
        void mo563Q(int i);

        /* renamed from: a */
        void mo564a();

        /* renamed from: b */
        boolean mo565b();

        /* renamed from: c */
        void mo566c(int i);

        /* renamed from: d */
        Token mo567d();

        /* renamed from: e */
        String mo568e();

        /* renamed from: f */
        void mo569f(PendingIntent pendingIntent);

        /* renamed from: g */
        void mo570g(C0197b bVar, Handler handler);

        /* renamed from: h */
        void mo571h(int i);

        /* renamed from: i */
        C0197b mo572i();

        /* renamed from: j */
        void mo573j(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: k */
        void mo574k(PendingIntent pendingIntent);

        /* renamed from: l */
        void mo575l(List<QueueItem> list);

        /* renamed from: m */
        void mo576m(boolean z);

        /* renamed from: n */
        void mo577n(C1301e eVar);

        /* renamed from: o */
        void mo578o(PlaybackStateCompat playbackStateCompat);

        /* renamed from: p */
        void mo579p(C1308l lVar);

        /* renamed from: q */
        C1301e mo580q();

        /* renamed from: w0 */
        void mo581w0(boolean z);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0201d extends C0210j {

        /* renamed from: H */
        private static boolean f453H = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$a */
        class C0202a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            C0202a() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C0201d.this.mo647w(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        C0201d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C5755b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo582G(PlaybackStateCompat playbackStateCompat) {
            long f = playbackStateCompat.mo667f();
            float d = playbackStateCompat.mo664d();
            long c = playbackStateCompat.mo663c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.mo668g() == 3) {
                long j = 0;
                if (f > 0) {
                    if (c > 0) {
                        j = elapsedRealtime - c;
                        if (d > 0.0f && d != 1.0f) {
                            j = (long) (((float) j) * d);
                        }
                    }
                    f += j;
                }
            }
            this.f489j.setPlaybackState(mo646u(playbackStateCompat.mo668g()), f, d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public void mo583I(PendingIntent pendingIntent, ComponentName componentName) {
            if (f453H) {
                this.f488i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.mo583I(pendingIntent, componentName);
            }
        }

        /* renamed from: g */
        public void mo570g(C0197b bVar, Handler handler) {
            super.mo570g(bVar, handler);
            if (bVar == null) {
                this.f489j.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f489j.setPlaybackPositionUpdateListener(new C0202a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public int mo584v(long j) {
            int v = super.mo584v(j);
            return (j & 256) != 0 ? v | 256 : v;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo585x(PendingIntent pendingIntent, ComponentName componentName) {
            if (f453H) {
                try {
                    this.f488i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f453H = false;
                }
            }
            if (!f453H) {
                super.mo585x(pendingIntent, componentName);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0203e extends C0201d {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class C0204a implements RemoteControlClient.OnMetadataUpdateListener {
            C0204a() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C0203e.this.mo647w(19, -1, -1, RatingCompat.m727a(obj), (Bundle) null);
                }
            }
        }

        C0203e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C5755b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        /* renamed from: g */
        public void mo570g(C0197b bVar, Handler handler) {
            super.mo570g(bVar, handler);
            if (bVar == null) {
                this.f489j.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f489j.setMetadataUpdateListener(new C0204a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public RemoteControlClient.MetadataEditor mo587s(Bundle bundle) {
            RemoteControlClient.MetadataEditor s = super.mo587s(bundle);
            PlaybackStateCompat playbackStateCompat = this.f500u;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.mo662b()) & 128) != 0) {
                s.addEditableKey(268435457);
            }
            if (bundle == null) {
                return s;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                s.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                s.putObject(C8710R.styleable.AppCompatTheme_switchStyle, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                s.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return s;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public int mo584v(long j) {
            int v = super.mo584v(j);
            return (j & 128) != 0 ? v | 512 : v;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0205f implements C0200c {

        /* renamed from: a */
        final MediaSession f456a;

        /* renamed from: b */
        final Token f457b;

        /* renamed from: c */
        final Object f458c = new Object();

        /* renamed from: d */
        Bundle f459d;

        /* renamed from: e */
        boolean f460e = false;

        /* renamed from: f */
        final RemoteCallbackList<C0223a> f461f = new RemoteCallbackList<>();

        /* renamed from: g */
        PlaybackStateCompat f462g;

        /* renamed from: h */
        List<QueueItem> f463h;

        /* renamed from: i */
        MediaMetadataCompat f464i;

        /* renamed from: j */
        int f465j;

        /* renamed from: k */
        boolean f466k;

        /* renamed from: l */
        int f467l;

        /* renamed from: m */
        int f468m;

        /* renamed from: n */
        C0197b f469n;

        /* renamed from: o */
        C0216l f470o;

        /* renamed from: p */
        C1301e f471p;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$f$a */
        class C0206a extends C0226b.C0227a {
            C0206a() {
            }

            /* renamed from: C1 */
            public void mo590C1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: D2 */
            public MediaMetadataCompat mo591D2() {
                throw new AssertionError();
            }

            /* renamed from: E0 */
            public void mo592E0() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: E1 */
            public boolean mo593E1() {
                throw new AssertionError();
            }

            /* renamed from: E2 */
            public void mo594E2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: E4 */
            public int mo595E4() {
                return C0205f.this.f468m;
            }

            /* renamed from: F2 */
            public Bundle mo596F2() {
                if (C0205f.this.f459d == null) {
                    return null;
                }
                return new Bundle(C0205f.this.f459d);
            }

            /* renamed from: G1 */
            public void mo597G1(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: G2 */
            public void mo598G2(C0223a aVar) {
                C0205f.this.f461f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (C0205f.this.f458c) {
                    C0216l lVar = C0205f.this.f470o;
                }
            }

            /* renamed from: G3 */
            public boolean mo599G3(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: G4 */
            public void mo600G4(int i) {
                throw new AssertionError();
            }

            /* renamed from: H */
            public void mo601H() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: J0 */
            public long mo602J0() {
                throw new AssertionError();
            }

            /* renamed from: J4 */
            public boolean mo603J4() {
                return C0205f.this.f466k;
            }

            /* renamed from: K0 */
            public int mo604K0() {
                return C0205f.this.f467l;
            }

            /* renamed from: K5 */
            public void mo605K5(long j) {
                throw new AssertionError();
            }

            /* renamed from: L5 */
            public void mo606L5(boolean z) throws RemoteException {
            }

            /* renamed from: M0 */
            public Bundle mo607M0() {
                throw new AssertionError();
            }

            /* renamed from: M1 */
            public PendingIntent mo608M1() {
                throw new AssertionError();
            }

            /* renamed from: N */
            public PlaybackStateCompat mo609N() {
                C0205f fVar = C0205f.this;
                return MediaSessionCompat.m810d(fVar.f462g, fVar.f464i);
            }

            /* renamed from: N0 */
            public void mo610N0(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O2 */
            public void mo611O2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: O5 */
            public ParcelableVolumeInfo mo612O5() {
                throw new AssertionError();
            }

            /* renamed from: P1 */
            public int mo613P1() {
                return C0205f.this.f465j;
            }

            /* renamed from: Q */
            public void mo614Q(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: R1 */
            public void mo615R1(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: R3 */
            public void mo616R3(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: U2 */
            public void mo617U2(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: W2 */
            public void mo618W2() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: X0 */
            public void mo619X0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: X3 */
            public void mo620X3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b3 */
            public void mo621b3(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: d4 */
            public void mo622d4(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: d5 */
            public void mo623d5(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: e1 */
            public void mo624e1(C0223a aVar) {
                if (!C0205f.this.f460e) {
                    C0205f.this.f461f.register(aVar, new C1301e("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                    synchronized (C0205f.this.f458c) {
                        C0216l lVar = C0205f.this.f470o;
                    }
                }
            }

            /* renamed from: f5 */
            public List<QueueItem> mo625f5() {
                return null;
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            /* renamed from: l5 */
            public void mo627l5() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: m1 */
            public boolean mo628m1() {
                return false;
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: o1 */
            public void mo630o1(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r1 */
            public void mo633r1(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t0 */
            public void mo635t0(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t1 */
            public void mo636t1(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: v0 */
            public String mo637v0() {
                throw new AssertionError();
            }

            /* renamed from: w0 */
            public void mo638w0(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: w2 */
            public CharSequence mo639w2() {
                throw new AssertionError();
            }

            /* renamed from: z3 */
            public void mo640z3(float f) throws RemoteException {
                throw new AssertionError();
            }
        }

        C0205f(Context context, String str, C5755b bVar, Bundle bundle) {
            MediaSession r = mo589r(context, str, bundle);
            this.f456a = r;
            this.f457b = new Token(r.getSessionToken(), new C0206a(), bVar);
            this.f459d = bundle;
            mo566c(3);
        }

        /* renamed from: N */
        public PlaybackStateCompat mo561N() {
            return this.f462g;
        }

        /* renamed from: N0 */
        public void mo562N0(int i) {
            if (this.f468m != i) {
                this.f468m = i;
                synchronized (this.f458c) {
                    for (int beginBroadcast = this.f461f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f461f.getBroadcastItem(beginBroadcast).mo455S4(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f461f.finishBroadcast();
                }
            }
        }

        /* renamed from: Q */
        public void mo563Q(int i) {
            if (this.f467l != i) {
                this.f467l = i;
                synchronized (this.f458c) {
                    for (int beginBroadcast = this.f461f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f461f.getBroadcastItem(beginBroadcast).mo460y0(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f461f.finishBroadcast();
                }
            }
        }

        /* renamed from: a */
        public void mo564a() {
            this.f460e = true;
            this.f461f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f456a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f456a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.f456a.setCallback((MediaSession.Callback) null);
            this.f456a.release();
        }

        /* renamed from: b */
        public boolean mo565b() {
            return this.f456a.isActive();
        }

        /* renamed from: c */
        public void mo566c(int i) {
            this.f456a.setFlags(i | 1 | 2);
        }

        /* renamed from: d */
        public Token mo567d() {
            return this.f457b;
        }

        /* renamed from: e */
        public String mo568e() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f456a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f456a, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        /* renamed from: f */
        public void mo569f(PendingIntent pendingIntent) {
            this.f456a.setSessionActivity(pendingIntent);
        }

        /* renamed from: g */
        public void mo570g(C0197b bVar, Handler handler) {
            synchronized (this.f458c) {
                this.f469n = bVar;
                this.f456a.setCallback(bVar == null ? null : bVar.f447b, handler);
                if (bVar != null) {
                    bVar.mo512D(this, handler);
                }
            }
        }

        /* renamed from: h */
        public void mo571h(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f456a.setPlaybackToLocal(builder.build());
        }

        /* renamed from: i */
        public C0197b mo572i() {
            C0197b bVar;
            synchronized (this.f458c) {
                bVar = this.f469n;
            }
            return bVar;
        }

        /* renamed from: j */
        public void mo573j(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f464i = mediaMetadataCompat;
            MediaSession mediaSession = this.f456a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.mo383g();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        /* renamed from: k */
        public void mo574k(PendingIntent pendingIntent) {
            this.f456a.setMediaButtonReceiver(pendingIntent);
        }

        /* renamed from: l */
        public void mo575l(List<QueueItem> list) {
            this.f463h = list;
            if (list == null) {
                this.f456a.setQueue((List) null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (QueueItem e : list) {
                arrayList.add((MediaSession.QueueItem) e.mo482e());
            }
            this.f456a.setQueue(arrayList);
        }

        /* renamed from: m */
        public void mo576m(boolean z) {
            this.f456a.setActive(z);
        }

        /* renamed from: n */
        public void mo577n(C1301e eVar) {
            synchronized (this.f458c) {
                this.f471p = eVar;
            }
        }

        /* renamed from: o */
        public void mo578o(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f462g = playbackStateCompat;
            synchronized (this.f458c) {
                for (int beginBroadcast = this.f461f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f461f.getBroadcastItem(beginBroadcast).mo458v6(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f461f.finishBroadcast();
            }
            MediaSession mediaSession = this.f456a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.mo666e();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        /* renamed from: p */
        public void mo579p(C1308l lVar) {
            this.f456a.setPlaybackToRemote((VolumeProvider) lVar.mo4621d());
        }

        /* renamed from: q */
        public C1301e mo580q() {
            C1301e eVar;
            synchronized (this.f458c) {
                eVar = this.f471p;
            }
            return eVar;
        }

        /* renamed from: r */
        public MediaSession mo589r(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        /* renamed from: w0 */
        public void mo581w0(boolean z) {
            if (this.f466k != z) {
                this.f466k = z;
                synchronized (this.f458c) {
                    for (int beginBroadcast = this.f461f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f461f.getBroadcastItem(beginBroadcast).mo457h3(z);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f461f.finishBroadcast();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0207g extends C0205f {
        C0207g(Context context, String str, C5755b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$h */
    static class C0208h extends C0207g {
        C0208h(Context context, String str, C5755b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        /* renamed from: n */
        public void mo577n(C1301e eVar) {
        }

        /* renamed from: q */
        public final C1301e mo580q() {
            return new C1301e(this.f456a.getCurrentControllerInfo());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$i */
    static class C0209i extends C0208h {
        C0209i(Context context, String str, C5755b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        /* renamed from: r */
        public MediaSession mo589r(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$j */
    static class C0210j implements C0200c {

        /* renamed from: A */
        int f473A;

        /* renamed from: B */
        int f474B;

        /* renamed from: C */
        Bundle f475C;

        /* renamed from: D */
        int f476D;

        /* renamed from: E */
        int f477E;

        /* renamed from: F */
        C1308l f478F;

        /* renamed from: G */
        private C1308l.C1312d f479G = new C0211a();

        /* renamed from: a */
        private final Context f480a;

        /* renamed from: b */
        private final ComponentName f481b;

        /* renamed from: c */
        private final PendingIntent f482c;

        /* renamed from: d */
        private final C0213c f483d;

        /* renamed from: e */
        private final Token f484e;

        /* renamed from: f */
        final String f485f;

        /* renamed from: g */
        final Bundle f486g;

        /* renamed from: h */
        final String f487h;

        /* renamed from: i */
        final AudioManager f488i;

        /* renamed from: j */
        final RemoteControlClient f489j;

        /* renamed from: k */
        final Object f490k = new Object();

        /* renamed from: l */
        final RemoteCallbackList<C0223a> f491l = new RemoteCallbackList<>();

        /* renamed from: m */
        private C0214d f492m;

        /* renamed from: n */
        boolean f493n = false;

        /* renamed from: o */
        boolean f494o = false;

        /* renamed from: p */
        volatile C0197b f495p;

        /* renamed from: q */
        private C1301e f496q;

        /* renamed from: r */
        C0216l f497r;

        /* renamed from: s */
        int f498s = 3;

        /* renamed from: t */
        MediaMetadataCompat f499t;

        /* renamed from: u */
        PlaybackStateCompat f500u;

        /* renamed from: v */
        PendingIntent f501v;

        /* renamed from: w */
        List<QueueItem> f502w;

        /* renamed from: x */
        CharSequence f503x;

        /* renamed from: y */
        int f504y;

        /* renamed from: z */
        boolean f505z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$a */
        class C0211a extends C1308l.C1312d {
            C0211a() {
            }

            /* renamed from: a */
            public void mo648a(C1308l lVar) {
                if (C0210j.this.f478F == lVar) {
                    C0210j jVar = C0210j.this;
                    C0210j.this.mo641F(new ParcelableVolumeInfo(jVar.f476D, jVar.f477E, lVar.mo4620c(), lVar.mo4619b(), lVar.mo4618a()));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$b */
        private static final class C0212b {

            /* renamed from: a */
            public final String f507a;

            /* renamed from: b */
            public final Bundle f508b;

            /* renamed from: c */
            public final ResultReceiver f509c;

            public C0212b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f507a = str;
                this.f508b = bundle;
                this.f509c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$c */
        class C0213c extends C0226b.C0227a {
            C0213c() {
            }

            /* renamed from: C1 */
            public void mo590C1(MediaDescriptionCompat mediaDescriptionCompat) {
                mo651i5(27, mediaDescriptionCompat);
            }

            /* renamed from: D2 */
            public MediaMetadataCompat mo591D2() {
                return C0210j.this.f499t;
            }

            /* renamed from: E0 */
            public void mo592E0() throws RemoteException {
                mo649P0(7);
            }

            /* renamed from: E1 */
            public boolean mo593E1() {
                return true;
            }

            /* renamed from: E2 */
            public void mo594E2(String str, Bundle bundle) throws RemoteException {
                mo653r6(4, str, bundle);
            }

            /* renamed from: E4 */
            public int mo595E4() {
                return C0210j.this.f474B;
            }

            /* renamed from: F2 */
            public Bundle mo596F2() {
                if (C0210j.this.f486g == null) {
                    return null;
                }
                return new Bundle(C0210j.this.f486g);
            }

            /* renamed from: G1 */
            public void mo597G1(MediaDescriptionCompat mediaDescriptionCompat) {
                mo651i5(25, mediaDescriptionCompat);
            }

            /* renamed from: G2 */
            public void mo598G2(C0223a aVar) {
                C0210j.this.f491l.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (C0210j.this.f490k) {
                    C0216l lVar = C0210j.this.f497r;
                }
            }

            /* renamed from: G3 */
            public boolean mo599G3(KeyEvent keyEvent) {
                mo651i5(21, keyEvent);
                return true;
            }

            /* renamed from: G4 */
            public void mo600G4(int i) {
                mo652o3(28, i);
            }

            /* renamed from: H */
            public void mo601H() throws RemoteException {
                mo649P0(3);
            }

            /* renamed from: J0 */
            public long mo602J0() {
                long j;
                synchronized (C0210j.this.f490k) {
                    j = (long) C0210j.this.f498s;
                }
                return j;
            }

            /* renamed from: J4 */
            public boolean mo603J4() {
                return C0210j.this.f505z;
            }

            /* renamed from: K0 */
            public int mo604K0() {
                return C0210j.this.f473A;
            }

            /* renamed from: K5 */
            public void mo605K5(long j) {
                mo651i5(11, Long.valueOf(j));
            }

            /* renamed from: L5 */
            public void mo606L5(boolean z) throws RemoteException {
            }

            /* renamed from: M0 */
            public Bundle mo607M0() {
                Bundle bundle;
                synchronized (C0210j.this.f490k) {
                    bundle = C0210j.this.f475C;
                }
                return bundle;
            }

            /* renamed from: M1 */
            public PendingIntent mo608M1() {
                PendingIntent pendingIntent;
                synchronized (C0210j.this.f490k) {
                    pendingIntent = C0210j.this.f501v;
                }
                return pendingIntent;
            }

            /* renamed from: N */
            public PlaybackStateCompat mo609N() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0210j.this.f490k) {
                    C0210j jVar = C0210j.this;
                    playbackStateCompat = jVar.f500u;
                    mediaMetadataCompat = jVar.f499t;
                }
                return MediaSessionCompat.m810d(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: N0 */
            public void mo610N0(int i) throws RemoteException {
                mo652o3(30, i);
            }

            /* renamed from: O2 */
            public void mo611O2(String str, Bundle bundle) throws RemoteException {
                mo653r6(8, str, bundle);
            }

            /* renamed from: O5 */
            public ParcelableVolumeInfo mo612O5() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0210j.this.f490k) {
                    C0210j jVar = C0210j.this;
                    i = jVar.f476D;
                    i2 = jVar.f477E;
                    C1308l lVar = jVar.f478F;
                    i3 = 2;
                    if (i == 2) {
                        int c = lVar.mo4620c();
                        int b = lVar.mo4619b();
                        i4 = lVar.mo4618a();
                        i5 = b;
                        i3 = c;
                    } else {
                        i5 = jVar.f488i.getStreamMaxVolume(i2);
                        i4 = C0210j.this.f488i.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i5, i4);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: P0 */
            public void mo649P0(int i) {
                C0210j.this.mo647w(i, 0, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: P1 */
            public int mo613P1() {
                return C0210j.this.f504y;
            }

            /* renamed from: Q */
            public void mo614Q(int i) throws RemoteException {
                mo652o3(23, i);
            }

            /* renamed from: R1 */
            public void mo615R1(String str, Bundle bundle) throws RemoteException {
                mo653r6(5, str, bundle);
            }

            /* renamed from: R3 */
            public void mo616R3(int i, int i2, String str) {
                C0210j.this.mo644r(i, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: T5 */
            public void mo650T5(int i, Object obj, int i2) {
                C0210j.this.mo647w(i, i2, 0, obj, (Bundle) null);
            }

            /* renamed from: U2 */
            public void mo617U2(String str, Bundle bundle) throws RemoteException {
                mo653r6(9, str, bundle);
            }

            /* renamed from: W2 */
            public void mo618W2() throws RemoteException {
                mo649P0(16);
            }

            /* renamed from: X0 */
            public void mo619X0(String str, Bundle bundle) throws RemoteException {
                mo653r6(20, str, bundle);
            }

            /* renamed from: X3 */
            public void mo620X3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                mo653r6(31, ratingCompat, bundle);
            }

            /* renamed from: b3 */
            public void mo621b3(Uri uri, Bundle bundle) throws RemoteException {
                mo653r6(10, uri, bundle);
            }

            /* renamed from: d4 */
            public void mo622d4(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo650T5(26, mediaDescriptionCompat, i);
            }

            /* renamed from: d5 */
            public void mo623d5(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.f440a;
                }
                mo651i5(1, new C0212b(str, bundle, resultReceiver));
            }

            /* renamed from: e1 */
            public void mo624e1(C0223a aVar) {
                if (C0210j.this.f493n) {
                    try {
                        aVar.mo427b4();
                    } catch (Exception unused) {
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    C0210j.this.f491l.register(aVar, new C1301e(C0210j.this.mo645t(callingUid), callingPid, callingUid));
                    synchronized (C0210j.this.f490k) {
                        C0216l lVar = C0210j.this.f497r;
                    }
                }
            }

            /* renamed from: f5 */
            public List<QueueItem> mo625f5() {
                List<QueueItem> list;
                synchronized (C0210j.this.f490k) {
                    list = C0210j.this.f502w;
                }
                return list;
            }

            public String getPackageName() {
                return C0210j.this.f485f;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i5 */
            public void mo651i5(int i, Object obj) {
                C0210j.this.mo647w(i, 0, 0, obj, (Bundle) null);
            }

            /* renamed from: l5 */
            public void mo627l5() throws RemoteException {
                mo649P0(17);
            }

            /* renamed from: m1 */
            public boolean mo628m1() {
                return false;
            }

            public void next() throws RemoteException {
                mo649P0(14);
            }

            /* renamed from: o1 */
            public void mo630o1(RatingCompat ratingCompat) throws RemoteException {
                mo651i5(19, ratingCompat);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: o3 */
            public void mo652o3(int i, int i2) {
                C0210j.this.mo647w(i, i2, 0, (Object) null, (Bundle) null);
            }

            public void pause() throws RemoteException {
                mo649P0(12);
            }

            public void previous() throws RemoteException {
                mo649P0(15);
            }

            /* renamed from: r1 */
            public void mo633r1(int i, int i2, String str) {
                C0210j.this.mo642H(i, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: r6 */
            public void mo653r6(int i, Object obj, Bundle bundle) {
                C0210j.this.mo647w(i, 0, 0, obj, bundle);
            }

            public void stop() throws RemoteException {
                mo649P0(13);
            }

            /* renamed from: t0 */
            public void mo635t0(long j) throws RemoteException {
                mo651i5(18, Long.valueOf(j));
            }

            /* renamed from: t1 */
            public void mo636t1(Uri uri, Bundle bundle) throws RemoteException {
                mo653r6(6, uri, bundle);
            }

            /* renamed from: v0 */
            public String mo637v0() {
                return C0210j.this.f487h;
            }

            /* renamed from: w0 */
            public void mo638w0(boolean z) throws RemoteException {
                mo651i5(29, Boolean.valueOf(z));
            }

            /* renamed from: w2 */
            public CharSequence mo639w2() {
                return C0210j.this.f503x;
            }

            /* renamed from: z3 */
            public void mo640z3(float f) throws RemoteException {
                mo651i5(32, Float.valueOf(f));
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$j$d */
        class C0214d extends Handler {
            public C0214d(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m1078a(KeyEvent keyEvent, C0197b bVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C0210j.this.f500u;
                    long b = playbackStateCompat == null ? 0 : playbackStateCompat.mo662b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case C8710R.styleable.AppCompatTheme_listPreferredItemPaddingStart /*85*/:
                                        break;
                                    case 86:
                                        if ((b & 1) != 0) {
                                            bVar.mo511C();
                                            return;
                                        }
                                        return;
                                    case C8710R.styleable.AppCompatTheme_panelMenuListTheme /*87*/:
                                        if ((b & 32) != 0) {
                                            bVar.mo538z();
                                            return;
                                        }
                                        return;
                                    case C8710R.styleable.AppCompatTheme_panelMenuListWidth /*88*/:
                                        if ((b & 16) != 0) {
                                            bVar.mo509A();
                                            return;
                                        }
                                        return;
                                    case C8710R.styleable.AppCompatTheme_popupMenuStyle /*89*/:
                                        if ((b & 8) != 0) {
                                            bVar.mo530r();
                                            return;
                                        }
                                        return;
                                    case C8710R.styleable.AppCompatTheme_popupWindowStyle /*90*/:
                                        if ((b & 64) != 0) {
                                            bVar.mo518f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((b & 2) != 0) {
                                bVar.mo520h();
                                return;
                            } else {
                                return;
                            }
                        } else if ((b & 4) != 0) {
                            bVar.mo521i();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            public void handleMessage(Message message) {
                C0197b bVar = C0210j.this.f495p;
                if (bVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m809a(data);
                    C0210j.this.mo577n(new C1301e(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.m809a(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C0212b bVar2 = (C0212b) message.obj;
                                bVar.mo516d(bVar2.f507a, bVar2.f508b, bVar2.f509c);
                                break;
                            case 2:
                                C0210j.this.mo644r(message.arg1, 0);
                                break;
                            case 3:
                                bVar.mo525m();
                                break;
                            case 4:
                                bVar.mo526n((String) message.obj, bundle);
                                break;
                            case 5:
                                bVar.mo527o((String) message.obj, bundle);
                                break;
                            case 6:
                                bVar.mo528p((Uri) message.obj, bundle);
                                break;
                            case 7:
                                bVar.mo521i();
                                break;
                            case 8:
                                bVar.mo522j((String) message.obj, bundle);
                                break;
                            case 9:
                                bVar.mo523k((String) message.obj, bundle);
                                break;
                            case 10:
                                bVar.mo524l((Uri) message.obj, bundle);
                                break;
                            case 11:
                                bVar.mo510B(((Long) message.obj).longValue());
                                break;
                            case 12:
                                bVar.mo520h();
                                break;
                            case 13:
                                bVar.mo511C();
                                break;
                            case 14:
                                bVar.mo538z();
                                break;
                            case 15:
                                bVar.mo509A();
                                break;
                            case 16:
                                bVar.mo518f();
                                break;
                            case 17:
                                bVar.mo530r();
                                break;
                            case 18:
                                bVar.mo531s(((Long) message.obj).longValue());
                                break;
                            case 19:
                                bVar.mo534v((RatingCompat) message.obj);
                                break;
                            case 20:
                                bVar.mo517e((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!bVar.mo519g(intent)) {
                                    m1078a(keyEvent, bVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0210j.this.mo642H(message.arg1, 0);
                                break;
                            case 23:
                                bVar.mo536x(message.arg1);
                                break;
                            case 25:
                                bVar.mo514b((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                bVar.mo515c((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                bVar.mo529q((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = C0210j.this.f502w;
                                if (list != null) {
                                    int i = message.arg1;
                                    QueueItem queueItem = (i < 0 || i >= list.size()) ? null : C0210j.this.f502w.get(message.arg1);
                                    if (queueItem != null) {
                                        bVar.mo529q(queueItem.mo479c());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                bVar.mo532t(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                bVar.mo537y(message.arg1);
                                break;
                            case 31:
                                bVar.mo535w((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                bVar.mo533u(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        C0210j.this.mo577n((C1301e) null);
                    }
                }
            }
        }

        public C0210j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C5755b bVar, Bundle bundle) {
            if (componentName != null) {
                this.f480a = context;
                this.f485f = context.getPackageName();
                this.f486g = bundle;
                this.f488i = (AudioManager) context.getSystemService("audio");
                this.f487h = str;
                this.f481b = componentName;
                this.f482c = pendingIntent;
                C0213c cVar = new C0213c();
                this.f483d = cVar;
                this.f484e = new Token(cVar, (C0226b) null, bVar);
                this.f504y = 0;
                this.f476D = 1;
                this.f477E = 3;
                this.f489j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        /* renamed from: A */
        private void m986A(List<QueueItem> list) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo429p2(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* renamed from: B */
        private void m987B(int i) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo460y0(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* renamed from: C */
        private void m988C() {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo427b4();
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
                this.f491l.kill();
            }
        }

        /* renamed from: D */
        private void m989D(int i) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo455S4(i);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* renamed from: E */
        private void m990E(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo458v6(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* renamed from: y */
        private void m991y(boolean z) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo457h3(z);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* renamed from: z */
        private void m992z(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo428g4(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo641F(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.f490k) {
                for (int beginBroadcast = this.f491l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f491l.getBroadcastItem(beginBroadcast).mo424F6(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.f491l.finishBroadcast();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo582G(PlaybackStateCompat playbackStateCompat) {
            this.f489j.setPlaybackState(mo646u(playbackStateCompat.mo668g()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo642H(int i, int i2) {
            if (this.f476D == 2) {
                C1308l lVar = this.f478F;
                if (lVar != null) {
                    lVar.mo4623f(i);
                    return;
                }
                return;
            }
            this.f488i.setStreamVolume(this.f477E, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public void mo583I(PendingIntent pendingIntent, ComponentName componentName) {
            this.f488i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo643J() {
            if (this.f494o) {
                mo585x(this.f482c, this.f481b);
                this.f488i.registerRemoteControlClient(this.f489j);
                mo573j(this.f499t);
                mo578o(this.f500u);
                return;
            }
            mo583I(this.f482c, this.f481b);
            this.f489j.setPlaybackState(0);
            this.f488i.unregisterRemoteControlClient(this.f489j);
        }

        /* renamed from: N */
        public PlaybackStateCompat mo561N() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f490k) {
                playbackStateCompat = this.f500u;
            }
            return playbackStateCompat;
        }

        /* renamed from: N0 */
        public void mo562N0(int i) {
            if (this.f474B != i) {
                this.f474B = i;
                m989D(i);
            }
        }

        /* renamed from: Q */
        public void mo563Q(int i) {
            if (this.f473A != i) {
                this.f473A = i;
                m987B(i);
            }
        }

        /* renamed from: a */
        public void mo564a() {
            this.f494o = false;
            this.f493n = true;
            mo643J();
            m988C();
            mo570g((C0197b) null, (Handler) null);
        }

        /* renamed from: b */
        public boolean mo565b() {
            return this.f494o;
        }

        /* renamed from: c */
        public void mo566c(int i) {
            synchronized (this.f490k) {
                this.f498s = i | 1 | 2;
            }
        }

        /* renamed from: d */
        public Token mo567d() {
            return this.f484e;
        }

        /* renamed from: e */
        public String mo568e() {
            return null;
        }

        /* renamed from: f */
        public void mo569f(PendingIntent pendingIntent) {
            synchronized (this.f490k) {
                this.f501v = pendingIntent;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo570g(android.support.p009v4.media.session.MediaSessionCompat.C0197b r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f490k
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$j$d r1 = r4.f492m     // Catch:{ all -> 0x0037 }
                r2 = 0
                if (r1 == 0) goto L_0x000b
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0037 }
            L_0x000b:
                if (r5 == 0) goto L_0x001a
                if (r6 != 0) goto L_0x0010
                goto L_0x001a
            L_0x0010:
                android.support.v4.media.session.MediaSessionCompat$j$d r1 = new android.support.v4.media.session.MediaSessionCompat$j$d     // Catch:{ all -> 0x0037 }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x0037 }
                r1.<init>(r3)     // Catch:{ all -> 0x0037 }
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                r4.f492m = r1     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f495p     // Catch:{ all -> 0x0037 }
                if (r1 == r5) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f495p     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f495p     // Catch:{ all -> 0x0037 }
                r1.mo512D(r2, r2)     // Catch:{ all -> 0x0037 }
            L_0x002a:
                r4.f495p = r5     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f495p     // Catch:{ all -> 0x0037 }
                if (r5 == 0) goto L_0x0035
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f495p     // Catch:{ all -> 0x0037 }
                r5.mo512D(r4, r6)     // Catch:{ all -> 0x0037 }
            L_0x0035:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                return
            L_0x0037:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.media.session.MediaSessionCompat.C0210j.mo570g(android.support.v4.media.session.MediaSessionCompat$b, android.os.Handler):void");
        }

        /* renamed from: h */
        public void mo571h(int i) {
            C1308l lVar = this.f478F;
            if (lVar != null) {
                lVar.mo4624g((C1308l.C1312d) null);
            }
            this.f477E = i;
            this.f476D = 1;
            int i2 = this.f476D;
            int i3 = this.f477E;
            mo641F(new ParcelableVolumeInfo(i2, i3, 2, this.f488i.getStreamMaxVolume(i3), this.f488i.getStreamVolume(this.f477E)));
        }

        /* renamed from: i */
        public C0197b mo572i() {
            C0197b bVar;
            synchronized (this.f490k) {
                bVar = this.f495p;
            }
            return bVar;
        }

        /* renamed from: j */
        public void mo573j(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C0180b(mediaMetadataCompat, MediaSessionCompat.f433d).mo392a();
            }
            synchronized (this.f490k) {
                this.f499t = mediaMetadataCompat;
            }
            m992z(mediaMetadataCompat);
            if (this.f494o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.mo379d();
                }
                mo587s(bundle).apply();
            }
        }

        /* renamed from: k */
        public void mo574k(PendingIntent pendingIntent) {
        }

        /* renamed from: l */
        public void mo575l(List<QueueItem> list) {
            this.f502w = list;
            m986A(list);
        }

        /* renamed from: m */
        public void mo576m(boolean z) {
            if (z != this.f494o) {
                this.f494o = z;
                mo643J();
            }
        }

        /* renamed from: n */
        public void mo577n(C1301e eVar) {
            synchronized (this.f490k) {
                this.f496q = eVar;
            }
        }

        /* renamed from: o */
        public void mo578o(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f490k) {
                this.f500u = playbackStateCompat;
            }
            m990E(playbackStateCompat);
            if (this.f494o) {
                if (playbackStateCompat == null) {
                    this.f489j.setPlaybackState(0);
                    this.f489j.setTransportControlFlags(0);
                    return;
                }
                mo582G(playbackStateCompat);
                this.f489j.setTransportControlFlags(mo584v(playbackStateCompat.mo662b()));
            }
        }

        /* renamed from: p */
        public void mo579p(C1308l lVar) {
            if (lVar != null) {
                C1308l lVar2 = this.f478F;
                if (lVar2 != null) {
                    lVar2.mo4624g((C1308l.C1312d) null);
                }
                this.f476D = 2;
                this.f478F = lVar;
                mo641F(new ParcelableVolumeInfo(this.f476D, this.f477E, this.f478F.mo4620c(), this.f478F.mo4619b(), this.f478F.mo4618a()));
                lVar.mo4624g(this.f479G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        /* renamed from: q */
        public C1301e mo580q() {
            C1301e eVar;
            synchronized (this.f490k) {
                eVar = this.f496q;
            }
            return eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo644r(int i, int i2) {
            if (this.f476D == 2) {
                C1308l lVar = this.f478F;
                if (lVar != null) {
                    lVar.mo4622e(i);
                    return;
                }
                return;
            }
            this.f488i.adjustStreamVolume(this.f477E, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public RemoteControlClient.MetadataEditor mo587s(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f489j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public String mo645t(int i) {
            String nameForUid = this.f480a.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public int mo646u(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public int mo584v(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo647w(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f490k) {
                C0214d dVar = this.f492m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", mo645t(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* renamed from: w0 */
        public void mo581w0(boolean z) {
            if (this.f505z != z) {
                this.f505z = z;
                m991y(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo585x(PendingIntent pendingIntent, ComponentName componentName) {
            this.f488i.registerMediaButtonEventReceiver(componentName);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$k */
    public interface C0215k {
        /* renamed from: a */
        void mo655a();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$l */
    static final class C0216l extends Handler {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    /* renamed from: a */
    public static void m809a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: d */
    static PlaybackStateCompat m810d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.mo667f() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.mo668g() != 3 && playbackStateCompat.mo668g() != 4 && playbackStateCompat.mo668g() != 5) {
            return playbackStateCompat;
        }
        long c = playbackStateCompat.mo663c();
        if (c <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d = ((long) (playbackStateCompat.mo664d() * ((float) (elapsedRealtime - c)))) + playbackStateCompat.mo667f();
        if (mediaMetadataCompat != null && mediaMetadataCompat.mo377a("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.mo382f("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.C0222d(playbackStateCompat).mo689g(playbackStateCompat.mo668g(), (j < 0 || d <= j) ? d < 0 ? 0 : d : j, playbackStateCompat.mo664d(), elapsedRealtime).mo683a();
    }

    /* renamed from: u */
    public static Bundle m811u(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m809a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: b */
    public MediaControllerCompat mo461b() {
        return this.f435b;
    }

    /* renamed from: c */
    public Token mo462c() {
        return this.f434a.mo567d();
    }

    /* renamed from: e */
    public boolean mo463e() {
        return this.f434a.mo565b();
    }

    /* renamed from: f */
    public void mo464f() {
        this.f434a.mo564a();
    }

    /* renamed from: g */
    public void mo465g(boolean z) {
        this.f434a.mo576m(z);
        Iterator<C0215k> it = this.f436c.iterator();
        while (it.hasNext()) {
            it.next().mo655a();
        }
    }

    /* renamed from: h */
    public void mo466h(C0197b bVar) {
        mo467i(bVar, (Handler) null);
    }

    /* renamed from: i */
    public void mo467i(C0197b bVar, Handler handler) {
        if (bVar == null) {
            this.f434a.mo570g((C0197b) null, (Handler) null);
            return;
        }
        C0200c cVar = this.f434a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.mo570g(bVar, handler);
    }

    /* renamed from: j */
    public void mo468j(boolean z) {
        this.f434a.mo581w0(z);
    }

    /* renamed from: k */
    public void mo469k(int i) {
        this.f434a.mo566c(i);
    }

    /* renamed from: l */
    public void mo470l(PendingIntent pendingIntent) {
        this.f434a.mo574k(pendingIntent);
    }

    /* renamed from: m */
    public void mo471m(MediaMetadataCompat mediaMetadataCompat) {
        this.f434a.mo573j(mediaMetadataCompat);
    }

    /* renamed from: n */
    public void mo472n(PlaybackStateCompat playbackStateCompat) {
        this.f434a.mo578o(playbackStateCompat);
    }

    /* renamed from: o */
    public void mo473o(int i) {
        this.f434a.mo571h(i);
    }

    /* renamed from: p */
    public void mo474p(C1308l lVar) {
        if (lVar != null) {
            this.f434a.mo579p(lVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    /* renamed from: q */
    public void mo475q(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem next : list) {
                if (next != null) {
                    if (hashSet.contains(Long.valueOf(next.mo480d()))) {
                        Log.e("MediaSessionCompat", "Found duplicate queue id: " + next.mo480d(), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(next.mo480d()));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        this.f434a.mo575l(list);
    }

    /* renamed from: r */
    public void mo476r(int i) {
        this.f434a.mo563Q(i);
    }

    /* renamed from: s */
    public void mo477s(PendingIntent pendingIntent) {
        this.f434a.mo569f(pendingIntent);
    }

    /* renamed from: t */
    public void mo478t(int i) {
        this.f434a.mo562N0(i);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (C5755b) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, C5755b bVar) {
        this.f436c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = C4713a.m30439a(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (i >= 29) {
                    this.f434a = new C0209i(context, str, bVar, bundle);
                } else if (i >= 28) {
                    this.f434a = new C0208h(context, str, bVar, bundle);
                } else if (i >= 22) {
                    this.f434a = new C0207g(context, str, bVar, bundle);
                } else {
                    this.f434a = new C0205f(context, str, bVar, bundle);
                }
                mo467i(new C0196a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f434a.mo574k(pendingIntent2);
            } else if (i >= 19) {
                this.f434a = new C0203e(context, str, componentName2, pendingIntent2, bVar, bundle);
            } else if (i >= 18) {
                this.f434a = new C0201d(context, str, componentName2, pendingIntent2, bVar, bundle);
            } else {
                this.f434a = new C0210j(context, str, componentName2, pendingIntent2, bVar, bundle);
            }
            this.f435b = new MediaControllerCompat(context, this);
            if (f433d == 0) {
                f433d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
