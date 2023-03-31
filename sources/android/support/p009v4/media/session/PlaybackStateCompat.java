package android.support.p009v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0219a();

    /* renamed from: a */
    final int f517a;

    /* renamed from: b */
    final long f518b;

    /* renamed from: c */
    final long f519c;

    /* renamed from: d */
    final float f520d;

    /* renamed from: e */
    final long f521e;

    /* renamed from: f */
    final int f522f;

    /* renamed from: g */
    final CharSequence f523g;

    /* renamed from: h */
    final long f524h;

    /* renamed from: i */
    List<CustomAction> f525i;

    /* renamed from: r */
    final long f526r;

    /* renamed from: s */
    final Bundle f527s;

    /* renamed from: t */
    private PlaybackState f528t;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    class C0219a implements Parcelable.Creator<PlaybackStateCompat> {
        C0219a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    private static class C0220b {
        /* renamed from: a */
        static void m1096a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        /* renamed from: b */
        static PlaybackState.CustomAction m1097b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        /* renamed from: c */
        static PlaybackState m1098c(PlaybackState.Builder builder) {
            return builder.build();
        }

        /* renamed from: d */
        static PlaybackState.Builder m1099d() {
            return new PlaybackState.Builder();
        }

        /* renamed from: e */
        static PlaybackState.CustomAction.Builder m1100e(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        /* renamed from: f */
        static String m1101f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        /* renamed from: g */
        static long m1102g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        /* renamed from: h */
        static long m1103h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        /* renamed from: i */
        static long m1104i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        /* renamed from: j */
        static List<PlaybackState.CustomAction> m1105j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        /* renamed from: k */
        static CharSequence m1106k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        /* renamed from: l */
        static Bundle m1107l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        /* renamed from: m */
        static int m1108m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        /* renamed from: n */
        static long m1109n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        /* renamed from: o */
        static CharSequence m1110o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        /* renamed from: p */
        static float m1111p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        /* renamed from: q */
        static long m1112q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        /* renamed from: r */
        static int m1113r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        /* renamed from: s */
        static void m1114s(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        /* renamed from: t */
        static void m1115t(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        /* renamed from: u */
        static void m1116u(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        /* renamed from: v */
        static void m1117v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        /* renamed from: w */
        static void m1118w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: x */
        static void m1119x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    private static class C0221c {
        /* renamed from: a */
        static Bundle m1120a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        /* renamed from: b */
        static void m1121b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f517a = i;
        this.f518b = j;
        this.f519c = j2;
        this.f520d = f;
        this.f521e = j3;
        this.f522f = i2;
        this.f523g = charSequence;
        this.f524h = j4;
        this.f525i = new ArrayList(list);
        this.f526r = j5;
        this.f527s = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1082a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = C0220b.m1105j(playbackState);
        if (j != null) {
            ArrayList arrayList2 = new ArrayList(j.size());
            for (PlaybackState.CustomAction a : j) {
                arrayList2.add(CustomAction.m1090a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0221c.m1120a(playbackState);
            MediaSessionCompat.m809a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0220b.m1113r(playbackState), C0220b.m1112q(playbackState), C0220b.m1104i(playbackState), C0220b.m1111p(playbackState), C0220b.m1102g(playbackState), 0, C0220b.m1106k(playbackState), C0220b.m1109n(playbackState), arrayList, C0220b.m1103h(playbackState), bundle);
        playbackStateCompat.f528t = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: h */
    public static int m1083h(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    /* renamed from: b */
    public long mo662b() {
        return this.f521e;
    }

    /* renamed from: c */
    public long mo663c() {
        return this.f524h;
    }

    /* renamed from: d */
    public float mo664d() {
        return this.f520d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Object mo666e() {
        if (this.f528t == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder d = C0220b.m1099d();
            C0220b.m1119x(d, this.f517a, this.f518b, this.f520d, this.f524h);
            C0220b.m1116u(d, this.f519c);
            C0220b.m1114s(d, this.f521e);
            C0220b.m1117v(d, this.f523g);
            for (CustomAction b : this.f525i) {
                C0220b.m1096a(d, (PlaybackState.CustomAction) b.mo671b());
            }
            C0220b.m1115t(d, this.f526r);
            if (Build.VERSION.SDK_INT >= 22) {
                C0221c.m1121b(d, this.f527s);
            }
            this.f528t = C0220b.m1098c(d);
        }
        return this.f528t;
    }

    /* renamed from: f */
    public long mo667f() {
        return this.f518b;
    }

    /* renamed from: g */
    public int mo668g() {
        return this.f517a;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f517a + ", position=" + this.f518b + ", buffered position=" + this.f519c + ", speed=" + this.f520d + ", updated=" + this.f524h + ", actions=" + this.f521e + ", error code=" + this.f522f + ", error message=" + this.f523g + ", custom actions=" + this.f525i + ", active item id=" + this.f526r + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f517a);
        parcel.writeLong(this.f518b);
        parcel.writeFloat(this.f520d);
        parcel.writeLong(this.f524h);
        parcel.writeLong(this.f519c);
        parcel.writeLong(this.f521e);
        TextUtils.writeToParcel(this.f523g, parcel, i);
        parcel.writeTypedList(this.f525i);
        parcel.writeLong(this.f526r);
        parcel.writeBundle(this.f527s);
        parcel.writeInt(this.f522f);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public static final class C0222d {

        /* renamed from: a */
        private final List<CustomAction> f534a;

        /* renamed from: b */
        private int f535b;

        /* renamed from: c */
        private long f536c;

        /* renamed from: d */
        private long f537d;

        /* renamed from: e */
        private float f538e;

        /* renamed from: f */
        private long f539f;

        /* renamed from: g */
        private int f540g;

        /* renamed from: h */
        private CharSequence f541h;

        /* renamed from: i */
        private long f542i;

        /* renamed from: j */
        private long f543j;

        /* renamed from: k */
        private Bundle f544k;

        public C0222d() {
            this.f534a = new ArrayList();
            this.f543j = -1;
        }

        /* renamed from: a */
        public PlaybackStateCompat mo683a() {
            return new PlaybackStateCompat(this.f535b, this.f536c, this.f537d, this.f538e, this.f539f, this.f540g, this.f541h, this.f542i, this.f534a, this.f543j, this.f544k);
        }

        /* renamed from: b */
        public C0222d mo684b(long j) {
            this.f539f = j;
            return this;
        }

        /* renamed from: c */
        public C0222d mo685c(long j) {
            this.f543j = j;
            return this;
        }

        /* renamed from: d */
        public C0222d mo686d(long j) {
            this.f537d = j;
            return this;
        }

        /* renamed from: e */
        public C0222d mo687e(int i, CharSequence charSequence) {
            this.f540g = i;
            this.f541h = charSequence;
            return this;
        }

        /* renamed from: f */
        public C0222d mo688f(Bundle bundle) {
            this.f544k = bundle;
            return this;
        }

        /* renamed from: g */
        public C0222d mo689g(int i, long j, float f, long j2) {
            this.f535b = i;
            this.f536c = j;
            this.f542i = j2;
            this.f538e = f;
            return this;
        }

        public C0222d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f534a = arrayList;
            this.f543j = -1;
            this.f535b = playbackStateCompat.f517a;
            this.f536c = playbackStateCompat.f518b;
            this.f538e = playbackStateCompat.f520d;
            this.f542i = playbackStateCompat.f524h;
            this.f537d = playbackStateCompat.f519c;
            this.f539f = playbackStateCompat.f521e;
            this.f540g = playbackStateCompat.f522f;
            this.f541h = playbackStateCompat.f523g;
            List<CustomAction> list = playbackStateCompat.f525i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f543j = playbackStateCompat.f526r;
            this.f544k = playbackStateCompat.f527s;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0218a();

        /* renamed from: a */
        private final String f529a;

        /* renamed from: b */
        private final CharSequence f530b;

        /* renamed from: c */
        private final int f531c;

        /* renamed from: d */
        private final Bundle f532d;

        /* renamed from: e */
        private PlaybackState.CustomAction f533e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        class C0218a implements Parcelable.Creator<CustomAction> {
            C0218a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f529a = str;
            this.f530b = charSequence;
            this.f531c = i;
            this.f532d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m1090a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l = C0220b.m1107l(customAction);
            MediaSessionCompat.m809a(l);
            CustomAction customAction2 = new CustomAction(C0220b.m1101f(customAction), C0220b.m1110o(customAction), C0220b.m1108m(customAction), l);
            customAction2.f533e = customAction;
            return customAction2;
        }

        /* renamed from: b */
        public Object mo671b() {
            PlaybackState.CustomAction customAction = this.f533e;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e = C0220b.m1100e(this.f529a, this.f530b, this.f531c);
            C0220b.m1118w(e, this.f532d);
            return C0220b.m1097b(e);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f530b + ", mIcon=" + this.f531c + ", mExtras=" + this.f532d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f529a);
            TextUtils.writeToParcel(this.f530b, parcel, i);
            parcel.writeInt(this.f531c);
            parcel.writeBundle(this.f532d);
        }

        CustomAction(Parcel parcel) {
            this.f529a = parcel.readString();
            this.f530b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f531c = parcel.readInt();
            this.f532d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f517a = parcel.readInt();
        this.f518b = parcel.readLong();
        this.f520d = parcel.readFloat();
        this.f524h = parcel.readLong();
        this.f519c = parcel.readLong();
        this.f521e = parcel.readLong();
        this.f523g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f525i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f526r = parcel.readLong();
        this.f527s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f522f = parcel.readInt();
    }
}
