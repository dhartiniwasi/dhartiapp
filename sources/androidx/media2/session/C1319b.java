package androidx.media2.session;

import android.os.Bundle;
import androidx.media.C1262d;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: androidx.media2.session.b */
/* compiled from: MediaUtils */
public class C1319b {

    /* renamed from: a */
    public static final C1262d.C1267e f3659a = new C1262d.C1267e("androidx.media2.session.MediaLibraryService", (Bundle) null);

    /* renamed from: b */
    public static final Executor f3660b = new C1320a();

    /* renamed from: c */
    private static final Map<String, String> f3661c;

    /* renamed from: d */
    private static final Map<String, String> f3662d = new HashMap();

    /* renamed from: androidx.media2.session.b$a */
    /* compiled from: MediaUtils */
    class C1320a implements Executor {
        C1320a() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f3661c = hashMap;
        hashMap.put("android.media.metadata.ADVERTISEMENT", "androidx.media2.metadata.ADVERTISEMENT");
        hashMap.put("android.media.metadata.BT_FOLDER_TYPE", "androidx.media2.metadata.BROWSABLE");
        hashMap.put("android.media.metadata.DOWNLOAD_STATUS", "androidx.media2.metadata.DOWNLOAD_STATUS");
        for (Map.Entry entry : hashMap.entrySet()) {
            Map<String, String> map = f3662d;
            if (!map.containsKey(entry.getValue())) {
                map.put((String) entry.getValue(), (String) entry.getKey());
            } else {
                throw new RuntimeException("Shouldn't map to the same value");
            }
        }
    }

    /* renamed from: a */
    public static ParcelImplListSlice m5738a(List<MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            MediaItem mediaItem = list.get(i);
            if (mediaItem != null) {
                arrayList.add(MediaParcelUtils.m5715b(mediaItem));
            }
        }
        return new ParcelImplListSlice((List<ParcelImpl>) arrayList);
    }

    /* renamed from: b */
    public static List<MediaItem> m5739b(ParcelImplListSlice parcelImplListSlice) {
        if (parcelImplListSlice == null) {
            return null;
        }
        List<ParcelImpl> a = parcelImplListSlice.mo4647a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            ParcelImpl parcelImpl = a.get(i);
            if (parcelImpl != null) {
                arrayList.add((MediaItem) MediaParcelUtils.m5714a(parcelImpl));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static MediaItem m5740c(MediaItem mediaItem) {
        return (mediaItem == null || mediaItem.getClass() == MediaItem.class) ? mediaItem : new MediaItem.C1313a().mo4638d(mediaItem.mo4633h()).mo4636b(mediaItem.mo4630e()).mo4637c(mediaItem.mo4632g()).mo4635a();
    }
}
