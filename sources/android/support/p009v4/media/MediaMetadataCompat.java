package android.support.p009v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p009v4.media.MediaDescriptionCompat;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import p124r.C5413a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0179a();

    /* renamed from: d */
    static final C5413a<String, Integer> f400d;

    /* renamed from: e */
    private static final String[] f401e = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: f */
    private static final String[] f402f = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: g */
    private static final String[] f403g = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: a */
    final Bundle f404a;

    /* renamed from: b */
    private MediaMetadata f405b;

    /* renamed from: c */
    private MediaDescriptionCompat f406c;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    class C0179a implements Parcelable.Creator<MediaMetadataCompat> {
        C0179a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C5413a<String, Integer> aVar = new C5413a<>();
        f400d = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f404a = bundle2;
        MediaSessionCompat.m809a(bundle2);
    }

    /* renamed from: b */
    public static MediaMetadataCompat m709b(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f405b = mediaMetadata;
        return createFromParcel;
    }

    /* renamed from: a */
    public boolean mo377a(String str) {
        return this.f404a.containsKey(str);
    }

    /* renamed from: c */
    public Bitmap mo378c(String str) {
        try {
            return (Bitmap) this.f404a.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    /* renamed from: d */
    public Bundle mo379d() {
        return new Bundle(this.f404a);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public MediaDescriptionCompat mo381e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f406c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String i = mo385i("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence j = mo386j("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(j)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < 3) {
                String[] strArr = f401e;
                if (i3 >= strArr.length) {
                    break;
                }
                int i4 = i3 + 1;
                CharSequence j2 = mo386j(strArr[i3]);
                if (!TextUtils.isEmpty(j2)) {
                    charSequenceArr[i2] = j2;
                    i2++;
                }
                i3 = i4;
            }
        } else {
            charSequenceArr[0] = j;
            charSequenceArr[1] = mo386j("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = mo386j("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = f402f;
            uri = null;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = mo378c(strArr2[i5]);
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            String[] strArr3 = f403g;
            if (i6 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String i7 = mo385i(strArr3[i6]);
            if (!TextUtils.isEmpty(i7)) {
                uri2 = Uri.parse(i7);
                break;
            }
            i6++;
        }
        String i8 = mo385i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(i8)) {
            uri = Uri.parse(i8);
        }
        MediaDescriptionCompat.C0178d dVar = new MediaDescriptionCompat.C0178d();
        dVar.mo373f(i);
        dVar.mo376i(charSequenceArr[0]);
        dVar.mo375h(charSequenceArr[1]);
        dVar.mo369b(charSequenceArr[2]);
        dVar.mo371d(bitmap);
        dVar.mo372e(uri2);
        dVar.mo374g(uri);
        Bundle bundle = new Bundle();
        if (this.f404a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", mo382f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f404a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", mo382f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            dVar.mo370c(bundle);
        }
        MediaDescriptionCompat a = dVar.mo368a();
        this.f406c = a;
        return a;
    }

    /* renamed from: f */
    public long mo382f(String str) {
        return this.f404a.getLong(str, 0);
    }

    /* renamed from: g */
    public Object mo383g() {
        if (this.f405b == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f405b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f405b;
    }

    /* renamed from: h */
    public RatingCompat mo384h(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                return RatingCompat.m727a(this.f404a.getParcelable(str));
            }
            return (RatingCompat) this.f404a.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e);
            return null;
        }
    }

    /* renamed from: i */
    public String mo385i(String str) {
        CharSequence charSequence = this.f404a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: j */
    public CharSequence mo386j(String str) {
        return this.f404a.getCharSequence(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f404a);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0180b {

        /* renamed from: a */
        private final Bundle f407a;

        public C0180b() {
            this.f407a = new Bundle();
        }

        /* renamed from: f */
        private Bitmap m721f(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        /* renamed from: a */
        public MediaMetadataCompat mo392a() {
            return new MediaMetadataCompat(this.f407a);
        }

        /* renamed from: b */
        public C0180b mo393b(String str, Bitmap bitmap) {
            C5413a<String, Integer> aVar = MediaMetadataCompat.f400d;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f407a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C0180b mo394c(String str, long j) {
            C5413a<String, Integer> aVar = MediaMetadataCompat.f400d;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f407a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C0180b mo395d(String str, RatingCompat ratingCompat) {
            C5413a<String, Integer> aVar = MediaMetadataCompat.f400d;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 3) {
                if (Build.VERSION.SDK_INT >= 19) {
                    this.f407a.putParcelable(str, (Parcelable) ratingCompat.mo398c());
                } else {
                    this.f407a.putParcelable(str, ratingCompat);
                }
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        /* renamed from: e */
        public C0180b mo396e(String str, String str2) {
            C5413a<String, Integer> aVar = MediaMetadataCompat.f400d;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f407a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public C0180b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f404a);
            this.f407a = bundle;
            MediaSessionCompat.m809a(bundle);
        }

        public C0180b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f407a.keySet()) {
                Object obj = this.f407a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo393b(str, m721f(bitmap, i));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f404a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
