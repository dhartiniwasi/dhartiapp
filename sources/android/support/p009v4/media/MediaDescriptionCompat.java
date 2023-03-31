package android.support.p009v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0175a();

    /* renamed from: a */
    private final String f383a;

    /* renamed from: b */
    private final CharSequence f384b;

    /* renamed from: c */
    private final CharSequence f385c;

    /* renamed from: d */
    private final CharSequence f386d;

    /* renamed from: e */
    private final Bitmap f387e;

    /* renamed from: f */
    private final Uri f388f;

    /* renamed from: g */
    private final Bundle f389g;

    /* renamed from: h */
    private final Uri f390h;

    /* renamed from: i */
    private MediaDescription f391i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    class C0175a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0175a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m670a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    private static class C0176b {
        /* renamed from: a */
        static MediaDescription m682a(MediaDescription.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        static MediaDescription.Builder m683b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        static CharSequence m684c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        /* renamed from: d */
        static Bundle m685d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        /* renamed from: e */
        static Bitmap m686e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        /* renamed from: f */
        static Uri m687f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        /* renamed from: g */
        static String m688g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        /* renamed from: h */
        static CharSequence m689h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        /* renamed from: i */
        static CharSequence m690i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        /* renamed from: j */
        static void m691j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: k */
        static void m692k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: l */
        static void m693l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        /* renamed from: m */
        static void m694m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        /* renamed from: n */
        static void m695n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        /* renamed from: o */
        static void m696o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: p */
        static void m697p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    private static class C0177c {
        /* renamed from: a */
        static Uri m698a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        /* renamed from: b */
        static void m699b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C0178d {

        /* renamed from: a */
        private String f392a;

        /* renamed from: b */
        private CharSequence f393b;

        /* renamed from: c */
        private CharSequence f394c;

        /* renamed from: d */
        private CharSequence f395d;

        /* renamed from: e */
        private Bitmap f396e;

        /* renamed from: f */
        private Uri f397f;

        /* renamed from: g */
        private Bundle f398g;

        /* renamed from: h */
        private Uri f399h;

        /* renamed from: a */
        public MediaDescriptionCompat mo368a() {
            return new MediaDescriptionCompat(this.f392a, this.f393b, this.f394c, this.f395d, this.f396e, this.f397f, this.f398g, this.f399h);
        }

        /* renamed from: b */
        public C0178d mo369b(CharSequence charSequence) {
            this.f395d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0178d mo370c(Bundle bundle) {
            this.f398g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0178d mo371d(Bitmap bitmap) {
            this.f396e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0178d mo372e(Uri uri) {
            this.f397f = uri;
            return this;
        }

        /* renamed from: f */
        public C0178d mo373f(String str) {
            this.f392a = str;
            return this;
        }

        /* renamed from: g */
        public C0178d mo374g(Uri uri) {
            this.f399h = uri;
            return this;
        }

        /* renamed from: h */
        public C0178d mo375h(CharSequence charSequence) {
            this.f394c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0178d mo376i(CharSequence charSequence) {
            this.f393b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f383a = str;
        this.f384b = charSequence;
        this.f385c = charSequence2;
        this.f386d = charSequence3;
        this.f387e = bitmap;
        this.f388f = uri;
        this.f389g = bundle;
        this.f390h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p009v4.media.MediaDescriptionCompat m670a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0083
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0083
            android.support.v4.media.MediaDescriptionCompat$d r2 = new android.support.v4.media.MediaDescriptionCompat$d
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m688g(r9)
            r2.mo373f(r3)
            java.lang.CharSequence r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m690i(r9)
            r2.mo376i(r3)
            java.lang.CharSequence r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m689h(r9)
            r2.mo375h(r3)
            java.lang.CharSequence r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m684c(r9)
            r2.mo369b(r3)
            android.graphics.Bitmap r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m686e(r9)
            r2.mo371d(r3)
            android.net.Uri r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m687f(r9)
            r2.mo372e(r3)
            android.os.Bundle r3 = android.support.p009v4.media.MediaDescriptionCompat.C0176b.m685d(r9)
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r3 = android.support.p009v4.media.session.MediaSessionCompat.m811u(r3)
        L_0x0044:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0062
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.mo370c(r0)
            if (r5 == 0) goto L_0x0072
            r2.mo374g(r5)
            goto L_0x007d
        L_0x0072:
            r0 = 23
            if (r1 < r0) goto L_0x007d
            android.net.Uri r0 = android.support.p009v4.media.MediaDescriptionCompat.C0177c.m698a(r9)
            r2.mo374g(r0)
        L_0x007d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo368a()
            r0.f391i = r9
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.media.MediaDescriptionCompat.m670a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public CharSequence mo352b() {
        return this.f386d;
    }

    /* renamed from: c */
    public Bundle mo353c() {
        return this.f389g;
    }

    /* renamed from: d */
    public Bitmap mo354d() {
        return this.f387e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Uri mo356e() {
        return this.f388f;
    }

    /* renamed from: f */
    public Object mo357f() {
        int i;
        Bundle bundle;
        MediaDescription mediaDescription = this.f391i;
        if (mediaDescription != null || (i = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder b = C0176b.m683b();
        C0176b.m695n(b, this.f383a);
        C0176b.m697p(b, this.f384b);
        C0176b.m696o(b, this.f385c);
        C0176b.m691j(b, this.f386d);
        C0176b.m693l(b, this.f387e);
        C0176b.m694m(b, this.f388f);
        if (i >= 23 || this.f390h == null) {
            C0176b.m692k(b, this.f389g);
        } else {
            if (this.f389g == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(this.f389g);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f390h);
            C0176b.m692k(b, bundle);
        }
        if (i >= 23) {
            C0177c.m699b(b, this.f390h);
        }
        MediaDescription a = C0176b.m682a(b);
        this.f391i = a;
        return a;
    }

    /* renamed from: g */
    public String mo358g() {
        return this.f383a;
    }

    /* renamed from: h */
    public Uri mo359h() {
        return this.f390h;
    }

    /* renamed from: i */
    public CharSequence mo360i() {
        return this.f385c;
    }

    /* renamed from: j */
    public CharSequence mo361j() {
        return this.f384b;
    }

    public String toString() {
        return this.f384b + ", " + this.f385c + ", " + this.f386d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f383a);
            TextUtils.writeToParcel(this.f384b, parcel, i);
            TextUtils.writeToParcel(this.f385c, parcel, i);
            TextUtils.writeToParcel(this.f386d, parcel, i);
            parcel.writeParcelable(this.f387e, i);
            parcel.writeParcelable(this.f388f, i);
            parcel.writeBundle(this.f389g);
            parcel.writeParcelable(this.f390h, i);
            return;
        }
        ((MediaDescription) mo357f()).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f383a = parcel.readString();
        this.f384b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f385c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f386d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f387e = (Bitmap) parcel.readParcelable(classLoader);
        this.f388f = (Uri) parcel.readParcelable(classLoader);
        this.f389g = parcel.readBundle(classLoader);
        this.f390h = (Uri) parcel.readParcelable(classLoader);
    }
}
