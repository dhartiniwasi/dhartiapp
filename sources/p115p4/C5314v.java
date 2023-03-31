package p115p4;

import android.util.Pair;
import com.google.android.gms.internal.ads.bv1;
import com.google.android.gms.internal.ads.lv1;
import java.util.Map;

/* renamed from: p4.v */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C5314v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lv1 f27335a;

    /* renamed from: b */
    public final /* synthetic */ bv1 f27336b;

    /* renamed from: c */
    public final /* synthetic */ String f27337c;

    /* renamed from: d */
    public final /* synthetic */ Pair[] f27338d;

    public /* synthetic */ C5314v(lv1 lv1, bv1 bv1, String str, Pair[] pairArr) {
        this.f27335a = lv1;
        this.f27336b = bv1;
        this.f27337c = str;
        this.f27338d = pairArr;
    }

    public final void run() {
        Map map;
        lv1 lv1 = this.f27335a;
        bv1 bv1 = this.f27336b;
        String str = this.f27337c;
        Pair[] pairArr = this.f27338d;
        if (bv1 == null) {
            map = lv1.mo12715c();
        } else {
            map = bv1.mo8951a();
        }
        map.put("action", str);
        for (Pair pair : pairArr) {
            map.put((String) pair.first, (String) pair.second);
        }
        lv1.mo12717e(map);
    }
}
