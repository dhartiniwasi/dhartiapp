package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.C0721a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p124r.C5413a;
import p152v0.C5755b;

public final class MediaMetadata extends CustomVersionedParcelable {

    /* renamed from: d */
    static final C5413a<String, Integer> f3548d;

    /* renamed from: a */
    Bundle f3549a;

    /* renamed from: b */
    Bundle f3550b;

    /* renamed from: c */
    ParcelImplListSlice f3551c;

    static final class BitmapEntry implements C5755b {

        /* renamed from: a */
        String f3552a;

        /* renamed from: b */
        Bitmap f3553b;

        BitmapEntry() {
        }

        /* renamed from: d */
        private int m5711d(Bitmap bitmap) {
            return C0721a.m3308a(bitmap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Bitmap mo4643c() {
            return this.f3553b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo4644e() {
            return this.f3552a;
        }

        BitmapEntry(String str, Bitmap bitmap) {
            this.f3552a = str;
            this.f3553b = bitmap;
            int d = m5711d(bitmap);
            if (d > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double sqrt = Math.sqrt(262144.0d / ((double) d));
                int i = (int) (((double) width) * sqrt);
                int i2 = (int) (((double) height) * sqrt);
                Log.i("MediaMetadata", "Scaling large bitmap of " + width + "x" + height + " into " + i + "x" + i2);
                this.f3553b = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            }
        }
    }

    static {
        C5413a<String, Integer> aVar = new C5413a<>();
        f3548d = aVar;
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
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("androidx.media2.metadata.RADIO_FREQUENCY", 4);
        aVar.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", 1);
        aVar.put("androidx.media2.metadata.BROWSABLE", 0);
        aVar.put("androidx.media2.metadata.PLAYABLE", 0);
        aVar.put("androidx.media2.metadata.ADVERTISEMENT", 0);
        aVar.put("androidx.media2.metadata.DOWNLOAD_STATUS", 0);
        aVar.put("androidx.media2.metadata.EXTRAS", 5);
    }

    MediaMetadata() {
    }

    /* renamed from: c */
    public void mo3057c() {
        Bundle bundle = this.f3550b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f3549a = bundle;
        ParcelImplListSlice parcelImplListSlice = this.f3551c;
        if (parcelImplListSlice != null) {
            for (ParcelImpl a : parcelImplListSlice.mo4647a()) {
                BitmapEntry bitmapEntry = (BitmapEntry) MediaParcelUtils.m5714a(a);
                this.f3549a.putParcelable(bitmapEntry.mo4644e(), bitmapEntry.mo4643c());
            }
        }
    }

    /* renamed from: d */
    public void mo3058d(boolean z) {
        synchronized (this.f3549a) {
            if (this.f3550b == null) {
                this.f3550b = new Bundle(this.f3549a);
                ArrayList arrayList = new ArrayList();
                for (String str : this.f3549a.keySet()) {
                    Object obj = this.f3549a.get(str);
                    if (obj instanceof Bitmap) {
                        arrayList.add(MediaParcelUtils.m5715b(new BitmapEntry(str, (Bitmap) obj)));
                        this.f3550b.remove(str);
                    }
                }
                this.f3551c = new ParcelImplListSlice((List<ParcelImpl>) arrayList);
            }
        }
    }

    /* renamed from: e */
    public boolean mo4639e(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f3549a.containsKey(str);
    }

    /* renamed from: f */
    public long mo4640f(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        return this.f3549a.getLong(str, 0);
    }

    /* renamed from: g */
    public String mo4641g(String str) {
        Objects.requireNonNull(str, "key shouldn't be null");
        CharSequence charSequence = this.f3549a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public String toString() {
        return this.f3549a.toString();
    }
}
